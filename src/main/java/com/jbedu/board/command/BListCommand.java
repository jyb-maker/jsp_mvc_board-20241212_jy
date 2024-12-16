package com.jbedu.board.command;

import java.util.List;

import com.jbedu.board.dao.BoardDao;
import com.jbedu.board.dto.BoardDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BListCommand implements BCommand {
	public void execute(HttpServletRequest request, HttpServletResponse response) {
	BoardDao boardDao = new BoardDao();
	List<BoardDto> bDtos = boardDao.board_list();
	request.setAttribute("boardList", bDtos);	

	}
}