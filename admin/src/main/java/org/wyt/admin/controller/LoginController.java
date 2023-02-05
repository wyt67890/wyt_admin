package org.wyt.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wyt.admin.domain.User;
import org.wyt.admin.service.UserService;
import org.wyt.admin.utils.R;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;


/**
 * @author 吴宇桐
 * @description
 * @date 2023/2/4
 */
@Slf4j
@CrossOrigin(maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/user")
@Api(tags = "登录接口")
public class LoginController {


    @Autowired
    private UserService userService;

    /**
     * 登录方法
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "接受Json参数", notes = "Json类型为User")
    public R login(@RequestBody User user) {

        log.info("入参为{}", user);

        User loginUser = userService.lambdaQuery()
                .eq(User::getUsername, user.getUsername())
                .eq(User::getPassword, user.getPassword())
                .list().stream().findFirst().orElse(null);

        if (loginUser == null) {
            return R.error("用户名或密码错误", null);
        } else if (!Objects.equals(loginUser.getState(), "0")) {
            return R.error("该用户已被禁用，请联系管理员", null);
        } else {
            return R.ok("登录成功", new HashMap<String, String>() {{
                put("token", UUID.randomUUID().toString());
            }});
        }

    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ApiOperation(value = "接受token参数", notes = "")
    public R login(String token) {

        log.info("token为{}", token);
        Map<String, String> data = new HashMap<>();
        data.put("roles", "admin");
        data.put("name", "wyt");

        return R.ok(null, data);

    }
}
