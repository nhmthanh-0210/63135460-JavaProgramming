package testSwing;

import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class test_JFRAME {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Ví dụ về frame"); 
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300,200); 
		
				
		f.setLayout(new FlowLayout());
		
		JButton btnOK = new JButton("Nhấn tôi đi");
		JButton btnKhac = new JButton("Nhấn em đi");
		
		BoLangNgheOK ok = new BoLangNgheOK();
		btnOK.addActionListener(ok);
		
		
	
		btnKhac.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new JDialog();
				dialog.setTitle("Hi keoo");
				dialog.setSize(200,300);
				dialog.show();	
			}
		});
				
		
	
		f.add(btnOK);
		f.add(btnKhac);
			
		f.show(); 
	}
	
	private static class BoLangNgheOK implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JDialog dialog = new JDialog();
			dialog.setTitle("Thông báo gì đó về btnOK");
			dialog.setSize(200,300);
			dialog.show();
			
		}
		
	}
	
	
}