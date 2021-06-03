package UI;

public class BankUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		while (true) {

			try {
				BankUI ui = null;
				int type = menu();
				switch (type) {
				case 1:
					ui = new LoginUI();
					break;
				case 2:
					ui = new JoinNewUI();
					break;
				case 3:
					ui = new UpdateUI();
					break;
				case 4:
					ui = new ExitUI();
					break;

				}
				if (ui != null)
					ui.execute();
				else
					System.out.println("1,2,3번 중에 선택하십시오");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
	private int menu() {
		System.out.println("===================================");
		System.out.println("\t 통합계좌 시스템에 오신것을 환영합니다");
		System.out.println("===================================");
		System.out.println("[1] 로그인 \n[2] 회원가입\n[3] 정보수정\n[4] 종료");
		int type = scanInt("원하시는 서비스를 선택하세요: ");
		return type;
				
	}
}
