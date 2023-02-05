package org.wyt.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.wyt.admin.domain.Emp;
import org.wyt.admin.domain.EmpVo;
import org.wyt.admin.mapper.EmpMapper;
import org.wyt.admin.service.EmpService;

/**
 * @author 11978
 * @description 针对表【emp】的数据库操作Service实现
 * @createDate 2023-02-04 08:56:18
 */
@Service
@Slf4j
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp>
        implements EmpService {

    @Override
    public IPage<Emp> getEmpList(EmpVo empVo) throws Exception {

        QueryWrapper<Emp> wrapper = new QueryWrapper<>();

        int currentPage = empVo.getPage();
        int pageSize = empVo.getLimit();

        log.info("{},{}", currentPage, pageSize);

        Page<Emp> page = new Page<>(currentPage, pageSize);


        wrapper.lambda().eq(empVo.getEmpName() != null, Emp::getEmpName, empVo.getEmpName())
                .eq(empVo.getEmpDegreeName() != null, Emp::getEmpDegreeName, empVo.getEmpDegreeName())
                .eq(empVo.getDeptName() != null, Emp::getDeptName, empVo.getDeptName());

        baseMapper.selectPage(page, wrapper);

        return page;
    }
}




