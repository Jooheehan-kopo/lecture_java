package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import UTIL.ConnectionFactory;
import UTIL.JDBCClose;
import VO.LoginVO;


public class LoginDAO {
	// 게시글 관리.

	public LoginDAO() {
		
	}

	public LoginVO 로그인(String ID) throws Exception {
		LoginVO login= new LoginVO();
		Connection conn =null;
		PreparedStatement pstmt =null;
		try {
			conn= new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("select USER_ID, USER_PW,USER_NAME,USER_JUMIN FROM USER_INFO ");
			sql.append("where USER_ID= ? ");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1,ID);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("USER_ID");
				String pwd= rs.getString("USER_PW");
				String name = rs.getString("USER_NAME");
				String jumin = rs.getString("USER_JUMIN");
				login = new LoginVO(id,pwd,name,jumin);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return login;
	}
	
	
	public void 회원가입(LoginVO newuser) throws Exception {
		LoginVO userinfo= new LoginVO();
		Connection conn =null;
		PreparedStatement pstmt =null;
		try {
			conn= new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO USER_INFO(USER_ID, USER_PW,USER_NAME,USER_JUMIN)");
			sql.append("VALUES(?,?,?,?) ");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1,newuser.getId());
			pstmt.setString(2,newuser.getPwd());
			pstmt.setString(3,newuser.getName());
			pstmt.setString(4,newuser.getUserno()); //vo 에서 값을 가져옴.
			
			pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
		
	
	}
	
	
	
	

//	public LoginVO 회원가입(int no) throws Exception {
//		for (LoginVO joinnew : list) {
//			if (LoginVO.getId() == joinnew)
//				return board;
//		}
//		return null; // 내가 원하는 게시글 번호가 없을시.
//	}
//
//	
//	public void 정보수정(BoardVO board) { // 번호와 제목을 가지고 있음
//		for (BoardVO vo : list) {
//			if (vo.getNo() == board.getNo()) {
//				vo.setTitle(board.getTitle());
//				return;
//			}
//		}
//	}




}
