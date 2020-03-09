package com.xuecheng.framework.domain.cms.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author rp
 * @create 2020/3/5
 */
@Data
public class QueryPageRequest extends RequestData {

    /**
     * 站点id
     */
    private String siteId;
    /**
     * 页面id
     */
    private String pageId;
    /**
     * 页面名称
     */
    private String pageName;
    /**
     * 页面别名
     */
    private String pageAliase;

    /**
     * 模板id
     */
    private String templateId;
}