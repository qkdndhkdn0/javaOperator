package cast;

import java.util.Scanner;

public class escape {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("�� ��� �̸��� �Է��ϼ���");
		String hong =scan.next();
		String kim = scan.next();
		System.out.println("�� ��� ���̸� �Է��ϼ���");
	    int age =scan.nextInt(); 
		int age2 = scan.nextInt();
		
		int a = age-age2;
		
		
		System.out.println(hong+"���� "+age+"�� �̰�, "+kim+"���� "+age2+"���̰�"+" ������̴� "+a+"�� �Դϴ�. "+hong+"���� "+kim+"������ "+a+"�� �����ϴ�.");

	}

}
