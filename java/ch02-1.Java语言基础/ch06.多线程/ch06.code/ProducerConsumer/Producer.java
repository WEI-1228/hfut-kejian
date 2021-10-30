//生产者线程
public class Producer extends Thread {
    private Buffer myBuffer;
    private int number;

    public Producer(Buffer buf, int number) {
        myBuffer = buf;
        this.number = number;
    }

    public void run() {
    	//依次向0~9缓冲区中放入产品，每放入一个后休眠随机时间
        for (int i = 0; i < 10; i++) {
            myBuffer.put(i);
            System.out.println("Producer #" + this.number
                               + " put: " + i);
            try {
                sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) { }
        }
    }
}
