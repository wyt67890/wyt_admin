package org.wyt.admin.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;


@Data
public class EmpVo implements Serializable {
//

    /**
     * 员工姓名
     */
    private String empName;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 学历
     */
    private String empDegreeName;


    private Integer page;


    private Integer limit;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}