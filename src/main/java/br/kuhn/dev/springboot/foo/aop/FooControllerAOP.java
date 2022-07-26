package br.kuhn.dev.springboot.foo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FooControllerAOP {

	@Around("execution(* br.kuhn.dev.springboot.foo.controller.*.*(..))")
	public Object aroundGetFortune(
			ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {

		return theProceedingJoinPoint.proceed();
	}
}
