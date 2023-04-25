package EJ1;
import java.util.Scanner;

public class Ejercicio9 {
    
    /**
     * @param args
     */
    public static void main(String[]args){

        
        int E ;
        

        try (Scanner Scan = new Scanner(System.in)) {

            

       do {

                System.out.println("Ingrese su edad ");
                E = Scan.nextInt();

                if(E<=0){
   
                    System.out.println("Ingrese una edad valida");
                
                
                }else if (E<18) {
                
                    System.out.println("Eche pa' la casa");
                
                }else {

                    System.out.println("Bienvenido :D");

                }
        
                    System.out.println(" Si desea salir digite: 1, si desea continuar digite: 0 ");
                    E = Scan.nextInt();



            } while (E < 1);

         }   


    }


}



