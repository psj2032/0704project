package polymorphism1;

public class Main {

	public static void main(String[] args) {
		// 3개의 클래스의 공격하는 메소드를 호출해보기
		Attack at = new Protoss();
		at.attack();
		at = new Terran();
		at.attack();
		at = new Zerg();
		at.attack();
	}
}
