package UI;

import VO.LoginVO;

public class JoinNewUI extends BankUI {

	@Override
	public void execute() throws Exception {
		LoginVO newuser = new LoginVO();
		while (true) {

			String id = scanStr("ID를 등록하세요: "); // 중복체크필요
			LoginVO idcheck = service.로그인서비스(id);

			if (idcheck.getId() !=  null) {
					System.out.println("이미 존재하는 ID입니다. 다시 입력하십시오");
					continue;
			} else {
				newuser.setId(id);
				break;
			}
		}

		while (true) {
			String pwd = scanStr("Password를 등록하세요: "); // 영어숫자문자 제약
			String pwd2 = scanStr("Password를 다시 한번 입력하세요: ");
			if (pwd.equals(pwd2)) {
				newuser.setPwd(pwd2);
				String name = scanStr("이름을 입력하세요: ");
				newuser.setName(name);
				String userno = scanStr("주민등록번호를 입력하세요(******-******* 형태 -포함)");
				if (userno.equals(service.로그인서비스(userno))) {
					System.out.println("이미 존재하는 회원입니다. 로그인 하십시오.");
					break;
				} else {
					newuser.setUserno(userno);
				}

			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}

			// LoginVO newuser = new LoginVO();
			// newuser.setId(id);

			service.회원가입서비스(newuser);
			// service 연결
			System.out.println(newuser.getName() + "님, 회원이 되신것을 축하합니다!");
			break;
		}

	}
}
