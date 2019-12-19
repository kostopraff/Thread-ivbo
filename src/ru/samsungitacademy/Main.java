package ru.samsungitacademy;

public class Main {

    public static void main(String[] args) {
        // extends Thread
        // implements Runnable
        // AsyncTask => doInBackground

        // анонимный класс
        new MyThread("+").start();

        MyThread t2 = new MyThread("-");
        t2.start();

    }

    public synchronized static void test(String m)  {
        try {
            System.out.print("[");
            Thread.sleep(1000);
            System.out.print(m);
            Thread.sleep(1000);
            System.out.print("]");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
