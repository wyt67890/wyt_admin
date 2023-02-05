package org.wyt.admin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wyt.admin.domain.Emp;
import org.wyt.admin.domain.EmpVo;
import org.wyt.admin.service.EmpService;
import org.wyt.admin.utils.R;

import java.util.List;

/**
 * @author 吴宇桐
 * @description
 * @date 2023/2/5
 */
@Slf4j
@Api(tags = "员工管理接口")
@RequestMapping("/emp")
@CrossOrigin(maxAge = 3600, allowCredentials = "true")
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @ApiOperation(value = "接受Json参数", notes = "当传入参数的page为null时，查询全部数据")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public R getEmpList(EmpVo empVo) throws Exception {

        log.info("传入参数为:{}", empVo);

        if (empVo.getPage() == null) {

            List<Emp> list = empService.list();

            return R.ok("success", list);
        }

        IPage<Emp> datalist = empService.getEmpList(empVo);


        return R.ok("success", datalist);
    }

    @ApiOperation(value = "接受Json参数", notes = "empVo")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public R addEmp(@RequestBody Emp emp) throws Exception {
        log.info("传入参数为{}", emp);
        empService.save(emp);
        return R.ok("success", null);
    }

    @ApiOperation(value = "接受Json参数", notes = "empVo")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public R updateEmp(@RequestBody Emp emp) throws Exception {
        log.info("传入参数为{}", emp);
        empService.updateById(emp);
        return R.ok("success", null);
    }

    @ApiOperation(value = "接受Json参数", notes = "empVo")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public R deleteEmp(@RequestBody Emp emp) throws Exception {
        log.info("传入参数为{}", emp);
        empService.removeById(emp.getId());
        return R.ok("success", null);
    }


}
