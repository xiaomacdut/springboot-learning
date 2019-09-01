package com.xiaoma.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaoma.dao.UserService;
import com.xiaoma.entity.User;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@Controller
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService useService;
    
    
    @RequestMapping(path = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String add(){
        User user = new User();
        user.setUserName("asdfads");
        user.setPassWord("1111111111");
        useService.addUser(user);
        return "add successfuly";
    }


}