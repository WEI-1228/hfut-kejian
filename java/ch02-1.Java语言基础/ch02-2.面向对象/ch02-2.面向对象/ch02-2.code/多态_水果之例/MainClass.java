public interface Fruit {
  //�ɼ�
	public void get();
}

public class Apple implements Fruit{
  //�ɼ�
	public void get(){
		System.out.println("�ɼ�ƻ��");
	}
}

public class Banana implements Fruit{
  //�ɼ�
	public void get(){
		System.out.println("�ɼ��㽶");
	}
}

//ʹ�ö�̬���ƣ���������͵��÷���
public class MainClass {
	public static void main(String[] args){		
		//ʵ����һ��Apple
		Apple apple = new Apple();
		//ʵ����һ��Banana
		Banana banana = new Banana();
		apple.get();
		banana.get();
  }
}