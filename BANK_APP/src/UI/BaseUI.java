package UI;

import java.util.Scanner;

import SERVICE.AccountService;
import SERVICE.AccountServiceFactory;
import SERVICE.BankService;
import SERVICE.BankServiceFactory;
import VO.LoginVO;


public abstract class BaseUI implements IBankUI {
	
	public static LoginVO sessionLoginVO;
	
	private Scanner sc;
	protected BankService service;
	protected AccountService accservice;
	
	   public BaseUI() {
	      sc = new Scanner(System.in);
	    service = BankServiceFactory.getInstance();
	    accservice =AccountServiceFactory.getInstance(); //계좌정보 서비스팩토리 추가
	   }
	   	

	   //문자를 입력받는 메소드
	   protected String scanStr(String msg) {
	      System.out.println(msg);
	      String str = sc.nextLine();
	      return str;
	   }
	   
	   //숫자를 입력받는 메소드
	   protected int scanInt(String msg) {
	      int num = Integer.parseInt(scanStr(msg));
	      return num;
	   }
}

