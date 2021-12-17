package Delivery;

//import account.RestaurentDB;
import member.MemberDB;
/**
* �α����� ó���ϴ� Ŭ�����̴�.. * @author SuperUser
*/
public class LoginProcessing {
 String loginId; // �α��� ���̵�
 String password; // �α��� �н�����
 MemberDB member; // ������ DB ��ü
 //RestaurentDB account; // ���� ���� ��ü
 int accountId; // ���� ����
 /**
 * �α��� ��ü ����
 */
 public LoginProcessing() {
 member = new MemberDB();
 //account = new RestaurentDB();
 }
 /**
 * �α��� ���̵� �ش��ϴ� ���ݰ��� ���
 * @param loginId �α��� ���̵�
 * @return ���ݰ���
 */
 public int getAccountId(String loginId) {
 accountId = account.getAccountId(loginId);
 return accountId;
 }
 
 /**
 * �α��� ���̵�� �н����� �˻�
 * �α��ΰ� �н����� �˻� ��� ������� �� true ����
 * @param id �α��� �Ƶ�
 * @param pwd �н�����
 * @return 
 */
 boolean checkVerify(String id, String pwd) {
 boolean idCheck, pwdCheck;
 
 // �α��� ���̵� �˻�
 idCheck = member.checkId(id);
 
 if(!idCheck) {
 return false;
 }
 
 // �н����� �˻�
 pwdCheck = member.checkPwd(id, pwd);
 
 if(!pwdCheck) {
 return false;
 } 
 
 return true;
 }

 }

