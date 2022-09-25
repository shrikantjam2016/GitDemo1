package java81;

import java.util.ArrayList;
import java.util.List;

public class EmplDB {
	
	public static List<Empl> getEmpList()
	{
		List<Empl> l=new ArrayList<Empl>();
		l.add(new Empl(176, "Roshan", "IT", 600000));
		l.add(new Empl(158, "Soscha", "HR", 566000));
		l.add(new Empl(256, "Kali", "Finance", 800000));
		l.add(new Empl(56, "Mama", "HR", 400000));
		l.add(new Empl(556, "Okaya", "Man", 450000));
			return l;
	}

}
