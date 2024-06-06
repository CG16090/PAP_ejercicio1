package Primera_etapa;

public class Gerente extends Empleados {
	public Gerente(String nombre, String direccion, String fechaNacimiento, String sexo) {
		super(nombre, direccion, fechaNacimiento, sexo);
		sueldo = 5000;
	}

}
