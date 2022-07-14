package ar.edu.unlam.pb2.aseguradora;

public class PolizaAccidentesPersonales implements SegurosDeVida {
	private Integer nroPoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	
	public PolizaAccidentesPersonales(Integer nroPoliza, Persona asegurado, Double sumaAsegurada,
			Double prima) {
		this.nroPoliza=nroPoliza;
		this.asegurado=asegurado;
		this.sumaAsegurada=sumaAsegurada;
		this.prima=prima;
	}

}
