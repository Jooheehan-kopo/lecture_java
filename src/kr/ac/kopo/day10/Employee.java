package kr.ac.kopo.day10;
//사원클래스 = 회사에서 사원 관리.

public class Employee {
	
	String name;
	int no;
	int salary;
	String grade;
	
	
	//생성자
	Employee(){
		
	} // 에ㅓ러나는것 해결
	
	Employee(int no, String name, int salary, String grade){
		
		this.no =no;
		this.name=name;
		this.salary = salary;
		this.grade = grade;
	}
	
	void info() {
		System.out.println("사원번호: "+no + "사원명: "+name +"연봉: "+ salary+ "직급: "+ grade);
		
	}
}
