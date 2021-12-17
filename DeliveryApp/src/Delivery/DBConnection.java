package Delivery;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
/**
* �α��� ���̵� �ش�Ǵ� ������ �����ϰų�, * ������ �ϱ� ���� �����ͺ��̽���
* �����ϴ� ������ �Ѵ�. * @author choi kyutae
*/
public class DBConnection {
	 final String jdbc_url = "jdbc:mysql://127.0.0.1:3306/software";
	 final String db_id = "software";
	 final String db_password = "selab";
	 // DB���� ����
	 Connection conn = null;
	 java.sql.Statement stmt = null;
	 /**
	 * ����� ���õ� DB�� �����ϱ� ���� ������ �����Ѵ�. * @return sql Statememt
	 */
	 public java.sql.Statement db_connect() {
	 try {
	 // ���� ����
		 Class<?> forName = Class.forName("com.mysql.jdbc.Driver");
		 conn = DriverManager.getConnection(jdbc_url, db_id, db_password);
		 stmt = conn.createStatement(); // ����κ��� statement ����
	 } 
	 catch (SQLException ex) {
		 System.out.println("���� DB���� ����");
	 } 
	 catch (ClassNotFoundException ex) {
		 System.out.println("JDBC ����̹� �ε� ���� ");
	 }
	 
	 return stmt;
	 } 
	 
	 /**
	 * ���� DB���� ���� ����
	 */
	 public void db_close() {
		 try {
			 conn.close();
		 } 
		 catch (SQLException ex) {
			 Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
		 }
	 }
 }

