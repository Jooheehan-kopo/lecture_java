package kr.ac.kopo.day11.lunch;

public class CastMain {

	public static void main(String[] args) {
		
		Child01 c01 = new Child01();
		c01.info(); //메소드 만들어
		
		Child01 c02 = new Child02();
		c01.info();
		
		Parent p = new Parent();
		p.info();
		
		
		
		Parent p =new Child01(); //오 자식, 왼 부모. 묵시적 형변환. --> override된 값을 부름. 메소드와 관련.
		System.out.println(p.name +", "+p.age);
		 
		/*Child01 c01 =new Child01();
		System.out.println(c01.name + ","+ c01.age); // 엄마나이
		c01.info();
		
		Parent p = new Parent();
		*/
	}

}
