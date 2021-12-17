package member;
import Delivery.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
/**
*
* @author SuperUser
*/
public class MemberDB {
	String loginID; // �α��� ���̵�
	 String password; // �н�����
	 String name; // �̸�
	 int payment; // ����
	 String address; // �ּ�
	 DBConnection dbcon; // memberdb �����ͺ��̽� ���� 
	 /**
	 * memberdb�� �ٷ� ��ü ����
	 * meberdb �����ͺ��̽� ����
	 */
	 public MemberDB() {
	 dbcon = new DBConnection(); // memberdb �����ͺ��̽� ����
	 }
	 
	 public String getLoginID() {
	 return loginID;
	 }
	 public void setLoginID(String loginID) {
	 this.loginID = loginID;
	 }
	 public String getPassword() {
	 return password;
	 }
	 public void setPassword(String password) {
	 this.password = password;
	 }
	 public String getName() {
	 return name;
	 }
	 public void setName(String name) {
	 this.name = name;
	 }
	 public int getpayment() {
	 return payment;
	 }
	 public void setpayment(int payment) {
	 this.payment = payment;
	 }
	 public String getaddress() {
		 return address;
	 }
	 public void setaddress(String address) {
	 this.address = address;
	 }
	 
	 /**
	 * memberdb�� ���ο� ������ ÷���ϱ�
	 * ���� ���ο� �������� �Ҵ��� �α��� ���� ������
	 * meberdb�� ����
	 * ���ο� ������ memberdb�� ����
	 * 
	 * @param id �α��� ���̵�
	 * @param pwd �н�����
	 * @param name �̸�
	 * @param payment ����
	 * @param address �ּ�
	 * @return �α��� ����
	 */
	 public int insert(String id, String pwd, String name, int payment, String address) {
	 int loginId;
	 java.sql.Statement stmt = null;
	 
	 try {
	 // �����ͺ��̽� ���� 
	 stmt = dbcon.db_connect();
	 
	 // memberdb�� ���ο� ������ ����
	 stmt.executeUpdate("insert into memberdb values ('"
	 + id + "', '"
	 + pwd + "', '"
	 + name + "', "
	 + payment + ", '"
	 + address + "' );");
	 dbcon.db_close();
	 } catch (SQLException ex) {
	 System.out.println("���ο� ������ ���� SQL ����");
	 // ���� ������ �� ��쿡�� account���� �����ؾ� �� 
	 return -1; // ���ο� ������ ���� ���и� �˷���
	 }
	 
	 return loginId; // ���� ���̵� ��ȯ
	 }
	 /**
	 * �α��� ���̵� �������� �˻�
	 * ���� ������ ture ��ȯ
	 * ������ flase ��ȯ
	 * @param id �α��� ���̵�
	 * @return �������� ��ȯ
	 */
	 public boolean checkId(String id) {
	 boolean flagCheck = false; 
	 java.sql.Statement stmt = null; 
	 String dbid;
	 
	 try {
	 // �����ͺ��̽� ����
	 stmt = dbcon.db_connect();
	 // �α��� ���̵� ���� ����
	 ResultSet rs = stmt.executeQuery("select * from memberdb where loginid='" + id + "'");
	 if (rs.first()) {
	 dbid = rs.getString("loginID");
	 // ���� ����� �α��� ���̵� ���� �� �˻�
	 if (dbid.equals(id)) {
		 flagCheck = true;
	 } else {
	 flagCheck = false;
	 }
	 }
	 dbcon.db_close();
	 } catch (SQLException ex) {
	 System.out.println("�α��� ���̵� ���� ���� SQL ����");
	 }
	 
	 return flagCheck;
	 }
	 /**
	 * �α��� ���̵� �ش��ϴ� �н����� �˻�
	 * @param id �α��� ���̵�
	 * @param pwd �н�����
	 * @return �н����� ��ġ ���� ��ȯ
	 */
	 public boolean checkPwd(String id, String pwd) {
		 boolean flagCheck = false;
		 java.sql.Statement stmt = null;
		 String dbPassword;
		 try {
			 // �����ͺ��̽� ����
			 stmt = dbcon.db_connect();
			 // �α��� ���̵� �ش��ϴ� �н����� ����
			 ResultSet rs = stmt.executeQuery("select * from memberdb where loginId='" + id + "'");
			 if (rs.first()) {
				 dbPassword = rs.getString("password");
				 // ���� ��� �н������ �Է��н����� ��ġ ���� �˻�
				 if (dbPassword.equals(pwd)) {
					 flagCheck = true;
				 } 
				 else {
					 flagCheck = false;
				 }
			 }
			 dbcon.db_close();
		 } 
		 catch (SQLException ex) {
			 System.out.println(" �н����� �˻� ���� SQL ����");
		 }
		 return flagCheck;
	 }
	 
}
