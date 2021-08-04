package cn.hp.impl;

import cn.hp.dao.BusinessInfoDao;
import cn.hp.model.Business;
import cn.hp.util.ConnDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BusinessInfoDaoImpl implements BusinessInfoDao {
    @Override
    public int AddBusiness(Business b) {
        Connection conn= ConnDemo.getConn();
        String sql="INSERT into t_business VALUES(NULL,?,?,?)";
        int i=0;
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,b.getbNum());
            ps.setString(2,b.getbType());
            ps.setString(3,b.getbMark());
            i=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public List<Business> BusinessAll() {
        List<Business> business=new ArrayList<Business>();
        Connection conn= ConnDemo.getConn();
        String sql="select * from t_business ";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Business b=new Business();
                b.setbId(rs.getInt(1));
                b.setbNum(rs.getString(2));
                b.setbType(rs.getString(3));
                b.setbMark(rs.getString(4));
                business.add(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return business;
    }
}
