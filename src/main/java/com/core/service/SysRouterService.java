package com.core.service;/**
 * @author lishaolong
 * @Date 2021/9/12
 */


import com.baomidou.mybatisplus.extension.service.IService;
import com.core.entity.SysRouter;
import com.core.vo.RouterVo;

import java.util.List;

/**
 * @author li
 * @date 2021/9/12
 */
public interface SysRouterService extends IService<SysRouter> {

    List<RouterVo> allRouterVoTree();

    List<RouterVo> menuRouter();

    List<RouterVo> pageRouter();

    List<RouterVo> actionRouter();

    List<RouterVo> allRouterVoByRoleId(Integer roleId);
}
