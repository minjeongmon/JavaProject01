package test01;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Main Page");
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
		lblNewLabel.setBounds(295, 10, 111, 30);
		panel_1.add(lblNewLabel);

		// id, pw 입력창 //

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 49, 684, 495);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel id = new JLabel("아이디를 입력하세요!");
		JLabel pw = new JLabel("비밀번호를 입력하세요!");


		JButton btnLogin = new JButton("Login");

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

		// 로그인 DB 가져오는 곳 //
		btnLogin.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "admin";
				String pw = "1234";

				if (id.equals(txtId.getText()) && pw.equals(txtPw.getText())) {
					JOptionPane.showMessageDialog(null, "로그인에 성공하였습니다.");
					
					
				} else {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 확인해주세요.");
				}

			}

		});

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 543, 684, 199);
		panel.add(panel_3);
		panel_3.setLayout(null);

		// 키오스크, 관리자페이지 이동 버튼 //

		JButton kiosk_btn = new JButton("키오스크");
		kiosk_btn.setBounds(90, 36, 200, 100);
		panel_3.add(kiosk_btn);

		JButton admin_btn = new JButton("관리자페이지");
		admin_btn.setBounds(400, 36, 200, 100);
		panel_3.add(admin_btn);
		
		// 페이지 이동 //
		

	}
}
