package ar.edu.unlam.banco.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Banco {

	private String nombre;
	private Integer contadorCuentas = 0;
	private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

	public Banco(String nombre) {
		this.nombre = nombre;

	}

	public void agregarCuenta(int posicion, Cuenta cuenta) {

		this.cuentas.add(posicion, cuenta);

	}

	public void recorrerList() {
		for (int i = 0; i < this.cuentas.size(); i++) {

			Cuenta cuenta = this.cuentas.get(i);
			cuenta.getNumero();
		}

		for (Cuenta cuenta : cuentas) {
			cuenta.getNumero();

		}
	}

	public Boolean agregarCuenta(Cuenta cuenta) {

		return this.cuentas.add(cuenta);

	}

	public Integer obtenerCantidadCuentas() {

		return this.cuentas.size();
	}

	public Boolean eliminarCuenta(Cuenta cuenta) {

		return this.cuentas.remove(cuenta);

	}

	public Cuenta eliminarCuenta(int posicion) {

		return this.cuentas.remove(posicion);

	}

	public void transferir(Integer nuemeroCuentaOrigen, Integer nuemeroCuentaDestino, Double monto) {

		Boolean estado = false;
		Cuenta cuentaOrigen = buscarCuenta(nuemeroCuentaOrigen);
		Cuenta cuentaDestino = buscarCuenta(nuemeroCuentaDestino);
		if (cuentaOrigen.extraerDinero(monto)) {
			cuentaDestino.depositarDinero(monto);
			estado = true;

		}
		//return estado;
	}

	public Cuenta buscarCuenta(Integer nuemeroCuenta) {
		for (Cuenta cuenta : this.cuentas) {
			if (nuemeroCuenta.equals(cuenta.getNumero()))
				return cuenta;
		}

		return null;
	}

	public List<Cuenta> obtenerCuentas(){
		return this.cuentas;
		
	}
	
	public void agregarListaDeCuenta (List<Cuenta> nuevasCuentas) {
		this.cuentas.addAll(nuevasCuentas);
	}
	public void  eliminarCuentas (List<Cuenta> cuentasABorrar) {
		this.cuentas.removeAll(cuentasABorrar);
		
		//1 2 3 4 5        3 5-- >  
		//1 2 4 
	}
	
	
	
	
}
