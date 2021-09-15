package com.core.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.core.entity.SysRole;
import com.core.modle.PageObject;

/**
 * @author li
 * @date 2021/9/9
 */
public interface SysRoleService extends IService<SysRole> {

    IPage<SysRole> sysRolePage(PageObject<SysRole> pageObject);
}
