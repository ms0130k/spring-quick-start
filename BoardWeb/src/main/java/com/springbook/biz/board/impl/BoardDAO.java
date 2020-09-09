package com.springbook.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;

@Repository("boardDAO")
public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private final String BOARD_INSERT = "INSERT INTO board (seq, title, writer, content) values ((SELECT NVL(MAX(seq), 0) + 1 FROM board), ?, ?, ?)";
	private final String BOARD_UPDATE = "UPDATE SET board title=?, writer=?, content=? WHERE seq=?";
	private final String BOARD_DELETE = "DELETE FROM board WHERE seq=?";
	private final String BOARD_GET = "SELECT * FROM board WHERE seq=?";
	private final String BOARD_LIST = "SELECT * FROM board ORDER BY seq DESC";
	
//	119page 계속
}
