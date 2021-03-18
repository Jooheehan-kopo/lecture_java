package kr.ac.kopo.day09;

public class EmployeeMain {
	//객체생성과 메소드 뿐이 안쓰임.

	public static void main(String[] args) {

		/*
		 * int totalEmployee =0; // Employee e = new Employee(); // e.name = "홍길동" //생성자
		 * 형식으로 Employee e = new Employee("홍길동" ,3200,"사원" ); totalEmployee++; //#2
		 * Employee e2 = new Employee("강길동" , 4000,"사원"); totalEmployee++;
		 * 
		 * e.info(); e2.info(); System.out.println("입사한 총 사원수:"+ totalEmployee+ "명");
		 */

	/* #1	int totalEmployee = 0;
		// Employee e = new Employee();
		// e.name = "홍길동" //생성자 형식으로
		Employee e = new Employee("홍길동", 3200, "사원");

		// #2
		Employee e2 = new Employee("강길동", 4000, "사원");

		e.info();
		e2.info();

		e2.printTotalEmployee();//e로 해도 값은 같게 나옴. 가르키는게 같아서.
		
		// 이렇게하면 1명으로 나와. 인스턴스 객체가 따로다로이기에.e/ e2
	//--> static 써. emp 창에 붙여
		
		*/
		
		Employee.printTotalEmployee(); //static 접근 방법. 클래스명.이름
		Employee e = new Employee("홍길동", 3200, "사원");
		e.info();
		
		Employee e2 = new Employee("강길동", 4000, "사원");
		e2.info();
		
		
		//내용을 수정하고 싶을때 - setter 메소드
		e.setName("한주희");

		//System.out.println("사원명 "+e.name);
		System.out.println("첫번째 사원명 :"+ e.getName()); //한명 이름 가져오기
	}
}
