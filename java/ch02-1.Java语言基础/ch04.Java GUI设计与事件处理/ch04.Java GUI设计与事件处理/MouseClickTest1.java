//�жϴ����е����������Ҽ�����
import javax.swing.*;
import java.awt.event.*;
public class MouseClickTest1 extends JFrame{
	public static void main(String[] args){
		Test1 t = new Test1();
	}

	public MouseClickTest1(){
		setSize(300,300);
		this.getContentPane().addMouseListener(new mouseProcassor());
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public class mouseProcassor extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			String outStr = "";
			if(e.getButton() == e.BUTTON1){
				outStr = "���";
			}else if(e.getButton() == e.BUTTON3){
				outStr = "�Ҽ�";
			}else{
				outStr = "�м�";
			}
			if(e.getClickCount() == 2){
				outStr = outStr + "˫��";
			}else{
				outStr = outStr + "���";
			}
				System.out.println(outStr);
		}
	}
}