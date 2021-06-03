package UI;

public class TransferLogUI extends AccountUI {

	@Override
	public void execute() throws Exception {
	
	while(true) {
		try {
			TransferLogUI ui= null;
			
			int trans =front();
			switch(trans) {
			case 1:
				ui = new DoTransUI();
				break;
			case 2:
				ui = new ShowTransUI();
				break;
			}
			if(ui != null)
				ui.execute();
			else
				System.out.println("다시 선택하세요.");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	}
	public int front() throws Exception{
		System.out.println("=============================================================");
		int trans = scanInt("서비스를 선택해주세요. \n[1] 계좌이체 \n[2] 입출금내역 ");
		System.out.println("=============================================================");
		return trans;
	
	}
	

}
