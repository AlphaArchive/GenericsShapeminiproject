
public class Rectangle implements Shape {
	public double height;
	public double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return (height*width);
	}
	
	public double getPerimeter() {
		return (2*(height+width));
	}
	
	public void scale(double scalar) {
		setHeight(height*scalar);
		setWidth(width*scalar);		
	}
	
	public void printData() {
		System.out.println("height: "+height);
		System.out.println("width: "+width);
	}

	

}
