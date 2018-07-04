package ipackage;

public class Empolyee {
	protected int num;
	@Override
	public String toString() {
		return "Empolyee [num=" + num + ", name=" + name + "]";
	}

	private String name;
	
	//num의 값을 일련변호로 만들기 위한 공유 변수 - static
	private static int autoincrement;
	
	//생성자(constructor)
	public Empolyee(int n) {
		//일련변호를 만들기
		autoincrement = autoincrement + 1;
		num = autoincrement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
