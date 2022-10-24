package EJ1;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[]args){

           
        
            try(Scanner scan = new Scanner(System.in)){

                int D1,D2,D3;

                Random rand = new Random();


                System.out.println(" Ingrese un dato");
                D2 = scan.nextInt();

                for(int i = 1; i <=10; i++) {
                    
                    D3 = rand.nextInt((10 - 1) + 1) + 1;
                    


                    System.out.println(D3);

                    if (i == 4) 
                    {
                        break;

                    }

    
                    D1 = D2 + D3;
                    
    
                   System.out.println( " El resultado de: " + D2 + (" ") + D3 + " Es: " + D1);

            }


           

            }









    }


    
}

