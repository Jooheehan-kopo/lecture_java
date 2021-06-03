package UI;

import VO.LoginVO;

public class LoginUI extends BankUI {

	@Override
	public void execute() throws Exception {
		String id = scanStr("ID를 입력하세요: ");
		String pwd = scanStr("Password를 입력하세요: ");

		LoginVO user = service.로그인서비스(id);
		//System.out.println(user);

		if(user.getId()==null) {
			System.out.println("Id가 존재하지 않습니다.");
		} else{
			if(user.getId().equals(id) && user.getPwd().equals(pwd)) {
				System.out.println(user.getName() + "님 환영합니다!");
				sessionLoginVO = user;
				AccountUI au = new AccountUI();
				au.execute();  // ADMIN 일 경우 여기서 항목 분리.
			} else if (!user.getPwd().equals(pwd)) {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}

	}

}
