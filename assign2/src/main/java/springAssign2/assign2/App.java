package springAssign2.assign2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Question 2 : ");
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        map obj = context.getBean("map", map.class);
        obj.print();
    }
}
