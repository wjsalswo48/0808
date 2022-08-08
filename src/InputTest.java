import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InputTest {
	private Student [] array;
	private Input input;
	@Before
	public void init() {
		array = new Student[12];
		String path = "C:/Temp/sunjuck_utf8.dat";
		input = new Input(array, path);
	}
	@Test
	public void testInput() {
		input.fileinput();
		for(Student student : array) {
			System.out.println(student);
		}
//		assertEquals("한송이", array[0].getName());
//		assertEquals(78+87+83+78, array[0].getKor()+array[0].getEng()+array[0].getMat()+array[0].getEdp());
	}
	
}
