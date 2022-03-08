

//결제 페이지 클래스
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PayPage {

	private JFrame PayPage;

	public JFrame getPayPage() {
		return PayPage;
	}

	private JTextField PaySumOut;
	private JTextField textField_1;
	private JTextField CouponCodeInput;
	private JButton CouponCodeBtn;
	private JTextField PaySysTextArea;
	private JPanel PayFinalCheck;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayPage window = new PayPage();
					window.PayPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PayPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PayPage = new JFrame();
		PayPage.getContentPane().setBackground(Color.WHITE);
		PayPage.setBounds(100, 100, 500, 520);
		PayPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PayPage.getContentPane().setLayout(null);

		PayFinalCheck = new JPanel();
		PayFinalCheck.setVisible(false);
		PayFinalCheck.setBounds(85, 387, 314, 65);
		PayPage.getContentPane().add(PayFinalCheck);
		PayFinalCheck.setLayout(null);

		btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setFont(new Font("Gulim", Font.PLAIN, 12));
		btnNewButton.setBounds(52, 38, 91, 23);
		PayFinalCheck.add(btnNewButton);

		btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.setFont(new Font("Gulim", Font.PLAIN, 12));

		btnNewButton_1.setBounds(174, 38, 91, 23);
		PayFinalCheck.add(btnNewButton_1);

		textField = new JTextField();
		textField.setFont(new Font("Gulim", Font.PLAIN, 12));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\uACB0\uC81C\uD558\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?");
		textField.setBounds(52, 10, 211, 21);
		PayFinalCheck.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBorder(null);
		textField_1.setCaretColor(SystemColor.control);
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setText("\uCFE0\uD3F0\uCF54\uB4DC :");
		textField_1.setBackground(SystemColor.control);
		textField_1.setBounds(85, 287, 96, 39);
		PayPage.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 462, 153);
		PayPage.getContentPane().add(scrollPane);
		KioskMain KM = new KioskMain();
		scrollPane.setViewportView(KM.getTable());

		PaySumOut = new JTextField();
		PaySumOut.setFont(new Font("Dialog", Font.PLAIN, 30));
		PaySumOut.setHorizontalAlignment(SwingConstants.CENTER);
		PaySumOut.setText("\uD569\uACC4 : ");
		PaySumOut.setBounds(85, 186, 314, 80);
		PayPage.getContentPane().add(PaySumOut);
		PaySumOut.setColumns(10);

		CouponCodeInput = new JTextField();
		CouponCodeInput.setHorizontalAlignment(SwingConstants.LEFT);
		CouponCodeInput.setFont(new Font("Dialog", Font.PLAIN, 18));
		CouponCodeInput.setColumns(10);
		CouponCodeInput.setCaretColor(SystemColor.menu);
		CouponCodeInput.setBorder(null);
		CouponCodeInput.setBackground(SystemColor.menu);
		CouponCodeInput.setBounds(181, 287, 218, 39);
		PayPage.getContentPane().add(CouponCodeInput);

		CouponCodeBtn = new JButton("\uD655\uC778");
		CouponCodeBtn.setFont(new Font("Gulim", Font.PLAIN, 12));

		CouponCodeBtn.setBounds(181, 344, 125, 33);
		PayPage.getContentPane().add(CouponCodeBtn);

		PaySysTextArea = new JTextField();
		PaySysTextArea.setEditable(false);
		PaySysTextArea.setFont(new Font("굴림", Font.PLAIN, 20));
		PaySysTextArea.setHorizontalAlignment(SwingConstants.CENTER);
		PaySysTextArea.setText("  ");
		PaySysTextArea.setBackground(SystemColor.control);
		PaySysTextArea.setBounds(85, 387, 314, 65);
		PayPage.getContentPane().add(PaySysTextArea);
		PaySysTextArea.setColumns(10);

		CouponCodeBtn.addActionListener(new ActionListener() {
			Coupon cup = new Coupon();

			public void actionPerformed(ActionEvent e) {
				System.out.println(CouponCodeInput.getText());
				System.out.println(cup.getCouponCode());

				if (CouponCodeInput.getText().equals(cup.getCouponCode())) {

					PayFinalCheck.setVisible(true);
					PaySysTextArea.setVisible(false);
				} else {
					PaySysTextArea.setText("쿠폰번호가 잘못되었습니다.");
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PayFinalCheck.setVisible(false);
				PaySysTextArea.setVisible(true);
				PaySysTextArea.setText("결제에 성공했습니다!");
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PayFinalCheck.setVisible(false);
				PaySysTextArea.setVisible(true);
				PaySysTextArea.setText("결제를 취소했습니다.");
			}
		});

	}

	public void setVisible(boolean b) {
		PayPage.setVisible(b);
	}
}
