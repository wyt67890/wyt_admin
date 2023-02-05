package org.wyt.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.wyt.admin.domain.User;
import org.wyt.admin.service.UserService;
import org.wyt.admin.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 11978
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-02-04 09:42:08
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




