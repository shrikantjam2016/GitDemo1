package java81;


interface Calculator
{
	//void SwitchON();
	
	int subTest(int a, int b);
}
public class CalculatorTest  {

	/*
	 * @Override public void SwitchON() {
	 * System.out.println("Print to switched ON");
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		/*
		 * Calculator cal=()-> System.out.println("\"Print to switched ON");
		 * cal.SwitchON();
		 */
		
		Calculator cal=(a,b)->{if(a>b) {throw new RuntimeException("test");}else{return b-a;}};
		
		System.out.println(cal.subTest(20, 20));
	}
	
	

}
