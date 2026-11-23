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

   public class Account {

    int balance = 1000;

    // synchronized do not let race condition happen 
   synchronized void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
        }

    }

}

Account account = new Account();

void main(String[] args) throws InterruptedException{
 // Both Thread.sleep() and thread.join() can throw InterruptedException.
// Java requires you to handle this checked exception.   

 // Runnable = What should be done? && run() = The actual work   
Runnable task = new Runnable() {
    @Override
    public void run() {
      account.withdraw(700);
    }
};

Thread thread1 = new Thread(task);
Thread thread2 = new Thread(task);

thread1.start();
thread2.start();

thread1.join();
thread2.join();

IO.println(account.balance);

}
