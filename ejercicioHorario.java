public class ejercicioHorario {

    public static void main(String[] args) {
        
        String[][] tablaHorario = {{"Horario", "Mañana", "Tarde", "Noche"},
    {"Lunes", "turno", "libre", "libre"},
    {"Martes", "turno", "libre", "libre"},
    {"Miércoles", "libre", "turno", "libre"},
    {"Jueves", "libre", "libre", "turno"},
    {"Viernes", "libre", "libre", "turno"},
    };

    System.out.print(chequearDescanso(tablaHorario));


    }

    public static double calcularRendimiento(String[][] tablaHorario) {

        int contadorTotal = 0;

        int contadorTurnos = 0;

        for (String[] fila: tablaHorario) {

            for (String palabra : fila) {

                System.out.println(palabra);
                
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

        int descansos = 2;

        for (int i = 1; i < tablaHorario.length; i++) {

            for (int j = 1; j < tablaHorario[0].length; j++) {

                if (tablaHorario[i][j].equals("turno")) {

                    if (descansos < 2) {

                        return false;

                    }

                    descansos = 0;

                }

                else descansos++;
                
            }
            
        }

        return true;

    }

}