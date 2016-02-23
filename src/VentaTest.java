import static org.junit.Assert.*;

import org.junit.Test;


public class VentaTest {

	@Test
	public void test() {
		Venta venta = new Venta();
		//assertEquals(0,venta.calcularPrecioTotal());
		assertEquals(0, venta.calcularPrecioTotal(), 0);
		
		/*Producto producto = new Producto();
		producto.establecerPrecio(10);
		producto.establecerCantidad(1);
		venta.agregarProductoEnVenta(producto);
		assertEquals(10,venta.calcularPrecioTotal());
		
		Venta venta2 = new Venta();
		Producto producto2 = new Producto();
		producto2.establecerPrecio(10);
		producto2.establecerCantidad(1);
		venta2.agregarProductoEnVenta(producto2);
		Producto producto3 = new Producto();
		producto3.establecerPrecio(15);
		producto3.establecerCantidad(1);
		venta2.agregarProductoEnVenta(producto3);
		assertEquals(25,venta2.calcularPrecioTotal());
		
		Venta venta3 = new Venta();
		Producto producto4 = new Producto();
		producto4.establecerCantidad(12);
		producto4.establecerPrecio(5);
		venta3.agregarProductoEnVenta(producto4);
		assertEquals(60,venta3.calcularPrecioTotal());*/
		
	    Articulo articulo = new Articulo();
		articulo.establecerPrecio(10);
		articulo.establecerCantidad(1);
		venta.agregarProductoEnVenta(articulo);
		//assertEquals(10,venta.calcularPrecioTotal());
		assertEquals(10, venta.calcularPrecioTotal(), 0);
		
		Venta venta2 = new Venta();
		Articulo articulo2 = new Articulo();
		articulo2.establecerPrecio(10);
		articulo2.establecerCantidad(1);
		venta2.agregarProductoEnVenta(articulo2);
		Articulo articulo3 = new Articulo();
		articulo3.establecerPrecio(15);
		articulo3.establecerCantidad(1);
		venta2.agregarProductoEnVenta(articulo3);
		//assertEquals(25,venta2.calcularPrecioTotal());
		assertEquals(25, venta2.calcularPrecioTotal(), 0);
		
		Venta venta3 = new Venta();
		Articulo articulo4 = new Articulo();
		articulo4.establecerCantidad(12);
		articulo4.establecerPrecio(5);
		venta3.agregarProductoEnVenta(articulo4);
		//assertEquals(60,venta3.calcularPrecioTotal());
		assertEquals(60, venta3.calcularPrecioTotal(), 0);
		
		Venta venta4 = new Venta();
		Servicio servicio = new Servicio();
		servicio.establecerCantidadHoras(2);
		servicio.establecerPrecioHora(3);
		venta4.agregarProductoEnVenta(servicio);
		//assertEquals(6,venta4.calcularPrecioTotal());
		assertEquals(1.2, venta4.calcularPrecioTotal(), 1);
		
		
		
		
	}

}
