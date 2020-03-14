package com.xuecheng.api.cms;
/**
 * Created by Administrator on 2020/3/5.
 */


import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author rp
 * @create 2020/3/5
 */
@Api(value = "cms页面管理接口",tags = "cms页面管理接口",description = "cms页面管理接口，提供页面的增、删、改、查")
public interface CmsPageContrllerApi {


    @ApiOperation("分页查询页面列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页 码", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "size", value = "每页记录 数", required = true, paramType = "path", dataType = "int")})
    QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);

}
