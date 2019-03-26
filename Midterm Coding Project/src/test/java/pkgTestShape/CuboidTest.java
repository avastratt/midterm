package pkgTestShape;

import static org.junit.Assert.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.Test;
import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class CuboidTest {
	@Test
	public void CuboidTest1() throws Exception {
		new Cuboid(1,2,3);
	}
	@Test (expected = IllegalArgumentException.class)
	public void cuboidTest2() throws Exception {
		new Cuboid(-7,14,10);
	}
	@Test (expected = IllegalArgumentException.class)
	public void cuboidTest3() throws Exception {
		new Cuboid(5,-10,15);
	}
	@Test (expected = IllegalArgumentException.class)
	public void cuboidTest4() throws Exception {
		new Cuboid(6,10,-12);
	}
	@Test
	public void setterTest1() throws Exception{
		Cuboid cub = new Cuboid (2,3,4);
		cub.setiLength(2);
		cub.setiWidth(3);
		cub.setiDepth(4);
		assertEquals(cub.getiLength(),2);
		assertEquals(cub.getiWidth(),3);
		assertEquals(cub.getiDepth(),4);
	}
	@Test
	public void areaTest1() throws Exception{
		Cuboid cub = new Cuboid (7,4,8);
		assertEquals(cub.area(),232,0.001);
	}
	@Test
	public void volumeTest1() throws Exception{
		Cuboid cub = new Cuboid (7,4,8);
		assertEquals(cub.volume(),224,0.001);
	}
	@Test (expected = UnsupportedOperationException.class)
	public void perimeterTest1() throws Exception{
		Cuboid cub = new Cuboid (10,5,15);
		cub.perimeter();
	}
	@Test
	public void compareToTest1() throws Exception{
		ArrayList<Cuboid> cubs = new ArrayList<Cuboid>();
		for(int i=0; i<10; i++) {
			int iWidth = ThreadLocalRandom.current().nextInt(1,10+1);
			int iLength = ThreadLocalRandom.current().nextInt(1,10+1);
			int iDepth = ThreadLocalRandom.current().nextInt(1,10+1);
			cubs.add(new Cuboid(iWidth,iLength,iDepth));
		}
		Collections.sort((List<Cuboid>)cubs);
		for(int i=0; i<9; i++) {
			assertTrue(cubs.get(i).area()<= cubs.get(i+1).area());
			}
		}
	public void sortbyareaTest1() throws Exception{
	}
	public void sortbyvolumeTest1() throws Exception{
	}
}