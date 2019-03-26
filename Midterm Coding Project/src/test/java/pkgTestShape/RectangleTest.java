package pkgTestShape;

import static org.junit.Assert.*;

import java.util.concurrent.ThreadLocalRandom;
import org.junit.Test;
import pkgShape.Rectangle;
import java.util.*;

public class RectangleTest {
	@Test
	public void rectangleTest1() throws Exception {
		new Rectangle(1,2);
		}
	@Test (expected = IllegalArgumentException.class)
	public void rectangleTest2() throws Exception {
		new Rectangle(7,-14);
	}
	@Test (expected = IllegalArgumentException.class)
	public void rectangleTest3() throws Exception {
		new Rectangle(-10,5);
	}
	@Test (expected = IllegalArgumentException.class)
	public void rectangleTest4() throws Exception {
		new Rectangle(-10,-14);
	}
	@Test 
	public void setterTest1() throws Exception{
		Rectangle rec = new Rectangle (1,2);
		rec.setiLength(1);
		rec.setiWidth(2);
		assertEquals(rec.getiLength(),1);
		assertEquals(rec.getiWidth(),2);
	}
	@Test
	public void areaTest1() throws Exception{
		Rectangle rec = new Rectangle (7,4);
		assertEquals(rec.area(),98,0.001);
	}
	@Test
	public void perimeterTest1() throws Exception{
		Rectangle rec = new Rectangle (10,5);
		assertEquals(rec.perimeter(),15,0.001);
	}
	@Test
	public void compareToTest1() throws Exception{
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		for(int i=0; i<10; i++) {
			int iWidth = ThreadLocalRandom.current().nextInt(1,10+1);
			int iLength = ThreadLocalRandom.current().nextInt(1,10+1);
			recs.add(new Rectangle(iWidth,iLength));
		}
		Collections.sort((List<Rectangle>) recs);
		for(int i=0; i<9; i++) {
			assertTrue(recs.get(i).area()<= recs.get(i+1).area());
		}
	}
}	
