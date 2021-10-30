class Cbank{//银行类
    private static int s=1000;
    public static void sub(int m){//取款
        int temp=s;
        temp=temp-m;
        try{ 
           Thread.sleep((int)(1000*Math.random()));
        }
        catch(InterruptedException e){ }
        s=temp;
        System.out.println("   s="+s);
    }
}

class Customer extends Thread{//储户类
    public void run(){
         for(int i=1;i<=5;i++){
            //System.out.print(this.getName()); 
            Cbank.sub(100);
            }
    }
}

public class Thread_3 {
   public static void main(String args[]){
       Customer Customer1=new Customer( ); 
       Customer Customer2=new Customer( ); 
       Customer1.start();
       Customer2.start();
   }
}