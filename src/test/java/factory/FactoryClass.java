package factory;

public class FactoryClass {
	
	public RunMethod getFactoryObj(String name)
	{
		if(name==null || name.isEmpty())
		return null;
		
		if("Anm".equals(name))
			return new Animal();
		else if("Hum".equals(name))
			return new Human();
		
		else
			return null;
		
	}

}
