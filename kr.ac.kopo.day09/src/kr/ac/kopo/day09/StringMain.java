package kr.ac.kopo.day09;

public class StringMain {

	public static void main(String[] args) {

		// 주소값을 비교. 같지 않음. ---> 안의 요소값을 비교하기 위해서 'equals'라는 메소드가 나옴.
		String str = new String("hello");
		String str2 = new String("HELLO"); // str str2의 값이 같은지 비교.

		// 글자 비교. 요소가 같음. 하나의 문자열 hello를 같이 가리킴.
		String a = "hello";
		String a2 = "hello"; // str str2의 값이 같은지 비교.

		if (str == str2) {
			System.out.println("str==str2");
		} else {
			System.out.println("str!=str2");

		}

		// 문자열 비교
//		str.equals("hello") //str의 문자열과 hello의 문자열이 서로 같은지. 같으면 t 아니면 f
//		("hello").equals(str) // 이렇게도 씀.

		boolean bool = str.equals(str2);

		if (bool) {
			System.out.println("equals():str==str2");
		} else {
			System.out.println("equals():str!=str2"); // 대소문자 구분해서 다르면 다르다고 나옴. hello:HELLO
		}
		bool = str.equalsIgnoreCase(str2);
		if (bool) {
			System.out.println("equalsIgnoreCase():str==str2");
		} else {
			System.out.println("equalsIgnoreCase():str!=str2"); // 대소문자 구분해서 다르면 다르다고 나옴.ignore로 값을 받아줌.
			// ignorecase는 다른 객체와 비교할때에도 사용가능함.

		}

		// str str2가 he로 시작되는 것인지 비교 :"start with"라는 메소드 사용.
		str = "hello!!";
		str2 = "hello world";

		String sub = "hello"; // str이 가지고 있는 문자열이 sub가 가지고 있는 문자열로 시작되니
		bool = str.startsWith(sub);
		if (bool) {
			System.out.println(str + "은" + str + "로 시작합니다.");
		} else {
			System.out.println(str + "은" + str + "로 시작하지 않습니다.");

		}
		
		//파일명 체크
		str = "hello.txt";
		bool = str.endsWith(".txt");
		if(bool) {
			System.out.println(str+"은 txt파일 입니다.");
		}else {
			System.out.println(str+"은 txt파일이 아닙니다.");
			
		}
		//누가 더 큰 값인지 비교
		str = "boat";
		str2="board"; 
		
		int compare = str.compareTo(str2); // 값 비교
		if(compare==0) { //값끼리 뺐을때, 0 같다
			System.out.println(str +"=="+str2);
		}else if(compare<0){ //빼면 값이 음수임.
			System.out.println(str+ "<"+ str2);
		}else {
			System.out.println(str+">"+ str2);
		}
		
		/*
		 * equals
		 * startsWith
		 * endsWith
		 * contains 를 가지고 원하는 값 추출.
		 * 
		 * 인덱스로 출력,
		 * for문으로 출력  ---> 비교적 편리
		 *
		 */
		String[]names = {"강길동","홍길동","홍길순","김길동","윤길동","박홍철","홍길동"};
		System.out.println("이름이 홍길동인 사람 검색");
		
		//배열의 값 반복. 인덱스, 1.5버전/ 어레이지 스트링은 출력하지 않기에 사용불가임.- 검색할때는 불가임.
		for(int i =0; i<names.length; i++) {
			if(names[i].equals("홍길동"))
				System.out.println(names[i]); 
		}
		
		System.out.println("성이 홍씨인 사람 검색");
		for(String name :names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		System.out.println("이름이 길동인 사람 검색");
		for(String name:names) {
			if(name.endsWith("길동")) {
				System.out.println(name);

			}
		}
		System.out.println("이름에 홍이 포함된 사람 검색");
		for(String name:names) {
			if(name.contains("홍")) //문자를 가지고 있냐.
				System.out.println(name);
				
		}
		
		
		
		
		//문자열 
		str = "hello world"; //o가 몇번째 위치부터 시작하는지,
		
		int searchIdx = str.indexOf("o");
		System.out.println("\"o\" 시작위치 : "+ searchIdx);
		
		searchIdx =str.lastIndexOf("o");
		System.out.println("\"o\" 위치 :"+ searchIdx); //가장 끝과가까운 곳에 위치한 o
		///
		str= "hello world";
		char ch = 'l';
		System.out.println("<"+ str +"에서"+ ch +"위치");
				
		int searchCh =str.indexOf(ch); //0부터 시작
		while(searchCh !=-1) { //일치하는 항목이 없는게 아니라면
			System.out.println("검색된 위치: "+ searchCh);
			searchCh =str.indexOf(ch,searchCh+1);
		}
		//==============================================
		
		//이부분 다시. lastidx로
		searchCh = -1; 
		while((searchCh=str.indexOf(ch,searchCh))!= -1){ //괄호 필수. searchCh 에 들어있는 값이 -1이냐?
			System.out.println("검색된 위치: "+ searchCh);
			
		}
		
	}

}
