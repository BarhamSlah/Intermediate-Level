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

