class Cbank{ //������
    private static int s=1000;
    // ���԰�synchronizedȥ����һ��
    public synchronized static void sub(int m){
        int temp=s;
        temp=temp-m;
        try{
           Thread.sleep((int)(1000*Math.random()));
        }
        catch(InterruptedException e){  }
        s=temp;
        System.out.println("   s="+s);
    }
}

//������
class Customer extends Thread{
    public void run(){
         for(int i=1;i<=5;i++)
         Cbank.sub(100);
     }
 }
 
//main class
public class Thread_4 {
   public static void main(String args[]){
       Customer Customer1= new Customer( ); 
       Customer Customer2= new Customer( ); 
       Customer1.start();
       Customer2.start();
   }
}