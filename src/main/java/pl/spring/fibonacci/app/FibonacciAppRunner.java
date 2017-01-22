package pl.spring.fibonacci.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.spring.fibonacci.service.FibonacciService;

@Service
public class FibonacciAppRunner {
	
	@Autowired
	private FibonacciService fbServive;
	
	public void start() {
		fbServive.fib(26);
		System.out.println(fbServive.fib(26));
	}
}
