package pl.spring.fibonacci.aspect;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.spring.fibonacci.service.FibonacciService;

@Aspect
@Service
public class CacheAspect{

	private Map<Integer, BigInteger> cache;

	@Around("execution(* pl.spring.fibonacci.service.impl.*.*(..))")
	public Object catchTime(ProceedingJoinPoint pjp) throws Throwable {
		cache = new HashMap<Integer, BigInteger>();
		Object[] args = pjp.getArgs();
		if(!cache.containsKey(args[0])){
			cache.put((Integer) args[0], (BigInteger) pjp.proceed());
		}
		return cache.get(args[0]);
	}
}
