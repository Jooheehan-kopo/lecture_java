package kr.ac.kopo.day04;
//반복문. break
public class LoopMain05 {

	public static void main(String[] args) {
		loop01 : for (int i = 1;i<=3;i++) { //loop01이 반복문 이름임.
			for(int j =1; j<=5; j++) {
				if (j==3) {
					break loop01; // 이 이름을 가진 애 브래이크. 한번에 빠져나갈 때 많이씀.
				}
				System.out.print(j);
			
			}
			System.out.println();
		}

	}

}
