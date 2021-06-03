package UI;

import VO.BankVO;

public class MakeAccountUI extends AccountUI {

	@Override
	public void execute() throws Exception {

		int bcode = front();
		String bname = main(bcode);

		BankVO addacc = new BankVO();
		String name = scanStr("이름을 입력하세요: ");
		addacc.setName(name);
		addacc.setBname(bname);
		addacc.setBcode(bcode);

		while (true) {
			String pwd = scanStr("Password를 등록하세요: ");
			String pwd2 = scanStr("Password를 한번 더 입력하세요: ");
			if (pwd.equals(pwd2)) {
				addacc.setAccpw(pwd2);
				break;
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				continue;
			}

		}

		while (true) {
			String userno = scanStr("주민등록번호를 입력하세요(******-******* 형태 -포함)"); // 로그인과비교
			if (userno.equals(sessionLoginVO.getUserno())) {

				addacc.setUserno(userno);
				break;
			} else {
				System.out.println("없는 회원입니다. 다시 입력하세요.");
				continue;
			}
		}

		while (true) {
			int mymoney = scanInt("입금하실 금액을 입력하세요. (1000원 이상)");
			System.out.println(mymoney);
			if (mymoney >= 1000) {
				System.out.println(mymoney + "원 입금되었습니다.");
				addacc.setAcctotal(mymoney);
				break;
			} else {
				System.out.println("1000원 이상부터 입금 가능합니다.");
			}
		}

		String accname = scanStr("계좌이름(별칭)을 입력하세요: ");
		// 값받아서 저장. 서비스로 넘겨줌. 각 항목에 따른 제약조건, 마지막으로 최종 확인 후 저장.

		addacc.setAccname(accname);
		addacc.getAccid();// 계좌 자동배정후 입력 필수!
		accservice.계좌개설서비스(addacc);
		System.out.println("***** [" + name + "] 님 계좌가 개설되었습니다! *****");
		System.out.println(">[" + bname + "은행] " + "계좌번호: " + accservice.getAccId(addacc.getUserno())); // 쿼리 띄어쓰기

	}

	public int front() throws Exception {
		System.out.println("=============================================================");
		System.out.println("\t 계좌를 생성할 은행을 선택하세요.");
		System.out.println("[1] 하나은행 \n[2] 우리은행\n[3] 기업은행 \n[4] 국민은행 \n[5] 신한은행");
		int chooseB = scanInt("번호 선택: ");
		return chooseB;
	}

	public String main(int c) throws Exception {
		switch (c) {
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
