
public class Ex003 {
	public static void main(String[] args) {
		System.out.println("Q. 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인가?");
		System.out.println("A. 상속받은 멤버와 자신의 멤버와 이름이 같을 때\r"
				+ "	super를 붙여서 조상클래스를 구별할 수 있음.\r"
				+ "	조상 클래스에 선언된 멤버변수와 같은 이름의 멤버변수를\r"
				+ "	자손 클래스에서 중복해서 정의하는 것이 가능하기 때문에 필요함.\r"
				+ "	(멤버변수와 지역변수의 이름이 같은 때 this를 붙여서 구별하는 것과 유사)");
		/*
			조상클래스의 인스턴스 변수를 초기화하여 사용하기 위해 호출이 되어야만 한다.
		*/
	}
}
