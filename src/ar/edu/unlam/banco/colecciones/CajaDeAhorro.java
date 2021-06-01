package ar.edu.unlam.banco.colecciones;

public class CajaDeAhorro extends Cuenta {
	
	private Float tasaDeInteres;
	//0.05
	
	public CajaDeAhorro(){
		tasaDeInteres = 0.0F;
	}
	
	public CajaDeAhorro(Double saldo, Integer numero, String apellidoTitular, String nombreTitular){
		super(saldo, numero, apellidoTitular, nombreTitular);	
		this.tasaDeInteres = 0.0F;
	}
	
	public CajaDeAhorro(Double saldoInicial){
		super(saldoInicial);
		tasaDeInteres = 0.0F;
	}
	
	public CajaDeAhorro(Double saldoInicial, Float tasaDeInteres){
		super(saldoInicial);
		this.tasaDeInteres = tasaDeInteres;
	}

	@Override
	public Boolean extraerDinero(Double importeARetirar) {
		Boolean estado=false;
		if (importeARetirar <= this.getSaldo()) {
					
			this.setSaldo(getSaldo()-importeARetirar);
			estado=true;
		}
		return false;
	}

}
