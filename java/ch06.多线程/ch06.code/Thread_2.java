////ͨ��ʵ��ʵ�� Runnable �ӿ�ʵ�ֶ��߳�,�����̴߳�ӡA��B
class myThread implements Runnable{ 
    private String mythreadname;   //�߳���
    private int mysleeptime;       //����ʱ��
    private int count;             //ѭ������
    myThread(String s, int m, int c){
        mythreadname = s;
        mysleeptime = m;
        count = c;
    }    
    public void run(){
        try{                       //һ��Ҫ�����߳��ж��쳣
           for (int i=0; i<count; i++){
              System.out.println(mythreadname + "  "+ (i+1));
              Thread.sleep(mysleeptime); 
           }
           System.out.println(mythreadname + " finished !"); 
        }
        catch(InterruptedException e)
           {return;}
    }
}
public class Thread_2{
    public static void main(String args[]){
        myThread threadA=new myThread("thread A ",50, 10); 
        myThread threadB=new myThread("thread B ",100, 10); 
        Thread threadC=new Thread(threadA); //ǿ������ת��
        Thread threadD=new Thread(threadB); 
        threadC.start();
        threadD.start();
    } 
}