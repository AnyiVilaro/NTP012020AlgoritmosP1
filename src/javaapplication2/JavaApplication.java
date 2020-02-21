import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 204
 */
public class NewClass 
{
    
    public static void main(String[] args)
    {   
        int suma=0;
        int n=0;
        Scanner entrada=new Scanner(System.in);
        n=entrada.nextInt();
        System.out.println("Digite la cantidad n");
        
         for (int i = 0; i < n; i++) 
        {
            suma=n*(n+1)/2;
            System.out.println("la suma de los primeros diez numeros es: " + suma);
            
        }
    }
    
}
    

