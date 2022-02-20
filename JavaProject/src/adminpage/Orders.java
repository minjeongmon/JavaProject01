package adminpage;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Orders {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Orders window = new Orders();
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
	public Orders() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("ADMIN PAGE - ORDER");
		frame.setSize(700, 780);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 684, 741);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		// 상위 버튼 버튼 누를 때 마다 페이지 이동 //

		JButton btn_Order = new JButton("주 문 관 리");
		btn_Order.setBounds(12, 10, 200, 80);
		panel.add(btn_Order);

		JButton btn_Inven = new JButton("재 고 관 리");
		btn_Inven.setBounds(247, 10, 200, 800);
		panel.add(btn_Inven);

		JButton btn_Sales = new JButton("매 출 관 리");
		btn_Sales.setBounds(472, 10, 200, 100);
		panel.add(btn_Sales);

	}

}
