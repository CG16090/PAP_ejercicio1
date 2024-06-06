package Primera_etapa;

public class Jefe_de_area extends Empleados{
	public Jefe_de_area (String nombre, String direccion, String fechaNacimiento, String sexo) {
		super(nombre, direccion, fechaNacimiento, sexo);
		sueldo = 1500;
	}
}
