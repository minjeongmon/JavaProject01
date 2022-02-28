package test01;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SalesFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesFrame window = new SalesFrame();
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
	public SalesFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Sales Page");

		frame.setSize(700, 780);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 684, 741);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		// 버튼 클릭 시 각 페이지로 이동 //

		JButton btn_Order = new JButton("주 문 관 리");
		btn_Order.setBounds(12, 10, 200, 80);
		panel.add(btn_Order);
		btn_Order.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				OrdersFrame order = new OrdersFrame();
				order.setVisible(true);
				frame.dispose();

			}

		});

		JButton btn_Inven = new JButton("재 고 관 리");
		btn_Inven.setBounds(247, 10, 200, 80);
		panel.add(btn_Inven);
		btn_Inven.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InvenFrame inven = new InvenFrame();
				inven.setVisible(true);
				frame.dispose();

			}

		});

		JButton btn_Sales = new JButton("매 출 관 리");
		btn_Sales.setBounds(472, 10, 200, 80);
		panel.add(btn_Sales);

	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

}
