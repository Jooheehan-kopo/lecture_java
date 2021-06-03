package UI;

import java.util.List;

import VO.BankVO;

public class MyBankAllUI extends AccountUI {

	@Override
	public void execute() throws Exception {
		System.out.println("'나의 전체계좌 목록보기' 서비스입니다.");
		String userno = scanStr("계좌조회를 위해, 주민번호를 입력해주세요: ");

		if (userno.equals(sessionLoginVO.getUserno()) ) {
			List<BankVO> list = accservice.전체계좌조회서비스(userno);
			System.out.println("===================================");
			for (BankVO bankall : list) {
				System.out.println("---------------------------------------------------------");
				System.out.println("이름\t은행코드\t은행명\t 계좌번호    \t보유잔액\t입출금내역\t 계좌별칭");
				System.out.println(bankall.getName() + "\t " + bankall.getBcode() + "\t " + bankall.getBname() + "\t "
						+ bankall.getAccid() + "\t " + bankall.getAcctotal() + "\t " + bankall.getBstatus() + "\t "
						+ bankall.getAccname());
			}
		} else {
			System.out.println("주민번호가 틀렸습니다. 다시 입력하세요.");
		}

		System.out.println("===================================");

	}

}
