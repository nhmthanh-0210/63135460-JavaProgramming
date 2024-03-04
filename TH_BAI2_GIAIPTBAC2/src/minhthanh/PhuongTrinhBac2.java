package minhthanh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PhuongTrinhBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;

	public PhuongTrinhBac2() {
		
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 511);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 0));
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nhập A: ");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(182, 23, 116, 40);
		contentPane.add(lblNewLabel);

		JLabel lblNhpB = new JLabel("Nhập B:");
		lblNhpB.setForeground(new Color(255, 255, 0));
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpB.setBounds(182, 83, 116, 40);
		contentPane.add(lblNhpB);

		JLabel lblNhpC = new JLabel("Nhập  C:");
		lblNhpC.setForeground(new Color(255, 255, 0));
		lblNhpC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpC.setBounds(182, 151, 116, 40);
		contentPane.add(lblNhpC);

		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(298, 23, 254, 32);
		contentPane.add(txtA);
		txtA.setColumns(10);

		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(298, 83, 254, 32);
		contentPane.add(txtB);

		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(298, 151, 254, 32);
		contentPane.add(txtC);

		JLabel lblX1 = new JLabel("");
		lblX1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblX1.setBounds(157, 347, 116, 40);
		contentPane.add(lblX1);

		JLabel lblX2 = new JLabel("");
		lblX2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblX2.setBounds(310, 347, 116, 40);
		contentPane.add(lblX2);

		JLabel lblDelta = new JLabel("");
		lblDelta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDelta.setBounds(157, 288, 395, 40);
		contentPane.add(lblDelta);

		JButton btnTinh = new JButton("Tính");
		btnTinh.setForeground(new Color(255, 0, 0));
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!validateForm()) {
					JOptionPane.showMessageDialog(PhuongTrinhBac2.this, "Vui lòng nhập giá trị!");
					return;
				} else {
					
					 try {
							String strA = txtA.getText();
							String strB = txtB.getText();
							String strC = txtC.getText();
							Double a = Double.parseDouble(strA);
							Double b = Double.parseDouble(strB);
							Double c = Double.parseDouble(strC);

							double x, x1, x2;
							double delta = (float) Math.pow(b, 2) - 4 * a * c;
							// y = ax^2 + bx +c;
							if (delta < 0) {
								lblDelta.setText("Vì Delta < 0 => Phương trình vô nghiệm");
								lblX1.setText("");	
								lblX2.setText("");
							} else if (delta == 0) {
								lblDelta.setText("Delta = " + String.format("%.2f", delta));
								x = -b / (2 * a);
								lblX1.setText("X = " + String.valueOf(x));
								lblX2.setText("");
							} else {
								x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
								x2 = Math.ceil((float) (-b - Math.sqrt(delta)) / (2 * a));
								lblDelta.setText("Delta = " + String.valueOf(delta));
								lblX1.setText("X1 = " + String.format("%.2f", x1));
								lblX2.setText("X2 = " + String.format("%.2f", x2));
							}
					      
					    } catch (NumberFormatException e1) {
					        // Xử lý ngoại lệ nếu có lỗi chuyển đổi
					        JOptionPane.showMessageDialog(PhuongTrinhBac2.this, "Vui lòng nhập số cho a, b, c!");
					        return;
					    }
					
				
				}
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTinh.setBounds(310, 213, 153, 40);
		contentPane.add(btnTinh);

		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(255, 0, 0));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
				txtB.setText("");
				txtC.setText("");
				lblX1.setText("");	
				lblX2.setText("");
				lblDelta.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setBounds(121, 202, 153, 40);
		contentPane.add(btnReset);

	}
	
	
	
	// xu li
	public boolean validateForm() {
		if (txtA.getText().isEmpty() || txtB.getText().isEmpty() || txtC.getText().isEmpty()) {
			return false;
		}

		return true;
	}
	


}