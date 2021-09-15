package com.core.service.impl;/**
 * @author lishaolong
 * @Date 2021/9/15
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.core.entity.VehicleInformation;
import com.core.mapper.VehicleInformationMapper;
import com.core.service.VehicleInformationService;
import org.springframework.stereotype.Service;

/**
 * @author li
 * @date 2021/9/15
 */
@Service
public class VehicleInformationServiceImpl extends ServiceImpl<VehicleInformationMapper, VehicleInformation> implements VehicleInformationService {
}
