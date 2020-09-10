package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class JDBCUtil {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/boardweb?serverTimezone=Asia/Seoul", "root", "ansgjs12)(*&");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(PreparedStatement stmt, Connection conn) {
		closePreparedStatement(stmt);
		closeConnection(conn);
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		closeResultSet(rs);
		closePreparedStatement(stmt);
		closeConnection(conn);
	}
	
	private static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				if (!rs.isClosed()) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}
		}
	}
	
	private static void closePreparedStatement(PreparedStatement stmt) {
		if (stmt != null) {
			try {
				if (!stmt.isClosed()) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				stmt = null;
			}
		}
	}
	
	private static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				if (!conn.isClosed()) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
	}
}
