package EJ1;
import java.util.Scanner;

public class Ejercicio1 {

  
   
    public static void main(String[] args)
    {

        int i = 0;
        do 
        {
        try (Scanner Scann = new Scanner(System.in)) {
            double F,C;

            System.out.println("Digite Un lado del rectangulo");
            F = Scann.nextDouble();

            C =  (F*2)*3;

            System.out.println(F + " El perimetro del rectangulo es " + C  );
        
            
        }

        System.out.println("Finalizando el programa");
        System.out.println("  ");
        
            
        }while(i == 0);

    }

    
}


//carcular el perimetro de un rectangulo sabiendo q el lado mayor es el doble del lado menor
//solicitar datos y mostrar datos al usuario
    
//solicitar año de nacimiento y calcular la edad del usuario
    
//programa que permita saber quien es mas alto 

//generar 3 numeros random y los sume con un dato ingresado