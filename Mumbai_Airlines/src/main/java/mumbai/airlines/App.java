package mumbai.airlines;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    
    
    {
    	
    	//Load the Spring XML Configuration
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	
    	//Get the welcome bean from Spring Container
    	Airline obj = (Airline) context.getBean("welcome");
    	
    	
    	//Display the injected message
    	System.out.println(obj.getMessage());
    }
}
