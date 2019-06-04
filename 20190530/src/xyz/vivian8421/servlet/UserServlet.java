package xyz.vivian8421.servlet;

import xyz.vivian8421.entity.User;
import xyz.vivian8421.service.impl.UserServiceImpl;
import xyz.vivian8421.service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");

        System.out.println(username+":"+password+":"+sex);

        User u =new User();
        u.setUsername(username);
        u.setPassword(password);
        u.setSex(sex);
        userService userService =new UserServiceImpl();
        int rows =userService.addUser(u);
        if (rows>0){
            request.setAttribute("msg","添加成功");
            request.getRequestDispatcher("/message.jsp").forward(request,response);
        }
        else {
                request.setAttribute("msg","添加失败");
                request.getRequestDispatcher("/message.jsp").forward(request,response);
        }

    }
}
