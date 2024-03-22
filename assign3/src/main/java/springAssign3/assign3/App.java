package springAssign3.assign3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */

@Component
public class App 
{
	private Triangle triangle;
	
	@Autowired
	public App(Triangle triangle) {
		this.triangle = triangle;
	}
	
    public static void main( String[] args ){
    	System.out.println("Question 3 : ");

        ApplicationContext context = new AnnotationConfigApplicationContext(TriangleConfig.class);
        
        App obj = context.getBean(App.class);
        System.out.println("Area of the triangle : " + obj.triangle.calculateArea());
    }
}



