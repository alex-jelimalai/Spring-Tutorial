package ch4.mind;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VolunteerTest {

	private Thinker volunteer;
	private MindReader magician;
	private ApplicationContext context = new ClassPathXmlApplicationContext("ch4/beans.xml");

	@Before
	public void setUp() {
	
		volunteer = (Thinker) context.getBean("volunter");
		magician = (MindReader) context.getBean("magician");

	}

	@Test
	public void magicianShouldReadVolunteersMind() {
		volunteer.thinkOfSomething("QueenofHearts");
		assertEquals("QueenofHearts", magician.getThoughts());
	}
}
