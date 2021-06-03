package UI;

public class ExitUI extends BankUI {

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("==================================");
		System.out.println("\n\t 통합계좌 시스템을 종료합니다.\n");
		System.out.println("==================================");
		System.exit(0);
	}

}
