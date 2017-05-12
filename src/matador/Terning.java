/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador;

/**
 *
 * @author Robert Sand <robert@ssand.dk>
 */
public class Terning {
    public static int[] slaa() {
        int tal[] = new int[2];
        tal[0] = (int)(Math.random()*6)+1;     // og slå et terningkast på den første terning (1-6)
        tal[1] = (int)(Math.random()*6)+1;     // og slå et terningkast på den anden terning (1-6)
        return (tal);
    } // slut slaa()
} // slut Terning
