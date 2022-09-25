package lambdaTest;

interface calculator
{
	void switchOn();
}

public class ClculatorImp {
	public static void main(String[] args) {
		calculator c=() -> System.out.println("hi");

		c.switchOn();
	}
	


}
