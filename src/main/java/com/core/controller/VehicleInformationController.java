package com.core.controller;/**
 * @author lishaolong
 * @Date 2021/9/15
 */

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.core.entity.VehicleInformation;
import com.core.modle.PageObject;
import com.core.modle.Result;
import com.core.service.VehicleInformationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author li
 * @date 2021/9/15
 */
@RequestMapping("sysUser")
@Api(tags = "车辆基础数据表",value = "VehicleInformationController")
public class VehicleInformationController {

    @Autowired
    VehicleInformationService service;

    @PostMapping("page")
    @ApiOperation("车辆基础数据列表")
    public Result<IPage<VehicleInformation>> page(PageObject pageObject){
        return Result.ok(service.page(new Page<>(pageObject.getCurrent(),pageObject.getSize())));
    }
}
