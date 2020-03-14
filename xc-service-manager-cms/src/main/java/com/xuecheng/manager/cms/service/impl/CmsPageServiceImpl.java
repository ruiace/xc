package com.xuecheng.manager.cms.service.impl;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manager.cms.dao.CmsPageRepository;
import com.xuecheng.manager.cms.service.CmsPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * 〈CmsPage CMS页面管理业务层接口
 *
 * @author rp
 * @create 2020/3/14
 */
@Service
public class CmsPageServiceImpl implements CmsPageService {


    @Autowired
    private CmsPageRepository cmsPageRepository;


    @Override
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest) {
        if(queryPageRequest == null ){
            queryPageRequest = new QueryPageRequest();
        }
        if(page <= 0){
            page = page -1;
        }
        Pageable pageable = PageRequest.of(page,size);
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);

        QueryResult queryResult = new QueryResult();
        queryResult.setList(all.getContent());
        queryResult.setTotal(all.getTotalElements());

        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS,queryResult);
        return queryResponseResult;
    }
}