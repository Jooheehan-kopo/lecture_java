package SERVICE;
//게시판 번호메기기
public class AccountSequence {

	private static int no =1;  //private이라 못받는거. 밑에서 처리
	
	public static synchronized int getNo() { //한번에 처리하기 위해 씽크.
		return AccountSequence.no++;
	}
}
