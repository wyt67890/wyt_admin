package org.wyt.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.wyt.admin.domain.Emp;
import org.wyt.admin.domain.EmpVo;

/**
 * @author 11978
 * @description 针对表【emp】的数据库操作Service
 * @createDate 2023-02-04 08:56:18
 */
public interface EmpService extends IService<Emp> {

    IPage<Emp> getEmpList(EmpVo empVo) throws Exception;
}
