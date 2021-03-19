package kr.ac.kopo.day10;
//관리자 클래스.
public class Manager03 extends Employee {
	//항목이 사원과 비슷한 형태임. 지워줌
	//멤버변수를 다 쓸 수 있음.
	Employee[] empList; //관리사원 목록
	//어느 사원을 관리하고 있는지. 여러명이니 배열형태
	
	//생성자
	/*Manager03(int no, String name, int salary, String grade, Employee[]empList){ //emp에 생성자 만들어줌.
		//super();
		this.no=no;  //--> 실제는 super의 것.
		this.name=name;
		this.salary=salary;
		this.grade=grade; //실제로는 emp의 멤버변수임.*/ //  아래로 수정.
		
	Manager03(int no, String name, int salary, String grade, Employee[]empList){ //emp에 생성자 만들어줌.
			super(no,name,salary,grade); //<에러 안생김> 가져다 쓸 것이라고만 지정.
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
