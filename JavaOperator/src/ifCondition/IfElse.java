package ifCondition;

public class IfElse {

	public static void main(String[] args) {
		int x = 1, y =2; // 지변 초기화
		if ((x==1) && (y==2)) { // && 엔퍼센트라고 읽고 and연산자이다.
			System.out.println("x는 1이면서 y도 2이다");
		}
		else if ((x==1) || (y==2) ) { // || 이거는 컬럼이라 읽는다 or연산자
			System.out.println("x는 1이거나 y는 2이다");
		}
		else{
			System.out.println("해당 사항 없음");
		}

	}

}
