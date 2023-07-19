package org.lld.multithreading;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        HelloworldPrinter hw = new HelloworldPrinter();
        Thread t = new Thread(hw);

        t.start();    // creates a new thread instead of using main thread for t.start

        /*  start - output
        Main method line thread : main
        Current Thread : Thread-0
        Printing HelloWorld from new Thread
        Hello World from main method
         */

//        t.run();      // uses the same existing main thread instead of creating a new thread

        /*  run - output
        Current Thread : main
        Printing HelloWorld from new Thread
        Main method line thread : main
        Hello World from main method
         */

        System.out.println("Main method line thread : "+Thread.currentThread().getName());
        Thread.sleep(1000);    // sleep used ot pause execution in milliseconds
        System.out.println("Hello World from main method");

        Adder add = new Adder(10, 20);
        Thread t1 = new Thread(add);
        t1.start();

        for(int i=1;i<=50;i++){
            //Create 50 threads, for each thread print the square of the num from 1 - 50

            SquarePrinter sq = new SquarePrinter(i);
            Thread sqT = new Thread(sq);
            sqT.start();
        }
    }
}

/*  *Java starts with main thread
    *main thread created a new thread and print helloworld
    *Hello world from main  method needs to print

    *Hello world from main thread may print first as thread needs to get
    created and print from helloworldprinter might take some time

 */