package com.java.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Main extends JFrame {
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmNewFile;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSaveFile;
	private JMenuItem mntmSaveAs;
	private JMenuItem mntmRenameFile;
	private JMenuItem mntmDelete;
	private JMenuItem mntmClose;
	private JMenu mnEdit;
	private JMenu mnView;
	private JMenu mnNewMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnEdit());
			menuBar.add(getMnView());
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmNewFile());
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSaveFile());
			mnFile.add(getMntmSaveAs());
			mnFile.add(getMntmRenameFile());
			mnFile.add(getMntmDelete());
			mnFile.add(getMntmClose());
		}
		return mnFile;
	}
	private JMenuItem getMntmNewFile() {
		if (mntmNewFile == null) {
			mntmNewFile = new JMenuItem("New File");
		}
		return mntmNewFile;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSaveFile() {
		if (mntmSaveFile == null) {
			mntmSaveFile = new JMenuItem("Save File");
		}
		return mntmSaveFile;
	}
	private JMenuItem getMntmSaveAs() {
		if (mntmSaveAs == null) {
			mntmSaveAs = new JMenuItem("Save as");
		}
		return mntmSaveAs;
	}
	private JMenuItem getMntmRenameFile() {
		if (mntmRenameFile == null) {
			mntmRenameFile = new JMenuItem("Rename File");
		}
		return mntmRenameFile;
	}
	private JMenuItem getMntmDelete() {
		if (mntmDelete == null) {
			mntmDelete = new JMenuItem("Delete");
		}
		return mntmDelete;
	}
	private JMenuItem getMntmClose() {
		if (mntmClose == null) {
			mntmClose = new JMenuItem("Close");
		}
		return mntmClose;
	}
	private JMenu getMnEdit() {
		if (mnEdit == null) {
			mnEdit = new JMenu("Edit");
		}
		return mnEdit;
	}
	private JMenu getMnView() {
		if (mnView == null) {
			mnView = new JMenu("View");
		}
		return mnView;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("search");
		}
		return mnNewMenu;
	}
}