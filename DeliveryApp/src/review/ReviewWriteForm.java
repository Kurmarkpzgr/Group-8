package review;

public class ReviewWriteForm {
	
	String review;
	
	/**
	 * Creates new form review_write_screen */
		 public ReviewWriteForm() {
			 initComponents(); 
		 }

	private void initComponents() {
		// TODO Auto-generated method stub
		btnReview = new javax.swing.JButton();
		btnOrderhistory = new javax.swing.JButton();
		btnWrite = new javax.swing.JButton();
		txtreview = new javax.swing.JTextField();
		
		btnReview.setText("리뷰");
		btnReview.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseClicked(java.awt.event.MouseEvent evt) {
				
			 }
		 });
		 
		 btnOrderhistory.setText("주문기록");
		 btnOrderhistory.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseClicked(java.awt.event.MouseEvent evt) {
				 
			 }
		 });


		
	}
	
	
	private javax.swing.JButton btnReview;
	private javax.swing.JButton btnOrderhistory;
	private javax.swing.JButton btnWrite;
	private javax.swing.JTextField txtreview;

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
