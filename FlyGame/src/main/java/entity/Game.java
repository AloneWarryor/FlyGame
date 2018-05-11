package entity;

public class Game {
	private int id;
	private String name;
	private double rate;
	private String description;
	private String image;
	public Game() {
		
	}
	public Game(int id, String name, double rate, String description, String image) {
		super();
		this.id = id;
		this.name = name;
		this.rate = rate;
		this.description = description;
		this.image = image;
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
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
