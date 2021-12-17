package Delivery;

//import account.RestaurentDB;
import member.MemberDB;
/**
* 로그인을 처리하는 클래스이다.. * @author SuperUser
*/
public class LoginProcessing {
 String loginId; // 로그인 아이디
 String password; // 로그인 패스워드
 MemberDB member; // 구성원 DB 객체
 //RestaurentDB account; // 예금 계정 객체
 int accountId; // 예금 계정
 /**
 * 로그인 객체 생성
 */
 public LoginProcessing() {
 member = new MemberDB();
 //account = new RestaurentDB();
 }
 /**
 * 로그인 아이디에 해당하는 예금계정 얻기
 * @param loginId 로그인 아이디
 * @return 예금계정
 */
 public int getAccountId(String loginId) {
 accountId = account.getAccountId(loginId);
 return accountId;
 }
 
 /**
 * 로그인 아이디와 패스워드 검사
 * 로그인과 패스워드 검사 모두 통과했을 때 true 리턴
 * @param id 로그인 아디
 * @param pwd 패스워드
 * @return 
 */
 boolean checkVerify(String id, String pwd) {
 boolean idCheck, pwdCheck;
 
 // 로그인 아이디 검사
 idCheck = member.checkId(id);
 
 if(!idCheck) {
 return false;
 }
 
 // 패스워드 검사
 pwdCheck = member.checkPwd(id, pwd);
 
 if(!pwdCheck) {
 return false;
 } 
 
 return true;
 }

 }

