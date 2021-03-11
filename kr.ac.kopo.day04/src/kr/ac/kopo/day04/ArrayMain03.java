package kr.ac.kopo.day04;
// 2차원 배열 -기본형 배열

public class ArrayMain03 {

	public static void main(String[] args) {

		int[][] arr =new int[2][4];
		//int[][] arr = new int [2][];
		
		arr[0] = new int[5];
		arr[1] = new int[3];
		
		System.out.println(" arr :" + arr);
		System.out.println(" arr.length: "+ arr.length);
		
		for (int i =0; i <arr.length ; i++) {
			System.out.println("arr[" +i+ "] :" +arr[i] );
			System.out.println("arr[ "+ i +"]" + arr[i].length);
		}

	}

}
