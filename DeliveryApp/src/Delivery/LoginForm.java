package Delivery;

import Delivery.DeliveryMainGUI;
import member.MemberJoinForm;
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
/**
* 로그인을 위한 GUI * - 아이디가 없는 사람은 회원가입 버튼을 누르고
* - 아이디가 있는 사람은 아이디와 패스워드를 입력 * 
*/
public class LoginForm extends javax.swing.JFrame {

 LoginProcessing loginProcess;
 DeliveryMainGUI deliveryMain; //주 화면
 MemberJoinForm memberJoinGui; //회원가입 화면

 
 /**
 * Creates new form LoginForm
 */
 public LoginForm() {
	 initComponents();
	 loginProcess = new LoginProcessing();
	 memberJoinGui = new MemberJoinForm();
 }
 /**
 * This method is called from within the constructor to initialize the form. * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor. */
 
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	 private void initComponents() {
	 jLabel1 = new javax.swing.JLabel();
	 jLabel2 = new javax.swing.JLabel();
	 btnLogin = new javax.swing.JButton();
	 btnMemberJoin = new javax.swing.JButton();
	 txtIdentifier = new javax.swing.JTextField();
	 txtPassword = new javax.swing.JTextField();
	 jLabel3 = new javax.swing.JLabel();
	 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	 jLabel1.setText("아이디(ID)");
	 jLabel2.setText("패스워드");
	 
	 btnLogin.setText("로그인");
	 btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
		 public void mouseClicked(java.awt.event.MouseEvent evt) {
			 loginProcess(evt);
		 }
	 });
	 btnMemberJoin.setText("회원가입");
	 btnMemberJoin.addMouseListener(new java.awt.event.MouseAdapter() {
		 public void mouseClicked(java.awt.event.MouseEvent evt) {
			 memberJoin(evt);
		 }
	 });
	 
	 txtIdentifier.setHorizontalAlignment(javax.swing.JTextField.LEFT);
	 txtIdentifier.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
	 txtPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
	 txtPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
	 jLabel3.setFont(new java.awt.Font("HY그래픽", 1, 18)); // NOI18N
	 jLabel3.setText("로그인");
	 
	 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	 getContentPane().setLayout(layout);
	 
	 layout.setHorizontalGroup(
			 
	 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	 	.addGroup(layout.createSequentialGroup()
	 			.addGap(83, 83, 83)
	 			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	 					.addGroup(layout.createSequentialGroup()
	 							.addComponent(btnMemberJoin)
	 							.addGap(18, 18, 18)
	 							.addComponent(btnLogin))
	 					
	 					.addGroup(layout.createSequentialGroup()
	 							.addGap(13, 13, 13)	 
	 							.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	 									.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 
	 											javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)	 
	 									.addComponent(jLabel1))	 							
	 							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)	 
	 							.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	 									.addComponent(txtIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
	 									.addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
	 
	 				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	 		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	 			.addContainerGap(52, Short.MAX_VALUE)
	 			.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, 
	 					javax.swing.GroupLayout.PREFERRED_SIZE))
	 			
			 );
	 
	 layout.setVerticalGroup(
	 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	 	.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	 			.addContainerGap(10, Short.MAX_VALUE)
	 			.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
	 			.addGap(18, 18, 18)
	 			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	 					.addComponent(jLabel1)
	 					.addComponent(txtIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	 			.addGap(18, 18, 18)
	 			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	 					.addComponent(jLabel2)
	 					.addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	 			.addGap(18, 18, 18)
	 			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	 					.addComponent(btnLogin)
	 					.addComponent(btnMemberJoin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, 
	 							javax.swing.GroupLayout.PREFERRED_SIZE))
	 			.addGap(58, 58, 58))
			 );
	 pack();
	 }// </editor-fold>//GEN-END:initComponents
 
	 /**
	 * 아이디와 패스워드를 입력하여 로그인 처리를 처리하는 이벤트 리스너 메소드
	 * 아이디와 패스워드가 맞으면 MainBankingGUI 화면이 나오게 됨
	 * @param evt 
	 */
	 private void loginProcess(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginProcess
	 // TODO add your handling code here:
		 String id; // 로그인 아이디(ID)
		 String password; // 패스워드
		 boolean idCheck, pwdCheck; // 아이디와 패스워드 DB로 부터 검사
		 String name; //  이름
		 
		 // 아이디와 패스워드 입력값 처리
		 id = txtIdentifier.getText(); 
		 password = txtPassword.getText(); 
		 
		 // 아이디와 패스워드 검사
		 if (loginProcess.checkVerify(id, password)) {
			 this.setVisible(false);
			 
			 // 로그이 완료 후 주 화면 보이기
			 deliveryMain = new DeliveryMainGUI();
			 deliveryMain.setVisible(true);
		 } 
		 else {
			 reInputInit(); // 아이디 패스워드 입력 값 초기화 
		 } 
	 }//GEN-LAST:event_loginProcess
	 /**
	 * 아이디 패스워드 입력값 초기화
	 * 아이디 입력부분에 포커싱
	 */
	 private void reInputInit() {
		 txtIdentifier.setText("");
		 txtPassword.setText("");
		 txtIdentifier.setFocusable(true);
	 } 
	 /**
	 * 회원가입 이벤트 리스너를 처리하는 메소드
	 * MemberJoinForm을 보여줌
	 * @param evt 
	 */
	 private void memberJoin(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberJoin
		 // TODO add your handling code here: 
		 this.setVisible(false);
		 memberJoinGui.setVisible(true);
	 }//GEN-LAST:event_memberJoin
	 /**
	 * @param args the command line arguments
	 */
	
	 // Variables declaration - do not modify//GEN-BEGIN:variables
	 private javax.swing.JButton btnLogin;
	 private javax.swing.JButton btnMemberJoin;
	 private javax.swing.JLabel jLabel1;
	 private javax.swing.JLabel jLabel2;
	 private javax.swing.JLabel jLabel3;
	 private javax.swing.JTextField txtIdentifier;
	 private javax.swing.JTextField txtPassword;
	 // End of variables declaration//GEN-END:variables
 }
