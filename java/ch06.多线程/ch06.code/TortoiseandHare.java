//ͨ���̳�Thread��ʵ�ֶ��߳�,��������


class myThread extends Thread{ 
    private String mythreadname;   //�߳���
    private int mysleeptime;       //����ʱ��
    private int count;             //ѭ������
    
    myThread(String s, int m, int c){
        mythreadname = s;
        mysleeptime =m;
        count = c;
    }
    
    //һ��Ҫʵ��run����
    public void run(){
        try{                       //һ��Ҫ�����߳��ж��쳣
           for (int i=0; i<count; i++){
              System.out.println(mythreadname + "���� "+ (i+1) + "��");
              sleep(mysleeptime); 
           }
           System.out.println(mythreadname + " finished !"); 
        }
        catch(InterruptedException e)
           {return;}
    }
}

public class TortoiseandHare{
    public static void main(String args[]){
        myThread threadA=new myThread("����  ", 50, 10); //�����߳�A
        myThread threadB=new myThread("�ڹ�  ", 100, 10);//�����߳�B 
        threadA.start(); 
        threadB.start();
        //threadA.run(); 
        //threadB.run();        
        
    }
}