package FPOO;

public class Retangle {

	double width;
	double height;
	double area;
	double perimetro;

	public Retangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double calcArea() {
		return width * height;
	}
	
	public double calcPerimetro() {
		return (width*2) + (height*2);
	}
	
	public double calcDiagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
