package cn.hp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDemo {
	private static String Driver = "com.mysql.jdbc.Driver";
//	三级联动
//	private static String Url = "jdbc:mysql://localhost:3306/provices?characterEncoding=utf8";
//	分页
//	private static String Url = "jdbc:mysql://localhost:3306/sushe?characterEncoding=utf8";
//	项目 宿舍系统
	private static String Url = "jdbc:mysql://localhost:3306/bank_exam?characterEncoding=utf8";


	private static String user = "root";
	private static String pwd = "123456";
	public static Connection conn;

	// 创建数据库连接
	public static Connection getConn() {
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(Url, user, pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	// 关闭数据库连接
	public static void getClose() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 测试数据库连接
	public static void main(String[] args) {
		System.out.println(getConn());
		if (getConn()!=null) {
			System.out.println("连接成功");		}
	}
}
