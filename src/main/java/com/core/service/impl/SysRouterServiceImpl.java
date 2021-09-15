package com.core.service.impl;/**
 * @author lishaolong
 * @Date 2021/9/13
 */


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.core.entity.SysRouter;
import com.core.mapper.SysRouterMapper;
import com.core.service.SysRouterService;
import com.core.vo.RouterVo;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author li
 * @date 2021/9/13
 */
@Service
public class SysRouterServiceImpl extends ServiceImpl<SysRouterMapper, SysRouter>
        implements SysRouterService {

    @Autowired
    Mapper mapper;

    @Override
    public List<RouterVo> allRouterVoTree() {
        //全部菜单
        List<RouterVo> menuRouter = menuRouter();
        //最上级
        List<RouterVo> rootList = new ArrayList<>();
        List<RouterVo> result = new ArrayList<>();
        //拿到最上级
        menuRouter.forEach(menuNode -> {
            if (menuNode.getLevel() == 0) {
                rootList.add(format(menuNode, pageRouter(), actionRouter()));
            }
        });
        rootList.forEach(routerVo -> {
            routerVo.setMenuVoList(tree(menuRouter, routerVo.getId()));
            result.add(routerVo);
        });
        return result;
    }

    private List<RouterVo> tree(List<RouterVo> allRouterVo, Integer id) {
        List<RouterVo> result = new ArrayList<>();
        allRouterVo.forEach(routerVo -> {
            if (routerVo.getPid() != null) {
                if (routerVo.getPid().equals(id)) {
                    result.add(routerVo);
                }
            }
        });
        if (result.size() == 0) {
            return null;
        }
        for (RouterVo f : result) {
            f.setMenuVoList(tree(allRouterVo, f.getId()));
        }
        return result;
    }

    private RouterVo format(RouterVo menu, List<RouterVo> pageList, List<RouterVo> actionList) {
        List<RouterVo> butter = new ArrayList<>();
        List<RouterVo> viewList = new ArrayList<>();
        pageList.forEach(pageVo -> {
            if (pageVo.getPid().equals(menu.getId())) {
                viewList.add(pageVo);
            }
            actionList.forEach(actionVo -> {
                if (pageVo.getId().equals(actionVo.getPid())) {
                    butter.add(actionVo);
                }
            });
            pageVo.setActionVoList(butter);
            butter.clear();
        });
        menu.setPageVoList(viewList);
        return menu;
    }

    @Override
    public List<RouterVo> menuRouter() {
        List<RouterVo> result = new ArrayList<>();
        QueryWrapper<SysRouter> queryWrapper = new QueryWrapper();
        queryWrapper.eq(SysRouter.Fields.type, 1);
        list(queryWrapper).forEach(sysRouter ->
                result.add(mapper.map(sysRouter, RouterVo.class))
        );
        return result;
    }

    @Override
    public List<RouterVo> pageRouter() {
        List<RouterVo> result = new ArrayList<>();
        QueryWrapper<SysRouter> queryWrapper = new QueryWrapper();
        queryWrapper.eq(SysRouter.Fields.type, 2);
        list(queryWrapper).forEach(sysRouter ->
                result.add(mapper.map(sysRouter, RouterVo.class))
        );
        return result;
    }

    @Override
    public List<RouterVo> actionRouter() {
        List<RouterVo> result = new ArrayList<>();
        QueryWrapper<SysRouter> queryWrapper = new QueryWrapper();
        queryWrapper.eq(SysRouter.Fields.type, 3);
        list(queryWrapper).forEach(sysRouter ->
                result.add(mapper.map(sysRouter, RouterVo.class))
        );
        return result;
    }

    @Override
    public List<RouterVo> allRouterVoByRoleId(Integer roleId) {
        //最上级
        List<RouterVo> rootList = new ArrayList<>();
        List<RouterVo> result = new ArrayList<>();
        List<RouterVo> routerVoList = new ArrayList<>();
        baseMapper.sysRoutersByRoleId(roleId).forEach(sysRouter ->
                routerVoList.add(mapper.map(sysRouter, RouterVo.class))
        );
        routerVoList.forEach(menuNode -> {
            if (menuNode.getLevel() == 0) {
                rootList.add(format(menuNode, pageRouter(), actionRouter()));
            }
        });
        rootList.forEach(routerVo -> {
            routerVo.setMenuVoList(tree(routerVoList, routerVo.getId()));
            result.add(routerVo);
        });
        return result;
    }
}
