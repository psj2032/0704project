package ipackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empolyee emp1 = new Empolyee(10);
		//객체의 내용을 확인하고자 하면 System.out.println 메소드에
		//객체의 이름만 대입
		System.out.println(emp1);
		
		Empolyee emp2 = new Empolyee(10);
		System.out.println(emp2);
		
		Manager man1 = new Manager();
		System.out.println(man1);
	}

}
