/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

import java.util.Scanner;

/**
 *
 * @author Tasya
 */
public class Latihan5 {
    public static void main(String[]args){
        System.out.println("Menentukan bilngan terbesar");
        Scanner input= new Scanner(System.in);
        double x;
        double y;
        double z;
        
        System.out.print("masukan bilangan I :") ;
        x=input.nextDouble();
        
        System.out.print("Masukan bilangan II:");
        y=input.nextDouble();
        
        System.out.print("Masukan bilangan III:");
        z=input.nextDouble();
         
    if (x>y && x>z) {System.out.println (x + " adalah bilangan terbesar");
    }else if (y>z && y>x) { System.out.println (y + " adalah bilangan terbesar");
} else if (z > x && z > y) {System.out.println(z + " adalah bilangan terbesar");
        } else if (x == y && x > z) {System.out.println(x + " adalah bilangan terbesar");
        } else if (x == z && x > y) {System.out.println(x + " adalah bilangan terbesar");
        } else {System.out.println(y + " adalah bilangan terbesar");
        }   
    }
}
        
            
        
    

