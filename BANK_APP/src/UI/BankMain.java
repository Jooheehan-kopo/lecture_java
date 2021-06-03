package UI;

public class BankMain {

	public static void main(String[] args) {
		BankUI ui = new BankUI();
		try {
			ui.execute();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
