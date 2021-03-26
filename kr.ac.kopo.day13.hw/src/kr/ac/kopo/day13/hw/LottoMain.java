package kr.ac.kopo.day13.hw;

import java.util.Scanner;

public class LottoMain {

	static void lotto() throws LottoNumberException {

		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하는 로또 번호를 입력하세요 : ");
		int lottoNum = sc.nextInt();

		if (lottoNum > 45) {
			throw new LottoNumberException("1-45사이의 숫자만 가능합니다." + lottoNum + "은 올바르지 않습니다.");
		} else {
			System.out.println(lottoNum + "를 포함해서 로또번호들을 추출하겠습니다.");
		}
	}

	public static void main(String[] args) {
		try {
			lotto();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
