package member;
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
/**
* �������� ������ ó���ϴ� Ŭ����
* @author SuperUser
*/
public class MemberProcessing {
	MemberDB member;
	 public MemberProcessing() {
	 member = new MemberDB();
	 }
	 
	 /**
	 * �α��� ���̵�� �н����� �˻�
	 * @param id �α��� ���̵�
	 * @param password �н�����
	 * @return �˻��� ��ȿ�� ��ȯ(true, false)
	 */
	 public boolean checkVerify(String id, String password) {
	 boolean idCheck, pwdCheck;
	 
	 // ���̵� �˻�
	 idCheck = member.checkId(id);
	 
	 if(!idCheck) return false;
	 
	 // �н����� �˻�
	 pwdCheck = member.checkPwd(id,password);
	 
	 if(pwdCheck) {
	 return true;
	 } else {
	 return false;
	 }
	 }
	 /**
	 * ������ ���� �޼ҵ�
	 * 
	 * @param loginId �α��� ���̵�
	 * @param password �н�����
	 * @param name �̸�
	 * @param address �ּ�
	 * @param payment ����
	 * @return �α��� ����
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
