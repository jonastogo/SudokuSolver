import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Gui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JPanel contentPane;
	public static JTextField TF1_1;
	public static JTextField TF1_2;
	public static JTextField TF1_3;
	public static JTextField TF2_1;
	public static JTextField TF2_2;
	public static JTextField TF2_3;
	public static JTextField TF3_1;
	public static JTextField TF3_2;
	public static JTextField TF3_3;
	public static JTextField TF1_4;
	public static JTextField TF1_5;
	public static JTextField TF1_6;
	public static JTextField TF2_4;
	public static JTextField TF2_5;
	public static JTextField TF2_6;
	public static JTextField TF3_4;
	public static JTextField TF3_5;
	public static JTextField TF3_6;
	public static JTextField TF1_7;
	public static JTextField TF1_8;
	public static JTextField TF1_9;
	public static JTextField TF2_7;
	public static JTextField TF2_8;
	public static JTextField TF2_9;
	public static JTextField TF3_7;
	public static JTextField TF3_8;
	public static JTextField TF3_9;
	public static JTextField TF4_1;
	public static JTextField TF4_2;
	public static JTextField TF4_3;
	public static JTextField TF5_1;
	public static JTextField TF5_2;
	public static JTextField TF5_3;
	public static JTextField TF6_1;
	public static JTextField TF6_2;
	public static JTextField TF6_3;
	public static JTextField TF4_4;
	public static JTextField TF4_5;
	public static JTextField TF4_6;
	public static JTextField TF5_4;
	public static JTextField TF5_5;
	public static JTextField TF5_6;
	public static JTextField TF6_4;
	public static JTextField TF6_5;
	public static JTextField TF6_6;
	public static JTextField TF4_7;
	public static JTextField TF4_8;
	public static JTextField TF4_9;
	public static JTextField TF5_7;
	public static JTextField TF5_8;
	public static JTextField TF5_9;
	public static JTextField TF6_7;
	public static JTextField TF6_8;
	public static JTextField TF6_9;
	public static JTextField TF7_1;
	public static JTextField TF7_2;
	public static JTextField TF7_3;
	public static JTextField TF7_4;
	public static JTextField TF7_5;
	public static JTextField TF7_6;
	public static JTextField TF7_7;
	public static JTextField TF7_8;
	public static JTextField TF7_9;
	public static JTextField TF8_1;
	public static JTextField TF8_2;
	public static JTextField TF8_3;
	public static JTextField TF8_4;
	public static JTextField TF8_5;
	public static JTextField TF8_6;
	public static JTextField TF8_7;
	public static JTextField TF8_8;
	public static JTextField TF8_9;
	public static JTextField TF9_1;
	public static JTextField TF9_2;
	public static JTextField TF9_3;
	public static JTextField TF9_4;
	public static JTextField TF9_5;
	public static JTextField TF9_6;
	public static JTextField TF9_7;
	public static JTextField TF9_8;
	public static JTextField TF9_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui() {
		setTitle("Sudoku-Solver");
		ValueArray.getInstance();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		TF1_1 = new JTextField();
		TF1_1.setText("0");
		TF1_1.setColumns(10);

		TF1_2 = new JTextField();
		TF1_2.setText("6");
		TF1_2.setColumns(10);

		TF1_3 = new JTextField();
		TF1_3.setText("4");
		TF1_3.setColumns(10);

		TF2_1 = new JTextField();
		TF2_1.setText("1");
		TF2_1.setColumns(10);

		TF2_2 = new JTextField();
		TF2_2.setText("0");
		TF2_2.setColumns(10);

		TF2_3 = new JTextField();
		TF2_3.setText("0");
		TF2_3.setColumns(10);

		TF3_1 = new JTextField();
		TF3_1.setText("2");
		TF3_1.setColumns(10);

		TF3_2 = new JTextField();
		TF3_2.setText("0");
		TF3_2.setColumns(10);

		TF3_3 = new JTextField();
		TF3_3.setText("0");
		TF3_3.setColumns(10);

		TF1_4 = new JTextField();
		TF1_4.setText("0");
		TF1_4.setColumns(10);

		TF1_5 = new JTextField();
		TF1_5.setText("0");
		TF1_5.setColumns(10);

		TF1_6 = new JTextField();
		TF1_6.setText("0");
		TF1_6.setColumns(10);

		TF2_4 = new JTextField();
		TF2_4.setText("2");
		TF2_4.setColumns(10);

		TF2_5 = new JTextField();
		TF2_5.setText("0");
		TF2_5.setColumns(10);

		TF2_6 = new JTextField();
		TF2_6.setText("7");
		TF2_6.setColumns(10);

		TF3_4 = new JTextField();
		TF3_4.setText("0");
		TF3_4.setColumns(10);

		TF3_5 = new JTextField();
		TF3_5.setText("4");
		TF3_5.setColumns(10);

		TF3_6 = new JTextField();
		TF3_6.setText("0");
		TF3_6.setColumns(10);

		TF1_7 = new JTextField();
		TF1_7.setText("7");
		TF1_7.setColumns(10);

		TF1_8 = new JTextField();
		TF1_8.setText("5");
		TF1_8.setColumns(10);

		TF1_9 = new JTextField();
		TF1_9.setText("0");
		TF1_9.setColumns(10);

		TF2_7 = new JTextField();
		TF2_7.setText("0");
		TF2_7.setColumns(10);

		TF2_8 = new JTextField();
		TF2_8.setText("0");
		TF2_8.setColumns(10);

		TF2_9 = new JTextField();
		TF2_9.setText("3");
		TF2_9.setColumns(10);

		TF3_7 = new JTextField();
		TF3_7.setText("0");
		TF3_7.setColumns(10);

		TF3_8 = new JTextField();
		TF3_8.setText("0");
		TF3_8.setColumns(10);

		TF3_9 = new JTextField();
		TF3_9.setText("8");
		TF3_9.setColumns(10);

		TF4_1 = new JTextField();
		TF4_1.setText("0");
		TF4_1.setColumns(10);

		TF4_2 = new JTextField();
		TF4_2.setText("5");
		TF4_2.setColumns(10);

		TF4_3 = new JTextField();
		TF4_3.setText("0");
		TF4_3.setColumns(10);

		TF5_1 = new JTextField();
		TF5_1.setText("0");
		TF5_1.setColumns(10);

		TF5_2 = new JTextField();
		TF5_2.setText("0");
		TF5_2.setColumns(10);

		TF5_3 = new JTextField();
		TF5_3.setText("2");
		TF5_3.setColumns(10);

		TF6_1 = new JTextField();
		TF6_1.setText("0");
		TF6_1.setColumns(10);

		TF6_2 = new JTextField();
		TF6_2.setText("1");
		TF6_2.setColumns(10);

		TF6_3 = new JTextField();
		TF6_3.setText("0");
		TF6_3.setColumns(10);

		TF4_4 = new JTextField();
		TF4_4.setText("0");
		TF4_4.setColumns(10);

		TF4_5 = new JTextField();
		TF4_5.setText("9");
		TF4_5.setColumns(10);

		TF4_6 = new JTextField();
		TF4_6.setText("0");
		TF4_6.setColumns(10);

		TF5_4 = new JTextField();
		TF5_4.setText("1");
		TF5_4.setColumns(10);

		TF5_5 = new JTextField();
		TF5_5.setText("0");
		TF5_5.setColumns(10);

		TF5_6 = new JTextField();
		TF5_6.setText("8");
		TF5_6.setColumns(10);

		TF6_4 = new JTextField();
		TF6_4.setText("0");
		TF6_4.setColumns(10);

		TF6_5 = new JTextField();
		TF6_5.setText("7");
		TF6_5.setColumns(10);

		TF6_6 = new JTextField();
		TF6_6.setText("0");
		TF6_6.setColumns(10);

		TF4_7 = new JTextField();
		TF4_7.setText("0");
		TF4_7.setColumns(10);

		TF4_8 = new JTextField();
		TF4_8.setText("4");
		TF4_8.setColumns(10);

		TF4_9 = new JTextField();
		TF4_9.setText("0");
		TF4_9.setColumns(10);

		TF5_7 = new JTextField();
		TF5_7.setText("9");
		TF5_7.setColumns(10);

		TF5_8 = new JTextField();
		TF5_8.setText("0");
		TF5_8.setColumns(10);

		TF5_9 = new JTextField();
		TF5_9.setText("0");
		TF5_9.setColumns(10);

		TF6_7 = new JTextField();
		TF6_7.setText("0");
		TF6_7.setColumns(10);

		TF6_8 = new JTextField();
		TF6_8.setText("8");
		TF6_8.setColumns(10);

		TF6_9 = new JTextField();
		TF6_9.setText("0");
		TF6_9.setColumns(10);

		TF7_1 = new JTextField();
		TF7_1.setText("5");
		TF7_1.setColumns(10);

		TF7_2 = new JTextField();
		TF7_2.setText("0");
		TF7_2.setColumns(10);

		TF7_3 = new JTextField();
		TF7_3.setText("0");
		TF7_3.setColumns(10);

		TF7_4 = new JTextField();
		TF7_4.setText("0");
		TF7_4.setColumns(10);

		TF7_5 = new JTextField();
		TF7_5.setText("8");
		TF7_5.setColumns(10);

		TF7_6 = new JTextField();
		TF7_6.setText("0");
		TF7_6.setColumns(10);

		TF7_7 = new JTextField();
		TF7_7.setText("0");
		TF7_7.setColumns(10);

		TF7_8 = new JTextField();
		TF7_8.setText("0");
		TF7_8.setColumns(10);

		TF7_9 = new JTextField();
		TF7_9.setText("9");
		TF7_9.setColumns(10);

		TF8_1 = new JTextField();
		TF8_1.setText("7");
		TF8_1.setColumns(10);

		TF8_2 = new JTextField();
		TF8_2.setText("0");
		TF8_2.setColumns(10);

		TF8_3 = new JTextField();
		TF8_3.setText("0");
		TF8_3.setColumns(10);

		TF8_4 = new JTextField();
		TF8_4.setText("5");
		TF8_4.setColumns(10);

		TF8_5 = new JTextField();
		TF8_5.setText("0");
		TF8_5.setColumns(10);

		TF8_6 = new JTextField();
		TF8_6.setText("1");
		TF8_6.setColumns(10);

		TF8_7 = new JTextField();
		TF8_7.setText("0");
		TF8_7.setColumns(10);

		TF8_8 = new JTextField();
		TF8_8.setText("0");
		TF8_8.setColumns(10);

		TF8_9 = new JTextField();
		TF8_9.setText("4");
		TF8_9.setColumns(10);

		TF9_1 = new JTextField();
		TF9_1.setText("0");
		TF9_1.setColumns(10);

		TF9_2 = new JTextField();
		TF9_2.setText("4");
		TF9_2.setColumns(10);

		TF9_3 = new JTextField();
		TF9_3.setText("8");
		TF9_3.setColumns(10);

		TF9_4 = new JTextField();
		TF9_4.setText("0");
		TF9_4.setColumns(10);

		TF9_5 = new JTextField();
		TF9_5.setText("0");
		TF9_5.setColumns(10);

		TF9_6 = new JTextField();
		TF9_6.setText("0");
		TF9_6.setColumns(10);

		TF9_7 = new JTextField();
		TF9_7.setText("5");
		TF9_7.setColumns(10);

		TF9_8 = new JTextField();
		TF9_8.setText("6");
		TF9_8.setColumns(10);

		TF9_9 = new JTextField();
		TF9_9.setText("0");
		TF9_9.setColumns(10);

		JButton Lösen = new JButton("L\u00F6sen");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addComponent(
																		TF1_1,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF2_1,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF3_1,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.UNRELATED)
																.addComponent(
																		TF4_1,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF5_1,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF6_1,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.UNRELATED)
																.addComponent(
																		TF7_1,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF8_1,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF9_1,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addComponent(
																		TF1_2,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF2_2,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF3_2,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.UNRELATED)
																.addComponent(
																		TF4_2,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF5_2,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF6_2,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.UNRELATED)
																.addComponent(
																		TF7_2,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF8_2,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF9_2,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.TRAILING,
																				false)
																				.addComponent(
																						TF1_4,
																						Alignment.LEADING,
																						0,
																						0,
																						Short.MAX_VALUE)
																				.addComponent(
																						TF1_3,
																						Alignment.LEADING,
																						GroupLayout.DEFAULT_SIZE,
																						24,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.LEADING)
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addComponent(
																										TF2_3,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF3_3,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.UNRELATED)
																								.addComponent(
																										TF4_3,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF5_3,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF6_3,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.UNRELATED)
																								.addComponent(
																										TF7_3,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF8_3,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF9_3,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addComponent(
																										TF2_4,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF3_4,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.UNRELATED)
																								.addComponent(
																										TF4_4,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF5_4,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF6_4,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.UNRELATED)
																								.addComponent(
																										TF7_4,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF8_4,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF9_4,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE))))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addComponent(
																		TF1_5,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF2_5,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF3_5,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.UNRELATED)
																.addComponent(
																		TF4_5,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF5_5,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF6_5,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.UNRELATED)
																.addComponent(
																		TF7_5,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF8_5,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF9_5,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.TRAILING,
																				false)
																				.addComponent(
																						TF1_7,
																						Alignment.LEADING,
																						0,
																						0,
																						Short.MAX_VALUE)
																				.addComponent(
																						TF1_6,
																						Alignment.LEADING,
																						GroupLayout.DEFAULT_SIZE,
																						24,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.LEADING)
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addComponent(
																										TF2_6,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF3_6,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.UNRELATED)
																								.addComponent(
																										TF4_6,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF5_6,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF6_6,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.UNRELATED)
																								.addComponent(
																										TF7_6,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF8_6,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF9_6,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addComponent(
																										TF2_7,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF3_7,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.UNRELATED)
																								.addComponent(
																										TF4_7,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF5_7,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF6_7,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.UNRELATED)
																								.addComponent(
																										TF7_7,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF8_7,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF9_7,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE))))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addComponent(
																		TF1_8,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF2_8,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF3_8,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.UNRELATED)
																.addComponent(
																		TF4_8,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF5_8,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF6_8,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.UNRELATED)
																.addComponent(
																		TF7_8,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF8_8,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF9_8,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addComponent(
																		TF1_9,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF2_9,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF3_9,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.UNRELATED)
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.TRAILING,
																				false)
																				.addComponent(
																						Lösen,
																						Alignment.LEADING,
																						0,
																						0,
																						Short.MAX_VALUE)
																				.addGroup(
																						Alignment.LEADING,
																						gl_panel.createSequentialGroup()
																								.addComponent(
																										TF4_9,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF5_9,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										TF6_9,
																										GroupLayout.PREFERRED_SIZE,
																										24,
																										GroupLayout.PREFERRED_SIZE)))
																.addPreferredGap(
																		ComponentPlacement.UNRELATED)
																.addComponent(
																		TF7_9,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF8_9,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED)
																.addComponent(
																		TF9_9,
																		GroupLayout.PREFERRED_SIZE,
																		24,
																		GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(32, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(
														TF1_1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF2_1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF3_1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF4_1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF5_1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF6_1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF7_1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF8_1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF9_1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(
														TF1_2,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF2_2,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF3_2,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF4_2,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF5_2,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF6_2,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF7_2,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF8_2,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF9_2,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(
														TF1_3,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF2_3,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF3_3,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF4_3,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF5_3,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF6_3,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF7_3,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF8_3,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF9_3,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(
														TF1_4,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF2_4,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF3_4,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF4_4,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF5_4,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF6_4,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF7_4,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF8_4,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF9_4,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(
														TF1_5,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF2_5,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF3_5,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF4_5,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF5_5,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF6_5,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF7_5,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF8_5,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF9_5,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(
														TF1_6,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF2_6,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF3_6,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF4_6,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF5_6,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF6_6,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF7_6,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF8_6,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF9_6,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(
														TF1_7,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF2_7,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF3_7,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF4_7,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF5_7,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF6_7,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF7_7,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF8_7,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF9_7,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(
														TF1_8,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF2_8,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF3_8,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF4_8,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF5_8,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF6_8,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF7_8,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF8_8,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF9_8,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(
														TF1_9,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF2_9,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF3_9,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF4_9,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF5_9,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF6_9,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF7_9,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF8_9,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														TF9_9,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(Lösen)
								.addContainerGap(GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		Lösen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 Arraygetter.raster[0][0] = Integer.parseInt(TF1_1.getText());
				 Arraygetter.raster[0][1] = Integer.parseInt(TF2_1.getText());
				 Arraygetter.raster[0][2] = Integer.parseInt(TF3_1.getText());
				 Arraygetter.raster[0][3] = Integer.parseInt(TF4_1.getText());
				 Arraygetter.raster[0][4] = Integer.parseInt(TF5_1.getText());
				 Arraygetter.raster[0][5] = Integer.parseInt(TF6_1.getText());
				 Arraygetter.raster[0][6] = Integer.parseInt(TF7_1.getText());
				 Arraygetter.raster[0][7] = Integer.parseInt(TF8_1.getText());
				 Arraygetter.raster[0][8] = Integer.parseInt(TF9_1.getText());
				 Arraygetter.raster[1][0] = Integer.parseInt(TF1_2.getText());
				 Arraygetter.raster[1][1] = Integer.parseInt(TF2_2.getText());
				 Arraygetter.raster[1][2] = Integer.parseInt(TF3_2.getText());
				 Arraygetter.raster[1][3] = Integer.parseInt(TF4_2.getText());
				 Arraygetter.raster[1][4] = Integer.parseInt(TF5_2.getText());
				 Arraygetter.raster[1][5] = Integer.parseInt(TF6_2.getText());
				 Arraygetter.raster[1][6] = Integer.parseInt(TF7_2.getText());
				 Arraygetter.raster[1][7] = Integer.parseInt(TF8_2.getText());
				 Arraygetter.raster[1][8] = Integer.parseInt(TF9_2.getText());
				 Arraygetter.raster[2][0] = Integer.parseInt(TF1_3.getText());
				 Arraygetter.raster[2][1] = Integer.parseInt(TF2_3.getText());
				 Arraygetter.raster[2][2] = Integer.parseInt(TF3_3.getText());
				 Arraygetter.raster[2][3] = Integer.parseInt(TF4_3.getText());
				 Arraygetter.raster[2][4] = Integer.parseInt(TF5_3.getText());
				 Arraygetter.raster[2][5] = Integer.parseInt(TF6_3.getText());
				 Arraygetter.raster[2][6] = Integer.parseInt(TF7_3.getText());
				 Arraygetter.raster[2][7] = Integer.parseInt(TF8_3.getText());
				 Arraygetter.raster[2][8] = Integer.parseInt(TF9_3.getText());
				 Arraygetter.raster[3][0] = Integer.parseInt(TF1_4.getText());
				 Arraygetter.raster[3][1] = Integer.parseInt(TF2_4.getText());
				 Arraygetter.raster[3][2] = Integer.parseInt(TF3_4.getText());
				 Arraygetter.raster[3][3] = Integer.parseInt(TF4_4.getText());
				 Arraygetter.raster[3][4] = Integer.parseInt(TF5_4.getText());
				 Arraygetter.raster[3][5] = Integer.parseInt(TF6_4.getText());
				 Arraygetter.raster[3][6] = Integer.parseInt(TF7_4.getText());
				 Arraygetter.raster[3][7] = Integer.parseInt(TF8_4.getText());
				 Arraygetter.raster[3][8] = Integer.parseInt(TF9_4.getText());
				 Arraygetter.raster[4][0] = Integer.parseInt(TF1_5.getText());
				 Arraygetter.raster[4][1] = Integer.parseInt(TF2_5.getText());
				 Arraygetter.raster[4][2] = Integer.parseInt(TF3_5.getText());
				 Arraygetter.raster[4][3] = Integer.parseInt(TF4_5.getText());
				 Arraygetter.raster[4][4] = Integer.parseInt(TF5_5.getText());
				 Arraygetter.raster[4][5] = Integer.parseInt(TF6_5.getText());
				 Arraygetter.raster[4][6] = Integer.parseInt(TF7_5.getText());
				 Arraygetter.raster[4][7] = Integer.parseInt(TF8_5.getText());
				 Arraygetter.raster[4][8] = Integer.parseInt(TF9_5.getText());
				 Arraygetter.raster[5][0] = Integer.parseInt(TF1_6.getText());
				 Arraygetter.raster[5][1] = Integer.parseInt(TF2_6.getText());
				 Arraygetter.raster[5][2] = Integer.parseInt(TF3_6.getText());
				 Arraygetter.raster[5][3] = Integer.parseInt(TF4_6.getText());
				 Arraygetter.raster[5][4] = Integer.parseInt(TF5_6.getText());
				 Arraygetter.raster[5][5] = Integer.parseInt(TF6_6.getText());
				 Arraygetter.raster[5][6] = Integer.parseInt(TF7_6.getText());
				 Arraygetter.raster[5][7] = Integer.parseInt(TF8_6.getText());
				 Arraygetter.raster[5][8] = Integer.parseInt(TF9_6.getText());
				 Arraygetter.raster[6][0] = Integer.parseInt(TF1_7.getText());
				 Arraygetter.raster[6][1] = Integer.parseInt(TF2_7.getText());
				 Arraygetter.raster[6][2] = Integer.parseInt(TF3_7.getText());
				 Arraygetter.raster[6][3] = Integer.parseInt(TF4_7.getText());
				 Arraygetter.raster[6][4] = Integer.parseInt(TF5_7.getText());
				 Arraygetter.raster[6][5] = Integer.parseInt(TF6_7.getText());
				 Arraygetter.raster[6][6] = Integer.parseInt(TF7_7.getText());
				 Arraygetter.raster[6][7] = Integer.parseInt(TF8_7.getText());
				 Arraygetter.raster[6][8] = Integer.parseInt(TF9_7.getText());
				 Arraygetter.raster[7][0] = Integer.parseInt(TF1_8.getText());
				 Arraygetter.raster[7][1] = Integer.parseInt(TF2_8.getText());
				 Arraygetter.raster[7][2] = Integer.parseInt(TF3_8.getText());
				 Arraygetter.raster[7][3] = Integer.parseInt(TF4_8.getText());
				 Arraygetter.raster[7][4] = Integer.parseInt(TF5_8.getText());
				 Arraygetter.raster[7][5] = Integer.parseInt(TF6_8.getText());
				 Arraygetter.raster[7][6] = Integer.parseInt(TF7_8.getText());
				 Arraygetter.raster[7][7] = Integer.parseInt(TF8_8.getText());
				 Arraygetter.raster[7][8] = Integer.parseInt(TF9_8.getText());
				 Arraygetter.raster[8][0] = Integer.parseInt(TF1_9.getText());
				 Arraygetter.raster[8][1] = Integer.parseInt(TF2_9.getText());
				 Arraygetter.raster[8][2] = Integer.parseInt(TF3_9.getText());
				 Arraygetter.raster[8][3] = Integer.parseInt(TF4_9.getText());
				 Arraygetter.raster[8][4] = Integer.parseInt(TF5_9.getText());
				 Arraygetter.raster[8][5] = Integer.parseInt(TF6_9.getText());
				 Arraygetter.raster[8][6] = Integer.parseInt(TF7_9.getText());
				 Arraygetter.raster[8][7] = Integer.parseInt(TF8_9.getText());
				 Arraygetter.raster[8][8] = Integer.parseInt(TF9_9.getText());
				 

				/* ValueArray.getInstance().getValueMap()[0][0] = getInt(TF1_1);
				ValueArray.getInstance().getValueMap()[0][1] = getInt(TF1_2);
				ValueArray.getInstance().getValueMap()[0][2] = getInt(TF1_3);
				ValueArray.getInstance().getValueMap()[0][3] = getInt(TF1_4);
				ValueArray.getInstance().getValueMap()[0][4] = getInt(TF1_5);
				ValueArray.getInstance().getValueMap()[0][5] = getInt(TF1_6);
				ValueArray.getInstance().getValueMap()[0][6] = getInt(TF1_7);
				ValueArray.getInstance().getValueMap()[0][7] = getInt(TF1_8);
				ValueArray.getInstance().getValueMap()[0][8] = getInt(TF1_9);
				
				ValueArray.getInstance().getValueMap()[1][0] = getInt(TF2_1);
				ValueArray.getInstance().getValueMap()[1][1] = getInt(TF2_2);
				ValueArray.getInstance().getValueMap()[1][2] = getInt(TF2_3);
				ValueArray.getInstance().getValueMap()[1][3] = getInt(TF2_4);
				ValueArray.getInstance().getValueMap()[1][4] = getInt(TF2_5);
				ValueArray.getInstance().getValueMap()[1][5] = getInt(TF2_6);
				ValueArray.getInstance().getValueMap()[1][6] = getInt(TF2_7);
				ValueArray.getInstance().getValueMap()[1][7] = getInt(TF2_8);
				ValueArray.getInstance().getValueMap()[1][8] = getInt(TF2_9);
				
				ValueArray.getInstance().getValueMap()[2][0] = getInt(TF3_1);
				ValueArray.getInstance().getValueMap()[2][1] = getInt(TF3_2);
				ValueArray.getInstance().getValueMap()[2][2] = getInt(TF3_3);
				ValueArray.getInstance().getValueMap()[2][3] = getInt(TF3_4);
				ValueArray.getInstance().getValueMap()[2][4] = getInt(TF3_5);
				ValueArray.getInstance().getValueMap()[2][5] = getInt(TF3_6);
				ValueArray.getInstance().getValueMap()[2][6] = getInt(TF3_7);
				ValueArray.getInstance().getValueMap()[2][7] = getInt(TF3_8);
				ValueArray.getInstance().getValueMap()[2][8] = getInt(TF3_9);
				
				ValueArray.getInstance().getValueMap()[3][0] = getInt(TF4_1);
				ValueArray.getInstance().getValueMap()[3][1] = getInt(TF4_2);
				ValueArray.getInstance().getValueMap()[3][2] = getInt(TF4_3);
				ValueArray.getInstance().getValueMap()[3][3] = getInt(TF4_4);
				ValueArray.getInstance().getValueMap()[3][4] = getInt(TF4_5);
				ValueArray.getInstance().getValueMap()[3][5] = getInt(TF4_6);
				ValueArray.getInstance().getValueMap()[3][6] = getInt(TF4_7);
				ValueArray.getInstance().getValueMap()[3][7] = getInt(TF4_8);
				ValueArray.getInstance().getValueMap()[3][8] = getInt(TF4_9);
				
				ValueArray.getInstance().getValueMap()[4][0] = getInt(TF5_1);
				ValueArray.getInstance().getValueMap()[4][1] = getInt(TF5_2);
				ValueArray.getInstance().getValueMap()[4][2] = getInt(TF5_3);
				ValueArray.getInstance().getValueMap()[4][3] = getInt(TF5_4);
				ValueArray.getInstance().getValueMap()[4][4] = getInt(TF5_5);
				ValueArray.getInstance().getValueMap()[4][5] = getInt(TF5_6);
				ValueArray.getInstance().getValueMap()[4][6] = getInt(TF5_7);
				ValueArray.getInstance().getValueMap()[4][7] = getInt(TF5_8);
				ValueArray.getInstance().getValueMap()[4][8] = getInt(TF5_9);
				
				ValueArray.getInstance().getValueMap()[5][0] = getInt(TF6_1);
				ValueArray.getInstance().getValueMap()[5][1] = getInt(TF6_2);
				ValueArray.getInstance().getValueMap()[5][2] = getInt(TF6_3);
				ValueArray.getInstance().getValueMap()[5][3] = getInt(TF6_4);
				ValueArray.getInstance().getValueMap()[5][4] = getInt(TF6_5);
				ValueArray.getInstance().getValueMap()[5][5] = getInt(TF6_6);
				ValueArray.getInstance().getValueMap()[5][6] = getInt(TF6_7);
				ValueArray.getInstance().getValueMap()[5][7] = getInt(TF6_8);
				ValueArray.getInstance().getValueMap()[5][8] = getInt(TF6_9);
				
				ValueArray.getInstance().getValueMap()[6][0] = getInt(TF7_1);
				ValueArray.getInstance().getValueMap()[6][1] = getInt(TF7_2);
				ValueArray.getInstance().getValueMap()[6][2] = getInt(TF7_3);
				ValueArray.getInstance().getValueMap()[6][3] = getInt(TF7_4);
				ValueArray.getInstance().getValueMap()[6][4] = getInt(TF7_5);
				ValueArray.getInstance().getValueMap()[6][5] = getInt(TF7_6);
				ValueArray.getInstance().getValueMap()[6][6] = getInt(TF7_7);
				ValueArray.getInstance().getValueMap()[6][7] = getInt(TF7_8);
				ValueArray.getInstance().getValueMap()[6][8] = getInt(TF7_9);
				
				ValueArray.getInstance().getValueMap()[7][0] = getInt(TF8_1);
				ValueArray.getInstance().getValueMap()[7][1] = getInt(TF8_2);
				ValueArray.getInstance().getValueMap()[7][2] = getInt(TF8_3);
				ValueArray.getInstance().getValueMap()[7][3] = getInt(TF8_4);
				ValueArray.getInstance().getValueMap()[7][4] = getInt(TF8_5);
				ValueArray.getInstance().getValueMap()[7][5] = getInt(TF8_6);
				ValueArray.getInstance().getValueMap()[7][6] = getInt(TF8_7);
				ValueArray.getInstance().getValueMap()[7][7] = getInt(TF8_8);
				ValueArray.getInstance().getValueMap()[7][8] = getInt(TF8_9);
				
				ValueArray.getInstance().getValueMap()[8][0] = getInt(TF9_1);
				ValueArray.getInstance().getValueMap()[8][1] = getInt(TF9_2);
				ValueArray.getInstance().getValueMap()[8][2] = getInt(TF9_3);
				ValueArray.getInstance().getValueMap()[8][3] = getInt(TF9_4);
				ValueArray.getInstance().getValueMap()[8][4] = getInt(TF9_5);
				ValueArray.getInstance().getValueMap()[8][5] = getInt(TF9_6);
				ValueArray.getInstance().getValueMap()[8][6] = getInt(TF9_7);
				ValueArray.getInstance().getValueMap()[8][7] = getInt(TF9_8);
				ValueArray.getInstance().getValueMap()[8][8] = getInt(TF9_9); */
				
				Arraygetter.printRaster();
				Arraygetter.löser();
				ValueArray.getInstance().printRaster();
			}
		});
	}
}
