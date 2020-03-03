package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;


/**
 * @author Administrator
 */
@Data
@ToString
public class CmsPageParam {

    /**
     * 参数名称
     */
    private String pageParamName;

    /**
     * 参数值
     */
    private String pageParamValue;

}
