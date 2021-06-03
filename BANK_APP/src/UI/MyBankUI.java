package UI;

import java.util.List;

import VO.BankVO;

public class MyBankUI extends AccountUI {

	@Override
	public void execute() throws Exception {
		
		System.out.println("=============================================================");
		System.out.println("\t 계좌를 조회할 은행을 선택하세요.");
		System.out.println("[1] 하나은행 \n[2] 우리은행\n[3] 기업은행 \n[4] 국민은행 \n[5] 신한은행");
		System.out.println("==========================");
		int bankinput = scanInt("번호 입력: ");
		List<BankVO> list = accservice.은행별계좌조회서비스(sessionLoginVO, bankinput);
		
		System.out.println("<< "+sessionLoginVO.getName()+"님의 계좌 정보입니다 >>");
		System.out.println("계좌번호  \t 잔액   \t입출금내역 별칭 \t 계좌개설일");
		for (BankVO bankVO : list) {
			//번호 부여해주고 싶었음.
			System.out.println(bankVO.getAccid()+"\t"+ bankVO.getAcctotal()+"\t"+ bankVO.getBstatus()+"\t"+   bankVO.getAccname()+"\t"+  bankVO.getAccdate());
			System.out.println();
		}
		
//		System.out.println("===================================");
//		if(list.size()==0) {
//			System.out.println("존재하지 않는 회원입니다.");
//		} else{
//			System.out.println("보유하고 계신 전체계좌입니다.");
//			for(BankVO bankall :list ) {
//				System.out.println("---------------------------------------------------------");
//				System.out.println("이름\t은행코드\t은행명\t 계좌번호    \t보유잔액\t입출금내역\t 계좌별칭");
//				System.out.println(bankall.getName()+"\t "+bankall.getBcode()+"\t "+bankall.getBname()+"\t "+bankall.getAccid()
//				+"\t "+bankall.getAcctotal()+"\t "+bankall.getBstatus()+"\t "+bankall.getAccname());
//			
//				
//			}
//		} if (!bank.getUserno().equals(userno)) {
//			System.out.println("주민번호가 틀렸습니다. 다시 입력하세요.");
//		}
//		System.out.println("===================================");
//

	}


	

}
