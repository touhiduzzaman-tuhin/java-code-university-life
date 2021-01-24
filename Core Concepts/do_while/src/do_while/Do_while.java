/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_while;

/**
 *
 * @author Tuhin
 */
import java.util.Scanner;

public class Do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        
        do
        {
            System.out.println(a);
            a--;
        }
        while(a < -1);
    }
    
}
/*
in do while loop first print the value then cheak the condition if
the first condition is false then the code print 
first value because of here do first then while condition
*/