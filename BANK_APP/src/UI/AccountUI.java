package UI;

//계좌조회
public class AccountUI extends BaseUI {

	@Override
	public void execute() throws Exception {

//		AccountUI ui = null;
//		int type = menu();
//		MyBank mb = new MyBank();
//		mb.execute(); 

		while (true) {
			try {
				AccountUI ui = null;

				int type = menu();
				switch (type) {
				case 1:
					ui = new MyBankUI();
					break;
				case 2:
					ui = new MyBankAllUI();
					break;
				case 3:
					ui = new TransferLogUI();
					break;
				case 4:
					ui = new MakeAccountUI();
					break;
				
				}
				if (ui != null)
					ui.execute();
				else
					System.out.println("다시 선택하세요.");
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

	private int menu() {
		System.out.println("===================================");
		System.out.println("<통합계좌센터> \n 원하는 서비스를 선택하세요.");
		System.out.println("===================================");
		System.out.println("[1] 은행별 계좌정보출력 \n[2] 나의 전체 계좌목록보기 \n[3] 계좌이체 \n[4] 계좌 만들기 ");
		int type = scanInt("원하시는 서비스를 선택하세요: ");
		return type;

	}

}
