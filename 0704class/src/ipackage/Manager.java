package ipackage;

//Empolyee 클래스를 상속받은 Manager클래스
public class Manager extends Empolyee {
	
	//이렇게 생성자를 직접 만들어서 상위 클래스의 생성자를 부르는 경우는
	//안드로이드에서 많이 발생합니다.
	public Manager() {
		super(10);
	}
	
	private String task;

	public String getTask() {
		return task;
	}

	//메소드 원형 : setTask(String)
	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public String toString() {
		//super.toString()은 상위 클래스인 Empolyee의 toString()을 호출합니다.
		return super.toString() + "Manager [task=" + task + "]";
	}

}
