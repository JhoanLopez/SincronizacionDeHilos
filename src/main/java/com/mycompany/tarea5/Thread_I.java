package com.mycompany.tarea5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @date 9 feb. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class Thread_I extends Thread {
 
    @Override
    public synchronized void run (){
        while (true) { 
            try {
                System.out.println("TIC");
                this.wait(999);
            } catch (InterruptedException ex) {
                System.out.println("ERROR:");
                Logger.getLogger(Thread_I.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
