
public class Infix {
	/*
	 * @Date : 2015.07.07
	 * @ Author : me
	 * @Stroy : 이항 연산자 문법
	 */
	public static void main(String[] args) {
		//선언 및 초기화 영역
		int x = 20, y= 7, add=0, sub=0, gob =0, mok=0, nmg=0;
		
		//연산 영역
		add= x+y ; 
		sub = x-y;
		gob = x*y; 
		mok = x/y; 
		nmg = x%y;
		
		System.out.println("+ : "+add);
		System.out.println("- : "+sub);
		System.out.println("* : "+gob);
		System.out.println("/ : "+mok);
		System.out.println("% : "+nmg);
		

	}

}
