package com.jbedu.board.command;

import com.jbedu.board.dao.BoardDao;
import com.jbedu.board.dto.BoardDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BContentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String bnum = request.getParameter("bnum");
		BoardDao boardDao = new BoardDao();
		boardDao.up_hit(bnum); // 조회수 증가
		BoardDto boardDto = boardDao.content_view(bnum);
		request.setAttribute("boardDto", boardDto);
		
	}

}
