package UI;

public class DoTransUI extends TransferLogUI {

	@Override
	public void execute() throws Exception {
		
		System.out.println("===================================================");
		System.out.println("\t 계좌이체를 진행합니다");
		System.out.println("===================================================");
		System.out.println("받는 사람의 계좌번호를 입력해주세요. ");
		String sendacc = scanStr(">");
		System.out.println("이체할 금액을 입력해주세요. ");
		String howmuch = scanStr(">");
		System.out.println(sendacc+"계좌로"+ howmuch+ "원 이체를 진행하시겠습니까? (y/n)");
		String check = scanStr(">");
		if(check =="y") {
			
		}
	}



}
