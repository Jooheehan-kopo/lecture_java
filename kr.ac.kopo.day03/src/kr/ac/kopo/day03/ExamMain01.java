package kr.ac.kopo.day03;


/*
 *  12345
 *  23456
 *  34567
 *  45678
 *  56789
 *  
 *  56789
 *  45678
 *  34567
 *  23456
 *  12345
 *  
 *  *****
 *  ****
 *  ***
 *  **
 *  *
 */
public class ExamMain01 {

	public static void main(String[] args) {
		
		for (int i = 1; i<5; i++) {
			for (int j=0; j<5 ; j++ ) {
				System.out.print(i+j);
			}
		System.out.println();
		}
	}
}
