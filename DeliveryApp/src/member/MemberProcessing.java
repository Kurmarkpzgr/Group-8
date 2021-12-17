package member;
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
/**
* 구성원의 가입을 처리하는 클래스
* @author SuperUser
*/
public class MemberProcessing {
	MemberDB member;
	 public MemberProcessing() {
	 member = new MemberDB();
	 }
	 
	 /**
	 * 로그인 아이디와 패스워드 검사
	 * @param id 로그인 아이디
	 * @param password 패스워드
	 * @return 검사의 유효성 반환(true, false)
	 */
	 public boolean checkVerify(String id, String password) {
	 boolean idCheck, pwdCheck;
	 
	 // 아이디 검사
	 idCheck = member.checkId(id);
	 
	 if(!idCheck) return false;
	 
	 // 패스워드 검사
	 pwdCheck = member.checkPwd(id,password);
	 
	 if(pwdCheck) {
	 return true;
	 } else {
	 return false;
	 }
	 }
	 /**
	 * 구성원 가입 메소드
	 * 
	 * @param loginId 로그인 아이디
	 * @param password 패스워드
	 * @param name 이름
	 * @param address 주소
	 * @param payment 결제
	 * @return 로그인 계정
	 */
	 public int memberJoin(String loginId, String password, String name, String address, int payment) {
	 string loginId = -1;
	 
	 
	 member.setLoginID(loginId);
	 member.setPassword(password);
	 member.setName(name);
	 member.setpayment(payment);
	 member.setaddress(address); 
	 loginId = member.insert(loginId, password, name, payment, address);
	 
	 return loginId;
	 }
	 }
