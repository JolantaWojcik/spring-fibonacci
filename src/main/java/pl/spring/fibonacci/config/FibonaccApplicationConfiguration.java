package pl.spring.fibonacci.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "pl.spring.fibonacci")
@EnableAspectJAutoProxy
public class FibonaccApplicationConfiguration {

}
