package kr.ac.kopo.day04;

public class ArrayMain01 {

	public static void main(String[] args) {
		
		int[] arr;
		
		arr = new int[5]; //arr[0]~arr[4] 자동초기화 new. 정수값 0임
		
		System.out.println("arr: "+ arr + ",원소개수 :" +arr.length);
		
		System.out.println("arr:" + arr);
		System.out.println("첫번째 정수 :" + arr[0]);
		System.out.println("두번째 정수 :" + arr[1]);
		
		for (int i =0; i<arr.length; i++) {  //i<5 (다섯번 돌리는것을 보여주기위해 많이씀)
			System.out.println(i+1 +"번째 정수 :"+ arr);
		}
		arr = new int[3];
		System.out.println("arr: "+ arr + ",원소개수 :" +arr.length);
		
		for(int i =0; i<arr.length ; i++ ) {
			System.out.println(i+1+ '번째 정수: '+ arr[i]);
		}
	}

}
