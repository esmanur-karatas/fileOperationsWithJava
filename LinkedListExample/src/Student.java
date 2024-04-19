
public class Student {

	private int number;
	private String name;
	private String surname;
	
	
	public Student() {
		
	}
	
	public Student(int number, String name, String surname) {
		this.number=number;
		this.name= name;
		this.surname= surname;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname=surname;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
	
	@Override 
	public boolean equals (Object o) {
		Student student= (Student)o;
		return student.number == this.number;
	}
	
	@Override
	public String toString() {
		return "NUMBER: "+ number+ ", NAME: "+ name+", SURNAME: "+ surname;
	}
}
