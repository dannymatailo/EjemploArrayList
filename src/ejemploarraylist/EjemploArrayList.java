/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;

import java.util.ArrayList;



/**
 *
 * @author labctr
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> edades = new ArrayList<Integer>();
        edades.add(5);
        edades.add(6);
        edades.add(7);
        for (int i = 0; i < edades.size(); i++) {
            System.out.println(edades.get(i));
            
        }
        System.out.println(edades.contains(6));
        edades.set(0,8);
        for (int i = 0; i < edades.size(); i++) {
            System.out.println(edades.get(i));
            
        }
        System.out.println(edades.size());
        System.out.println(edades.indexOf(7));
        edades.remove(7);
        for (int i = 0; i < edades.size(); i++) {
            System.out.println(edades.get(i));
            
        }
        edades.clear();
        
    }
    
}
