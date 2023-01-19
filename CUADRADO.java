package package1;
//TODO this does not work correctly w numbers as long as my ID number
public class CUADRADO {

	public int num;
	public double area, perimetro, diagonal;

	public CUADRADO(int a) {
		int num=a;
		area=(double) Math.pow(num, 2);
		perimetro=num*4;
		diagonal=(double) Math.sqrt(area+area);
	}
	
	public double impresionA() {
		return area;
	}
	public double impresionB() {
		return perimetro;
	}
	public double impresionC() {
		return diagonal;
	}
	
	
	
}
