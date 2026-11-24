1. Simple real-life example
  
Imagine you have three threads:
Situation	                                          Thread state
You created a thread but haven't called start()        NEW
Thread is ready or executing	                         RUNNABLE
Thread is waiting for a synchronized lock              BLOCKED
Thread calls join() without a timeout	                 WAITING
Thread calls sleep(2000)                            	 TIMED_WAITING
Thread finishes its task                             	 TERMINATED

  
2. Important correction
- thread.join() → WAITING // 
- thread.join(2000) → TIMED_WAITING
  
Similarly:
- Thread.sleep() → TIMED_WAITING
- Object.wait() → WAITING (without timeout). // there is a example below 

Object lock = new Object();

Thread t1 = new Thread(() -> {
    synchronized (lock) {
        try {
            System.out.println("Waiting...");
            lock.wait();

            System.out.println("I'm awake!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
});

Thread t2 = new Thread(() -> {
    synchronized (lock) {
        lock.notify();
    }
});

t1.start();
Thread.sleep(1000);
t2.start();

What happens?
1. t1 starts and prints Waiting....
2. t1 reaches lock.wait() and pauses.
3. t2 starts and calls lock.notify().
4. t1 wakes up, reacquires the lock, and prints I'm awake!.
Remember
- wait() = Stop and wait.
- notify() = Wake up a waiting thread.
The main idea: One thread waits, and another thread wakes it up.

  
