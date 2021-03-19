package kr.ac.kopo.day10;

class One {
	One(){ //생성자 호출
		System.out.println("one 생성자 호출.");
	}
}
class Two extends One{ //상속 받음. 투가 원사용가능함.
	Two(){ //생성자 호출
		//super(); 가 숨어 있음. 그래서 둘다 나옴. --> 얘가 움직여 위로위로.
		System.out.println("two 생성자 호출.");
	}
	
}
class Three extends Two{
	Three(){
		System.out.println("Three 생성자 호출 .");
	}
}
public class ExtendsMain {

	public static void main(String[] args) {
		new Three(); //여기에 둘다 담겨져 있어. 
		/*one 생성자 호출.
		two 생성자 호출*/ // 이렇게 나옴.

	}

}
