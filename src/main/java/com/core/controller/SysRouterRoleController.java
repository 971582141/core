package com.core.controller;/**
 * @author lishaolong
 * @Date 2021/9/13
 */


import com.core.entity.SysRouterRole;
import com.core.modle.Result;
import com.core.service.SysRouterRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author li
 * @date 2021/9/13
 */
@RestController
@RequestMapping("sysRouterRole")
@Api(tags = "角色路由对应",value = "SysRouterRoleController")
public class SysRouterRoleController {

    @Autowired
    private SysRouterRoleService service;

    @PostMapping("addSysRouterRole")
    @ApiOperation("添加角色路由")
    public Result addSysRouterRole(@RequestBody SysRouterRole sysRouterRole){
        return Result.ok(service.save(sysRouterRole));
    }
}
