package EJ1;
import java.util.Scanner;

public class Ejercicio3 {

        /**
         * @param args
         */
        public static void main(String[]args)
        {

            int i = 0;
            do{
                try(Scanner Scan = new Scanner(System.in)) {

                    double M,J,D;

                    System.out.println("Ingrese las estaturas de: ");
                    System.out.println("Mateo: ");
                    M = Scan.nextDouble();

                    System.out.println("Juan: ");
                    J = Scan.nextDouble();

                    System.out.println("Daniel: ");
                    D = Scan.nextDouble();

                    if (M>J) {

                            System.out.println("Mateo es el mas alto");

                        } else if  (J>M) {
                                System.out.println("Juan es el mas alto");
                                
                            
                            }else  System.out.println(" Daniel es el mas alto ");
                    


                }

                
            }while(i == 0);


        }


}
