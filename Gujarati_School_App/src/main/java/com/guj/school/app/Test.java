package com.guj.school.app;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeListener;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;

import net.sourceforge.jdatepicker.DateModel;
import net.sourceforge.jdatepicker.JDateComponent;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringUtils;

public class Test extends JFrame implements ActionListener, WindowListener
{
	private static final long serialVersionUID = 1L;
	
	private TextField text1;
	private TextField text2;
	private TextField text3;
	
	private JLabel label1;
	private Label label2;
	private Label label3;
	
	private Button button;
	
	public Test() 
	{
		this.setFont(new Font("SHREE_GUJ_OTF_0768", Font.PLAIN, 20));
		text1 = new TextField();
		text2 = new TextField();
		text3 = new TextField();
		String a = GujaratiLetter.ONE_UNICODE + GujaratiLetter.NA + GujaratiLetter.AN + GujaratiLetter.BA + GujaratiLetter.RA;
		
		label1 = new JLabel();
		label1.setFont(new Font("SHREE_GUJ_OTF_0768", Font.PLAIN, 12));
		label1.setText(a);
		label1.setPreferredSize(new Dimension(100, 100));
		text3.setText(GujaratiLetter.ONE_UNICODE + GujaratiLetter.NA + GujaratiLetter.KENDRABINDU + GujaratiLetter.BA + GujaratiLetter.RA);
		text3.setEditable(false);
		label2 = new Label("Enter No2:");
		label3 = new Label("Result:");
		
		button = new Button("Ok");
		
		DateModel<String> dateModel = new DateModel<String>() {

			@Override
			public void addChangeListener(ChangeListener paramChangeListener) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removeChangeListener(ChangeListener paramChangeListener) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int getYear() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void setYear(int paramInt) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int getMonth() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void setMonth(int paramInt) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int getDay() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void setDay(int paramInt) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setDate(int paramInt1, int paramInt2, int paramInt3) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addYear(int paramInt) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addMonth(int paramInt) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addDay(int paramInt) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String getValue() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setValue(String paramT) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean isSelected() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void setSelected(boolean paramBoolean) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addPropertyChangeListener(
					PropertyChangeListener paramPropertyChangeListener) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removePropertyChangeListener(
					PropertyChangeListener paramPropertyChangeListener) {
				// TODO Auto-generated method stub
				
			}
		};
		
		add(new JDatePickerImpl(new JDatePanelImpl(dateModel)));
		
		text1.setPreferredSize(new Dimension(100, 20));
		text2.setPreferredSize(new Dimension(100, 20));
		text3.setPreferredSize(new Dimension(100, 20));
		
		setLayout(new FlowLayout());
		
		add(label1);
		add(text1);
		add(label2);
		add(text2);
		add(button);
		add(label3);
		add(text3);
		
		addWindowListener(this);
		button.addActionListener(this);
	}
	public static void main(String[] args) 
	{
//		System.setProperty("file.encoding", "UTF-8");
		String a = GujaratiLetter.GA+GujaratiLetter.SIGN_U+GujaratiLetter.JA+GujaratiLetter.RA+GujaratiLetter.SIGN_AA
				+GujaratiLetter.T+GujaratiLetter.SIGN_EE+" "+GujaratiLetter.JA+GujaratiLetter.MA+GujaratiLetter.SIGN_AA
				+ "-" + GujaratiLetter.U+GujaratiLetter.DH+GujaratiLetter.SIGN_AA+GujaratiLetter.RA;
		JFrame frame = new Test();
		frame.setVisible(true);
		frame.setSize(700, 700);
		frame.setTitle(a);
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
	public void actionPerformed(ActionEvent arg0) 
	{
		String hexString1 = null;
		String hexString2 = null;
		try 
		{
			hexString1 = new String(Hex.encodeHex(text1.getText().getBytes("UTF-16")));
			hexString2 = new String(Hex.encodeHex(text2.getText().getBytes("UTF-16")));
		} 
		catch (UnsupportedEncodingException e) 
		{
			e.printStackTrace();
		}
		String tempHexString1 = hexString1.substring(4);
		String tempHexString2 = hexString2.substring(4);
		
		String no1 = null;
		String mainString1 = "";
		String no1InEng = "";
		String no1String = "";
		String no2 = null;
		String mainString2 = "";
		String no2InEng = "";
		String no2String = "";
		
		for(int i = 0; i < tempHexString1.length()/4; i++)
		{
			int j = i * 4;
			no1 = tempHexString1.substring(j, j + 4);
			if(StringUtils.contains(GujaratiLetter.ZERO, no1))
			{
				no1 = GujaratiLetter.ZERO_UNICODE;
				no1InEng = "0";
			}
			if(StringUtils.contains(GujaratiLetter.ONE, no1))
			{
				no1 = GujaratiLetter.ONE_UNICODE;
				no1InEng = "1";
			}
			if(StringUtils.contains(GujaratiLetter.TWO, no1))
			{
				no1 = GujaratiLetter.TWO_UNICODE;
				no1InEng = "2";
			}
			if(StringUtils.contains(GujaratiLetter.THREE, no1))
			{
				no1 = GujaratiLetter.THREE_UNICODE;
				no1InEng = "3";
			}
			if(StringUtils.contains(GujaratiLetter.FOUR, no1))
			{
				no1 = GujaratiLetter.FOUR_UNICODE;
				no1InEng = "4";
			}
			if(StringUtils.contains(GujaratiLetter.FIVE, no1))
			{
				no1 = GujaratiLetter.FIVE_UNICODE;
				no1InEng = "5";
			}
			if(StringUtils.contains(GujaratiLetter.SIX, no1))
			{
				no1 = GujaratiLetter.SIX_UNICODE;
				no1InEng = "6";
			}
			if(StringUtils.contains(GujaratiLetter.SEVEN, no1))
			{
				no1 = GujaratiLetter.SEVEN_UNICODE;
				no1InEng = "7";
			}
			if(StringUtils.contains(GujaratiLetter.EIGHT, no1))
			{
				no1 = GujaratiLetter.EIGHT_UNICODE;
				no1InEng = "8";
			}
			if(StringUtils.contains(GujaratiLetter.NINE, no1))
			{
				no1 = GujaratiLetter.NINE_UNICODE;
				no1InEng = "9";
			}
			mainString1 = mainString1 + no1;
			no1String = no1String + no1InEng;
		}
		
		for(int i = 0; i < tempHexString2.length()/4; i++)
		{
			int j = i * 4;
			no2 = tempHexString2.substring(j, j + 4);
			if(StringUtils.contains(GujaratiLetter.ZERO, no2))
			{
				no2 = GujaratiLetter.ZERO_UNICODE;
				no2InEng = "0";
			}
			if(StringUtils.contains(GujaratiLetter.ONE, no2))
			{
				no2 = GujaratiLetter.ONE_UNICODE;
				no2InEng = "1";
			}
			if(StringUtils.contains(GujaratiLetter.TWO, no2))
			{
				no2 = GujaratiLetter.TWO_UNICODE;
				no2InEng = "2";
			}
			if(StringUtils.contains(GujaratiLetter.THREE, no2))
			{
				no2 = GujaratiLetter.THREE_UNICODE;
				no2InEng = "3";
			}
			if(StringUtils.contains(GujaratiLetter.FOUR, no2))
			{
				no2 = GujaratiLetter.FOUR_UNICODE;
				no2InEng = "4";
			}
			if(StringUtils.contains(GujaratiLetter.FIVE, no2))
			{
				no2 = GujaratiLetter.FIVE_UNICODE;
				no2InEng = "5";
			}
			if(StringUtils.contains(GujaratiLetter.SIX, no2))
			{
				no2 = GujaratiLetter.SIX_UNICODE;
				no2InEng = "6";
			}
			if(StringUtils.contains(GujaratiLetter.SEVEN, no2))
			{
				no2 = GujaratiLetter.SEVEN_UNICODE;
				no2InEng = "7";
			}
			if(StringUtils.contains(GujaratiLetter.EIGHT, no2))
			{
				no2 = GujaratiLetter.EIGHT_UNICODE;
				no2InEng = "8";
			}
			if(StringUtils.contains(GujaratiLetter.NINE, no2))
			{
				no2 = GujaratiLetter.NINE_UNICODE;
				no2InEng = "9";
			}
			mainString2 = mainString2 + no2;
			no2String = no2String + no2InEng;
		}
		int number1 = Integer.parseInt(no1String);
		int number2 = Integer.parseInt(no2String);
		
		int number3 = number1 + number2;
		String no3 = null;
		String result = "";
		String number3String = String.valueOf(number3);
		for(int i = 0; i < number3String.length(); i++)
		{
			char c = number3String.charAt(i);
			if(c == '0')
			{
				no3 = GujaratiLetter.ZERO_UNICODE;
			}
			if(c == '1')
			{
				no3 = GujaratiLetter.ONE_UNICODE;
			}
			if(c == '2')
			{
				no3 = GujaratiLetter.TWO_UNICODE;
			}
			if(c == '3')
			{
				no3 = GujaratiLetter.THREE_UNICODE;
			}
			if(c == '4')
			{
				no3 = GujaratiLetter.FOUR_UNICODE;
			}
			if(c == '5')
			{
				no3 = GujaratiLetter.FIVE_UNICODE;
			}
			if(c == '6')
			{
				no3 = GujaratiLetter.SIX_UNICODE;
			}
			if(c == '7')
			{
				no3 = GujaratiLetter.SEVEN_UNICODE;
			}
			if(c == '8')
			{
				no3 = GujaratiLetter.EIGHT_UNICODE;
			}
			if(c == '9')
			{
				no3 = GujaratiLetter.NINE_UNICODE;
			}
			result = result + no3;
			text3.setText(result);
		}
	}
}
