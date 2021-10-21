package uri1002;

public class Circulo {

	private static final double PI = 3.14159;
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return PI * Math.pow(radius, 2.0); // elevando raio ao quadrado usando metodo(pow)
	}

}
