public class ProducerConsumerTest {
    public static void main(String[] args) {
        Buffer b = new Buffer();  //��������������
        Producer p1 = new Producer(b, 1);  //���������߶���
        Consumer c1 = new Consumer(b, 1);  //���������߶���
        p1.start();
        c1.start();
    }
}
/*

���н����
Producer #1 put: 0
Consumer #1 got: 0
Producer #1 put: 1
Consumer #1 got: 1
Producer #1 put: 2
Consumer #1 got: 2
Producer #1 put: 3
Consumer #1 got: 3
Producer #1 put: 4
Consumer #1 got: 4
Producer #1 put: 5
Consumer #1 got: 5
Producer #1 put: 6
Consumer #1 got: 6
Producer #1 put: 7
Consumer #1 got: 7
Producer #1 put: 8
Consumer #1 got: 8
Producer #1 put: 9
Consumer #1 got: 9
*/