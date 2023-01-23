package package1;
//TODO this does not work correctly w numbers as long as my ID number
public class CUADRADO {

	public int num;
	public double area, perimetro, diagonal;

	public CUADRADO(int num) {
		this.num=num;
	}
	CUADRADO(){
		this(178607);
	}
	
	public double impresionA() {
		area=(double) Math.pow(num, 2);
		return area;
	}
	public double impresionB() {
		perimetro=num*4;
		return perimetro;
	}
	public double impresionC() {
		diagonal=(double) Math.sqrt(area+area);
		return diagonal;
	}	
	
	
	
}
