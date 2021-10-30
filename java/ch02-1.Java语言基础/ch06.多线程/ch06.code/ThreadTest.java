//ͨ���̳�Thread��ʵ�ֶ��߳�,�����̴߳�ӡA��B

//����Լ����߳���
class myThread extends Thread{ 
    private String threadname;   //�߳���
    private int count;           //ѭ������
    private int sleeptime;       //����ʱ��
    
    //���췽��
    myThread(String a, int b, int c){
        threadname = a;
        count = b;
        sleeptime = c;
    }
    
    // ʵ��run��������ɹ���
    public void run(){
		try{   //sleep()���봦��InterruptedException�쳣
           for (int i=0; i<count; i++){
              System.out.println(threadname + " ��ӡ "+ (i+1));
              sleep(sleeptime); 
           }
           System.out.println(threadname + " ��ӡ���� !");            
		}
		catch (InterruptedException e){
			System.out.println(threadname + " �����쳣��");	
		}        
    }
}

//��Ƹó��������
public class ThreadTest{
    public static void main(String args[]){
        myThread mt1 = new myThread("Thread 1", 10, 300); 
        myThread mt2 = new myThread("Thread 2", 10, 800); 
        mt1.start();//mt1.run();
        mt2.start();//mt2.run();
     }
}