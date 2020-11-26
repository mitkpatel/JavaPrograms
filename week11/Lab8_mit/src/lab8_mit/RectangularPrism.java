package lab8_mit;

public class RectangularPrism extends Rectangle {
	
	//RectangularPrism class is inheriting Rectangle class with extends
	
	private double height;

	// Getter and Setter method for length and width
	public boolean setHeight(double height) {
		if (height > 0) {
			this.height = height;
			return true;
		}
		return false;
	}
	
	public double getHeight() {
		return height;
	}

	public RectangularPrism() {
		super(1, 1);          // Default constructor called and pass 1,1 value in Rectangle constructor
	}
	
	public RectangularPrism(double length, double width, double height) {
		super(length, width);		// calling Rectangle constructor and setting length and width
		this.height = height;
	}
	
	// Methods for volume, area and perimeter
	public double getVolume() {   // V = h*(l*w)
		return height * super.getArea();
	}
	
	public double getSurfaceArea() {  // S = 2(lw + lh + wh)  
		return 2 * ((super.getLength() * super.getWidth()) + (super.getLength() * getHeight()) + (super.getWidth() * getHeight()));
	}

	@Override
	public String toString() {
		return  super.toString() + "RectangularPrism [Height = " + getHeight() + ", Volume = " + getVolume() + ",Surface Area = "
				+ getSurfaceArea() + ", Perimeter = " + getPerimeter() + "]";
	}
	
	
}
