**🏦 Race Condition – Real Java Example**

**Scenario:** A bank account has $100. Two threads try to withdraw $80 at the same time.

### **1. What happens? (Without synchronized)**

1. Thread A checks the balance → $100.
2. Thread B checks the balance → $100.
3. Thread A withdraws $80.
4. Thread B also withdraws $80.
5. Final balance becomes **-$60** (incorrect).

### **2. What's the problem?**

Both threads accessed and modified the same shared data without coordination.

### **3. What's the solution?**

Use `synchronized` to ensure only one thread at a time can execute the withdrawal operation on the same account object.

public synchronized void withdraw(int amount) {
    if (balance >= amount) {
        balance -= amount;
    }
}

Runnable = What should be done?
run() = The actual work.
Thread = Who executes the work?
start() = Start working!


**Most important:** Protect the entire operation (check balance + withdraw), not just the balance update.

******************************************************************************************************************

class Counter {
    int count = 0;

    public synchronized void increment()
    {
        count++;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        // override run method that already in exist in the Runnable Class
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + counter.count);
    }
}                                                  
