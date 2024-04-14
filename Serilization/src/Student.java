import java.io.Serializable;

public class Student implements Serializable{

		private int number;
		private String name;
		private String surname;
		private String classs;
	
	public Student() {
		
	}
	
	public Student( int number, String name, String surname, String classs) {
		this.number= number;
		this.name= name;
		this.surname=surname;
		this.classs= classs;
	}
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number= number;
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
	
	public String getClasss() {
		return classs;
	}
	
	public void setClasss(String classs) {
		this.classs=classs;
	}
	
	@Override
	public boolean equals(Object obj) {
	    Student student= (Student)obj;
		return this.number == student.number;
		
	}
	
	@Override
	public String toString() {
		return "NUMARA: "+number+ ", ADI: " +name+ ", SOYADI: "+ surname +", SINIFI: "+ classs;
	}

}
