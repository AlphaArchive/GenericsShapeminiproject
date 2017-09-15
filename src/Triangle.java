
public class Triangle implements Shape{
	public double height;
	public double base;
	public double hypotenuse;
	
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
		this.hypotenuse = (base*base)+(height*height);
		this.hypotenuse = Math.sqrt(hypotenuse);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public void setHypotenuse(double hypotenuse) {
		this.hypotenuse = hypotenuse;
	}

	public double getArea() {
		return ((height*base)/2);
	}

	public double getPerimeter() {
		return (base+height+hypotenuse);
	}

	public void scale(double scalar) {
		setHeight(height*scalar);
		setBase(base*scalar);
		setHypotenuse(Math.sqrt((base*base)+(height*height)));		
	}
	
	public void printData() {
		System.out.println("height: "+height);
		System.out.println("base: "+base);
		System.out.println("hypotenuse: "+hypotenuse);
	}
	
	

}
