package Java8;

public class Empolyee {
	private int id;
	private String name;
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
	public Empolyee(int id, String name) {

		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Empolyee [id=" + id + ", name=" + name + "]";
	}
	

}
