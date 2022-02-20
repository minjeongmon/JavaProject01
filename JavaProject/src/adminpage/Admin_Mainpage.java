package adminpage;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Admin_Mainpage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Mainpage window = new Admin_Mainpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_Mainpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(700, 780);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 684, 780);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 684, 50);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel adminPage = new JLabel("Admin Page");
		adminPage.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 20));
		adminPage.setBounds(268, 10, 120, 30);
		panel_1.add(adminPage);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 50, 684, 600);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnOrder = new JButton("\uC8FC \uBB38 \uD604 \uD669");
		btnOrder.setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		btnOrder.setBounds(30, 225, 200, 150);
		panel_2.add(btnOrder);
		
		JButton btnInven = new JButton("\uC7AC \uACE0 \uD604 \uD669");
		btnInven.setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		btnInven.setBounds(242, 225, 200, 150);
		panel_2.add(btnInven);
		
		JButton btnSales = new JButton("\uB9E4 \uCD9C \uD604 \uD669");
		btnSales.setFont(new Font("³ª´®°íµñ", Font.BOLD, 20));
		btnSales.setBounds(457, 225, 200, 150);
		panel_2.add(btnSales);

	}
}
