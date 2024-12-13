package com.jbedu.board.controller;

import java.io.IOException;
import java.util.List;

import com.jbedu.board.dao.BoardDao;
import com.jbedu.board.dto.BoardDto;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")  // Controller 기능의 클래스로 서버가 인식하도록 함 
public class BoardController extends HttpServlet{

	public BoardController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 중요한 건 매개변수!!
		System.out.println("doGet 호출");
		request.setCharacterEncoding("utf-8");		

		String viewPage = ""; //글 목록 페이지 파일 이름
				
		String uri = request.getRequestURI();  // /jsp_mvc_board-20241212_jy/list.jsp
		String conPath = request.getContextPath();  // /jsp_mvc_board-20241212_jy
		String com = uri.substring(conPath.length()); // uri-conPath(길이) -> /list.jsp
		
		System.out.println(uri);
		System.out.println(conPath);
		System.out.println(com);
		
		if(com.equals("/list.do")) {
			
			BoardDao boardDao = new BoardDao();
			List<BoardDto> bDtos = boardDao.board_list();
			request.setAttribute("boardList", bDtos);
			
			viewPage="list.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
				
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 중요한 건 매개변수!!
		 
	}


	
}
