package hgs.itg23;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;



public class Abfrage implements ActionListener {

	int i = 0;
	ImageIcon B1 = new ImageIcon("pac.png");
	ImageIcon B2 = new ImageIcon("wen.png");
	ImageIcon B3 = new ImageIcon("wa.png");
	ImageIcon B4 = new ImageIcon("cc.jpg");
	ImageIcon B5 = new ImageIcon("ll.jpg");
	ImageIcon B6 = new ImageIcon("nn.jpg");
	ImageIcon B7 = new ImageIcon("");
	
	
	String[] fragen = {			"Test1?",
								"Test?",
							    "Oder doch Test3?"
				      };
	
	String[][] moeglichkeiten = {
									{"ad","as","ag"},
									{"da","sa","ga"},
									{"vv","bb","nn"}
								};
	
	String[] antworten = {
							"1",
							"2",
							"3",
							
					};
	
	ImageIcon[][] bilder  =  {		{B1,B3},
									{B2,B3},
									{B3,B1}
			
	};
	
	  String erraten;
	  String antwort;
	  int index;
	  int richtig_erraten = 0;
	  int alle_fragen = fragen.length;
	  int ergebnis;
	  int sekunden = 10;
	  int sekunden_uebrig;
	  
	 
	 
	
	
	JFrame frame = new JFrame();
	JTextField textfeld = new JTextField();
	JTextArea textbereich = new JTextArea();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JLabel Antwort1_label = new JLabel();
	JLabel Antwort2_label = new JLabel();
	JLabel Antwort3_label = new JLabel();
	JLabel zeit_label = new JLabel();
	JLabel rest_zeit = new JLabel();
	JTextField richtige_antworten = new JTextField();
	JLabel pic = new JLabel();
	
	public Abfrage() {
			
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920, 1080);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(null);
		frame.setResizable(true);
		
		
		
		textfeld.setBounds(234, 43, 650, 50);										//Höchste priorität
		textfeld.setBackground(Color.BLACK);										// Optional
		textfeld.setForeground(Color.WHITE);										// Optional
		textfeld.setFont(new Font("Ink Free", Font.BOLD,30));          				// WICHTIG! Ändern
		textfeld.setBorder(BorderFactory.createBevelBorder(1));						// So lassen
		textfeld.setHorizontalAlignment(textfeld.CENTER);							// Optional	
		textfeld.setEditable(false);												// So lassen90ßßßßßßßßßßßßßßßßß
		textfeld.setText("Test");													//	Ändern so bald fertig
										
		
		textbereich.setBounds(234, 93, 650, 50);	
		textbereich.setLineWrap(true);
		textbereich.setBackground(Color.BLACK);										
		textbereich.setForeground(Color.WHITE);										
		textbereich.setFont(new Font("Arial Black", Font.BOLD,30));          				
		textbereich.setBorder(BorderFactory.createBevelBorder(1));													
		textbereich.setEditable(false);											
		textbereich.setText("Test1");			
		
		
		button1.setBounds(0, 200, 200, 200); 										//ändern
		button1.setFont(new Font("Arial Black", Font.BOLD, 20)); 
		button1.setBackground(Color.GRAY);
		button1.setFocusable(false);
		button1.addActionListener(this);
		button1.setText("1");
		
		
		button2.setBounds(0, 450, 300, 100); 										//ändern
		button2.setFont(new Font("Arial Black", Font.BOLD, 20)); 
		button2.setBackground(Color.GRAY);
		button2.setFocusable(false);
		button2.addActionListener(this);
		button2.setText("2");
		
		button3.setBounds(0, 800, 200, 200); 										//ändern
		button3.setFont(new Font("Arial Black", Font.BOLD, 20)); 
		button3.setBackground(Color.GRAY);
		button3.setFocusable(false);
		button3.addActionListener(this);
		button3.setText("3");
		
		Antwort1_label.setBounds(425, 200, 500, 100);
		Antwort1_label.setBackground(Color.darkGray);
		Antwort1_label.setForeground(Color.LIGHT_GRAY);
		Antwort1_label.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		
		Antwort2_label.setBounds(225, 450, 500, 100);
		Antwort2_label.setBackground(Color.darkGray);
		Antwort2_label.setForeground(Color.WHITE);
		Antwort2_label.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		Antwort3_label.setBounds(125, 800, 500, 100);
		Antwort3_label.setBackground(Color.darkGray);
		Antwort3_label.setForeground(Color.LIGHT_GRAY);
		Antwort3_label.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		rest_zeit.setBounds(535, 510, 100, 100);
		rest_zeit.setBackground(Color.BLACK);
		rest_zeit.setForeground(Color.BLUE);
		rest_zeit.setFont(new Font("Arial Black", Font.BOLD, 20));
		rest_zeit.setBorder(BorderFactory.createBevelBorder(1));
		rest_zeit.setText(String.valueOf(sekunden));
		rest_zeit.setHorizontalAlignment(rest_zeit.CENTER);
		
		
		richtige_antworten.setBounds(225, 225, 200, 100);
		richtige_antworten.setBackground(Color.BLUE);
		richtige_antworten.setForeground(Color.BLACK);
		richtige_antworten.setFont(new Font("Arial Black", Font.BOLD, 20));
		richtige_antworten.setBorder(BorderFactory.createBevelBorder(1));
		richtige_antworten.setHorizontalAlignment(richtige_antworten.CENTER); // JTextField.CENTER
		richtige_antworten.setEditable(false);
		
		pic.setBounds(525, 525, 500, 500);
		pic.setVisible(false);
		
		
		//frame.add(richtige_antworten);
		frame.add(rest_zeit);
		frame.add(Antwort1_label);
		frame.add(Antwort2_label);
		frame.add(Antwort3_label);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(textbereich);
		frame.add(textfeld);
		frame.add(pic);
		frame.setVisible(true);
		
		
		N_Abfrage();
		
		}

	
		public void N_Abfrage() {
			
			if(index>= alle_fragen) {
				
				Punkte();
			} 
			else {
				
				textfeld.setText("Frage "+ (index+1));
				textbereich.setText(fragen[index]);
				Antwort1_label.setText(moeglichkeiten[index][0]);
				Antwort2_label.setText(moeglichkeiten[index][1]);
				Antwort3_label.setText(moeglichkeiten[index][2]);
			}
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		
			button1.setEnabled(false);
			button2.setEnabled(false);
			button3.setEnabled(false);
			
			if(e.getSource()==button1) {
				
				antwort = "1";
							
			
			pic.setIcon(bilder[0][i]);
				
				
				
				
				if (antwort == antworten[index]) {
					
					richtig_erraten++;
					
				}
				
				
				
			}
			
if(e.getSource()==button2) {
				
				antwort = "2";
				
				
				
				pic.setIcon(bilder[1][i]);		
						
				
				if (antwort == antworten[index]) {
					
					richtig_erraten++;
					
				}
			}
if(e.getSource()==button3) {
	
	antwort = "3";
	
	
	
	
	pic.setIcon(bilder[2][i]);	
		
	
	if (antwort == antworten[index]) {
		
		richtig_erraten++;
		
	}
}
		bild();
			
		}
		
		//g

		public void bild() {
			
			
			pic.setVisible(true);
			
			Timer m1 = new Timer(2000, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource()==button1) {
						
						
					
						
					}
					pic.setVisible(false);
				}
			
			});
			
			
			
			pic.setVisible(true);
			
			Timer m2 = new Timer(2000, new ActionListener() {
			
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource()==button2) {
				
					
					
						
					}
					pic.setVisible(false);
					}		
				
			});
			
			m2.setRepeats(false);
			m2.start();
			
			
pic.setVisible(true);
			
			Timer m3 = new Timer(2000, new ActionListener() {
			
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource()==button3) {
				
					
					
						
						
					}
					pic.setVisible(false);
					}		
				
			});
			
			m3.setRepeats(false);
			m3.start();
				
				
		Anzeige();

		
		}


		
		public void Anzeige() {
			
			button1.setEnabled(false);
			button2.setEnabled(false);
			button3.setEnabled(false);
			
			Timer pause = new Timer(2000, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
				i++;	
				index++;
				button1.setEnabled(true);
				button2.setEnabled(true);
				button3.setEnabled(true);
				
				N_Abfrage();
					
				}
				
			});
			
			pause.setRepeats(false);
			pause.start();
			
			
		}
		
		
		public void Punkte() {
			
			
		}
		

}
