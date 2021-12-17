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
* 로그인 아이디에 해당되는 계정을 생성하거나, * 연산을 하기 위해 데이터베이스에
* 연결하는 역할을 한다. * @author choi kyutae
*/
public class DBConnection {
	 final String jdbc_url = "jdbc:mysql://127.0.0.1:3306/software";
	 final String db_id = "software";
	 final String db_password = "selab";
	 // DB연결 관련
	 Connection conn = null;
	 java.sql.Statement stmt = null;
	 /**
	 * 은행과 관련된 DB를 연결하기 위한 동작을 수행한다. * @return sql Statememt
	 */
	 public java.sql.Statement db_connect() {
	 try {
	 // 연결 생성
		 Class<?> forName = Class.forName("com.mysql.jdbc.Driver");
		 conn = DriverManager.getConnection(jdbc_url, db_id, db_password);
		 stmt = conn.createStatement(); // 연결로부터 statement 생성
	 } 
	 catch (SQLException ex) {
		 System.out.println("은행 DB연결 오류");
	 } 
	 catch (ClassNotFoundException ex) {
		 System.out.println("JDBC 드라이버 로드 오류 ");
	 }
	 
	 return stmt;
	 } 
	 
	 /**
	 * 은행 DB와의 연결 해제
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

