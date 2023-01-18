package package1;
//TODO this does not work correctly w numbers as long as my ID number
public class CUADRADO {

	public int num;
	public double area, perimetro, diagonal;

	public CUADRADO(int a) {
		int num=a;
		area=num*num;
		perimetro=num*4;
		diagonal=(double) Math.sqrt((num*num)+(num*num));
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
