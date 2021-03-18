package kr.ac.kopo.day09;
//총 몇명의 사원이 입사했다
public class Employee {
	
	private String name;
	int salary;
	String grade;
	//#1
	
	static int totalEmployee; //메인에 따로 만들어줄 필요 없음. 사원 입사 명수
	//생성자를 생성할때마다 증가.
	
	Employee() { 
	//하나 만들어주어야함.	
		++Employee.totalEmployee; //공유해야하는 값
	}
	Employee(String name, int salary, String grade){
		this.name = name;
		this.salary =salary;
		this.grade = grade;
		
		++Employee.totalEmployee;
	}
	void info() {
		System.out.println("name:" + this.name + "salary: "+ this.salary + "grade:"+this.grade);
		Employee.printTotalEmployee();//가능
		
		
	}
	static void printTotalEmployee() {
		System.out.println("총 사원수 : "+ totalEmployee+ "명");
//		System.out.println("사원명 :"+ this/ name); 이거 불가능. 만들어졌는지 모름.
	}
	//name이라는 멤버변수 값을 외부에서 볼 수 있게끔. private으로 설정이 되어있는 것을 
	//아래 public 붙여서 바꿔줌. //getter 라고 부름.
	public String getName(){
		return this.name;
	}
	public void setName(String name) {
		this.name= name;
	}
	
	
}
