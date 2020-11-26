package lab8_mit;

public class Rectangle {
	
	// Instance variables
	private double length, width;

	// Default constructor
	public Rectangle() {
		length = 1;
		width = 1;
	}
	
	// Constructor overloading
 	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// Getter and Setter method for length and width
	public boolean setLength(double length) {
		if (length > 0) {
			this.length = length;
			return true;
		}
		return false;
	}
	
	public double getLength() {
		return length;
	}

	public boolean setWidth(double width) {
		if (width > 0) {
			this.width = width;
			return true;
		}
		return false;
	}

	public double getWidth() {
		return width;
	}
	
	// Methods for area and perimeter
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return 2 * (length + width);
	}

	// Overriding toString() to return details of rectangle
	@Override
	public String toString() {
		return "\nRectangle details.\nlength = " + length + "\nwidth = " + width + "\narea = " + getArea() + 
				"\nperimeter = " + getPerimeter() + "\n";
	}
	
}
