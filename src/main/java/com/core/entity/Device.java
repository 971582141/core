package com.core.entity;/**
 * @author lishaolong
 * @Date 2021/9/15
 */

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.FieldNameConstants;

/**
 * @author li
 * @date 2021/9/15
 */
@Data
@ApiModel("设备")
@FieldNameConstants
@TableName(value = "device")
public class Device {
}
