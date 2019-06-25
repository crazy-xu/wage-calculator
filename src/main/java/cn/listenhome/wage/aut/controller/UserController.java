package cn.listenhome.wage.aut.controller;


import cn.listenhome.wage.aut.entity.User;
import cn.listenhome.wage.aut.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xu.you
 * @since 2019-03-26
 */
@RestController
@RequestMapping("/aut/user")
public class UserController {

    @Autowired
    private IUserService userService;
    @RequestMapping("/list")
    public List<User> findList () {
        return userService.list();
    }
}
