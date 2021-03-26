package kr.ac.kopo.day12;

import java.util.Random;

/*final*/class Super{
	
	private /*final*/ int MAX =100;
	
	public /*final*/ void info() {
		System.out.println("super클래스에서 정의된 메소드");
		MAX =50; //할당 받을 수 없음. 
	}
}
class sub extends Super{
	
	
	@Override
	public void info() { //인포 재정의.  error
		System.out.println("sub에서 재정의된 메소드");
	}
}

//나만의 랜덤클래스 만들어. bound 10일때 1 10부터 나오는걸로 만들고싶음. 
class MyRandom extends Random{
/**
 * bound가 10일때 1~10사이의 난수 추출
 * @author HP bound 난수범위
 * @author HP return 1~ bound 사이의 난수
 */
	@Override
	public int nextInt(int bound) {
		
		return super.nextInt(bound)+1;    //super 랜덤이 가지고 있는 nextInt에서 내보내/ (bound+1);
	}
	
	
	
	
}
public class FinalMain {
	public static void main(String[] args) {
		/*
		 * 1-100사이의 난수를 발생시켜 출력하는 코드를 작성.
		 * 램덤
		 */
		Random r = new MyRandom();   ///MyRandom(); OK
		int random = r.nextInt(3); //실제로는 0-99
		System.out.println(" 추출된 정수 :"+random);
		
		//1부터 난수를 추출하는 것을 만들고싶음.
		
	}//==================
	/*
	 * class MyString extends String{} : 불가능. final 클래스임. 고정되었기에 변하게 할 수 없음.
	 */
}
