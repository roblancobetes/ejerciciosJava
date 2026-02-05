import javax.swing.JOptionPane;

public class practicaOptionPane {

    public static void main(String[] args) {
        
    int objetivo = (int)(Math.random()*101);

    String numeroCadena = JOptionPane.showInputDialog("Introduce un número entre 0 y 100:");

    int numero = Integer.parseInt(numeroCadena);
    
    int intentos = 1;

    while (numero != objetivo) {

        intentos++;

        if (numero < objetivo) JOptionPane.showMessageDialog(null, "El número que buscamos es mayor");
        else JOptionPane.showMessageDialog(null, "El número que buscamos es menor");

        numeroCadena = JOptionPane.showInputDialog("Introduce otra vez un número entre 0 y 100:");

        numero = Integer.parseInt(numeroCadena);
    }

    JOptionPane.showMessageDialog(null, "¡Has acertado tras " + intentos + " intentos!");
}

}
