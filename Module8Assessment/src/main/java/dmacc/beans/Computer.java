package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Computer {
	@Id
	@GeneratedValue
	private long id;
	String brand;
	String name;
	double price;
	
	@Autowired
	ComputerSpecs computerSpecs;
	
	
	public Computer() {
		super();
	}
	
	public Computer(String brand, String name, double price) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public Computer(int id, String brand, String name, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ComputerSpecs getComputerSpecs() {
		return computerSpecs;
	}

	public void setComputerSpecs(ComputerSpecs computerSpecs) {
		this.computerSpecs = computerSpecs;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", brand=" + brand + ", name=" + name + ", price=" + price + ", computerSpecs="
				+ computerSpecs + "]";
	}
	
}
