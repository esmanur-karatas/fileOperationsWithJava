import java.io.Serializable;

public class Movie implements Serializable {
		private String name;
		private String director;
		private MovieType type;
		private int year;
		
		public Movie() {
			
		}
		
		public Movie(String name, String director, MovieType type, int year) {
			this.name= name;
			this.director= director;
			this.type=type;
			this.year=year;
		}
	
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name= name;
		}
		
		public String getDirector() {
			return director;
		}
		
		public void setDirector(String director) {
			this.director= director;
		}
		
		public MovieType getMovieType() {
			return type;
		}
		
		public void setMovieType(MovieType type) {
			this.type=type;
		}
		
		public int getYear() {
			return year;
		}
		
		public void getYear(int year) {
			this.year= year;
		}
		
		@Override
		public int hashCode() {
			return this.year + this.name.hashCode();
		}
		
		@Override
		public boolean equals (Object o) {
			Movie movie = (Movie)o;
			return movie.name.equals(this.name) && movie.year== this.year;
		}

		@Override
		public String toString () {
			return "FİLMİN ADI: " + name + "\t FİLMİN YÖNETMENİ: " + director+ "\t FİLMİN TÜRÜ: "+ " \t YAYINLANMA YILI: "+ year; 
		}
}
