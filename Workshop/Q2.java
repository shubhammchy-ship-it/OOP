package Workshop;

	class Shape {

	   
	    double getPerimeter() {
	        return 0;
	    }

	    
	    double getArea() {
	        return 0;
	    }
	}
	
	class Circle extends Shape {
	    double radius;

	    
	    Circle(double radius) {
	        this.radius = radius;
	    }

	   
	    
	    double getPerimeter() {
	        return 2 * Math.PI * radius;
	    }

	   
	 
	    double getArea() {
	        return Math.PI * radius * radius;
	    }
	}

	
	public class Q2 {
	    public static void main(String[] args) {

	        Circle c1 = new Circle(5);

	        System.out.println("Circle Details:");
	        System.out.println("Radius: 5");
	        System.out.println("Perimeter (Circumference): " + c1.getPerimeter());
	        System.out.println("Area: " + c1.getArea());
	    }
	}


