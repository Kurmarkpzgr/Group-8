package review;

import java.awt.Container;
import review.ReviewWriteForm;

public class ReviewForm extends javax.swing.JFrame{
	
	ReviewWriteForm writeform;
	
	
	public ReviewForm(){
		initComponents();
		writeform = new ReviewWriteForm();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
		btnOrderhistory = new javax.swing.JButton();
		btnWrite = new javax.swing.JButton();
		btnCorrect = new javax.swing.JButton();
		btnDel = new javax.swing.JButton();
		txtreview = new javax.swing.JTextArea();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		btnOrderhistory.setText("주문 기록");
		btnOrderhistory.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseClicked(java.awt.event.MouseEvent evt) {
				 orderhistory(evt);
			 }
		 });
		 
		 btnWrite.setText("작성");
		 btnWrite.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseClicked(java.awt.event.MouseEvent evt) {
				 writeform(evt);
			 }
		 });
		 
		 btnCorrect.setText("수정");
		 btnCorrect.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseClicked(java.awt.event.MouseEvent evt) {
				 correctform(evt);
			 }
		 });
		 
		 btnDel.setText("삭제");
		 btnDel.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseClicked(java.awt.event.MouseEvent evt) {
				 deleteprocess(evt);
			 }
		 });
		 
		 setTitle("IT 배달 어플");
		 
		 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		 getContentPane().setLayout(layout);
		 
		layout.setHorizontalGroup(				 
				 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				 
						 .addGroup(layout.createSequentialGroup()
								 .addGap(18, 18, 18)
								 .addComponent(btnOrderhistory)
								 .addGap(18, 18, 18)
								 .addComponent(btnWrite)
								 .addGap(18, 18, 18)
								 )
						 .addGroup(layout.createSequentialGroup()
								 .addComponent(txtreview)
								 )
						 .addGroup(layout.createSequentialGroup()
								 .addGap(18, 18, 18)
								 .addComponent(btnCorrect)
								 .addGap(20, 20, 20)
								 .addComponent(btnDel))						
						 
		 );
				 
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()						 			
							.addGap(18, 18, 18)
						 	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						 		.addComponent(btnOrderhistory)
						 		.addGap(18,18,18)
						 		.addComponent(btnWrite,javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
						 	.addGap(18, 18, 18)
						 	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)						 					
						 		.addComponent(txtreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						 	.addGap(18, 18, 18)
						 	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						 			.addComponent(btnCorrect)
						 			.addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))						 					
						 			.addGap(58, 58, 58)
					)
		);				 						
	pack();	
	}
	private void orderhistory(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberJoin
		 // TODO add your handling code here: 
		 this.setVisible(false);
		 //orderhistory.setVisible(true);
		 }//GEN-LAST:event_memberJoin
	
	private void writeform(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberJoin
		 // TODO add your handling code here: 
		 this.setVisible(false);
		 writeform.setVisible(true);
		 }//GEN-LAST:event_memberJoin
	
	private void correctform(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberJoin
		 // TODO add your handling code here: 
		 this.setVisible(false);
		 writeform.setVisible(true);
		 }//GEN-LAST:event_memberJoin
	
	private void deleteprocess(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberJoin
		 // TODO add your handling code here: 
		//review delete process 만들어서 추가할것.
		 }//GEN-LAST:event_memberJoin

	private javax.swing.JButton btnOrderhistory;
	private javax.swing.JButton btnWrite;
	private javax.swing.JButton btnCorrect;
	private javax.swing.JButton btnDel;
	private javax.swing.JTextArea txtreview;
}
