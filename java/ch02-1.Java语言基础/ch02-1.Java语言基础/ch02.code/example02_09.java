//BreakOp1.withoutLabel
//使用break语句跳出循环体
package chapter2;

public class example02_09{
  public static void main(String args[]){
    int n;
    for(n=1;n<=10;n++){
      if (n%2==0) break;
      System.out.println("n="+n);
    }
  }
}