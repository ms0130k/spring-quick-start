package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		BoardVO vo = new BoardVO();
		vo.setTitle("test subject");
		vo.setWriter("test writer");
		vo.setContent("test content");
		boardService.insertBoard(vo);
		
		List<BoardVO> boards = boardService.getBoardList();
		for (BoardVO board : boards) {
			System.out.println(board);
		}
		
		container.close();
	}
}
