package kr.ac.kopo.day05;


import java.util.Arrays;
public class Content01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {10,20,30};
		int[]b;
		
		//b=a;
		b = new int[a.length]; //a의 length개수큼 만들어져야하는 것임.그걸 b에 저장.
		
		for(int i =0; i<b.length; i++) {
			b[i]= a[i];  //요기가 딥커피.
			// System.arraycopy(a,0,b,0,a.length);
		}
		System.out.println("a: "+ Arrays.toString(a));
		System.out.println("b: "+ Arrays.toString(b));
		
	}

}
