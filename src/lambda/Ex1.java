package lambda;

public class Ex1 {

	public static void main(String[] args) {

		// 인터페이스로 인스턴스를 만들수없다! -> 구현 클래스를 만들어서 연결
//		StringConcat stringConcat = new StringConcat();
		
		StringConcat stringConcat = new StringConcatImpl(); //자식 클래스쓰기
		stringConcat.makeString("Hello", "World"); //make함수 호출
		
		// 람다식으로 인터페이스 구현하기(이런 경우 람다식으로 구현하는게 더 간결하다)
		StringConcat stringConcat2 = (s1, s2) -> System.out.println(s1 + "," + s2);
		stringConcat2.makeString("Hi", "~~~");
		
	}

}

// 함수형 인터페이스 만들기
interface StringConcat {
	
	// 추상메소드 하나 만들기(두 문자열을 연결하는 함수), 선언부o 구현부x
	public void makeString(String s1, String s2);	
}

// StringConcat의 구현클래스 만들기
class StringConcatImpl implements StringConcat {

	// 선언부, 구현부를 람다식으로 만들기!(위에서 작성)
	@Override
	public void makeString(String s1, String s2) {
		// 리턴타입이 없으므로 출력!
		// 리턴타입이 있다면 String!
		System.out.println(s1 + "," + s2);
	}
	
}