package com.core.service.impl;/**
 * @author lishaolong
 * @Date 2021/9/9
 */


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.core.entity.SysRole;
import com.core.mapper.SysRoleMapper;
import com.core.modle.PageObject;
import com.core.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * @author li
 * @date 2021/9/9
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
    @Override
    public IPage<SysRole> sysRolePage(PageObject<SysRole> pageObject) {
        QueryWrapper<SysRole> queryWrapper = new QueryWrapper<SysRole>(pageObject.getData());
        return baseMapper.selectPage(new Page<>(pageObject.getCurrent(),pageObject.getSize()),queryWrapper);
    }
}
