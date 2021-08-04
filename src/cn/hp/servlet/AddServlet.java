package cn.hp.servlet;

import cn.hp.dao.BusinessInfoDao;
import cn.hp.impl.BusinessInfoDaoImpl;
import cn.hp.model.Business;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/business_Edit")
public class AddServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String bNum=req.getParameter("bNum");
        String bType=req.getParameter("bType");
        String bMark=req.getParameter("bMark");

        //将数据存在 business中
        Business b=new Business(0,bNum,bType,bMark);

        BusinessInfoDao bd=new BusinessInfoDaoImpl();

        int flag=bd.AddBusiness(b);

        List<Business> list=bd.BusinessAll();
        req.getSession().setAttribute("list",list);
        if (flag>0){
resp.sendRedirect("businessList.jsp");



        }
    }
}
