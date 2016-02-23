
public class Servicio extends Producto {
	
	/*public int calcular() {
		precio=cantidad*precio;
		return precio;
    }*/
	
	public double calcular() {
		precio=cantidad*precio*0.2;
		return precio;
   }

	public void establecerCantidadHoras(int horas) {
		this.cantidad = horas;
	}
	
	public void establecerPrecioHora(int precio) {
		this.precio = precio;
	}

}

