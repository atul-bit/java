//Threads are used to run program/task parrallelly on other threads.
//To use thread, the class must extend Thread and must have implementation in run () method.
//The class consuming the thread class, should run start() method for thread execution.
//Instead of extending thread class, we implement it from Runnable which 
// is internally called by thread class.
package Threads;

class A extends Thread {
    public void run () {
        for (int i = 0 ; i <= 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
}

class B extends Thread {
    public void run () {
        for (int i = 0 ; i <= 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {

        // in case of implementing runnable object
        // Runnable obj1 = new A();
        // Runnable obj2 = new B();

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);
        // t1.start();
        // t2.start();

        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();

    }
    
}
