package org.example;
public class App {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            write("A");
        });

        Thread thread2 = new Thread(() -> {
            write("B");
        });
        while (true) {
            thread1.run();
            thread2.run();
        }
    }
    public static synchronized void write(String thread) {
        System.out.println(thread);
    }
}

//        switch (thread) {
//            case "thread1" :
//                System.out.println("A");
//                break;
//            case "thread2" :
//                System.out.println("B");
//                break;
//            default :
//                System.out.println("хмммммммм");
//                break;
//        }
