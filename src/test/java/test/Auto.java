package test;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int contador = 0;
		for (int i = 0; i< this.asientos.length;i++ ) {
			if(this.asientos[i] != null ) {
				contador++;
			
			}
			
		}
		
		return contador;
	}
	
	
	String verificarIntegridad() {
		boolean verificacion = true;
		if (this.registro == this.motor.registro) {
			
			for (int i = 0; i < this.asientos.length;i++) {
				if(this.asientos[i] != null) {
				  if (this.asientos[i].registro != this.registro) {
					  verificacion = false;
					  break;
					
				 }
			  } 
			}
			
			if (verificacion == true) {
				return ("Auto original");
			}
			
			else {
				return("Las piezas no son originales");
			}
				
					
		}
		
		else {
			return("Las piezas no son originales");			
		}
		
	}
	
	
	

}
