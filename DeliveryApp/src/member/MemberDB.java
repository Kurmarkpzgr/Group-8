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
	String loginID; // 로그인 아이디
	 String password; // 패스워드
	 String name; // 이름
	 int payment; // 결제
	 String address; // 주소
	 DBConnection dbcon; // memberdb 데이터베이스 연결 
	 /**
	 * memberdb를 다룩 객체 생성
	 * meberdb 데이터베이스 연결
	 */
	 public MemberDB() {
	 dbcon = new DBConnection(); // memberdb 데이터베이스 연결
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
	 * memberdb에 새로운 구성원 첨가하기
	 * 먼저 새로운 구성원에 할당할 로그인 계정 얻어오기
	 * meberdb에 연결
	 * 새로운 구성원 memberdb에 삽입
	 * 
	 * @param id 로그인 아이디
	 * @param pwd 패스워드
	 * @param name 이름
	 * @param payment 결제
	 * @param address 주소
	 * @return 로그인 계정
	 */
	 public int insert(String id, String pwd, String name, int payment, String address) {
	 int loginId;
	 java.sql.Statement stmt = null;
	 
	 try {
	 // 데이터베이스 연결 
	 stmt = dbcon.db_connect();
	 
	 // memberdb에 새로운 구성원 사입
	 stmt.executeUpdate("insert into memberdb values ('"
	 + id + "', '"
	 + pwd + "', '"
	 + name + "', "
	 + payment + ", '"
	 + address + "' );");
	 dbcon.db_close();
	 } catch (SQLException ex) {
	 System.out.println("새로운 구성원 삽입 SQL 에러");
	 // 만약 에러가 난 경우에는 account계정 삭제해야 함 
	 return -1; // 새로운 구성원 삽입 실패를 알려줌
	 }
	 
	 return loginId; // 계정 아이디 반환
	 }
	 /**
	 * 로그인 아이디 존재유무 검사
	 * 만약 있으면 ture 반환
	 * 없으면 flase 반환
	 * @param id 로그인 아이디
	 * @return 존재유무 반환
	 */
	 public boolean checkId(String id) {
	 boolean flagCheck = false; 
	 java.sql.Statement stmt = null; 
	 String dbid;
	 
	 try {
	 // 데이터베이스 연결
	 stmt = dbcon.db_connect();
	 // 로그인 아이디에 대한 질의
	 ResultSet rs = stmt.executeQuery("select * from memberdb where loginid='" + id + "'");
	 if (rs.first()) {
	 dbid = rs.getString("loginID");
	 // 질의 결과와 로그인 아이디가 같은 지 검사
	 if (dbid.equals(id)) {
		 flagCheck = true;
	 } else {
	 flagCheck = false;
	 }
	 }
	 dbcon.db_close();
	 } catch (SQLException ex) {
	 System.out.println("로그인 아이디 존재 유무 SQL 에러");
	 }
	 
	 return flagCheck;
	 }
	 /**
	 * 로그인 아이디에 해당하는 패스워드 검사
	 * @param id 로그인 아이디
	 * @param pwd 패스워드
	 * @return 패스워드 일치 여부 반환
	 */
	 public boolean checkPwd(String id, String pwd) {
		 boolean flagCheck = false;
		 java.sql.Statement stmt = null;
		 String dbPassword;
		 try {
			 // 데이터베이스 연결
			 stmt = dbcon.db_connect();
			 // 로그인 아이디에 해당하는 패스워드 질의
			 ResultSet rs = stmt.executeQuery("select * from memberdb where loginId='" + id + "'");
			 if (rs.first()) {
				 dbPassword = rs.getString("password");
				 // 질의 결과 패스워드와 입력패스워드 일치 여부 검사
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
			 System.out.println(" 패스워드 검사 질의 SQL 에러");
		 }
		 return flagCheck;
	 }
	 
}
