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

@WebServlet("*.do") //컨트롤러 기능의 클래스로 서버가 인식하도록 함
public class BoardController extends HttpServlet{

	public BoardController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
				
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
		
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo 호출!");
		
		request.setCharacterEncoding("utf-8");
		
		String viewPage = null; //글 목록 페이지 파일 이름
		
		String uri = request.getRequestURI();///jsp_mvc_board-20241212/list.jsp
		String conPath = request.getContextPath();///jsp_mvc_board-20241212
		String com = uri.substring(conPath.length());//uri - conPath(길이)->/list.jsp
		
//		System.out.println(uri);
//		System.out.println(conPath);
//		System.out.println(com);
		
		if(com.equals("/list.do")) {
			
			BoardDao boardDao = new BoardDao();
			List<BoardDto> bDtos = boardDao.board_list();
			request.setAttribute("boardList", bDtos);
			
			viewPage="list.jsp";
		} else if(com.equals("/write_form.do")) {
			viewPage="write_form.jsp";
		} else if(com.equals("/write.do")) {
			BoardDao boardDao = new BoardDao();
			String btitle = request.getParameter("btitle");
			String bname = request.getParameter("bname");
			String bcontent = request.getParameter("bcontent");
			
			boardDao.board_write(btitle, bname, bcontent);
			
			viewPage="list.do";//주의!! list.jsp X list.do O
		} else if(com.equals("/content_view.do")) {
			String bnum = request.getParameter("bnum"); // 유저가 글내용 보기를 원하는 클릭한 글의 번호 
			viewPage="content_view.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);	
	}
}