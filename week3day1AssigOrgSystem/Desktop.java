package week3day1AssigOrgSystem;

public class Desktop extends Computer{

	void destopSize() {
		System.out.println("This is my desktop size");;
	}
	public static void main(String[] args) {
		Desktop dt=new Desktop();
		dt.destopSize();
		Computer cc=new Computer();
		cc.computerModel();
	}

}
