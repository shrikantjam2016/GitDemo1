package factory;

public class MainMethod {
	public static void main(String[] args) {
		
		FactoryClass f=new FactoryClass();
		RunMethod r=f.getFactoryObj("Hum");
		r.running();
	}

}
