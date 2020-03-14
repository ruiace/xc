package com.xuecheng.manager.cms.dao;

import com.alibaba.fastjson.JSONObject;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.CmsPageParam;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by Administrator on 2020/3/5.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class CmsPageRepositoryTest {


    @Autowired
    private CmsPageRepository cmsPageRepository;

    @Test
    public void test1() {
        System.out.println("==================");
    }

    //查询所以
    @Test
    public void testFindAll() {
        long count = cmsPageRepository.count();
        log.info("总记录数 count = {}", count);
        System.out.println("===============================================");
        List<CmsPage> all = cmsPageRepository.findAll();

        all.forEach(v -> {
            log.info("查询结果-->{}", JSONObject.toJSONString(v));
        });
    }


    /**
     * 分页查询
     */
    @Test
    public void testFindPage() {

        //分页从0开始
        int page = 0;
        int size = 10;
        Pageable pageable = PageRequest.of(page, size);
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
        List<CmsPage> content = all.getContent();
        content.forEach(v -> {
            log.info("查询结果-->{}", JSONObject.toJSONString(v));
        });
    }


    /**
     * 新增
     */
    @Test
    public void testInsert() {
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageId("5e6c56f822a5ee1820242353");
        cmsPage.setSiteId("s01");
        cmsPage.setTemplateId("t01");
        cmsPage.setPageName("测试页面111");
        cmsPage.setPageCreateTime(new Date());
        List<CmsPageParam> cmsPageParams = new ArrayList<>();
        CmsPageParam cmsPageParam = new CmsPageParam();
        cmsPageParam.setPageParamName("param1");
        cmsPageParam.setPageParamValue("value1");
        cmsPageParams.add(cmsPageParam);
        cmsPage.setPageParams(cmsPageParams);
        cmsPageRepository.save(cmsPage);
        CmsPage save = cmsPageRepository.save(cmsPage);
        System.out.println(save.toString());


        Optional<CmsPage> byId = cmsPageRepository.findById("5e6c56f822a5ee1820242353");
        if (byId.isPresent()) {
            CmsPage cmsPage1 = byId.get();
            log.info("Optional<CmsPage> byId = {}", JSONObject.toJSONString(cmsPage1));
        }
        System.out.println();
    }

    //删除
    @Test
    public void testDelete() {
        cmsPageRepository.deleteById("5e6c56f822a5ee1820242353");
    }


    //修改
    @Test
    public void testUpdate() {
        Optional<CmsPage> optional = cmsPageRepository.findById("5e6c56f822a5ee1820242353");
        if (optional.isPresent()) {
            CmsPage cmsPage = optional.get();
            cmsPage.setPageName("测试页面01");
            cmsPageRepository.save(cmsPage);
        }
    }
}