package kr.ac.kopo.day04;

public class ArrayMain02 {

	public static void main(String[] args) {
		// 1,2,3,4,5를 가지는 배열 arr를 생성
		int[] arr = new int [5];
		
		for(int i =0; i<arr.length; i++) {
			arr[i]= i+1;
		}
        // arr 배열의 원소 출력
		System.out.println(" <print>  ");
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] +"\t");
			
		// 배열의 전체 요소를 출력하는 방식 3가지
		// 1. 인덱스를 이용한 출력
		System.out.println(" <방식 1>  ");
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] +"  ");
		}
		System.out.println();
		
		
	}
		
	

}
