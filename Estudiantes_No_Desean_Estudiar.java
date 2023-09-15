
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Estudiantes_No_Desean_Estudiar {

    public record Estudiante(String nombre,
                             int edad,
                             boolean seUsanTecnicasDeEnseñansaAntiguas,
                             boolean FaltaDeRecursos,
                             boolean NoLeGustaEstudiar) {
    }
    public static void main(String[] args) {
        // Crear una lista de estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();

        // Agregar estudiantes con su nombre, edad y condiciones
        estudiantes.add(new Estudiante("Estudiante_1", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_2", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_3", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_4", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_5", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_6", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_7", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_8", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_9", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_10", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_11", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_12", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_13", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_14", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_15", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_16", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_17", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_18", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_19", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_20", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_21", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_22", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_23", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_24", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_25", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_26", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_27", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_28", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_29", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_30", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_31", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_32", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_33", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_34", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_35", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_36", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_37", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_38", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_39", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_40", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_41", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_42", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_43", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_44", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_45", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_46", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_47", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_48", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_49", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_50", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_51", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_52", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_53", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_54", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_55", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_56", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_57", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_58", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_59", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_60", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_61", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_62", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_63", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_64", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_65", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_66", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_67", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_68", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_69", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_70", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_71", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_72", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_73", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_74", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_75", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_76", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_77", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_78", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_79", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_80", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_81", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_82", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_83", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_84", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_85", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_86", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_87", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_88", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_89", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_90", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_91", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_92", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_93", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_94", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_95", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_96", 19, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_97", 16, true, true, true));
        estudiantes.add(new Estudiante("Estudiante_98", 17, false, true, false));
        estudiantes.add(new Estudiante("Estudiante_99", 18, true, false, true));
        estudiantes.add(new Estudiante("Estudiante_100", 19, true, true, true));

        // Calcular el promedio de edades de todos los estudiantes
        double Promedio_De_Edades = Calcular_Promedio(Edades_De_Estudiantes(estudiantes));
        double Cantidad_De_Estudiantes_Que_No_Les_Gusta_Estudiar = Conteo_No_le_gusta_Estudiar(estudiantes);

        // Contar los estudiantes con problemas economicos y en relación a que no les guste estudiar
        int Problemas_Economicos = Estudiantes_No_Tienen_Recursos_Economicos(estudiantes);
        double Cantidad_Estudiantes_No_Continuan_Por_Recursos_Economicos = Estudiantes_No_Tienen_Recursos_Economicos_No_Estudiar(estudiantes);

        // Contar a cuantos estudiantes se les enseña con tecnicas antiguas
        int Estudiantes_Que_Les_Ensenan_De_Forma_Antigua = Conteo_Estudiantes(estudiantes);
        int Estudiantes_Que_No_Les_Ensenan_De_Forma_Antigua = -Conteo_Estudiantes(estudiantes)+estudiantes.size();

        //Contar los que no tienen recursos y les enseñan de forma antigua y los que no cumplen los tres
        double Problemas_Economicos_Ensenanaza_Antigua =Conteo_Estudiantes_Problemas_Economicos_Esenanzas_Antiguas(estudiantes);
        double Problemas_Economicos_Ensenanaza_Antigua_No_estudiar = Conteo_Estudiantes_Problemas_Economicos_Esenanzas_Antiguas_No_quieren_estudiar(estudiantes);
        // Contar cuántos estudiantes se les enseña de maera antigua y no desean estudiar 
        double Cantidad_Estudiantes_Que_no_les_gusta_estudiar_por_ensenanza_antigua= Conteo_Estudiantes_Que_No_Le_Gusta_Estudiar(estudiantes);

        // Calcular la moda de las edades
        int Edad_Moda = calculo_Edad_Que_Mas_Se_Repite(Edades_De_Estudiantes(estudiantes));


        // Imprimir resultados
        System.out.println("");
        System.out.println("A continuación se presentarán los resultados de una encuesta realizada jóvenes estudiantes del país");
        System.out.println("El tema de la encuesta es el agrado hacia el estudio y las causas de este");
        System.out.println("");
        System.out.println("la cantidad de encuestados es " + estudiantes.size());
        System.out.println("La edad promedio de los encuestados es de " + Promedio_De_Edades+" años y la edad que mas se repite es "+ Edad_Moda);
        System.out.println("");
        System.out.println("La cantidad de estuiantes que se les sigue enseñando de maneras antiguas es: " + Estudiantes_Que_Les_Ensenan_De_Forma_Antigua);
        System.out.println("La cantidad de estuiantes que se les enseña de maneras modernas es: " + Estudiantes_Que_No_Les_Ensenan_De_Forma_Antigua);
        System.out.println("La cantidad de estuiantes que tienen problemas economicos es: " + Problemas_Economicos);
        System.out.println("");
        System.out.println("En porcentaje podemos observar que: ");
        System.out.println("El "+ (Problemas_Economicos_Ensenanaza_Antigua/estudiantes.size())*100+"% no tienen recursos economicos y se les enseña de manera antigua");
        System.out.println("El "+ ((Cantidad_De_Estudiantes_Que_No_Les_Gusta_Estudiar)/estudiantes.size())*100+"% no desean estudiar");
        System.out.println("El "+ (Cantidad_Estudiantes_No_Continuan_Por_Recursos_Economicos/estudiantes.size())*100+"% no desean estudiar y tienen problemas economicos");
        System.out.println("El "+ (Cantidad_Estudiantes_Que_no_les_gusta_estudiar_por_ensenanza_antigua/estudiantes.size())*100+"% no desean estudiar y se les enseña de manera antigua");
        System.out.println("El "+ (Problemas_Economicos_Ensenanaza_Antigua_No_estudiar/estudiantes.size())*100+"% no desean estudiar, se les enseña de manera antigua y tienen problemas economicos");
        System.out.println("");
        System.out.println("Con estos resultados podemos decir ");
        System.out.println("1- La mayoria de estudiantes tienen problemas economicos y se les enseña de manera ortodoxa ");
        System.out.println("2- La mayoria de estudiantes no desean estudiar y la principal causa es la forma en que se enseña");
        System.out.println("3- La situación economica tambien es un gran afectante encuanto al disgusto por estudiar ");
        System.out.println("");
        System.out.println("En conclusión:");
        System.out.println("se debe implementar nuevas estrategias para captar la atención de los jovenes");
        System.out.println("Y se debe realizar ayuda social para mejorar la carente situación economica de los jovenes");
        
    }

    // Método para calcular el promedio de una lista de edades
    private static double Calcular_Promedio(List<Integer> edades) {
        double suma = 0;
        for (int edad : edades) {
            suma += edad;
        }
        return suma / edades.size();
    }

    // Método para contar cuántos estudiantes se le enseña de manera antigua
    private static int Conteo_Estudiantes(List<Estudiante> estudiantes) {
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.seUsanTecnicasDeEnseñansaAntiguas == true) {
                contador++;
            }
        }
        return contador;
    }
    // Método para contar cuántos estudiantes no desean estudiar 
    private static int Conteo_No_le_gusta_Estudiar(List<Estudiante> estudiantes){
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.NoLeGustaEstudiar == true) {
                contador++;
            }
        }
        return contador;
    }



    // Método para contar cuántos estudiantes no desean estudiar por falta de recursos
    private static int Estudiantes_No_Tienen_Recursos_Economicos_No_Estudiar(List<Estudiante> estudiantes) {
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if ((estudiante.NoLeGustaEstudiar== true )&&(estudiante.FaltaDeRecursos == true)) {
                contador++;
            }
        }
        return contador;
    }
    // Método para contar cuántos estudiantes tienen problemas economicos
    private static int Estudiantes_No_Tienen_Recursos_Economicos(List<Estudiante> estudiantes) {
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.FaltaDeRecursos== true ) {
                contador++;
            }
        }
        return contador;
    }

    // Método para contar cuántos estudiantes se les enseña de manera antigua y no desean seguir estudiando
    private static int Conteo_Estudiantes_Que_No_Le_Gusta_Estudiar(List<Estudiante> estudiantes) {
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if ((estudiante.seUsanTecnicasDeEnseñansaAntiguas == true)&&(estudiante.NoLeGustaEstudiar == true)) {
                contador++;
            }
        }
        return contador;
    }
    // Método para contar cuántos estudiantes tienen problemas economicos y se les enseña de manera antigua 
    private static int Conteo_Estudiantes_Problemas_Economicos_Esenanzas_Antiguas(List<Estudiante> estudiantes) {
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if ((estudiante.seUsanTecnicasDeEnseñansaAntiguas == true)&&(estudiante.FaltaDeRecursos==true)) {
                contador++;
            }
        }
        return contador;
    }
    // Método para contar cuántos estudiantes no desean estudiar, tienen problemas economicos y se les enseña de manera antigua
    private static int Conteo_Estudiantes_Problemas_Economicos_Esenanzas_Antiguas_No_quieren_estudiar(List<Estudiante> estudiantes) {
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if ((estudiante.seUsanTecnicasDeEnseñansaAntiguas == true)&&(estudiante.FaltaDeRecursos==true)&&(estudiante.NoLeGustaEstudiar == true)) {
                contador++;
            }
        }
        return contador;
    }

    // Método para obtener las edades de todos los estudiantes
    private static List<Integer> Edades_De_Estudiantes(List<Estudiante> estudiantes) {
        List<Integer> edades = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            edades.add(estudiante.edad);
        }
        return edades;
    }

    // Método para calcular la moda de una lista de edades
    private static int calculo_Edad_Que_Mas_Se_Repite(List<Integer> edades) {
        int moda = 0;
        int Max_Frecuencia = 0;
        for (int edad : edades) {
            int frecuencia = Collections.frequency(edades, edad);
            if (frecuencia > Max_Frecuencia) {
                moda = edad;
                Max_Frecuencia = frecuencia;
            }
        }
        return moda;
    }
}

