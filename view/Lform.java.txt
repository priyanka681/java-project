package com.java.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.java.db.DB;
import com.java.model.LoginForm;

import java.awt.SystemColor;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class LForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JButton btnLogin;
	private JButton btnSignUp;
	private JTextField username;
	private JPasswordField password;
	private JButton btnLogin_1;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LForm frame = new LForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LForm() {
		setAutoRequestFocus(false);
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 455, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getBtnSignUp());
		contentPane.add(getUsername());
		contentPane.add(getPassword());
		contentPane.add(getBtnLogin_1());
		contentPane.add(getLabel());
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setFont(new Font("Dialog", Font.BOLD, 20));
			lblUsername.setForeground(SystemColor.textHighlight);
			lblUsername.setBounds(55, 84, 121, 24);
		}
		return lblUsername;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Dialog", Font.BOLD, 20));
			lblPassword.setBounds(55, 129, 111, 24);
		}
		return lblPassword;
	}
	
	
	
	private JButton getBtnSignUp() {
		if (btnSignUp == null) {
			btnSignUp = new JButton("Sign up");
			btnSignUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new SForm().setVisible(true);
					//DB.getInsert();
				}
			});
			btnSignUp.setForeground(Color.WHITE);
			btnSignUp.setBackground(new Color(30, 144, 255));
			btnSignUp.setFont(new Font("Dialog", Font.BOLD, 15));
			btnSignUp.setBounds(258, 165, 117, 25);
		}
		return btnSignUp;
	}
	private JTextField getUsername() {
		if (username == null) {
			username = new JTextField();
			username.setBounds(181, 74, 217, 34);
			username.setColumns(10);
		}
		return username;
	}
	private JPasswordField getPassword() {
		if (password == null) {
			password = new JPasswordField();
			password.setBounds(184, 121, 214, 32);
		}
		return password;
	}
	private JButton getBtnLogin_1() {
		if (btnLogin_1 == null) {
			btnLogin_1 = new JButton("login");
			btnLogin_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					LoginForm lf=new LoginForm();
					String un=username.getText();
					String pw=password.getText();
					try {
						Connection con=DB.getConnectionDb();
						String sql="SELECT * FROM form";
						Statement stm=con.createStatement();
						ResultSet rs=stm.executeQuery(sql);
						while(rs.next()) {
					if(un.equals(rs.getString("Username"))&&pw.equals(rs.getString("Password"))) {
						new Main().setVisible(true);
					}
						}
						
					}catch(Exception e2) {
						
					
					}
					
				}
			});
			btnLogin_1.setForeground(Color.WHITE);
			btnLogin_1.setBackground(new Color(30, 144, 255));
			btnLogin_1.setFont(new Font("Dialog", Font.BOLD, 15));
			btnLogin_1.setBounds(129, 172, 117, 25);
		}
		return btnLogin_1;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setIcon(new ImageIcon("/home/seetal/Downloads/gettyimages-104637612-2048x2048.jpg"));
			label.setBounds(12, 0, 431, 258);
		}
		return label;
	}
}