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



    }

}