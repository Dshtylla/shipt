/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationaloperators;

/**
 *
 * @author dshty
 */
public class RelationalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        int y = 20;
        boolean result = x ==y;
        System.out.println("x == y? " + result);
        
        result = x !=y;
        System.out.println("x !y? " + result);
        
        result = x > y;
        System.out.println("x > y? " + result);
        
        result = x >= y;
        System.out.println("x >= y? " + result);
        
        result = x < y;
        System.out.println("x < y? " + result);
        
        result = x <= y;
        System.out.println("x <= y? " + result);
        
        
        
        
    }
    
}
