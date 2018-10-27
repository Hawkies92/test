/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.util.*;
/**
 *
 * @author CMCW
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> hw =new ArrayList<String>();
        
        hw.add("H");
        hw.add("e");
        hw.add("l");
        hw.add("l");
        hw.add("o");
        hw.add(" ");
        hw.add("W");
        hw.add("o");
        hw.add("r");
        hw.add("l");
        hw.add("d");
        
        for (int i = 0; i <= hw.size()-1;i++)
        {
            System.out.println(hw.get(i));
        }
    }
    
}
