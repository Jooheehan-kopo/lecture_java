package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import UTIL.ConnectionFactory;
import UTIL.JDBCClose;
import VO.BankVO;


public class BankDAO {
	// 게시글 관리.

	public BankDAO() {
		
	}

	public List<BankVO> 전체계좌조회서비스(String userno) throws Exception {
		List<BankVO> bankinfo = new ArrayList<BankVO>();
		Connection conn =null;
		PreparedStatement pstmt =null;
		try {
			conn= new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT *FROM BANK_INFO ");
			sql.append("where BANK_JUMIN= ? ");
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1,userno);
		
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
			
				userno= rs.getString("BANK_JUMIN");
				String name= rs.getString("USER_NAME");
				String accid=rs.getString("USER_ACC_ID");
				int bcode=rs.getInt("BANK_CODE");
				String bname=rs.getString("BANK_NAME");
				String bstatus=rs.getString("EXCHANGE_STATUS");
				int acctotal=rs.getInt("ACC_TOTAL");
				String accpw=rs.getString("BANK_PW");
				Date accdate=rs.getDate("ACC_DATE");
				String accname = rs.getString("ACC_NAME");
				
				BankVO bankall = new BankVO(userno,name,accid,bcode,bname,bstatus,acctotal,accpw,accdate,accname);
				bankinfo.add(bankall);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return bankinfo;
	}

	

	
	public void 개좌개설(BankVO newacc) throws Exception {
		
		Connection conn =null;
		PreparedStatement pstmt =null;
		try {
			conn= new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO BANK_INFO(BANK_JUMIN,USER_NAME,BANK_PW,BANK_CODE,USER_ACC_ID, BANK_NAME, "
					+ " EXCHANGE_STATUS,ACC_TOTAL,ACC_NAME)");
			sql.append("VALUES(?,?,?,?,'111'||lpad(BANK_INFO_ACC.NEXTVAL,11,0),?,?,?,?) ");
			
	 // 계좌번호 앞자리 고정 어떻게함?/ bank코드 값으로 이름 연결하기. (완료)
			//앞자리: '123'||시퀀스 / 코드: ui에서 스위치로 설정.
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1,newacc.getUserno());
			pstmt.setString(2,newacc.getName());
			pstmt.setString(3,newacc.getAccpw());
			pstmt.setInt(4,newacc.getBcode());
			pstmt.setString(5,newacc.getBname());
			pstmt.setString(6, newacc.getBstatus()); //입출금 상태 - 입금제약과 연결.
			pstmt.setInt(7,newacc.getAcctotal()); //입금 제약 
			pstmt.setString(8,newacc.getAccname());
			
			pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pstmt);
		}
		
	
	}
	
	
	public String getAccId (String acc) throws Exception{
		String accid = "";		
		BankVO bank = new BankVO();
		Connection conn=null;
		PreparedStatement pstmt = null;
		conn=new ConnectionFactory().getConnection();
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT USER_ACC_ID "
				+ "FROM( SELECT USER_ACC_ID,ACC_DATE FROM BANK_INFO "
				+ "where BANK_JUMIN=? "
				+ "ORDER BY ACC_DATE DESC) "
				+ "WHERE ROWNUM=1 " );
		pstmt =conn.prepareStatement(sql.toString());
		pstmt.setString(1, acc);
		
	
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			accid = rs.getString("USER_ACC_ID");
		}
		return accid;
		
		//여기할차례!!!
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
