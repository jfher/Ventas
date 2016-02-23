
public class Venta {
	public double total=0;

	public double calcularPrecioTotal() {
		return total;
	}

	public void agregarProductoEnVenta(Producto producto) {
		total=total+producto.calcular();
	}

}
