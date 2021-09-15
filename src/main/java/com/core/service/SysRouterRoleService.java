package com.core.service;/**
 * @author lishaolong
 * @Date 2021/9/12
 */


import com.baomidou.mybatisplus.extension.service.IService;
import com.core.entity.SysRouterRole;

import java.util.List;

/**
 * @author li
 * @date 2021/9/12
 */
public interface SysRouterRoleService extends IService<SysRouterRole> {

    List<SysRouterRole> sysRouterRoleListByRoleId(Integer roleId);
}
