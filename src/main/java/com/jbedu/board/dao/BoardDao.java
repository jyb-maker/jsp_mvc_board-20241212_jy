package com.jbedu.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.jbedu.board.dto.BoardDto;

public class BoardDao {

	public List<BoardDto> board_list() { //모든 게시판 글 목록 가져오기 
		
		String sql = "SELECT * FROM mvc_board ORDER BY bnum DESC"; //게시판 모든 글 가져오기 
		
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jsp_project";
		String username = "root";
		String password = "12345";
		
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;  // SELECT 문구에는 필요
		List<BoardDto> bDtos = new ArrayList<BoardDto>();
		
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, username, password);
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) { // 글(레코드)의 갯수만큼 반복 
				int bnum = rs.getInt("bnum");
				String bname = rs.getString("bname");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				Timestamp bdate = rs.getTimestamp("bdate"); // 날짜 타입
				int bhit = rs.getInt("bhit");
						
				BoardDto bDto = new BoardDto(bnum,bname,btitle,bcontent,bdate,bhit);
				bDtos.add(bDto);
			}			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return bDtos; //board_list 메소드를 호출 시 최종적으로 반환되는 글들이 모여있는 리스트 값
	}
	
}
