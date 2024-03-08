package dmacc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Computer;
import dmacc.beans.ComputerSpecs;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class Module8AssessmentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Module8AssessmentApplication.class, args);
	}
	
	@Autowired
	ComputerRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// Update Existing Bean
		Computer c = appContext.getBean("computer", Computer.class);
		c.setPrice(1300);
		repo.save(c);
		
		// Create bean to use not managed by spring
		Computer d = new Computer("ASUS", "ZenBook", 1100);
		ComputerSpecs a = new ComputerSpecs(8, "512GB", "Windows 11 x64", "Intel Core i5");
		d.setComputerSpecs(a);
		repo.save(d);
		
		List<Computer> allComputers = repo.findAll();
		for(Computer computers: allComputers) {
			System.out.println(computers.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
}
