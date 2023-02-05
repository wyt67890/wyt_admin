package org.wyt.admin.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName emp
 */
@TableName(value ="emp")
@Data
public class Emp implements Serializable {
    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 员工姓名
     */
    private String empName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 学历
     */
    private String empDegreeName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}