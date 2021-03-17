package kr.ac.kopo.day08;

public class Member {
	
	String name;
	int age;
	String bloodType;
	
	Member(){
		//중간에 들어감. 이유 못들음?
		this("알수없음"); // <이름 초기화>
			
	}
	Member (String name){ //지역변수
		this(name,-1); //아래로 토스. 호출 <나이 초기화>
		
	}
	Member(String name, int age){  //<혈액형 초기화>
		this(name, age, "알수없음"); // 뉴 강길동으로 객체가 만들어진 상태에서 하기에,this
		//System.out.println(" dkddkd"); //얘는 위로 올릴 수 없음.
		
	}//아래 멤버로 토스 시킴. - this 생성자.
	
	Member(String name, int age,String bloodType){
			this.name=name;
			this.age = age;
			this.bloodType =bloodType;
	}
	
	void info() {
		System.out.println("이름 : "+ name +".나이: "+age + ",혈액형:"+ bloodType);
	//null 값의 이름을 바꿔주고자함. 
	//이름없는경우 알수 없음. 나이 초기화안되어 있으면 -. 혈액형도 알수없음.으로 설정
		
	/*
	 * String name;
	int age;
	String bloodType;
	
	Member(){
		//중간에 들어감. 이유 못들음?
		name = "알수없음"; //멤버변수
		age = -1;
		bloodType = "알수없음"; //초기화
			
	}
	Member (String name){ //지역변수
		this.name = name; //멤버변수와 지역변수를 구분하기위해 this를 써줌.
		this.age = -1;
		this.bloodType ="알수없음";
		
	}
	Member(String name, int age){
		this.name=name;
		this.age = age;
		this.bloodType ="알수없음";
	}
	
	Member(String name, int age,String bloodType){
			this.name=name;
			this.age = age;
			this.bloodType =bloodType;
	}
	
	void info() {
		System.out.println("이름 : "+ name +".나이: "+age + ",혈액형:"+ bloodType);
	//null 값의 이름을 바꿔주고자함. 
	//이름없는경우 알수 없음. 나이 초기화안되어 있으면 -. 혈액형도 알수없음.으로 설정
		
	
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	}
}
