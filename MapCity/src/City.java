import java.io.Serializable;

public class City implements Serializable{
	private String name;
	private long population;
	
	public City () {
		
	}
	public City (String name, long population) {
		this.name = name;
		this.population = population;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPopulation() {
		return population;
	}
	
	public void setPopulation( long population) {
		this.population=population;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		City city = (City)o;
		return city.name.equals(this.name);
	}
	
	@Override
	public String toString() {
		return "Şehir Adı: "+ name+ "\tNüfus: "+ population;
	}

}
