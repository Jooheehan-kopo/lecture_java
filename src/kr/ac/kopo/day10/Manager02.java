package kr.ac.kopo.day10;
//관리자 클래스.
public class Manager02 extends Employee {
	//항목이 사원과 비슷한 형태임. 지워줌
	//멤버변수를 다 쓸 수 있음.
	Employee[] empList; //관리사원 목록
	//어느 사원을 관리하고 있는지. 여러명이니 배열형태
	
	Manager02(int no, String name, int salary, String grade, Employee[]empList){ //emp에 생성자 만들어줌.
		//super();
		this.no=no;
		this.name=name; //Emp에서 private 으로 지정해줬기에, 다른 클래스인 m02는 접근할 수가 없는 것임.
		this.salary=salary;
		this.grade=grade;
		this.empList=empList;
	}
	@Override //코드 주석 : 에러체크까지해줌.
	void info() { //emp의 info에 있음. emp클래스에 오버라이딩한 것이다. 라고 코드주석을 달아줘야함.
		System.out.println("사원번호"+no +", 사원명 :"+name + ",연봉"+salary+"만원"+ ", 직급"+grade);
		System.out.println("========================");
		System.out.println("\t관리사원 목록");
		System.out.println("========================");
		for(Employee e : empList) {
			e.info();
			
		}
		System.out.println("========================");
	}
}
