//本程序从命令行输入两个数据进行比较，
//输出较大的数

public class example02_07 {
    public static void main(String args[]) {
        int x,y=0;
        //读入命令行参数
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
	 if(x>=y) System.out.println("x="+x); 
          else System.out.println("y="+y); 
	}         
} 