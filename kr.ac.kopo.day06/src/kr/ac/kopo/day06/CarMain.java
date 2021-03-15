package kr.ac.kopo.day06;

public class CarMain {// 얘가 메인임.
	//프로그램 실행하기 위해 만든 클래스. 실행클래스
	//힙영역에 만들어져야함. 눈에보이는 사물 만들어. new
	public static void main(String[] args) {
		new Car(); // 힙영역에 저장 됨. 변수 없음. 지정해 줘야함.
		Car c =new Car(); // 이렇게 됨.
	
		c. name="쏘나타"; 
		c.price = 3200;
		c.company ="현대";
		
		Car c2 =new Car();
		
		c2. name = "k5";
		c2. price = 3000;
		c2.company = "기아";
		
		System.out.println("모델명: "+ c.name+ ".가격 :"+ c.price +"만원,제조사:"+ c.company);
		System.out.println("모델명: "+ c2.name+ ".가격 :"+ c2.price +"만원,제조사:"+ c2.company);
	
	// c= c2; 라고 쓰면 shallow copy가 일어남. 그래서 모두 c2를 가르킴. c값이 바뀌게 됨.
		//c는 이제 접근이 불가함. 공간을 사용할 수 없어. 많아지면 메모리 부족.
		// stack에 만들어진 영역만 바뀔 수 있고, 힙은 안사라져.
		
		
	}
}
