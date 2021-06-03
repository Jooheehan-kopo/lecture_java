package SERVICE;
//보드서비스 인스턴스 객체 만들어줌.
public class AccountServiceFactory {
	   private static AccountService accservice;
	   //private static final BoardService service = new BoardService();
	   
	   public static AccountService getInstance() {
	      if(accservice == null)
	         accservice = new AccountService();
	      	
	      
	      //if(service == null)
	      //   service = new BoardService();
	      return accservice;
	   }

	}