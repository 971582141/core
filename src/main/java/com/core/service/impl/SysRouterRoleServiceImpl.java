package com.core.service.impl;/**
 * @author lishaolong
 * @Date 2021/9/13
 */


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.core.entity.SysRouterRole;
import com.core.mapper.SysRouterRoleMapper;
import com.core.service.SysRouterRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author li
 * @date 2021/9/13
 */
@Service
public class SysRouterRoleServiceImpl extends ServiceImpl<SysRouterRoleMapper, SysRouterRole> implements SysRouterRoleService {
    @Override
    public List<SysRouterRole> sysRouterRoleListByRoleId(Integer roleId) {
        return null;
    }
}
