package in_action.ch4;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	public void takeSeats() {
		System.out.println("The audience is taking their seats");
	}

	public void turnOffPhones() {
		System.out.println("The audience is turning off their phones");
	}

	public void applaud() {
		System.out.println("CLAP,CLAP,CLAP,CLAP");
	}

	public void demandRefund() {
		System.out.println("Boo! We want our money back");
	}

	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		try {
			takeSeats();
			applaud();
			long start = System.currentTimeMillis();
			joinpoint.proceed();
			long end = System.currentTimeMillis();
			System.out.println("The singer sung " + (end - start)
					+ " miliseconds");
		} catch (Throwable e) {
			demandRefund();
		}

	}
}
