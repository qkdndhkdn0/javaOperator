package ifCondition;

/*
 * @Date : 2015.07.08
 * @ Author : me
 * @Stroy : If만 있는 구문
 */
public class OnlyIf {
	public static void main(String[] args) {
		/*
		 * 구문 (statement
		 * 자바 연산식에서 3가지 종류의 구문으로 나뉜다.
		 * 조건문
		 * if ,if-else ,switch
		 * 
		 * 반복문
		 * while ,for ,do-while
		 * 
		 * 기타문
		 * break, continue, return
		 */

		int x =1, y=2;
		if (x==y) { // 값의 비교 연산자 ==0
			System.out.println("숫자 x 와 y의 값은 같다");
		}
		if(x!=y){
			System.out.println("숫자 x 와 y의 값은 같지 않다");
		}
	
	}

}
