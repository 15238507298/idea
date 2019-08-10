package com.ac.front.actions;

import com.ac.beans.user;
import com.ac.interfaces.userInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="user/")
@Api("swagger ui 注释 api 级别")
public class userAction {

    @Autowired
    userInterface useri;
    @ApiOperation("swagger ui 注释 api 级别")
    @RequestMapping (value = "regist/")
public String registUser(@RequestParam("user") user user){
        com.ac.beans.user u = useri.loginUser(user);
        if(u!=null || u.getUsername()==null){
            useri.saveUser(user);
            return "success";
        }
    return "error";
}
}
