package xyz.vivian8421.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import xyz.vivian8421.ssm.entity.Admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Vivian8421
 * @title: ItemController
 * @projectName MySpringMvc01
 * @date 2019/9/1310:06
 * @description:
 */
@Controller
public class AdminController3 {
    @RequestMapping("/queryMapper")
    public ModelAndView query() throws Exception {
        List<Admin> adminList=new ArrayList<Admin>();
        Admin admin1=new Admin();
        admin1.setAdminName("xixix");
        admin1.setAdminPwd("xxxxxxxxx");
        Admin admin2=new Admin();
        admin2.setAdminName("ffffff");
        admin2.setAdminPwd("ffff");
        adminList.add(admin1);
        adminList.add(admin2);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("adminList", adminList);
        modelAndView.setViewName("/WEB-INF/jsp/adminList.jsp");
        return modelAndView;
    }
}
