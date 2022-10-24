package EJ1;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[]args){

        int i = 0;

        do{
            try(Scanner Scan = new Scanner(System.in))   
            {
                int D1,D2;

                System.out.println( "Ingrese su año de nacimiento: " );
                D1 = Scan.nextInt();

                D2 = 2022-D1;

                System.out.println( D1 + " Su edad es: " + D2 );

            }

            System.out.println("Finalizando el programa");
        System.out.println("  ");




        }while(i ==0);



    }


    
}
