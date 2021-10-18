package test;
public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	void asignarTipo(String tipo) {
		switch(tipo) {
		
		case "electrico":
			this.tipo = tipo;
			
		case "gasolina":
			this.tipo = tipo;
			
		
		
		}
		
		
	}
	
	
}
