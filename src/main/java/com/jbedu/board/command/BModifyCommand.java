package com.jbedu.board.command;

import com.jbedu.board.dao.BoardDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BModifyCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String bnum = request.getParameter("bnum");//유저가 수정을 원하는 글의 번호
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		BoardDao boardDao = new BoardDao();
		boardDao.board_modify(bnum, bname, btitle, bcontent);
		
	}

}
