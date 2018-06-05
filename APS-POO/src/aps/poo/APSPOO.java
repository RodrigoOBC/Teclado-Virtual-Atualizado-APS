/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.poo;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author rodri
 */
public class APSPOO {

    /**
     * @param args the command line arguments
     */
    static String Panangrama[] = {"Quem traz CD, LP, fax, engov e whisky JB?",
        "Jane quer LP, fax, CD, giz, TV e bom whisky",
        "TV faz quengo explodir com whisky JB",
        "Gafanhotos azuis celebram a pequena terra das jovens bruxas",
        "Um pequeno jabuti xereta viu dez cegonhas felizes"};
    
  
    
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Panangrama[n]);
            
    }
}
