
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Taller2Pre {

	/*

	- 	Realice cada punto en el orden que desee
	- 	El ejericio debe ser realizado con los conceptos vistos en clase
	- 	Como parte del ejercicio se proveen 5 metodos utilitarios a los cuales hay que definir los tipos de datos que considere
		es el mas conveniente para el tipo de dato a manejar. Cada uno de estos metodos devuelve un array con el dato que se quiere analizar.
		Por ejemplo el metodo pesos devuelve un array con los valores {70,58,3,55,63...}.
		NOTA: Estos metodos se encuentran comentados, descomente solo el metodo del punto que este trabajando para evitar error de compilacion.
  - 	No es necesario crear nuevos metodos, todos los puntos pueden ser programados en el metodo main
  -   Adicionalmente y al final de la clase se ha incluido como ejemplo el metodo  public static String[] getDirecciones(String[] data). Ese metodo se usa para
    extraer las direcciones de cada persona, las cuales son imprimidas utilizando un for desde el main

	1. Pesos:
		Imprimir los pesos
		Calcular la media de los pesos

	2. Estaturas:
		Imprimir estaturas
		Encontrar el menos alto
		Encontrar el mas alto

	3. Generos
		Contar cuantas personas tienen genero Masculino (M), y cuantas con Femenino (F)

	4. Nombres Completos
		Generar una cadena que contenga todos los nombres de las personas separados por comas asi:
		Juan Pérez,María García, Carlos Pérez

	5. Edades:
		Imprimir las edades de cada persona
		Encontrar cual es la persona con menos año
*/

	public record InformacionPersonal(String nombre,
									  String apellido,
									  LocalDate fechaDeNacimiento,
									  String direccion,
									  String nivelAcademico,
									  String ocupacion,
									  Character genero,
									  int peso,
									  float estatura){}
	public static void main(String[] args) {
		String[] data = new String[11];

		data[0] = "Nombres, Apellidos, Fecha de Nacimiento (DIA/MES/AÑO, Direccion, Nivel Academico, Ocupacion, Genero, Peso en kilogramos, Estatura en metros";
		data[1] = "Juan,Pérez,15/03/1985,Calle 123,Medellin,Licenciatura en Ingeniería,Ingeniero de Software,M,70,1.75";
		data[2] = "María,García,28/07/1992,Calle 123,Medellin,Maestría en Psicología,Psicóloga Clínica,F,58,1.68";
		data[3] = "Carlos,Pérez Garcia,10/03/2023,Calle 123,Medellin,,,M,3,0.80";
		data[4] = "Ana,Martínez,05/09/2009,Calle 14,Villa,Bachiller,Estudiante,Femenino,55,1.60";
		data[5] = "Luisa,Hernández,20/06/1989,Carrera 789,Envigado,Doctorado en Economía,Profesora Universitaria,F,63,1.70";
		data[6] = "Javier,López,12/04/1975,Calle San Juan,Medellin,Licenciatura en Arquitectura,Arquitecto Independiente,M,75,1.82";
		data[7] = "Laura,Ramírez,18/04/1998,Avenida 6,Ciudad Metropolitana,Bachiller,Estudiante,F,52,1.65";
		data[8] = "Martín,Torres,30/02/1998,Avenida 6,Aldea,Bachiller,Estudiante,M,68,1.78";
		data[9] = "Sofia,Vargas,22/07/1995,Avenida 6,Rionegro,Bachiller,Estudiante,F,60,1.63";
		data[10] = "Daniel,Sánchez,08/12/1999,Avenida 6,Rionegro,Bachiller,Estudiante,M,72,1.79";


		InformacionPersonal[] Data = new InformacionPersonal[10];

		Data[0] = new InformacionPersonal("Juan","Pérez",LocalDate.parse("15/03/1985", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 123Medellin","Licenciatura en Ingeniería","Ingeniero de Software",'M',70,1.75F);
		Data[1] = new InformacionPersonal("María","García",LocalDate.parse("28/07/1992", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 123,Medellin","Maestría en Psicología","Psicóloga Clínica",'F',58,1.68F);
		Data[2] = new InformacionPersonal("Carlos","Pérez Garcia",LocalDate.parse("10/03/2023", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 123,Medellin","","",'M',3,0.80F);
		Data[3] = new InformacionPersonal("Ana","Martínez",LocalDate.parse("05/09/2009", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 14,Villa","Bachiller","Estudiante",'F',55,1.60F);
		Data[4] = new InformacionPersonal("Luisa","Hernández",LocalDate.parse("20/06/1989", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Carrera 789,Envigado","Doctorado en Economía","Profesora Universitaria",'F',63,1.70F);
		Data[5] = new InformacionPersonal("Javier","López",LocalDate.parse("12/04/1975", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle San Juan,Medellin","Licenciatura en Arquitectura","Arquitecto Independiente",'M',75,1.82F);
		Data[6] = new InformacionPersonal("Laura","Ramírez",LocalDate.parse("18/04/1998", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6,Ciudad Metropolitana","Bachiller","Estudiante",'F',52,1.65F);
		Data[7] = new InformacionPersonal("Martín","Torres",LocalDate.parse("28/02/1998", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6,Aldea","Bachiller","Estudiante",'M',68,1.78F);
		Data[8] = new InformacionPersonal("Sofia","Vargas",LocalDate.parse("22/07/1995", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6,Rionegro","Bachiller","Estudiante",'F',60,1.63F);
		Data[9] = new InformacionPersonal("Daniel","Sánchez",LocalDate.parse("08/12/1999", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6,Rionegro","Bachiller","Estudiante",'M',72,1.79F);




		int pesoPromed =0;
		System.out.println("Los pesos son:");
		System.out.println("");
		for(InformacionPersonal info:Data){
			pesoPromed += info.peso;
			System.out.println(info.peso);
			System.out.println("");
		}
		System.out.println("El promedio de pesos es:" + pesoPromed/Data.length);

		System.out.println("");



		System.out.println("Las Estaturas son:");
		System.out.println("");
		Float minEstatura=100F;
		Float maxestatura = 0F;
		for(InformacionPersonal info: Data){
			System.out.println(info.estatura);
			System.out.println("");
			if(info.estatura< minEstatura){
				minEstatura = info.estatura;
			}
			if(info.estatura > maxestatura){
				maxestatura = info.estatura;
			}

		}
		System.out.println("");
		System.out.println("La mayor altura es: " + maxestatura + " y la menor estatura es: "+ minEstatura);


		int masculino=0;
		int  femenino=0;
		System.out.println("");
		for(InformacionPersonal info:Data){
			if(info.genero == 'M'){
				masculino++;

			}else {
				femenino++;
			}
		}
		System.out.println("El total de personas de genero masculino es: "+masculino);
		System.out.println("");
		System.out.println("El total de personas de genero femenino es: "+femenino);
		System.out.println("");


		StringBuilder cadenaNombres = new StringBuilder();
		for (InformacionPersonal info:Data){
			cadenaNombres.append(info.nombre);
			cadenaNombres.append(",");
			cadenaNombres.append(" ");


		}
		System.out.println(cadenaNombres);
		System.out.println("");
		long edadmin = 1000L;

		for (InformacionPersonal info:Data){
			long edad = ChronoUnit.YEARS.between(info.fechaDeNacimiento,LocalDate.now());
			System.out.println(edad);
			System.out.println("");
			if(edad<edadmin){
				edadmin = edad;
			}
		}
		System.out.println("La menor edad es "+ edadmin);

		//El metodo getDirecciones y el siguiente for se incluye como ejemplo de impresión de las direcciones
		/**String[] direcciones = getDirecciones( data );
		for ( String direccion : direcciones ) {
			System.out.println(direccion);
		}*/


		//1. Pesos:
		//tipo_de_variable_para_pesos_pesos = getPesos(data);


		//2. Estaturas:
		//tipo_de_variable_para_estaturas estaturas = getEstaturas( data );


		//3. Generos
		//tipo_de_variable_para_generos generos = getGeneros( data );


		//4. Nombres Completos
		//tipo_de_variable_para_nombres_completos nombresCompletos = getNombresCompletos( data );

		//5. Edades:
		//tipo_de_variable_para_fechas_de_nacimiento fechasDeNacimiento = getFechasDeNacimientos(data);



	}


	public static int[] getPesos(String[] data){

		int[] pesos = new int[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			int peso = Integer.valueOf(datum[8]);
			pesos[i-1] = peso;
		}
		return pesos;
	}

	public static Float[] getEstaturas(String[] data){

		Float[] estaturas = new Float[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			Float estatura = Float.valueOf(datum[9]);
			estaturas[i-1] = estatura;
		}
		return estaturas;
	}

	public static Character[] getGeneros(String[] data){

		Character[] generos = new Character[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			Character genero = datum[7].charAt( 0 );
			generos[i-1] = genero;
		}
		return generos;
	}

	public static String[] getNombresCompletos(String[] data){

		String[] nombresCompletos = new String[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String nombreCompleto = datum[0] + " " + datum[1];
			nombresCompletos[i-1] = nombreCompleto;
		}
		return nombresCompletos;
	}



	public static LocalDate[] getFechasDeNacimientos(String[] data){

		LocalDate[] fechasDeNacimiento = new LocalDate[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String fechaDeNacimiento = datum[2];
			fechasDeNacimiento[i-1] = LocalDate.parse( fechaDeNacimiento, DateTimeFormatter.ofPattern("dd/MM/uuuu"));
		}
		return fechasDeNacimiento;
	}

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
