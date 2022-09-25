package collection;

public class StudentClass {
	int id;
	String name;
	public StudentClass(int id, String name) {

		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentClass [id=" + id + ", name=" + name + "]";
	}

}
