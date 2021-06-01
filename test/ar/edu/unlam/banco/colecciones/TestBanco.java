package ar.edu.unlam.banco.colecciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestBanco {

	@Test
	public void queSePuedaAgregarUnaCuenta() {
		String nombre = "unlam";
		Banco unlam = new Banco(nombre);
		Cuenta cuenta = new CajaDeAhorro();
		Cuenta cuenta2 = new CajaDeAhorro();
		assertTrue(unlam.agregarCuenta(cuenta));
		assertTrue(unlam.agregarCuenta(cuenta2));
		Integer ve = 2;
		Integer vo = unlam.obtenerCantidadCuentas();
		assertEquals(ve, vo);
		// assertNotNull()
//		Cuenta cuenta2=new CajaDeAhorro();
//		assertTrue(unlam.agregarCuenta(cuenta2));		
		// assertEquals(2,unlam.obtenerCantidadCuentas())

	}

	@Test
	public void queSePuedaEliminarUnaCuenta() {
		String nombre = "unlam";
		Banco unlam = new Banco(nombre);
		Cuenta cuenta = new CajaDeAhorro();
		Cuenta cuenta2 = new CajaDeAhorro();
		unlam.agregarCuenta(cuenta);
		unlam.agregarCuenta(cuenta2);
		unlam.eliminarCuenta(1);

		// assertNotNull()
//		Cuenta cuenta2=new CajaDeAhorro();
//		assertTrue(unlam.agregarCuenta(cuenta2));		
		// assertEquals(2,unlam.obtenerCantidadCuentas())

	}

	@Test
	public void queSePuedaTransferirEntreDosCuentas() {

		///
		Banco unlam = new Banco("unlam");

		CajaDeAhorro cah = new CajaDeAhorro(1000.0);
		cah.setNumero(30);

		CuentaCorriente cc = new CuentaCorriente(1000.0);
		cc.setNumero(28);
		unlam.agregarCuenta(cc);
		unlam.agregarCuenta(cah);

		Integer nuemeroCuentaOrigen = 28;
		Integer nuemeroCuentaDestino = 30;
		Double monto = 300.0;
		unlam.transferir(nuemeroCuentaOrigen, nuemeroCuentaDestino, monto);

		assertEquals(700.0, unlam.buscarCuenta(28).getSaldo(), 0.01);
		assertEquals(1300.0, unlam.buscarCuenta(30).getSaldo(), 0.01);
		unlam.obtenerCuentas().size();

	}

}
