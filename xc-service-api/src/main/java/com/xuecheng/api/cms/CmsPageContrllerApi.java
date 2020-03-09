package com.xuecheng.api.cms;
/**
 * Created by Administrator on 2020/3/5.
 */


import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author rp
 * @create 2020/3/5
 */
public interface CmsPageContrllerApi {

    /**
     * 查询cmsPage集合
     * @param page
     * @param size
     * @param queryPageRequest
     * @return
     */
    QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
