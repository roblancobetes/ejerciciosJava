import java.util.Scanner;

public class ejemplo {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Hola, introduzca un número:");

            int n = sc.nextInt();

            int fact = 1;

            int i =1;

            while (i <= n) {
                fact = fact * i;
            }

            System.out.println("El factorial es: " + fact);
        }



    }

}