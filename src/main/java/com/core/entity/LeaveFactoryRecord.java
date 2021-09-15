package com.core.entity;/**
 * @author lishaolong
 * @Date 2021/9/14
 */

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.FieldNameConstants;

/**
 * @author li
 * @date 2021/9/14
 */
@Data
@FieldNameConstants
@TableName(value = "leave_factory_record")
@ApiModel("出厂记录")
public class LeaveFactoryRecord {

    private Integer id;
}
