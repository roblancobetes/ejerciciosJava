public class EjemploArrays {

    public static void main(String[] args) {
        
        String[] nombres = new String[4];

        nombres[0] = "Luis";

        nombres[1] = "Ana";

        nombres[2] = "Marta";

        nombres[3] = "Jaime";

        int[] edades = {14, 64, 51, 67};

        boolean[] gustaProgramar = {true, false, true, false};


        for (int idx = 0; idx < nombres.length; idx++) {
            
            if (gustaProgramar[idx]) System.out.println("Hola soy " + nombres[idx] +
            " tengo " + edades[idx] + " años y me encanta programar");

            else System.out.println("Hola soy " + nombres[idx] +
            " tengo " + edades[idx] + " años y no me gusta nada programar");

        }

        String[] listaPalabras = {"Hola", "soy", "programador", "en", "Java"};

        System.out.println(crearFrase(listaPalabras));

        System.out.println(crearFrase2(listaPalabras));

    }

    public static String crearFrase(String[] listaPalabras) {

        String frase = "";

        for (int i = 0; i < listaPalabras.length - 1; i++) {
            
            frase = frase + listaPalabras[i] + " ";

        }

        frase = frase + listaPalabras[listaPalabras.length - 1] + ".";

        return frase;

    }

        public static String crearFrase2(String[] listaPalabras) {

        String frase = "";

        for (String palabra: listaPalabras) {
            
            frase = frase + palabra + " ";

        }

        return frase.substring(0, frase.length()-1) + ".";

    }

}