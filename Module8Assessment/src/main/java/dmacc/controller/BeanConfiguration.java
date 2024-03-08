package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;
import dmacc.beans.ComputerSpecs;

@Configuration
public class BeanConfiguration {

	@Bean
	public Computer computer() {
		Computer bean = new Computer("LENOVO", "Legion 5", 1200.00);
		
		return bean;
	}
	
	@Bean
	public ComputerSpecs computerSpecs() {
		ComputerSpecs bean = new ComputerSpecs();
		bean.setRamGB(32);
		bean.setStorageSize("1TB");
		bean.setGraphicsCard("NVIDIA GeForce RTX 3050");
		bean.setOperatingSystem("Windows 11 x64");
		bean.setProcessor("AMD Ryzen 7 5800H");
		return bean;
	}
	
}
