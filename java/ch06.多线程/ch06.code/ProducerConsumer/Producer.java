//�������߳�
public class Producer extends Thread {
    private Buffer myBuffer;
    private int number;

    public Producer(Buffer buf, int number) {
        myBuffer = buf;
        this.number = number;
    }

    public void run() {
    	//������0~9�������з����Ʒ��ÿ����һ�����������ʱ��
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
