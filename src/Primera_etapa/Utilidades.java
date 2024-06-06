package Primera_etapa;

public final class Utilidades {
	//métodos
	    public static double calcularSalarioNeto(Empleados empleado) {
	        return empleado.getSueldo() - calcularIsss(empleado) - calcularAfp(empleado) - calcularRenta(empleado);
	    }
	    public static double calcularIsss(Empleados empleado) {
	    	return empleado.getSueldo() * 0.075;
	    }
	    public static double calcularAfp(Empleados empleado) {
	    	return empleado.getSueldo() * 0.0775;
	    }
	    public static double calcularRenta(Empleados empleado) {
	    	double sueldo = empleado.getSueldo();
	    	 if (sueldo > 472.01 && sueldo < 895.24) {
	    		 return sueldo * 0.1 + 17.67;
	    	 } else if (sueldo > 895.25 && sueldo < 2038.10) {
	    		 return sueldo * 0.2 + 60;
	    	 } else if (sueldo > 2038.11) {
	    		 return sueldo * 0.3 + 288.57;
	    	 }
	    	 
	    	 return 0;
	    }
}
