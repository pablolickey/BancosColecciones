package ar.edu.unlam.banco.colecciones;

public class CuentaCorriente extends Cuenta {

	private Double sobregiro;
	
	public Double getSobregiro() {
		return sobregiro;
	}

	public CuentaCorriente(){
		sobregiro = 300.0;
	}
	
	public CuentaCorriente(Double saldoInicial){
		super(saldoInicial);
		sobregiro = 300.0;
	}
	// Sobreescritura de método

	@Override
	public Boolean extraerDinero(Double importeARetirar) {
		Boolean estado=false;
		if (importeARetirar <= this.getSaldo()+sobregiro) {
			this.setSaldo(getSaldo()-importeARetirar);
			estado=true;
		}
		return estado;
	}
	
	
	
}
