package com.mycompany.tarea5;

/**
 * @date 9 feb. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class Main {
    public static void main (String [] args) {
        Thread_I thread1 = new Thread_I();
        thread1.start();
       
        Thread_II thread2 = new Thread_II();
        thread2.start();
    }
}
 