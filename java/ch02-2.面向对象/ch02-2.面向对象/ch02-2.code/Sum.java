//求阶乘和的代码，“大数”
public class Sum{
    public static void main(String args[]){
	long sum=0;//定义阶乘总和 
    	long temp=1;//定义存放阶乘的变量 
    	int n=1;   
    	do{  
    		temp=n*temp;   
    		sum=sum+temp;  
    		n++;}
    	while(n<=50); 
    	System.out.println("50以内的阶乘总和是"+sum);	    
	} 
} 
      /*System.out.println("50以内的阶乘总和是"+ "18446744073709551615");	    
	  2的64次方- 1 = 18446744073709551615
	  需要用到 BigInteger

	 数据类型      类型名      位长          取值范围                默认值
	 布尔型 boolean             1         true,false                   false
       字节型 byte                   8         -128-127                    0
       字符型 char                  16        ‘\u000’-\uffff ‘            \u0000’
       短整型 short                 16       -32768-32767              0
       整型    int                     32  -2147483648,2147483647  0
       长整型 long                  64  -9.22E18,9.22E18               0
       浮点型 float                  32  1.4E-45-3.4028E+38          0.0
       双精度型 double           64  4.9E-324,1.7977E+308       0.0
      BigInteger 任意大的整数，原则上是，只要你的计算机的内存足够大，可以有无限位.
      
      BigInteger属于java.math.BigInteger,因此在每次使用前都要import 这个类。*/

