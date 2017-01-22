package pl.spring.fibonacci.aspect;

import java.math.BigInteger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Service;

import pl.spring.fibonacci.service.FibonacciService;

@Aspect
@Service
public class CountTimeAspect{

	private FibonacciService fbService;
	
	@After("execution(* pl.spring.fibonacci.service.impl.*.*(..))")
	public Object countTime(JoinPoint pjp) throws Throwable{
		long start = System.currentTimeMillis();
		Object result = pjp.getTarget();
		long time = System.currentTimeMillis()-start;
		System.out.println("metoda: "+pjp.getSignature().getName()+" wykonała sie w czasie: "+time+" ms");
		return result;
	}
}
