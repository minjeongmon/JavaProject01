package test01;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrame window = new AdminFrame();
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
	public AdminFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Admin Page");

		frame.setSize(700, 780);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setBounds(0, 0, 684, 741);
		panel.setLayout(null);
		
		// 버튼 클릭 시 각 페이지로 이동 //

		JButton btn_Order = new JButton("주 문 관 리");
		JButton btn_Inven = new JButton("상 품 관 리");
		JButton btn_Sales = new JButton("매 출 관 리");

		btn_Order.setBounds(20, 330, 200, 80);
		btn_Inven.setBounds(240, 330, 200, 80);
		btn_Sales.setBounds(460, 330, 200, 80);

		panel.add(btn_Order);
		panel.add(btn_Inven);
		panel.add(btn_Sales);

		btn_Order.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				OrdersFrame order = new OrdersFrame();
				order.setVisible(true);
				frame.dispose();

			}

		});

		btn_Inven.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InvenFrame inven = new InvenFrame();
				inven.setVisible(true);
				frame.dispose();

			}

		});

		btn_Sales.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SalesFrame sale = new SalesFrame();
				sale.setVisible(true);
				frame.dispose();

			}

		});

	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}
}
