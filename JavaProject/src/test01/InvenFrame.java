package test01;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InvenFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InvenFrame window = new InvenFrame();
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
	public InvenFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Inventory Page");

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

		JButton btn_Order = new JButton("�� �� �� ��");
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

		JButton btn_Inven = new JButton("�� �� �� ��");
		btn_Inven.setBounds(247, 10, 200, 80);
		panel.add(btn_Inven);

		JButton btn_Sales = new JButton("�� �� �� ��");
		btn_Sales.setBounds(472, 10, 200, 80);
		panel.add(btn_Sales);

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
