package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.CmsConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author 麦客子
 * @desc CMS配置管理接口
 * @email leeshuhua@163.com
 * @create 2019/07/08 21:00
 **/
@Api(value = "CMS配置管理接口",description = "CMS配置管理接口，提供数据模型的管理、查询接口")
public interface CmsConfigControllerApi {

    @ApiOperation("根据id查询CMS配置信息")
    public CmsConfig getModel(String id);
}
