//561p ����(�̿ϼ�)
package ch14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame{
	
	private JLabel[] keyMessage; //3���� �޼����� ����� ���̺� ������Ʈ �迭
	
	public KeyListenerEx() {
		setTitle("keyListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		//���̺� �迭�� 3�� �����ϰ� �� ���̺� ������Ʈ ����
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel(" getKeyCode()");
		keyMessage[1] = new JLabel(" getKeyChar()");
		keyMessage[2] = new JLabel(" getKeyText()");
		
		//3���� ���̺� ������Ʈ�� ����Ʈ�ҿ� ����
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); //������ ���̵��� ������ �Ӽ� ����
			keyMessage[i].setBackground(Color.YELLOW); //������ CYAN������ ����
		}
		
		setSize(300,150);
		setVisible(true);
		
		//����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		c.setFocusable(true);
		c.requestFocus();
	}
	
	//Key ������ ����
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); //Ű �ڵ� �˾Ƴ���
			char keyChar = e.getKeyChar(); //Ű ���� �� �˾Ƴ���		
			}
	}

	public static void main(String[] args) {

	}

}