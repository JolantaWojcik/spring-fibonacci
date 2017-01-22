package pl.spring.fibonacci.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.spring.fibonacci.config.FibonaccApplicationConfiguration;

public class Main {
    public static void main( String[] args ){       	
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				FibonaccApplicationConfiguration.class);
		context.getBean(FibonacciAppRunner.class).start();
    }

}
