package Primera_etapa;

public class Empleados {
// atributos
		protected double sueldo;
	    private String nombre;
	    private String direccion;
	    private String fechaNacimiento;
	    private String sexo;
// constructores
	    public Empleados(String nombre, String direccion, String fechaNacimiento, String sexo) {
	        this.nombre = nombre;
	        this.direccion = direccion;
	        this.fechaNacimiento = fechaNacimiento;
	        this.sexo = sexo;
	    }
	    
	    public String getNombre() {
	    	return nombre;
	    }
	    public String getDireccion() {
	    	return direccion;
	    }
	    public String getFechaNacimiento() {
	    	return fechaNacimiento;
	    }
	    public String getSexo() {
	    	return sexo;
	    }
	    public double getSueldo() {
	    	return sueldo;
	    }
}
