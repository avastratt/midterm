package pkgShape;
import java.util.Comparator;

public class Cuboid extends Rectangle {

	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) throws Exception {
		super(iWidth, iLength);
		if (iDepth < 0)
			throw new IllegalArgumentException("Depth can't be negative");
		else {
			this.iDepth = iDepth;
		}
	}
	public int getiDepth() {
		return iDepth;
	}
	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	@Override
	public int compareTo(Object obj) {
		Cuboid cub = (Cuboid)obj;
		return (int) (this.area()- cub.area());
	}
	@Override
	public double area() {
		return 2*getiLength()*getiWidth() + 2*getiLength()*getiDepth() + 2*getiWidth()*getiDepth();
	}
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Perimeter method is invalid");
	}
	public double volume () {
		return getiWidth()*getiLength()*getiDepth();
	}
	
}
class SortByArea implements Comparator<Cuboid>{
	SortByArea(){
		super();
	}
	@Override
	public int compare(Cuboid cub1, Cuboid cub2) {
		return (int)(cub1.area()-cub2.area());
	}
}
class SortByVolume implements Comparator<Cuboid>{
	SortByVolume(){
		super();
	}
	@Override
	public int compare(Cuboid cub1, Cuboid cub2) {
		return (int)(cub1.volume()-cub2.volume());
	}
}

