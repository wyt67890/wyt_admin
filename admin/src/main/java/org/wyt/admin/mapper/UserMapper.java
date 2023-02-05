package org.wyt.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.wyt.admin.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 11978
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-02-04 09:42:08
* @Entity org.wyt.admin.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




