import java.io.Serializable;

public class Author implements Serializable{

	String name;
	private String surname;
	
	public Author() {
		
	}
	
	public Author(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName( String name) {
		this.name= name;
	}
	
	public String getSurname(){
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override 
	public boolean equals (Object o) {
		Author author = (Author)o;
		return author.name.equals(this.name) && author.surname.equals(this.surname);
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.surname.hashCode();
	}
	
	@Override 
	public String toString() {
		return "Kitabın Adı: "+ name + "\tYazar Soyadı: "+surname;
	}
	


}