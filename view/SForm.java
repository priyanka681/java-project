package com.java.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.java.db.DB;
import com.java.model.LoginForm;
public class SForm extends JFrame {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField lname;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SForm frame = new SForm();
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
	public SForm() {
		setTitle("Create Form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 440, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Dialog", Font.BOLD, 17));
		lblFirstName.setBounds(61, 24, 112, 32);
		contentPane.add(lblFirstName);
		
		fname = new JTextField();
		fname.setBounds(174, 28, 176, 27);
		contentPane.add(fname);
		fname.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Dialog", Font.BOLD, 17));
		lblLastName.setBounds(63, 57, 100, 32);
		contentPane.add(lblLastName);
		
		lname = new JTextField();
		lname.setBounds(174, 61, 176, 28);
		contentPane.add(lname);
		lname.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 17));
		lblUsername.setBounds(63, 88, 100, 32);
		contentPane.add(lblUsername);
		
		username = new JTextField();
		username.setBounds(174, 92, 176, 27);
		contentPane.add(username);
		username.setColumns(10);
		
		
		
		
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				try {
					   
					Connection con=DB.getConnectionDb();
					System.out.println(con);
						LoginForm lf=new LoginForm();
							lf.setFname(fname.getText());
							lf.setLname(lname.getText());
							lf.setUsername(username.getText());
							lf.setPassword(password.getText());
							String fname=lf.getFname();
							String lname=lf.getLname();
							String username=lf.getUsername();
							String password=lf.getPassword();
				    	String sql="INSERT INTO form(First_Name,Last_Name,Username,Password)values('"+fname+"','"+lname+"','"+username+"','"+password+"')";
				    	Statement stm=con.createStatement();
				        stm.execute(sql);
				        con.close();
				        System.out.println("added success");
				        dispose();
				        new LForm().setVisible(true);
				        dispose();
				    }catch(Exception e2) {
				    	System.out.println("exception="+e2.getMessage());
				    }
					}
		});
		btnSignUp.setFont(new Font("Dialog", Font.BOLD, 17));
		btnSignUp.setBounds(150, 160, 129, 35);
		contentPane.add(btnSignUp);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPassword.setBounds(63, 121, 100, 27);
		contentPane.add(lblPassword);
		
		password = new JPasswordField();
		password.setBounds(174, 121, 176, 27);
		contentPane.add(password);
		
		JMenuItem mntmBack = new JMenuItem("Back");
		mntmBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mntmBack.setFont(new Font("Dialog", Font.BOLD, 15));
		mntmBack.setBounds(0, 0, 129, 19);
		contentPane.add(mntmBack);
	}
	
}