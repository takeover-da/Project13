package lambda;

public class Quiz3 {

	public static void main(String[] args) {

		StringConverter converter1 = new StringConverterImpl();
		String result1 = converter1.convert("abcde");
		System.out.println("대문자로: " + result1);
		
		StringConverter converter2 = new StringConverter() {
			
			@Override
			public String convert(String s) {
				return s.toUpperCase();
			}
		};
	}

}

//함수형 인터페이스 선언
@FunctionalInterface
interface StringConverter {
	
	//문자열을 대문자로 변환해서 반환하는 함수
	String convert(String s);
}

class StringConverterImpl implements StringConverter {

	@Override
	public String convert(String s) {
		return s.toUpperCase();
	}
	
}
//StringConverter의 구현클래스를 만들고 convert() 호출
//StringConverter의 익명클래스를 만들고 convert() 호출
//StringConverter의 람다식 함수를 만들고 convert() 호출
