
//키오스크 메인 클래스
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class KioskMain {

	private JFrame frmKiosk;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	private JTextField textField;
	private JTextField MenuNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KioskMain window = new KioskMain();
					window.frmKiosk.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JTable getTable() {
		return table;
	}

	int N;
	int MNum = 0;
	int removeRowNum = -1;
	String[] MenuName = { "부대찌개", "닭도리탕", "김치볶음밥", "밀푀유나베", "버섯전골", "감자탕", "오징어볶음", "해물탕", "크림파스타", "비닐봉투" };
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_12;
	private JTable table;

	/**
	 * Create the application.
	 */
	public KioskMain() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKiosk = new JFrame();
		frmKiosk.setBackground(Color.WHITE);
		frmKiosk.getContentPane().setBackground(new Color(204, 204, 255));
		frmKiosk.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\kimso\\Desktop\\eclipse\\imege\\imege.png"));
		frmKiosk.setTitle("Kiosk");
		frmKiosk.setBounds(100, 100, 700, 728);
		frmKiosk.setLocationRelativeTo(null);
		frmKiosk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKiosk.getContentPane().setLayout(null);

		JPanel TitlePage = new JPanel();
		TitlePage.setBackground(Color.WHITE);
		TitlePage.setBorder(new LineBorder(new Color(0, 0, 0)));
		TitlePage.setBounds(12, 10, 662, 72);
		frmKiosk.getContentPane().add(TitlePage);
		TitlePage.setLayout(null);

		JButton btnNewButton = new JButton("Main");
		btnNewButton.setFont(new Font("Gulim", Font.PLAIN, 12));
		btnNewButton.setIcon(null);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(559, 24, 91, 23);
		TitlePage.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("\uBC00\uD0A4\uD2B8 \uC790\uB3D9 \uD310\uB9E4\uAE30");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 43));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(144, 7, 373, 52);
		TitlePage.add(lblNewLabel);

		JPanel MenuPage = new JPanel();
		MenuPage.setBackground(Color.WHITE);
		MenuPage.setBorder(new LineBorder(new Color(0, 0, 0)));
		MenuPage.setBounds(12, 92, 662, 282);
		frmKiosk.getContentPane().add(MenuPage);
		MenuPage.setLayout(null);

		JButton MenuPageLeft = new JButton("");
		MenuPageLeft.setFont(new Font("Gulim", Font.PLAIN, 12));
		MenuPageLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		MenuPageLeft.setBorderPainted(false);
		MenuPageLeft.setForeground(Color.WHITE);
		MenuPageLeft.setBackground(Color.WHITE);
		MenuPageLeft.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\ArrowLeft.png"));
		MenuPageLeft.setBounds(12, 109, 63, 63);
		MenuPage.add(MenuPageLeft);

		JButton Menu2Btn = new JButton(" ");
		Menu2Btn.setFont(new Font("Gulim", Font.PLAIN, 12));
		Menu2Btn.setBorderPainted(false);
		Menu2Btn.setBackground(Color.WHITE);

		JButton Menu1Btn = new JButton(" ");
		Menu1Btn.setFont(new Font("Gulim", Font.PLAIN, 12));
		Menu1Btn.setBorderPainted(false);
		Menu1Btn.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\MealKitIcon.png"));
		Menu1Btn.setIconTextGap(-115);
		Menu1Btn.setBackground(Color.WHITE);
		Menu1Btn.setBounds(121, 21, 91, 91);
		MenuPage.add(Menu1Btn);
		Menu2Btn.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\MealKitIcon.png"));
		Menu2Btn.setIconTextGap(-115);
		Menu2Btn.setBounds(286, 21, 91, 91);
		MenuPage.add(Menu2Btn);

		JButton Menu3Btn = new JButton(" ");
		Menu3Btn.setFont(new Font("Gulim", Font.PLAIN, 12));
		Menu3Btn.setBorderPainted(false);
		Menu3Btn.setBackground(Color.WHITE);
		Menu3Btn.setIconTextGap(-115);
		Menu3Btn.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\MealKitIcon.png"));
		Menu3Btn.setBounds(450, 21, 91, 91);
		MenuPage.add(Menu3Btn);

		JButton Menu4Btn = new JButton(" ");
		Menu4Btn.setFont(new Font("Gulim", Font.PLAIN, 12));
		Menu4Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		Menu4Btn.setBorderPainted(false);
		Menu4Btn.setBackground(Color.WHITE);
		Menu4Btn.setIconTextGap(-115);
		Menu4Btn.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\MealKitIcon.png"));
		Menu4Btn.setBounds(121, 153, 91, 91);
		MenuPage.add(Menu4Btn);

		JButton Menu5Btn = new JButton(" ");
		Menu5Btn.setFont(new Font("Gulim", Font.PLAIN, 12));
		Menu5Btn.setBorderPainted(false);
		Menu5Btn.setBackground(Color.WHITE);
		Menu5Btn.setIconTextGap(-115);
		Menu5Btn.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\MealKitIcon.png"));
		Menu5Btn.setBounds(286, 153, 91, 91);
		MenuPage.add(Menu5Btn);

		JButton Menu6Btn = new JButton(" ");
		Menu6Btn.setFont(new Font("Gulim", Font.PLAIN, 12));
		Menu6Btn.setBorderPainted(false);
		Menu6Btn.setBackground(Color.WHITE);
		Menu6Btn.setIconTextGap(-115);
		Menu6Btn.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\MealKitIcon.png"));
		Menu6Btn.setBounds(450, 153, 91, 91);
		MenuPage.add(Menu6Btn);

		JButton MenuPageRight = new JButton("");
		MenuPageRight.setFont(new Font("Gulim", Font.PLAIN, 12));

		MenuPageRight.setBorderPainted(false);
		MenuPageRight.setForeground(Color.WHITE);
		MenuPageRight.setBackground(Color.WHITE);
		MenuPageRight.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\ArrowRight.png"));
		MenuPageRight.setBounds(587, 109, 63, 63);
		MenuPage.add(MenuPageRight);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Gulim", Font.PLAIN, 12));
		textField_1.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
		textField_1.setEditable(false);
		textField_1.setText("\uBD80\uB300\uCC0C\uAC1C");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(121, 117, 91, 21);
		MenuPage.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Gulim", Font.PLAIN, 12));
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("\uB2ED\uB3C4\uB9AC\uD0D5");
		textField_2.setColumns(10);
		textField_2.setBounds(286, 117, 91, 21);
		MenuPage.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Gulim", Font.PLAIN, 12));
		textField_3.setEditable(false);
		textField_3.setText("\uAE40\uCE58\uBCF6\uC74C\uBC25");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(450, 117, 91, 21);
		MenuPage.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Gulim", Font.PLAIN, 12));
		textField_4.setEditable(false);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("\uAC10\uC790\uD0D5");
		textField_4.setColumns(10);
		textField_4.setBounds(450, 251, 91, 21);
		MenuPage.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Gulim", Font.PLAIN, 12));
		textField_5.setEditable(false);
		textField_5.setText("\uBC84\uC12F\uC804\uACE8");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(286, 251, 91, 21);
		MenuPage.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Gulim", Font.PLAIN, 12));
		textField_6.setEditable(false);
		textField_6.setText("\uBC00\uD440\uC720\uB098\uBCA0");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(121, 251, 91, 21);
		MenuPage.add(textField_6);

		JPanel MenuPage2 = new JPanel();
		MenuPage2.setLayout(null);
		MenuPage2.setBorder(new LineBorder(new Color(0, 0, 0)));
		MenuPage2.setBackground(Color.WHITE);
		MenuPage2.setBounds(12, 92, 662, 282);
		frmKiosk.getContentPane().add(MenuPage2);

		JButton MenuPageLeft2 = new JButton("");
		MenuPageLeft2.setFont(new Font("Gulim", Font.PLAIN, 12));
		MenuPageLeft2.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\ArrowLeft.png"));
		MenuPageLeft2.setForeground(Color.WHITE);
		MenuPageLeft2.setBorderPainted(false);
		MenuPageLeft2.setBackground(Color.WHITE);
		MenuPageLeft2.setBounds(12, 109, 63, 63);
		MenuPage2.add(MenuPageLeft2);

		JButton Menu7Btn = new JButton(" ");
		Menu7Btn.setFont(new Font("Gulim", Font.PLAIN, 12));
		Menu7Btn.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\MealKitIcon.png"));
		Menu7Btn.setIconTextGap(-115);
		Menu7Btn.setBorderPainted(false);
		Menu7Btn.setBackground(Color.WHITE);
		Menu7Btn.setBounds(121, 21, 91, 91);
		MenuPage2.add(Menu7Btn);

		JButton Menu8Btn = new JButton(" ");
		Menu8Btn.setFont(new Font("Gulim", Font.PLAIN, 12));
		Menu8Btn.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\MealKitIcon.png"));
		Menu8Btn.setIconTextGap(-115);
		Menu8Btn.setBorderPainted(false);
		Menu8Btn.setBackground(Color.WHITE);
		Menu8Btn.setBounds(286, 21, 91, 91);
		MenuPage2.add(Menu8Btn);

		JButton Menu9Btn = new JButton(" ");
		Menu9Btn.setFont(new Font("Gulim", Font.PLAIN, 12));
		Menu9Btn.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\MealKitIcon.png"));
		Menu9Btn.setIconTextGap(-115);
		Menu9Btn.setBorderPainted(false);
		Menu9Btn.setBackground(Color.WHITE);
		Menu9Btn.setBounds(450, 21, 91, 91);
		MenuPage2.add(Menu9Btn);

		JButton Menu10Btn = new JButton(" ");
		Menu10Btn.setFont(new Font("Gulim", Font.PLAIN, 12));
		Menu10Btn.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\MealKitIcon.png"));
		Menu10Btn.setIconTextGap(-115);
		Menu10Btn.setBorderPainted(false);
		Menu10Btn.setBackground(Color.WHITE);
		Menu10Btn.setBounds(121, 153, 91, 91);
		MenuPage2.add(Menu10Btn);

		JButton Menu5Btn_1 = new JButton(" ");
		Menu5Btn_1.setVisible(false);
		Menu5Btn_1.setIconTextGap(-115);
		Menu5Btn_1.setBackground(Color.WHITE);
		Menu5Btn_1.setBounds(286, 153, 91, 91);
		MenuPage2.add(Menu5Btn_1);

		JButton Menu6Btn_1 = new JButton(" ");
		Menu6Btn_1.setVisible(false);
		Menu6Btn_1.setIconTextGap(-115);
		Menu6Btn_1.setBackground(Color.WHITE);
		Menu6Btn_1.setBounds(450, 153, 91, 91);
		MenuPage2.add(Menu6Btn_1);

		JButton MenuPageRight2 = new JButton("");
		MenuPageRight2.setFont(new Font("Gulim", Font.PLAIN, 12));
		MenuPageRight2.setIcon(new ImageIcon("C:\\Users\\ansek\\eclipse\\Pro\\imege\\ArrowRight.png"));
		MenuPageRight2.setForeground(Color.WHITE);
		MenuPageRight2.setBorderPainted(false);
		MenuPageRight2.setBackground(Color.WHITE);
		MenuPageRight2.setBounds(587, 109, 63, 63);
		MenuPage2.add(MenuPageRight2);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Gulim", Font.PLAIN, 12));
		textField_7.setText("\uC624\uC9D5\uC5B4\uBCF6\uC74C");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
		textField_7.setBounds(121, 117, 91, 21);
		MenuPage2.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setFont(new Font("Gulim", Font.PLAIN, 12));
		textField_8.setText("\uD574\uBB3C\uD0D5");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(286, 117, 91, 21);
		MenuPage2.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setFont(new Font("Gulim", Font.PLAIN, 12));
		textField_9.setText("\uD06C\uB9BC\uD30C\uC2A4\uD0C0");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(450, 117, 91, 21);
		MenuPage2.add(textField_9);

		textField_12 = new JTextField();
		textField_12.setFont(new Font("Gulim", Font.PLAIN, 12));
		textField_12.setText("\uBE44\uB2D0\uBD09\uD22C");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(121, 251, 91, 21);
		MenuPage2.add(textField_12);

		JPanel TablePage = new JPanel();
		TablePage.setBackground(Color.WHITE);
		TablePage.setBorder(new LineBorder(new Color(0, 0, 0)));
		TablePage.setBounds(12, 384, 662, 128);
		frmKiosk.getContentPane().add(TablePage);
		TablePage.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("\uC7A5\uBC14\uAD6C\uB2C8");
		lblNewLabel_1.setFont(new Font("Gulim", Font.PLAIN, 12));
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 88, 128);
		TablePage.add(lblNewLabel_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(88, 0, 574, 128);
		TablePage.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "\uD488\uBA85", "\uC218\uB7C9", "\uAC00\uACA9" }));
		scrollPane.setViewportView(table);

		JPanel PayPage = new JPanel();
		PayPage.setBackground(Color.WHITE);
		PayPage.setBorder(new LineBorder(new Color(0, 0, 0)));
		PayPage.setBounds(12, 522, 662, 154);
		frmKiosk.getContentPane().add(PayPage);
		PayPage.setLayout(null);

		JButton MenuPayBtn = new JButton("\uACB0\uC81C\uD558\uAE30");
		MenuPayBtn.setFont(new Font("Dialog", Font.PLAIN, 29));
		MenuPayBtn.setBounds(68, 43, 240, 65);
		PayPage.add(MenuPayBtn);

		JButton MenuCancleBtn = new JButton("\uCDE8\uC18C\uD558\uAE30");
		MenuCancleBtn.setFont(new Font("Dialog", Font.PLAIN, 29));
		MenuCancleBtn.setBounds(354, 43, 240, 65);
		PayPage.add(MenuCancleBtn);
		JPanel MenuNumPage = new JPanel();
		MenuNumPage.setVisible(false);
		MenuNumPage.setBackground(Color.WHITE);
		MenuNumPage.setBounds(12, 92, 662, 282);

		MenuNumPage.setLayout(null);
		frmKiosk.getContentPane().add(MenuNumPage);
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 40));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\"<dynamic>\" 선택하셨습니다!");
		textField.setBounds(12, 10, 638, 84);
		MenuNumPage.add(textField);
		textField.setColumns(10);

		MenuNum = new JTextField();
		MenuNum.setFont(new Font("Dialog", Font.PLAIN, 30));
		MenuNum.setHorizontalAlignment(SwingConstants.CENTER);
		MenuNum.setText(MNum + "\uAC1C");
		MenuNum.setBounds(244, 125, 163, 65);
		MenuNumPage.add(MenuNum);
		MenuNum.setColumns(10);

		JButton MenuMinus = new JButton("-");
		MenuMinus.setFont(new Font("Dialog", Font.PLAIN, 26));
		MenuMinus.setBounds(419, 132, 50, 50);
		MenuNumPage.add(MenuMinus);

		JButton MeunPlus = new JButton("+");
		MeunPlus.setFont(new Font("Dialog", Font.PLAIN, 26));
		MeunPlus.setBounds(182, 132, 50, 50);
		MenuNumPage.add(MeunPlus);

		JButton NumSelect = new JButton("\uACB0\uC815");
		NumSelect.setFont(new Font("Dialog", Font.PLAIN, 30));
		NumSelect.setBounds(244, 209, 163, 50);
		MenuNumPage.add(NumSelect);

		// MenuNumPage Btn Action

		MeunPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MNum < 10) {
					MNum = MNum + 1;
					MenuNum.setText(MNum + "\uAC1C");
				}
			}
		});
		MenuMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MNum > 0) {
					MNum = MNum - 1;
					MenuNum.setText(MNum + "\uAC1C");
				}
			}
		});
		NumSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPage.setVisible(true);
				MenuNumPage.setVisible(false);
				String SMNum = Integer.toString(MNum);
				String SMNumSum = Integer.toString(MNum * 5000);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				Object[] data = new String[] { MenuName[N], SMNum, SMNumSum };
				model.addRow(data);
				removeRowNum++;
				MNum = 0;
				MenuNum.setText(MNum + "\uAC1C");
			}
		});

//PayPAge Btn Action

		MenuPayBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PayPage paypage = new PayPage();
				paypage.setVisible(true);
				frmKiosk.setVisible(false);
			}
		});
		MenuCancleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (removeRowNum != -1) {
					model.removeRow(removeRowNum);
					removeRowNum--;
				}
			}
		});
		

//MenuPage Btn Action
		MenuPageRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPage.setVisible(false);
				MenuPage2.setVisible(true);
			}
		});

		Menu1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				N = 0;
				MenuNumPage.setVisible(true);
				MenuPage.setVisible(false);
				MenuPage2.setVisible(false);
				textField.setText(MenuName[N] + "\uB97C \uC120\uD0DD\uD558\uC168\uC2B5\uB2C8\uB2E4!");
			}
		});
		Menu2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				N = 1;
				MenuNumPage.setVisible(true);
				MenuPage.setVisible(false);
				MenuPage2.setVisible(false);
				textField.setText(MenuName[N] + "\uB97C \uC120\uD0DD\uD558\uC168\uC2B5\uB2C8\uB2E4!");
			}
		});
		Menu3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				N = 2;
				MenuNumPage.setVisible(true);
				MenuPage.setVisible(false);
				MenuPage2.setVisible(false);
				textField.setText(MenuName[N] + "\uB97C \uC120\uD0DD\uD558\uC168\uC2B5\uB2C8\uB2E4!");
			}
		});
		Menu4Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				N = 3;
				MenuNumPage.setVisible(true);
				MenuPage.setVisible(false);
				MenuPage2.setVisible(false);
				textField.setText(MenuName[N] + "\uB97C \uC120\uD0DD\uD558\uC168\uC2B5\uB2C8\uB2E4!");
			}
		});
		Menu5Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				N = 4;
				MenuNumPage.setVisible(true);
				MenuPage.setVisible(false);
				MenuPage2.setVisible(false);
				textField.setText(MenuName[N] + "\uB97C \uC120\uD0DD\uD558\uC168\uC2B5\uB2C8\uB2E4!");
			}
		});
		Menu6Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				N = 5;
				MenuNumPage.setVisible(true);
				MenuPage.setVisible(false);
				MenuPage2.setVisible(false);
				textField.setText(MenuName[N] + "\uB97C \uC120\uD0DD\uD558\uC168\uC2B5\uB2C8\uB2E4!");
			}
		});

		// MenuPage2 Btn Action
		MenuPageLeft2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPage.setVisible(true);
				MenuPage2.setVisible(false);
			}
		});
		
		
		// Main Page Action //
		
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPage login = new LoginPage();
				login.setVisible(true);
				frmKiosk.dispose();
			}
			
		});
	}

	public void setVisible(boolean b) {
		frmKiosk.setVisible(b);

	}

}