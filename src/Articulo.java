
public class Articulo extends Producto {
	
	public double calcular() {
		precio=cantidad*precio;
		System.out.println("articulo calcular");
		return precio;
    }


}
