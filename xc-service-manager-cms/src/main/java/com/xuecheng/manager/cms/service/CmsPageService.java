package com.xuecheng.manager.cms.service;/**
 * Created by Administrator on 2020/3/14.
 */


import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * 〈一句话功能简述〉<br>
 * 〈CmsPage CMS页面管理业务层接口〉
 *
 * @author rp
 * @create 2020/3/14
 */
public interface CmsPageService {

    /**
     * 分页查询cmspage信息
     * @param page
     * @param size
     * @param queryPageRequest
     * @return
     */
    QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
