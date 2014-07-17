package in_action.ch4;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AudienceAnnotated {

	@Pointcut("execution(* in_action.ch4.Singer.play(..))")
	public void performance() {
	}

	@Before("performance()")
	public void takeSeats() {
		System.out.println("Annotation: The audience is taking their seats");
	}

	@Before("performance()")
	public void turnOffPhones() {

		System.out
				.println("Annotation: The audience is turning off their phones");
	}

	@After("performance()")
	public void applaud() {
		System.out.println("Annotation: CLAP,CLAP,CLAP,CLAP");
	}

	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Annotation: Boo! We want our money back");
	}
}
