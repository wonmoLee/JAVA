package ch08;

import java.io.IOException;
import java.io.InputStream;

//��Ʈ��(Byte) => ���� �帧
//���� �带�� ���������� ��ŵθ� ���� �帣�� �ʴ´�.
//���� �带�� ���������� ���� ���� �귯��. (��� ����)
//�� = ����Ʈ
public class InputEx01 {

	public static void main(String[] args) {
		InputStream in = System.in; //Ű����
		try {
			int data = in.read();
			System.out.println((char)data);
		} catch (IOException e) {
			System.out.println("IO ������ �߻�");
			System.out.println("����������!");

		}
		
	}

}