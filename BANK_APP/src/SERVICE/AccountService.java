package SERVICE;

import java.util.List;

import DAO.BankDAO;
import VO.BankVO;
import VO.LoginVO;


public class AccountService {

//	private BoardDAO dao;
	private BankDAO dao;
//	private static int boardNo =1; // 게시글 등록할때마다 나오는 번호 --> 클래스를 따로 만들어줌.
	
	public AccountService() {
		dao = new BankDAO();
		
	}
	public List<BankVO> 은행별계좌조회서비스 (LoginVO login, int bankCode) throws Exception{
		List<BankVO> bankeach  = dao.전체계좌조회서비스(login.getUserno());
		for (int j = 0; j < bankeach.size(); j++) {
			if(bankeach.get(j).getBcode() != bankCode){
				bankeach.remove(j);
			}
			
		}
		return bankeach;
		
			
	}
	public  List<BankVO> 전체계좌조회서비스 (String userno) throws Exception{
		List<BankVO> bankall = dao.전체계좌조회서비스(userno);
		return bankall;
			
	}
	public void 계좌개설서비스 (BankVO newacc) throws Exception{
		
		 dao.개좌개설(newacc);
	}
	public String getAccId(String getacc) throws Exception{
		String accid = dao.getAccId(getacc);
		return accid;
	}
	
	// dao와 연결 (객체 이름)
}
