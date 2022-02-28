package edit_0224;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage {

	private JFrame frame;
	private JTextField idField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login Page");
		frame.setSize(700, 780);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// 로그인 화면 //

		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(Color.LIGHT_GRAY);
		loginPanel.setBounds(0, 0, 684, 741);
		frame.getContentPane().add(loginPanel);
		loginPanel.setLayout(null);

		JLabel mainLabel = new JLabel("KIOSK & ADMIN PAGE");
		mainLabel.setBackground(Color.LIGHT_GRAY);
		mainLabel.setFont(new Font("Verdana", Font.PLAIN, 30));
		mainLabel.setBounds(170, 200, 345, 50);
		loginPanel.add(mainLabel);

		JLabel idLabel = new JLabel("I  D : ");
		idLabel.setVerticalAlignment(SwingConstants.TOP);
		idLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		idLabel.setBounds(330, 400, 60, 30);
		loginPanel.add(idLabel);

		JLabel pwLabel = new JLabel("P W : ");
		pwLabel.setVerticalAlignment(SwingConstants.TOP);
		pwLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		pwLabel.setBounds(330, 445, 60, 30);
		loginPanel.add(pwLabel);

		idField = new JTextField(15);
		idField.setFont(new Font("Verdana", Font.PLAIN, 15));
		idField.setBounds(400, 400, 200, 27);
		loginPanel.add(idField);
		idField.setColumns(10);

		passwordField = new JPasswordField(15);
		passwordField.setFont(new Font("Verdana", Font.PLAIN, 15));
		passwordField.setBounds(400, 445, 200, 27);
		loginPanel.add(passwordField);

		JButton loginBtn = new JButton("L O G I N");
		loginBtn.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 20));
		loginBtn.setBounds(470, 500, 130, 35);
		loginPanel.add(loginBtn);

		// 로그인 후, 키오스크 및 관리자 페이지 선택 패널 //

		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 684, 741);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);

		JLabel introLabel = new JLabel("안녕하세요! 사용 하실 버튼을 눌러주세요.");
		introLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 22));
		introLabel.setBounds(0, 228, 684, 50);
		introLabel.setHorizontalAlignment(JLabel.CENTER); 		// 라벨 내의 텍스트 가운데 정렬 기능
		mainPanel.add(introLabel);
		mainPanel.setVisible(false);

		JButton kioskBtn = new JButton("키오스크");
		kioskBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		kioskBtn.setBounds(80, 418, 200, 100);
		mainPanel.add(kioskBtn);

		JButton adminBtn = new JButton("관리자페이지");
		adminBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		adminBtn.setBounds(414, 418, 200, 100);
		mainPanel.add(adminBtn);

		// 로그인 후 introPanel로 이동 // 

		loginBtn.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String id = "admin";
				String pw = "1234";

				if (id.equals(idField.getText()) && pw.equals(passwordField.getText())) {
					JOptionPane.showMessageDialog(null, "로그인에 성공했습니다!");
					loginPanel.setVisible(false);
					mainPanel.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 확인하세요!");
				}

			}
		});
		
		// 키오스크 페이지 & 관리자 페이지 이동 //
		
		//		kioskBtn.addActionListener(new ActionListener() {
		//
		//			@Override
		//			public void actionPerformed(ActionEvent e) {
		//				키오스크 완성 되면 페이지 이동 설정 예정
		//			}
		//			
		//		});
		
		
		adminBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				OrderPage order = new OrderPage();
				order.setVisible(true);

				
			}
			
		});

	}
}
