package org.tjnutt.lying.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tjnutt.lying.entity.Result;
import org.tjnutt.lying.entity.Users;
import org.tjnutt.lying.service.UsersService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class Usercontroller {
    @Autowired
    private  UsersService usersService;
    @GetMapping("/all")
    public Result getAllUsers() {
        List<Users> usersList=usersService.list();
        log.info("获取所有用户");
        Result result = Result.success(usersList);
        return result; // 获取所有用户
    }


}
