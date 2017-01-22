package pl.spring.fibonacci.service.impl;

import java.math.BigInteger;

import org.springframework.stereotype.Service;

import pl.spring.fibonacci.service.FibonacciService;

@Service
public class FibonacciServiceImpl implements FibonacciService{

	public BigInteger fib(int n) {
		if (n == 1 || n == 2) {
			return BigInteger.ONE;
		}
		return fib(n - 1).add(fib(n - 2));
	}
}
