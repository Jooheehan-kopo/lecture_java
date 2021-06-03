package SERVICE;

import DAO.LoginDAO;
import VO.LoginVO;


public class BankService {

//	private BoardDAO dao;
	private LoginDAO dao;
//	private static int boardNo =1; // 게시글 등록할때마다 나오는 번호 --> 클래스를 따로 만들어줌.
	
	public BankService() {
		dao = new LoginDAO();
		
	}
	public LoginVO 로그인서비스 (String ID) throws Exception{
		LoginVO user = dao.로그인(ID);
		return user;
			
	}
	public void 회원가입서비스 (LoginVO newuser) throws Exception{
		dao.회원가입(newuser);
		
	}
}
