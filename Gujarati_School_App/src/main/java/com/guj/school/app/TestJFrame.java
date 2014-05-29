package com.guj.school.app;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class TestJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4940816660343486897L;
	
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {		
					TestJFrame frame = new TestJFrame();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public TestJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0AA4\u0ABE\u0AB0\u0AC0\u0A96:");
		lblNewLabel.setFont(new Font("SHREE_GUJ_OTF_0768", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 40, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("SHREE_GUJ_OTF_0768", Font.PLAIN, 12));
		textField.setBounds(59, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
