package testpaper;

public class Temp {
	
	int i;
	
	Temp(int i)
	{
		this.i=i;
		
	}
	
	public int hashcode()
	{
		return i%9;
	}

	@Override
	public String toString() {
		return " " + i + " ";
	}
	
	


}
