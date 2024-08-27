import java.util.concurrent.*;

class Producer implements Runnable {

    BlockingQueue<Integer> bQueue = null;

    Producer(BlockingQueue<Integer> bQueue) {
        this.bQueue = bQueue;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                bQueue.put(i);
                System.out.println("Producer " + i);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt(); // Re-interrupt the thread
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt(); // Re-interrupt the thread
            }
        }
    }

}

class Consumer implements Runnable {
    BlockingQueue<Integer> bQueue = null;

    Consumer(BlockingQueue<Integer> bQueue) {
        this.bQueue = bQueue;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                bQueue.take();
                System.out.println("Consumer " + i);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt(); // Re-interrupt the thread
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt(); // Re-interrupt the thread
            }
        }
    }
}

class ProducerConsumerBQDemo {
    public static void main(String[] args) {

        BlockingQueue<Integer> bQueue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(bQueue);
        Consumer consumer = new Consumer(bQueue);
        Thread pThread = new Thread(producer);
        Thread cThread = new Thread(consumer);
        pThread.start();
        cThread.start();
    }
}

