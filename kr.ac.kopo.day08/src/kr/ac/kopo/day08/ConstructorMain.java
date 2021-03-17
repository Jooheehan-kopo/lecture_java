package kr.ac.kopo.day08;
//이름 나이 혈액형을 가지고 있는 멤버클ㄹ스 만드려고함
public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}class Car {
		// 생성자 특징.
		//클래스명 동일
		// 반환형이 존재하지 않음.
		// 디폴트 생성자 지원
		// 오버로딩 지원
			// 객체의 초기화가 목적임.
			
			Car(){
				System.out.println("Car() 생성자 호출");
			}
			Car(String s){
				System.out.println("Car(String) 생성자 호출");
			}
			Car(int i, String s){
				System.out.println("Car(int, String) 생성자 호출");
			}
			void Car() {
				System.out.println("일반 메소드 Car()호출..");
			}
		}

}
