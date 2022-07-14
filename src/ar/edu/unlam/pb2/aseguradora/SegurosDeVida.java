package ar.edu.unlam.pb2.aseguradora;

public interface SegurosDeVida {

	void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario parentesco);

	Object obtenerCantidadDeBeneficiarios();

	Object getPremio();

	Object getAsegurado();

}
