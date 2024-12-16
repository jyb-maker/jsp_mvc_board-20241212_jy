package com.jbedu.board.command;

import com.jbedu.board.dao.BoardDao;
import com.jbedu.board.dto.BoardDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BModifyFormCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String bnum = request.getParameter("bnum");
		BoardDao boardDao = new BoardDao();
		BoardDto boardDto = boardDao.content_view(bnum);
		request.setAttribute("boardDto", boardDto);
		
	}

}
