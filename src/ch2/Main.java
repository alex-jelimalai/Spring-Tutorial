package ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch2.performer.Performer;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ch2/beans.xml");
		
		Performer duke = (Performer) context.getBean("duke");
		duke.perform();
		
		Performer performer = (Performer) context.getBean("poeticDuke");
		performer.perform();
		
		Performer kenny = (Performer) context.getBean("kenny");
		kenny.perform();
		
		Performer sonny = (Performer) context.getBean("sony");
		sonny.perform();
	}

}
