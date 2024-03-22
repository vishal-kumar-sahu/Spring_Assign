package springAssign3.assign3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="springAssign3.assign3")
public class TriangleConfig{
	
	@Bean
    public Triangle triangle() {
        return new Triangle(6, 30);
    }
	
}