//�������߳�
public class Consumer extends Thread {
    private Buffer myBuffer;
    private int number;

    public Consumer(Buffer buf, int number) {
        myBuffer = buf;
        this.number = number;
    }

    public void run() {
    	//���δ�0~9�Ż�������ȡ����Ʒ
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = myBuffer.get();
            System.out.println("Consumer #" + this.number
                               + " got: " + value);
        }
    }
}