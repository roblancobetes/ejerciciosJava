public class ejercicioHorario {

    public static void main(String[] args) {
        
        String[][] tablaHorario = {{"Horario", "Mañana", "Tarde", "Noche"},
    {"Lunes", "turno", "libre", "libre"},
    {"Martes", "turno", "libre", "turno"},
    {"Miércoles", "libre", "turno", "libre"},
    {"Jueves", "libre", "libre", "turno"},
    {"Viernes", "libre", "turno", "libre"},
    };


    }

    public static double calcularRendimiento(String[][] tablaHorario) {

        int contadorTotal = 0;

        int contadorTurnos = 0;

        for (String[] fila: tablaHorario) {

            for (String palabra : fila) {
                
                if (palabra.equals("turno")) {

                contadorTotal++;

                contadorTurnos++;

                }

                else if (palabra.equals("libre")) {

                    contadorTotal++;

                }}}
            
            return (double) contadorTurnos/contadorTotal;

    }

    public static boolean chequearDescanso(String[][] tablaHorario) {

        

    }

}