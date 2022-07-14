package ar.edu.unlam.pb2.aseguradora;

import java.util.Collections;
import java.util.Set;

public class CompaniaDeSeguro {
	private String nombre;
	private Set<Poliza> listaPolizas;

	public CompaniaDeSeguro(String nombre) {
		this.nombre=nombre;
	}

	public void denunciarSiniestro(Integer nroPoliza) throws PolizaInexistente {
		Poliza poliza = getPoliza(nroPoliza);
		if(poliza instanceof SegurosGenerales)
			poliza.setSufrioRobos(true);
		if(poliza instanceof SegurosDeVida)
			poliza.setTuvoAccidentes(true);
	}
	
	public void agregarPoliza(PolizaDeAuto polizaDeAuto) {
		// TODO Auto-generated method stub
		
	}

	public void denunciarSiniestro(int i) {
		// TODO Auto-generated method stub
		
	}

	public Object getPoliza() {
		// TODO Auto-generated method stub
		return this.getNroPoliza();
	}

	public void agregarPoliza(PolizaAccidentesPersonales polizaAccidentesPersonales) {
		listaPolizas.add(polizaAccidentesPersonales);
		
	}

	public void agregarPoliza(PolizaCombinadoFamiliar polizaCombinadoFamiliar) {
		listaPolizas.add(polizaCombinadoFamiliar);
		
	}
	
	
	public Object obtenerLaCantidadDePolizasEmitidas() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Poliza getPoliza(Integer nroPoliza) throws PolizaInexistente {
		for(Poliza poliza:listaPolizas) {
			if(poliza.getNroPoliza().equals(nroPoliza))
				return poliza;
			}
		throw new PolizaInexistente("No se encontro el numero de poliza");
		
	}


}
