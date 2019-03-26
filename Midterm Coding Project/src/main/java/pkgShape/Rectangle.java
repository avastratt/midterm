package pkgShape;

public class Rectangle extends Shape {

	private int iWidth;
	private int iLength;

	public Rectangle(int iWidth, int iLength) throws Exception {
		super();

		if (iWidth < 0 || iLength < 0)
			throw new IllegalArgumentException("Width and length can't be negative");
		else {
			this.iWidth = iWidth;
			this.iLength = iLength;
		}
	}

	@Override
	public double area() {
		return iWidth * iLength;
	}

	@Override
	public double perimeter() {
		return iWidth + iLength;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	public int compareTo(Object obj) {
		Rectangle rec = (Rectangle)obj;
		return (int) (this.area()- rec.area());
	}

}
