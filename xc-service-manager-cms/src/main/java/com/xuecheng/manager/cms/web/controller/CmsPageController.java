package com.xuecheng.manager.cms.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.xuecheng.api.cms.CmsPageContrllerApi;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.manager.cms.service.CmsPageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author rp
 * @create 2020/3/5
 */
@RequestMapping("/cms/page")
@RestController
@Slf4j
public class CmsPageController implements CmsPageContrllerApi {


    @Autowired
    private CmsPageService cmsPageService;


    /**
     * 分页查询cmspage信息
     * @param page
     * @param size
     * @param queryPageRequest
     * @return
     */
    @GetMapping("/list/{page}/{size}")
    @Override
    public QueryResponseResult findList(@PathVariable("page") int page,@PathVariable("size") int size, QueryPageRequest queryPageRequest) {


        QueryResponseResult result  = cmsPageService.findList(page,size,queryPageRequest);
        log.info("分页查询cmspage信息,返回结果 result ={}", JSONObject.toJSONString(result));
//        QueryResult queryResult = new QueryResult();
//        queryResult.setTotal(2);
//        List<CmsPage> list = new ArrayList<>();
//        CmsPage cmsPage = new CmsPage();
//        cmsPage.setDataUrl("www.baidu.com");
//        list.add(cmsPage);
//        queryResult.setList(list);
//        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS,queryResult);
//        return queryResponseResult;
        return result;
    }
}