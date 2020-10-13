package com.lx.controller;

import com.lx.mapper.UserMapper;
import com.lx.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 留香
 * @Describe 描述
 * @create 2020-10-13-13:54
 */
@Controller
public class MyBatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @RequestMapping("/selectList")
    public void selectList() {
        System.err.println("执行了");
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @ResponseBody
    @RequestMapping("/saveUser")
    public void saveUser() {
        User user = new User();
        user.setName("留香");
        user.setAge(1);
        user.setEmail("13793@qq.com");
        int insert = userMapper.insert(user);
        System.err.println("添加返回的内容：" + insert);

    }
}
