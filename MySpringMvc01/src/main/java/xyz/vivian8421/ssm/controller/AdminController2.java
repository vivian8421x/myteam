package xyz.vivian8421.ssm.controller;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import sun.misc.Request;
import xyz.vivian8421.ssm.entity.Admin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Vivian8421
 * @title: ItemController
 * @projectName MySpringMvc01
 * @date 2019/9/1310:06
 * @description:
 */
public class AdminController2 implements HttpRequestHandler {
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
                List<Admin> adminList=new ArrayList<Admin>();
        Admin admin1=new Admin();
        admin1.setAdminName("xixix");
        admin1.setAdminPwd("xxxxxxxxx");
        Admin admin2=new Admin();
        admin2.setAdminName("ffffff");
        admin2.setAdminPwd("ffff");
        adminList.add(admin1);
        adminList.add(admin2);
        httpServletRequest.setAttribute("adminList",adminList);
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/adminList.jsp").forward(httpServletRequest,httpServletResponse);
    }
    //    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.addObject("adminList", adminList);
//        modelAndView.setViewName("/WEB-INF/jsp/adminList.jsp");
//        return modelAndView;
//    }
}
