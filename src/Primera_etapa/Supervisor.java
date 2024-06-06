package Primera_etapa;

public class Supervisor extends Empleados{
	public Supervisor (String nombre, String direccion, String fechaNacimiento, String sexo) {
		super(nombre, direccion, fechaNacimiento, sexo);
		sueldo = 750;
	}
}
