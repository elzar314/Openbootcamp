package eFinales;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*Este programa calcula tu Indice de Masa Corporal
Luego te proporciona consejos en base a tu estado y 
si deseas crea un archivo donde obtienes un plan para mejorar tu salud.
Además de mostrartelo en pantalla.
*/

public class ejercicio9 {
    public static void main(String[] args) {
        try {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner s = new Scanner(new InputStreamReader(System.in, StandardCharsets.UTF_8));

        HashMap<String,String> persona = new HashMap<>();

        System.out.print("Bienvenido al Sistema Vida Saludable\n\n");
        System.out.print("¿Cúal es tu nombre? ");
            persona.put("Nombre",s.nextLine());
        System.out.print("¿Cúantos años tienes? ");
            persona.put("edad",s.nextLine());
        System.out.print("¿Cúal es tu peso? ");
            persona.put("Peso",s.nextLine());
            String temp = persona.get("Peso");
            double peso = Double.parseDouble(temp);
        System.out.print("Ahora ingresa tu altura ");
            persona.put("Altura",s.nextLine());
            temp=persona.get("Altura");
            double altura = Double.parseDouble(temp);
        double ICM = peso/Math.pow(altura,2) ;
        ICM = Math.round(ICM * 100.0) / 100.0;

        persona.put("ICM",Double.toString(ICM));

        String cuerpo="";

        System.out.println("Tu índice de masa corporal es de "+ICM);

        if(ICM<18){
            cuerpo="delgado";
            persona.put("Contextura","Delgada");
        }else if((ICM>=18)&&(ICM<25)){
            cuerpo="normal";
            persona.put("Contextura","Normal");
        }else if((ICM>=25)&&(ICM<30)){
            cuerpo="con sobrepeso";
            persona.put("Contextura","Con sobrepeso");
        }else if(ICM>=30){
            cuerpo="con obesidad";
            persona.put("Contextura","con Obesidad");
        }

        System.out.println("Lo que significa que tienes un cuerpo "+cuerpo);

        boolean continuar = false;

        while(!continuar){
            System.out.print("\nQuieres 3 consejos que cambiaran tu vida Y/N: ");
            String seguir = s.next();
            seguir=seguir.toUpperCase();
            if (seguir.contentEquals("Y")){
                continuar=true;
                System.out.println("Bien aqui los tienes:");
                switch (cuerpo) {
                    case "delgado" -> System.out.println("1) Consulta a un profesional de la salud para evaluar tu situación.\n2) Incorpora una dieta balanceada con calorías y nutrientes adecuados.\n3) Realiza ejercicio suave y progresivo para desarrollar masa muscular.");
                    case "normal" -> System.out.println("1) Mantén una alimentación equilibrada y saludable para promover tu bienestar.\n2) Realiza ejercicio regularmente para fortalecer tu cuerpo y mantenerlo activo.\n3) Prioriza el descanso y el sueño adecuado para rejuvenecer tu organismo.");
                    case "con sobrepeso" -> System.out.println("1) Controla tus porciones de comida y evita los alimentos procesados.\n2) Incrementa la actividad física diaria para quemar calorías adicionales.\n3) Consulta a un profesional de la salud para recibir asesoramiento personalizado.");
                    case "con obesidad" -> System.out.println("1) Incrementa la actividad física diaria para quemar calorías adicionales.\n2) Adopta una alimentación equilibrada y controla las porciones de comida.\n3) Busca apoyo profesional para establecer metas y mantener la motivación.");
                }

            }else if(seguir.contentEquals("N")){
                continuar=true;
                System.out.println("Muchas gracias por participar, te deseamos lo mejor.");


            }else {
                System.out.println("No has ingresado una respuesta correctamente");
            }
        }

        continuar = false;

        while(!continuar){
            System.out.println("\n¡Tenemos un plan gratis especial para ti!");
            System.out.print("¿Quieres descargarlo? Y/N: ");
            String contenido;
            String in = s.next();
            in=in.toUpperCase();
            if(in.contains("Y")){

                try{
                    File archivo = new File("C:\\Users\\ELEAZAR\\Downloads\\PlanVidaSana.txt");
                    PrintStream print = new PrintStream(archivo);
                    switch (cuerpo) {
                        case "delgado" -> {
                            contenido = "Plan de salud para ICM delgado:\n\n"+persona+"\n\nRecetas saludables:\nDesayuno: Batido de proteínas con frutas y yogur bajo en grasa.\nAlmuerzo: Ensalada de pollo a la parrilla con vegetales frescos y aderezo bajo en grasa.\nCena: Salmón a la plancha con espárragos y quinoa.\nMerienda: Rodajas de manzana con mantequilla de almendras.\n\nEjercicios:\nCardio: Realiza 30 minutos de ejercicio cardiovascular de intensidad moderada, como correr o nadar, al menos tres veces por semana.\nEntrenamiento de fuerza: Realiza ejercicios de fortalecimiento muscular dos veces por semana, como levantamiento de pesas o entrenamiento con bandas de resistencia.\n\nMotivación:\nMantén un diario de tu progreso y celebra cada hito alcanzado.\nEncuentra un compañero de entrenamiento para motivarse mutuamente y compartir los logros.\nEstablece metas realistas y date recompensas cuando las alcances.";
                            print.println(contenido);
                            System.out.println("Descargado satisfactoriamente!");
                        }
                        case "normal" -> {
                            contenido = "Plan de salud para ICM normal:\n\n"+persona+"\n\nRecetas saludables:\nDesayuno: Tortilla de claras de huevo con espinacas y tostadas integrales.\nAlmuerzo: Ensalada de quinoa con vegetales variados y pechuga de pollo a la parrilla.\nCena: Pescado al horno con vegetales asados y arroz integral.\nMerienda: Yogur griego con nueces y miel.\n\nEjercicios:\nRealiza 150 minutos de ejercicio cardiovascular moderado a la semana, como caminar rápido, andar en bicicleta o bailar.\nIncorpora ejercicios de fuerza dos veces por semana, como entrenamiento con pesas o pilates.\n\nMotivación:\nCrea un grupo de apoyo o únete a una comunidad en línea para compartir experiencias y recibir motivación adicional.\nExperimenta con diferentes actividades físicas para mantener la variedad y el interés en tu rutina de ejercicios.\nEstablece metas a corto plazo y lleva un registro de tus logros para mantener la motivación.";
                            print.println(contenido);
                            System.out.println("Descargado satisfactoriamente!");
                        }
                        case "con sobrepeso" -> {
                            contenido = "Plan de salud para ICM con sobrepeso:\n\n"+persona+"\n\nRecetas saludables:\nDesayuno: Avena con frutas y nueces.\nAlmuerzo: Sopa de verduras con pollo a la parrilla y una porción de pan integral.\nCena: Tacos de pescado a la plancha con tortillas de trigo integral y ensalada de col.\nMerienda: Batido de proteínas con leche descremada y frutas.\n\nEjercicios:\nRealiza al menos 30 minutos de ejercicio cardiovascular de intensidad moderada, como caminar rápido, al menos cinco días a la semana.\nIncorpora ejercicios de fuerza dos o tres veces por semana, como levantamiento de pesas o entrenamiento de resistencia con bandas elásticas.\n\nMotivación:\nBusca un amigo o familiar como compañero de ejercicios para mantenerse mutuamente motivados y responsables.\nRecuerda el progreso que has hecho y concéntrate en cómo te sientes después de hacer ejercicio.\nEstablece metas semanales y recompénsate con algo no alimenticio cuando las alcances.";
                            print.println(contenido);
                            System.out.println("Descargado satisfactoriamente!");
                        }
                        case "con obesidad" -> {
                            contenido = "Plan de salud para ICM con obesidad:\n\n"+persona+"\n\nRecetas saludables:\nDesayuno: Tortilla de claras de huevo con espinacas y una rebanada de pan integral.\nAlmuerzo: Ensalada de garbanzos con verduras frescas y pollo a la parrilla.\nCena: Filete magro a la plancha con brócoli al vapor y puré de papas dulces.\nMerienda: Rodajas de pepino con hummus bajo en grasa.\n\nEjercicios:\nRealiza al menos 150 minutos de ejercicio cardiovascular de intensidad moderada a la semana, como caminar rápido, nadar o andar en bicicleta.\nIncorpora ejercicios de fuerza dos o tres veces por semana, como entrenamiento con pesas o ejercicios con bandas de resistencia.\n\nMotivación:\nÚnete a un grupo de apoyo local o en línea para compartir tus experiencias y recibir apoyo adicional.\nEstablece metas pequeñas y alcanzables a corto plazo para mantenerte motivado a medida que alcanzas cada una.\nRecuerda que el cambio lleva tiempo y paciencia. Celebra cada paso hacia una vida más saludable, sin importar cuán pequeño sea.";
                            print.println(contenido);
                            System.out.println("Descargado satisfactoriamente!");
                        }
                    }
                    System.out.print("¿Quieres leer tu archivo aquí? Y/N:");
                    in = s.next();
                    in=in.toUpperCase();
                    if(in.contains("Y")) {
                        System.out.println("Leyendo tu archivo descargado\n");
                        try {
                            InputStream nuevo = new FileInputStream("C:\\Users\\ELEAZAR\\Downloads\\PlanVidaSana.txt");
                                ArrayList<Integer> leyendo = new ArrayList<>();
                                int byteLeido;
                                while ((byteLeido = nuevo.read()) != -1) {
                                    leyendo.add(byteLeido);
                                }
                                for (int e : leyendo) {
                                    System.out.print((char) e);
                                }
                                nuevo.close();
                            System.out.println("\n¡Muchas gracias por visitarnos! Hasta la próxima");
                        } catch (Exception e) {
                            System.out.println("Hubo un problema leyendo tu archivo");
                        }
                    }else if(in.contains("N")){
                        System.out.println("¡Muchas gracias por visitarnos! Hasta la próxima");
                    }else {
                        System.out.println("Tu respuesta no ha sido clara");

                    }
                    continuar=true;
                }catch (Exception e){
                    System.out.println("Hubo un error "+ e.getMessage());
                }
            }else if(in.contains("N")){
                System.out.println("¡Muchas gracias por visitarnos! Hasta la próxima");
                continuar=true;
            }else {
                System.out.println("Tu respuesta no ha sido clara");
            }


        }
    }
}
