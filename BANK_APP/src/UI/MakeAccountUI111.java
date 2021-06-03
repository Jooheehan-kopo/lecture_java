package UI;

import VO.BankVO;

public class MakeAccountUI111 extends AccountUI {

	@Override
	public void execute() throws Exception {
		
		int bcode = front();
		String bname = main(bcode);
		
		String name= scanStr("이름을 입력하세요: ");
		String pwd = scanStr("Password를 등록하세요: ");
		String pwd2 = scanStr("Password를 한번 더 입력하세요: ");
		
		String userno= scanStr("주민등록번호를 입력하세요(******-******* 형태 -포함)"); //로그인과비교
		Integer mymoney= scanInt("입금하실 금액을 입력하세요. (1000원 이상)");
		String accname= scanStr("계좌이름(별칭)을 입력하세요: ");
		
		//값받아서 저장. 서비스로 넘겨줌. 각 항목에 따른 제약조건, 마지막으로 최종 확인 후 저장.
		BankVO addacc = new BankVO();
		addacc.setBcode(bcode);
		addacc.setName(name);
		addacc.setAccpw(pwd2);
		addacc.setUserno(userno);
		addacc.setBname(bname);
		addacc.setAcctotal(mymoney);
		addacc.setAccname(accname);
		addacc.getAccid();// 계좌 자동배정후 입력 필수!
		accservice.계좌개설서비스(addacc);
		System.out.println("***** ["+name+"] 님 계좌가 개설되었습니다! *****");
		
//		String str= accservice.getAccId(addacc.getUserno());
//		System.out.println(str);
		System.out.println(">["+bname+"은행] "+"계좌번호: "+accservice.getAccId(addacc.getUserno())); //쿼리 띄어쓰기
	
	}
	
	public int front() throws Exception{
		System.out.println("=============================================================");
		System.out.println("\t 계좌를 생성할 은행을 선택하세요.");
		System.out.println("[1] 하나은행 \n[2] 우리은행\n[3] 기업은행 \n[4] 국민은행 \n[5] 신한은행");
		int chooseB = scanInt("번호 선택: ");
		return chooseB;
	}
	public String main(int c) throws Exception {
		switch(c) {
		case 1:
			return "하나";
		case 2:
			return "우리";
		case 3:
			return "기업";
		case 4:
			return "국민";
		case 5: 
			return "신한";
		}
		return null;

	}

	
}
