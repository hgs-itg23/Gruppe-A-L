package hgs.itg23;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;



public class Abfrage implements ActionListener {

		
	String[] fragen = {			"Test1?",
								"Test?",
							    "Oder doch Test3?"
				      };
	
	String[][] moeglichkeiten = {
									{"ad","as","ag","af"},
									{"da","sa","ga","fa"},
									{"vv","bb","nn","mm"}
								};
	
	String[] antwort = {
							"1",
							"2",
							"3",
							"4"
					};
	
	
	/*
	 * 
	 * 
	 * string erraten;
	 * string antwort;
	 * int index;
	 * int richtig_erraten;
	 * int ergebnis;
	 * int sekunden = 10;
	 * 
	 * 
	 */
	
	
	JFrame frame = new JFrame();
	JTextField textfeld = new JTextField();
	JTextArea textbereich = new JTextArea();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JLabel Antwort1_label = new JLabel();
	JLabel Antwort2_label = new JLabel();
	JLabel Antwort3_label = new JLabel();
	JLabel time_label = new JLabel();
	JLabel rest_zeit_label = new JLabel();
	JTextField richtige_antworten = new JTextField();
	
	public Abfrage() {
			
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920, 1080);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(null);
		frame.setResizable(true);
		
		textfeld.setBounds(234, 43, 650, 50);
		textfeld.setBackground(Color.BLACK);
		textfeld.setForeground(Color.WHITE);
		textfeld.setFont(new Font("Ink Free", Font.BOLD,30));
		textfeld.setBorder(BorderFactory.createBevelBorder(1));
		textfeld.setHorizontalAlignment(textfeld.CENTER);
		textfeld.setEditable(true);
		textfeld.setText("Test");
		
		
		frame.add(textfeld);
		frame.setVisible(true);
			
		}

	
		public void N_Abfrage() {
			
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		
			
			
		}

		public void Punkte() {
			
			
		}
		

}
