package edit_0224;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

public class SalesPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesPage window = new SalesPage();
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
	public SalesPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Admin Page - Sales Management");
		frame.setSize(700, 780);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setBounds(0, 0, 684, 741);
		panel.setLayout(null);

		JButton orderBtn = new JButton("주 문 관 리");
		orderBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		JButton goodsBtn = new JButton("상 품 관 리");
		goodsBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		JButton salesBtn = new JButton("매 출 관 리");
		salesBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		JButton mainBtn = new JButton("메 인 화 면");
		mainBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20));

		orderBtn.setBounds(12, 85, 150, 70);
		goodsBtn.setBounds(182, 85, 150, 70);
		salesBtn.setBounds(352, 85, 150, 70);
		mainBtn.setBounds(522, 85, 150, 70);
		panel.add(orderBtn);
		panel.add(goodsBtn);
		panel.add(salesBtn);
		panel.add(mainBtn);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 240, 660, 250);
		panel.add(scrollPane);
		
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"상품번호", "상품명", "상품명", "판매갯수", "개당금액", "총 금액"
			}
		));
		
		JLabel dayLabel = new JLabel("날 짜 : ");
		dayLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		dayLabel.setBounds(145, 188, 55, 15);
		panel.add(dayLabel);
		
		JButton btnNewButton = new JButton("CLICK");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btnNewButton.setBounds(464, 180, 100, 30);
		panel.add(btnNewButton);
		table.getColumnModel().getColumn(0).setMinWidth(30);

		// 버튼 클릭 시 각 페이지로 이동 할 수 있음 //
		// 인트로 페이지를 ㄸㅏ로 나눠야 할까... 뒤로 가기를 모르겠음 // 
		
		orderBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				OrderPage order = new OrderPage();
				order.setVisible(true);
				frame.dispose();

			}

		});

		goodsBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				GoodsPage goods = new GoodsPage();
				goods.setVisible(true);
				frame.dispose();

			}

		});

	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}
}
