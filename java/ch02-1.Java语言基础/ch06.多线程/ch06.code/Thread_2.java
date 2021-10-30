////通过实现实现 Runnable 接口实现多线程,两个线程打印A和B
class myThread implements Runnable{ 
    private String mythreadname;   //线程名
    private int mysleeptime;       //休眠时间
    private int count;             //循环次数
    myThread(String s, int m, int c){
        mythreadname = s;
        mysleeptime = m;
        count = c;
    }    
    public void run(){
        try{                       //一定要处理线程中断异常
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
        Thread threadC=new Thread(threadA); //强制类型转换
        Thread threadD=new Thread(threadB); 
        threadC.start();
        threadD.start();
    } 
}