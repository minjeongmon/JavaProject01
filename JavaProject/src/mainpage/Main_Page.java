package mainpage;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main_Page {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Page window = new Main_Page();
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
	public Main_Page() {
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

		JLabel lblNewLabel = new JLabel("Main Page");
		lblNewLabel.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 20));
		lblNewLabel.setBounds(295, 10, 111, 30);
		panel_1.add(lblNewLabel);

		// ID, PW 입력하는 패널 //

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 49, 684, 495);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel id = new JLabel("아이디를 입력하세요!");
		JLabel pw = new JLabel("비밀번호를 입력하세요!");
		id.setFont(new Font("나눔고딕", Font.BOLD, 15));
		pw.setFont(new Font("나눔고딕", Font.BOLD, 15));

		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("나눔고딕", Font.BOLD, 15));
		JTextField txtId = new JTextField(10);
		JPasswordField txtPw = new JPasswordField(15); // 비밀번호 자동 암호화

		id.setBounds(180, 150, 150, 30);
		pw.setBounds(180, 230, 150, 30);
		txtId.setBounds(180, 180, 300, 30);
		txtPw.setBounds(180, 260, 300, 30);
		btnLogin.setBounds(260, 320, 150, 50);

		panel_2.add(id);
		panel_2.add(pw);
		panel_2.add(txtId);
		panel_2.add(txtPw);
		panel_2.add(btnLogin);

		// 로그인 DB 자료 넣기 - 현재는 액션 추가만 함 //
		btnLogin.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "admin";
				String pw = "1234";

				if (id.equals(txtId.getText()) && pw.equals(txtPw.getText())) {
					JOptionPane.showMessageDialog(null, "로그인 성공! 하단 메뉴를 선택하세요.");
				} else {
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 확인해주세요.");
				}

			}

		});

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 543, 684, 199);
		panel.add(panel_3);
		panel_3.setLayout(null);

		// 버튼 누르면 키오스크 페이지 이동 하기 //

		JButton kiosk_conn = new JButton("키오스크 페이지");
		kiosk_conn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		kiosk_conn.setBounds(90, 36, 200, 100);
		panel_3.add(kiosk_conn);

		// 버튼 누르면 관리자 페이지로 이동 하기 //
		JButton admin_conn = new JButton("관리자 페이지");
		admin_conn.setFont(new Font("나눔고딕", Font.BOLD, 15));
		admin_conn.setBounds(400, 36, 200, 100);
		panel_3.add(admin_conn);
	}
}
