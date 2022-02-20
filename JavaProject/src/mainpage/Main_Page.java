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
		lblNewLabel.setFont(new Font("������� ExtraBold", Font.BOLD, 20));
		lblNewLabel.setBounds(295, 10, 111, 30);
		panel_1.add(lblNewLabel);

		// ID, PW �Է��ϴ� �г� //

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 49, 684, 495);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel id = new JLabel("���̵� �Է��ϼ���!");
		JLabel pw = new JLabel("��й�ȣ�� �Է��ϼ���!");
		id.setFont(new Font("�������", Font.BOLD, 15));
		pw.setFont(new Font("�������", Font.BOLD, 15));

		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("�������", Font.BOLD, 15));
		JTextField txtId = new JTextField(10);
		JPasswordField txtPw = new JPasswordField(15); // ��й�ȣ �ڵ� ��ȣȭ

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

		// �α��� DB �ڷ� �ֱ� - ����� �׼� �߰��� �� //
		btnLogin.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "admin";
				String pw = "1234";

				if (id.equals(txtId.getText()) && pw.equals(txtPw.getText())) {
					JOptionPane.showMessageDialog(null, "�α��� ����! �ϴ� �޴��� �����ϼ���.");
				} else {
					JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� Ȯ�����ּ���.");
				}

			}

		});

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 543, 684, 199);
		panel.add(panel_3);
		panel_3.setLayout(null);

		// ��ư ������ Ű����ũ ������ �̵� �ϱ� //

		JButton kiosk_conn = new JButton("Ű����ũ ������");
		kiosk_conn.setFont(new Font("���� ���", Font.BOLD, 15));
		kiosk_conn.setBounds(90, 36, 200, 100);
		panel_3.add(kiosk_conn);

		// ��ư ������ ������ �������� �̵� �ϱ� //
		JButton admin_conn = new JButton("������ ������");
		admin_conn.setFont(new Font("�������", Font.BOLD, 15));
		admin_conn.setBounds(400, 36, 200, 100);
		panel_3.add(admin_conn);
	}
}
