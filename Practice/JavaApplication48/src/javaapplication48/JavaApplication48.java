/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, i, j, k;
        
        System.out.println("Enter your Matrix base: ");
        
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        
        System.out.println("Enter your first  matrix element: ");
        
        int[][] a = new int[n][n];
        int[][] b = new int[n][n]; 
        int[][] c = new int[n][n]; 
        
        for(i = 0; i < n ; i++)
        {
            for(j = 0; j < n; j++)
            {
                a[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("Enter your second  matrix element: ");
        
        for(i = 0; i < n ; i++)
        {
            for(j = 0; j < n; j++)
            {
                b[i][j] = scan.nextInt();
            }
        }
        
        for(i = 0; i < n ; i++)
        {
            for(j = 0; j < n; j++)
            {
                for(k = 0; k < n; k++)
                {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        
        System.out.println("Your matrix multplication is : ");
        
        for(i = 0; i < n ; i++)
        {
            for(j = 0; j < n; j++)
            {
                System.out.println(c[i][j]);
            }
        }
    }
    
}
