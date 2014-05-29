package com.guj.school.app;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringUtils;

public class MainClass extends Frame implements ActionListener, WindowListener
{
	private static final long serialVersionUID = 1L;
	
	private TextField accountTypeAndInformationLabel;
	private TextField text2;
	private TextField text3;
	
	private Label label1;
	private Label label2;
	private Label label3;
	
	private Button button;
	
	public MainClass() 
	{
		String accountTypeAndInformationString = GujaratiLetter.KHA + GujaratiLetter.SIGN_AA + GujaratiLetter.T + GujaratiLetter.SIGN_AA
				+ GujaratiLetter.NA + GujaratiLetter.SIGN_UU + " " + GujaratiLetter.NA + GujaratiLetter.SIGN_AA + GujaratiLetter.MA
				+" " + GujaratiLetter.A + GujaratiLetter.NA + GujaratiLetter.SIGN_AE + " " 
				+ GujaratiLetter.VA + GujaratiLetter.SIGN_E + GujaratiLetter.GA + GujaratiLetter.T;
		
		accountTypeAndInformationLabel = new TextField();
		accountTypeAndInformationLabel.setText(accountTypeAndInformationString);
		text2 = new TextField();
		text3 = new TextField();
		add(accountTypeAndInformationLabel);
		add(text2);
		setLayout(new FlowLayout());
		addWindowListener(this);
	}
	public static void main(String[] args) 
	{
		Frame frame = new MainClass();
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.setTitle("Gujarati Application Test");
	}
	public void windowActivated(WindowEvent arg0) 
	{}
	public void windowClosed(WindowEvent arg0) 
	{}
	public void windowClosing(WindowEvent arg0) 
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent arg0) 
	{}
	public void windowDeiconified(WindowEvent arg0)
	{}
	public void windowIconified(WindowEvent arg0) 
	{}
	public void windowOpened(WindowEvent arg0) 
	{}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{}
}
