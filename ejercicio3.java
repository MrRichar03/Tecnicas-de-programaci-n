public static int[] getPesos(String[] data){

		int[] pesos = new int[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			int peso = Integer.valueOf(datum[8]);
			pesos[i-1] = peso;
		}
		return pesos;
	}

	public static int[] getEstaturas(String[] data){

		int[] estaturas = new int[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			int estatura = Integer.valueOf(datum[9]);
			estaturas[i-1] = estatura;
		}
		return estaturas;
	}

	/*public static tipo_de_variable_para_generos[] getGeneros(String[] data){

		tipo_de_variable_para_generos[] generos = new tipo_de_variable_para_generos[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			tipo_de_variable_para_generos genero = datum[7].charAt( 0 );
			generos[i-1] = genero;
		}
		return generos;
	}*/

	/*public static tipo_de_variable_para_nombres_completos[] getNombresCompletos(String[] data){

		tipo_de_variable_para_nombres_completos[] nombresCompletos = new tipo_de_variable_para_nombres_completos[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			tipo_de_variable_para_nombres_completos[] datum = data[i].split( "," );
			tipo_de_variable_para_nombres_completos nombreCompleto = datum[0] + " " + datum[1];
			nombresCompletos[i-1] = nombreCompleto;
		}
		return nombresCompletos;
	}
*/


	/*public static tipo_de_variable_para_fechas_de_nacimiento[] getFechasDeNacimientos(String[] data){

		tipo_de_variable_para_fechas_de_nacimiento[] fechasDeNacimiento = new tipo_de_variable_para_fechas_de_nacimiento[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String fechaDeNacimiento = datum[2];
			fechasDeNacimiento[i-1] = tipo_de_variable_para_fechas_de_nacimiento.parse( fechaDeNacimiento, DateTimeFormatter.ofPattern("dd/MM/uuuu"));
		}
		return fechasDeNacimiento;
	}*/

	public static String[] getDirecciones(String[] data){

		String[] direcciones = new String[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String direccion = datum[3] ;
			direcciones[i-1] = direccion;
		}
		return direcciones;
	}
}
