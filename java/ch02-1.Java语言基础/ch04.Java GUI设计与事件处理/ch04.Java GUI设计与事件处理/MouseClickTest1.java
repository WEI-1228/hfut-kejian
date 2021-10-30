//ÅÐ¶Ï´°ÌåÖÐµã»÷×ó¼ü»òÕßÓÒ¼üÀý³Ì
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
				outStr = "×ó¼ü";
			}else if(e.getButton() == e.BUTTON3){
				outStr = "ÓÒ¼ü";
			}else{
				outStr = "ÖÐ¼ü";
			}
			if(e.getClickCount() == 2){
				outStr = outStr + "Ë«»÷";
			}else{
				outStr = outStr + "µã»÷";
			}
				System.out.println(outStr);
		}
	}
}