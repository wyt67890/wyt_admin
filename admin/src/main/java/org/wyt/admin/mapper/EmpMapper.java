package org.wyt.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.wyt.admin.domain.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 11978
* @description 针对表【emp】的数据库操作Mapper
* @createDate 2023-02-04 08:56:18
* @Entity org.wyt.admin.domain.Emp
*/
@Mapper
public interface EmpMapper extends BaseMapper<Emp> {

}




