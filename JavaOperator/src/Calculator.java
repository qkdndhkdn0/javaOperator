import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x,y;
		
		
		System.out.println("�� ���� �Է��ϼ���.");
		x = scan.nextInt();
		y = scan.nextInt();
		
		 
		System.out.println(x+ " + " +y+ " =\t" +(x+y));
		System.out.println(x+ " - " +y+ " =\t" +(x-y));
		System.out.println(x+ " * " +y+ " =\t" +(x*y));
		System.out.println(x+ " / " +y+ " =\t" +(x/y));
		System.out.println(x+ " % " +y+ " =\t" +(x%y));

	}

}
