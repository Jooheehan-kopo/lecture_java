package kr.ac.kopo.day10;

public class ExtendsMain02 {

	public static void main(String[] args) {
		// 사원번호가 1, 연봉이 4000을 받는 사원 홍길동 사원 객체 생성. 
		Employee e = new Employee(1,"홍길동", 4_000, "사원"); //세자리마다밑줄문자로 구분 콤마대신 밑줄.
		Employee e2 = new Employee(2,"박길동", 4_200, "사원"); //세자리마다밑줄문자로 구분 콤마대신 밑줄.
		Employee e3 = new Employee(3,"강길동", 4_800, "대리"); //세자리마다밑줄문자로 구분 콤마대신 밑줄.
		Employee e4 = new Employee(4,"한길동", 5_500, "과장"); //세자리마다밑줄문자로 구분 콤마대신 밑줄.
		Employee e5 = new Employee(5,"윤길동", 5_800, "대리"); //세자리마다밑줄문자로 구분 콤마대신 밑줄.
		
		
		e.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		
		Employee[]empList = {e,e2,e4};
		Manager01 m = new Manager01(100,"나캡틴", 9_000, "부장",empList);
		Manager02 m2 = new Manager02(100,"나캡틴", 9_000, "부장",empList);
		Manager03 m3 = new Manager03(100,"나캡틴", 9_000, "부장",empList); // 똑같이 나옴
		m.info(); 
	}

}
