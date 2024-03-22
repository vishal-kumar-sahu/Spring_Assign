package springAssign4.assign4;

/**
 * Hello world!
 *
 */
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Question 4 : ");
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Sum sum = context.getBean(Sum.class);
        sum.setNum1(5);
        sum.setNum2(10);
        
        sum.sum();
        
        context.close();
    }
}