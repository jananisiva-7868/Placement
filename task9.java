TASK 1 : extending thread class print numbers 1 to 10

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

TASK 2 : Implement runnable to print a message from multiple threads 
 
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
    }
}

TASK 3: Demonstrate sleep() and join() using thread coordination 

class SleepJoinExample extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        SleepJoinExample t1 = new SleepJoinExample();
        SleepJoinExample t2 = new SleepJoinExample();
        
        t1.start();
        try {
            t1.join(); // Waits for t1 to finish before t2 starts
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
    }
}


TASK 4: Ticket Booking Simulation

class TicketBooking extends Thread {
    static int tickets = 5;

    public void run() {
        synchronized (TicketBooking.class) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + " booked 1 ticket.");
                tickets--;
            } else {
                System.out.println(Thread.currentThread().getName() + " - Tickets sold out!");
            }
        }
    }

    public static void main(String[] args) {
        TicketBooking t1 = new TicketBooking();
        TicketBooking t2 = new TicketBooking();
        TicketBooking t3 = new TicketBooking();

        t1.setName("User 1");
        t2.setName("User 2");
        t3.setName("User 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
