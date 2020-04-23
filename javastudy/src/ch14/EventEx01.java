package ch14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx01 extends JFrame {
	
	public EventEx01() {
		setTitle("Action �̺�Ʈ ������ ����");
		//�̺�Ʈ �й� ������ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		//������ ����
		btn.addActionListener(new ActionListener() {
			
			//Ÿ��(�̺�Ʈ �й� �����尡 �ݹ�)
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư Ŭ����");
				//e = ���ؽ�Ʈ(�̺�Ʈ��ü), e.getSource() = �̺�Ʈ �ҽ�
				JButton b = (JButton) e.getSource();
				System.out.println(b.getText());
				b.setText("�׼�");
			}
		});
		c.add(btn);
		setSize(350,150);
		setVisible(true); //paint() �Լ� ȣ�� ����.
		
	}//end of ������

	public static void main(String[] args) {
		new EventEx01();
	}

}