package SERVICE;
//보드서비스 인스턴스 객체 만들어줌.
public class BankServiceFactory {
	   private static BankService service;
	   //private static final BoardService service = new BoardService();
	   
	   public static BankService getInstance() {
	      if(service == null)
	         service = new BankService();
	      	
	      
	      //if(service == null)
	      //   service = new BoardService();
	      return service;
	   }

	}