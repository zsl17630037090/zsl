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

@WebServlet("/businessList")
public class BusinessServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text html;charset=utf-8");
        BusinessInfoDao bid = new BusinessInfoDaoImpl();


        List<Business> list = bid.BusinessAll();
        req.getSession().setAttribute("list", list);
        req.getRequestDispatcher("businessList.jsp").forward(req, resp);
    }
}
