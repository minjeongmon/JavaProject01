package edit_0224;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminPage {

	private JFrame frame;
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage window = new AdminPage();
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
	public AdminPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Admin Page");

		frame.setSize(700, 780);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel adminPanel = new JPanel();
		frame.getContentPane().add(adminPanel);
		adminPanel.setBounds(0, 0, 684, 741);
		adminPanel.setLayout(null);

		JButton orderBtn = new JButton("주 문 관 리");
		orderBtn.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		JButton goodsBtn = new JButton("상 품 관 리");
		goodsBtn.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		JButton salesBtn = new JButton("매 출 관 리");
		salesBtn.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		JButton mainBtn = new JButton("메 인 화 면");
		mainBtn.setFont(new Font("맑은 고딕", Font.BOLD, 18));

		orderBtn.setBounds(12, 20, 150, 70);
		goodsBtn.setBounds(182, 20, 150, 70);
		salesBtn.setBounds(352, 20, 150, 70);
		mainBtn.setBounds(522, 20, 150, 70);


		adminPanel.add(orderBtn);
		adminPanel.add(goodsBtn);
		adminPanel.add(salesBtn);
		adminPanel.add(mainBtn);


		// 버튼 클릭 시 각 페이지로 이동 //
		orderBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}

		});

		goodsBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}

		});

		salesBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}

		});

	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}
}
