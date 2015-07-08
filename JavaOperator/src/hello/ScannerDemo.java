package hello;

import java.util.Scanner;

/*
 * @Date : 2015.07.07
 * @ Author : me
 * @Stroy : 스캐너 사용으로 인풋 작업 실행
 */
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int num = scan.nextInt();
		System.out.println(num);
		

	}

}
