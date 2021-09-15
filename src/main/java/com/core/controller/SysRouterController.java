package com.core.controller;/**
 * @author lishaolong
 * @Date 2021/9/14
 */

import com.core.entity.SysRouter;
import com.core.modle.Result;
import com.core.service.SysRouterService;
import com.core.vo.RouterVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.util.Date;

/**
 * @author li
 * @date 2021/9/14
 */
@RestController
@RequestMapping("sysRouter")
@Api(tags = "菜单路由",value = "SysRouterController")
public class SysRouterController {

    @Autowired
    SysRouterService service;

    @PostMapping("addRouter")
    @ApiOperation("添加菜单")
    public Result addRouter(@RequestBody SysRouter sysRouter){
        return Result.ok(service.save(sysRouter));
    }
    @PostMapping("deleteRouterById")
    @ApiOperation("删除路由")
    public Result deleteRouterById(@RequestBody Integer routerId){
        return Result.ok(service.removeById(routerId));
    }
    @PostMapping("updateRouter")
    @ApiOperation("编辑路由")
    public Result updateRouter(@RequestBody SysRouter sysRouter){
        sysRouter.setUpdateDate(new Date());
        return Result.ok(service.updateById(sysRouter));
    }
    @PostMapping("allRouterVoTree")
    @ApiOperation("完整路由列表树")
    public Result<RouterVo> allRouterVoTree(){
        return Result.ok(service.allRouterVoTree());
    }
//    @PostMapping("routerVoUpdateList")
//    @ApiOperation("角色现有路由树")
//    public Result<RouterVo> routerVoUpdateList(@RequestBody Integer roleId){
//        return Result.ok(service.routerVoUpdateList);
//    }
}
