package com.core.entity;/**
 * @author lishaolong
 * @Date 2021/9/14
 */

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.FieldNameConstants;

import java.util.Date;

/**
 * @author li
 * @date 2021/9/14
 */
@Data
@FieldNameConstants
@TableName(value = "vehicle_information")
@ApiModel("车辆基础数据表")
public class VehicleInformation {

    @TableId(value = "id",type = IdType.AUTO)
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "车牌颜色")
    private String plateColor;
    @ApiModelProperty(value = "车辆类型")
    private String vehicleType;
    @ApiModelProperty(value = "车牌号")
    private String plateNumber;
    @ApiModelProperty(value = "车辆识别代码")
    private String vehicleIdentificationCode;
    @ApiModelProperty(value = "发动机号码")
    private String engineNumber;
    @ApiModelProperty(value = "燃料类型")
    private String fuelType;
    @ApiModelProperty(value = "排放等级")
    private String emissionClass;
    @ApiModelProperty(value = "使用性质")
    private String vehicleTransportType;
    @ApiModelProperty(value = "环保登记编码")
    private String EnvironmentalProtectionRegistrationCode;
    @ApiModelProperty(value = "所属人单位")
    private String unit;
    @ApiModelProperty(value = "注册日期")
    private Date registrationDate;
    @ApiModelProperty(value = "随车清单照片")
    private String carListUrl;
    @ApiModelProperty(value = "行驶证照片")
    private String drivingLicenseUrl;
    @ApiModelProperty(value = "是否黑名单 0 否 1 是")
    private String isDisable;
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "录入时间")
    private Date createDate;

}
