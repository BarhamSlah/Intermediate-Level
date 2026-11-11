USING BOTH EXTENDS AND IMPLEMENTS TOGETHER IS A POWERFUL FEATURE IN JAVA BECAUSE IT LETS YOU COMBINE CODE REUSE WITH INTERFACE FLEXIBILITY.

Strict Rule : Just remember that extends must always come first, followed by implements. 
    
**********************************************************************************************************************************************************************************************************
IMPLEMENTING RUNNABLE AND PASSING IT TO A THREAD OBJECT IS THE DEFINITIVE BEST PRACTICE FOR ENTERPRISE BACKEND DEVELOPMENT INSTEAD OF USING EXTENDS THREAD
    
1- No Class Limit : Java only lets you inherit from one class. If your class already extends something else, extends Thread won't work.

2- If you use extends Thread it is just like 1 worker and 1 plan but If you use implements Runnable 1 plan and as you want worker 
    
**********************************************************************************************************************************************************************************************************

class MultiThread implements Runnable {

    int num;
    MultiThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " " + num);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

void main(){

    MultiThread multiThread1 = new MultiThread(6);
    MultiThread multiThread2 = new MultiThread(7);
    Thread thread1 = new Thread(multiThread1);
    Thread thread2 = new Thread(multiThread2);

    thread1.setPriority(Thread.MAX_PRIORITY);
    thread2.setPriority(Thread.MIN_PRIORITY);
    thread1.start();
    thread2.start();
    
}

