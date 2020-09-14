package com.springbook.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.springbook.biz.common.JDBCUtil;
import com.springbook.biz.user.UserVO;

public class UserDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private final String USER_GET = "SELECT id, password, name, role FROM users WHERE id = ? AND password = ?";
	
	public UserVO getUser(UserVO vo) {
		UserVO user = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			
			
			if (rs.next()) {
				user = new UserVO();
				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setRole(rs.getString("role"));
			}
			
//			for (int i = 0; i < 1; i--) {
//				if (rs.next()) {
//					user = new UserVO();
//					user.setId(rs.getString(1));
//					user.setPassword(rs.getString(2));
//					user.setName(rs.getString(3));
//					user.setRole(rs.getString(4));
//				} else {
//					break;
//				}
//			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		
		return user;
	}
}
