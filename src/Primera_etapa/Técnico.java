package Primera_etapa;

public class Técnico extends Empleados {
	public Técnico (String nombre, String direccion, String fechaNacimiento, String sexo) {
		super(nombre, direccion, fechaNacimiento, sexo);
		sueldo = 350;
	}
}
