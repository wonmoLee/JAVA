package booklist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerList {
	Connection con; // �������

	public CustomerList() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		/* 11g express edition�� orcl ��� XE�� �Է��Ѵ�. */
		String userid = "c##madang";
		String pwd = "c##madang";

		try { // ����̹��� ã�� ���� - ���� �����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try { // �����ͺ��̽��� �����ϴ� ���� - ��Ʈ��ũ �����
			System.out.println("�����ͺ��̽� ���� �غ�...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (Exception e) {

		}
	}

	private void sqlRun() {
		String query = "SELECT NAME, ADDRESS\r\n" + "FROM CUSTOMER CS \r\n" + "WHERE EXISTS (SELECT *\r\n"
				+ "              FROM ORDERS OD\r\n" + "              WHERE CS.CUSTID = OD.CUSTID)"; // SQL��
		try { // �����ͺ��̽��� ���� ����� �������� ����
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("\tNAME\tAREA");
			while (rs.next()) {
				System.out.print("\t" + rs.getString(1));
				System.out.println("\t" + rs.getString(2));
				// System.out.print("\t" + rs.getString(3));
				// System.out.println("\t" + rs.getString(4));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CustomerList so = new CustomerList();
		so.sqlRun();
	}

}