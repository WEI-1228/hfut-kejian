//通过继承Thread类实现多线程,两个线程打印A和B

//设计自己的线程类
class myThread extends Thread{ 
    private String threadname;   //线程名
    private int count;           //循环次数
    private int sleeptime;       //休眠时间
    
    //构造方法
    myThread(String a, int b, int c){
        threadname = a;
        count = b;
        sleeptime = c;
    }
    
    // 实现run方法，完成功能
    public void run(){
		try{   //sleep()必须处理InterruptedException异常
           for (int i=0; i<count; i++){
              System.out.println(threadname + " 打印 "+ (i+1));
              sleep(sleeptime); 
           }
           System.out.println(threadname + " 打印结束 !");            
		}
		catch (InterruptedException e){
			System.out.println(threadname + " 发生异常！");	
		}        
    }
}

//设计该程序的主类
public class ThreadTest{
    public static void main(String args[]){
        myThread mt1 = new myThread("Thread 1", 10, 300); 
        myThread mt2 = new myThread("Thread 2", 10, 800); 
        mt1.start();//mt1.run();
        mt2.start();//mt2.run();
     }
}