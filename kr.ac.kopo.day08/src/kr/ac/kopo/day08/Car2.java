package kr.ac.kopo.day08;

public class Car2 {
// 생성자 특징.
//클래스명 동일
// 반환형이 존재하지 않음.
// 디폴트 생성자 지원
// 오버로딩 지원
	// 객체의 초기화가 목적임.
	
	Car2(){
		System.out.println("Car() 생성자 호출");
	}
	Car2(String s){
		System.out.println("Car(String) 생성자 호출");
	}
	Car2(int i, String s){
		System.out.println("Car(int, String) 생성자 호출");
	}
	void Car() {
		System.out.println("일반 메소드 Car()호출..");
	}
}
