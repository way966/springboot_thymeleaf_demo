package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @Auther: lhq
 * @Date: 2021/1/28 10:29
 * @Description:
 */
@Controller    //注意：如果使用thymeleaf模板  则注解需要使用Controller
public class TestController {

    @RequestMapping("/hello")
    public String index(Model model) {
        model.addAttribute("message", "欢迎来到优就业学习");
        return "index01";
    }


    @RequestMapping("/findOne")
    public String findOne(Model model) {
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        user.setAge(35);


        Map<String, Object> map = new HashMap<>();
        map.put("id", "1");
        map.put("name", "李四");
        map.put("sex", "男");

        model.addAttribute("user", user);

        model.addAttribute("map", map);
        return "index02";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        User user1 = new User();
        user1.setId(1L);
        user1.setName("张三");
        user1.setAge(35);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("李四");
        user2.setAge(48);

        User user3 = new User();
        user3.setId(3L);
        user3.setName("王五");
        user3.setAge(56);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("list", list);
        return "index03";
    }

    @RequestMapping("/index04")
    public String index04(Model model) {
        model.addAttribute("message", "欢迎来到优就业学习");
        return "index04";
    }

    @RequestMapping("/index05")
    public String index05(Model model) {
        model.addAttribute("flag", "yes");

        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");

        return "index05";
    }


    @RequestMapping("/index06")
    public String index06(Model model){
        model.addAttribute("date",new Date());
        model.addAttribute("number",123.456);
        String str = "Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，" +
                "不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。" +
                "\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\\r\\n\n";
        model.addAttribute("str",str);
        return "index06";
    }
}
