
public class Circle implements Shape{
	public double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return (Math.PI*Math.exp(radius/2));
	}
	public double getPerimeter() {
		return (Math.PI*(radius/2)*2);
	}
	public void scale(double scalar) {
		setRadius(radius*scalar);
		
	}
	
	public void printData() {
		System.out.println("radius: "+radius);
	}
	
	

}
