//通过继承Thread类实现多线程,龟兔赛跑


class myThread extends Thread{ 
    private String mythreadname;   //线程名
    private int mysleeptime;       //休眠时间
    private int count;             //循环次数
    
    myThread(String s, int m, int c){
        mythreadname = s;
        mysleeptime =m;
        count = c;
    }
    
    //一定要实现run方法
    public void run(){
        try{                       //一定要处理线程中断异常
           for (int i=0; i<count; i++){
              System.out.println(mythreadname + "跑了 "+ (i+1) + "步");
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
        myThread threadA=new myThread("兔子  ", 50, 10); //创建线程A
        myThread threadB=new myThread("乌龟  ", 100, 10);//创建线程B 
        threadA.start(); 
        threadB.start();
        //threadA.run(); 
        //threadB.run();        
        
    }
}