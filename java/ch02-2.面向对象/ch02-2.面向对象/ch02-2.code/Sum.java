//��׳˺͵Ĵ��룬��������
public class Sum{
    public static void main(String args[]){
	long sum=0;//����׳��ܺ� 
    	long temp=1;//�����Ž׳˵ı��� 
    	int n=1;   
    	do{  
    		temp=n*temp;   
    		sum=sum+temp;  
    		n++;}
    	while(n<=50); 
    	System.out.println("50���ڵĽ׳��ܺ���"+sum);	    
	} 
} 
      /*System.out.println("50���ڵĽ׳��ܺ���"+ "18446744073709551615");	    
	  2��64�η�- 1 = 18446744073709551615
	  ��Ҫ�õ� BigInteger

	 ��������      ������      λ��          ȡֵ��Χ                Ĭ��ֵ
	 ������ boolean             1         true,false                   false
       �ֽ��� byte                   8         -128-127                    0
       �ַ��� char                  16        ��\u000��-\uffff ��            \u0000��
       ������ short                 16       -32768-32767              0
       ����    int                     32  -2147483648,2147483647  0
       ������ long                  64  -9.22E18,9.22E18               0
       ������ float                  32  1.4E-45-3.4028E+38          0.0
       ˫������ double           64  4.9E-324,1.7977E+308       0.0
      BigInteger ������������ԭ�����ǣ�ֻҪ��ļ�������ڴ��㹻�󣬿���������λ.
      
      BigInteger����java.math.BigInteger,�����ÿ��ʹ��ǰ��Ҫimport ����ࡣ*/

