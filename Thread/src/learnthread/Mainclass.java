package learnthread;

public class Mainclass {

	public static void main(String[] args) {
    new Bclass(new Ainterf() {
	public void r1()
	{
		System.out.println("r1 of mainclass");
	}
	}).s1();
	}
}
