package hgs.itg23;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;



public class Abfrage implements ActionListener {

	int i = 0;
	ImageIcon B1 = new ImageIcon("valo.jpg");
	ImageIcon B2 = new ImageIcon("elden.jpg");
	ImageIcon B3 = new ImageIcon("fn.jpg");
	ImageIcon B4 = new ImageIcon("mc.jpg");
	ImageIcon B5 = new ImageIcon("mario.png");
	ImageIcon B6 = new ImageIcon("Download.jpg");
	ImageIcon B7 = new ImageIcon("bo2.jpg");
	ImageIcon B8 = new ImageIcon("battle.jpg");
	ImageIcon B9 = new ImageIcon("81.jpg");
	ImageIcon B10 = new ImageIcon("82.jpg");
	ImageIcon B12 = new ImageIcon("80.jpg");
	ImageIcon B13 = new ImageIcon("monacco.png");
	ImageIcon B14 = new ImageIcon("fra.png");
	ImageIcon B15 = new ImageIcon("vati.jpg");
	ImageIcon B16 = new ImageIcon("island.png");
	ImageIcon B17 = new ImageIcon("russland.png");
	ImageIcon B18 = new ImageIcon("irland.png");
	ImageIcon B19 = new ImageIcon("16.jpg");
	ImageIcon B20 = new ImageIcon("2.png");
	ImageIcon B21 = new ImageIcon("14.png");
	ImageIcon B22 = new ImageIcon("tokio.jpg");
	ImageIcon B23 = new ImageIcon("moskau.jpg");
	ImageIcon B24 = new ImageIcon("shanghai.jpg");
	ImageIcon B25 = new ImageIcon("pi.png");
	ImageIcon B26 = new ImageIcon("pi.png");
	ImageIcon B27 = new ImageIcon("pi.png");
	ImageIcon B28 = new ImageIcon("strangerthings.jpeg");
	ImageIcon B29 = new ImageIcon("bb.jpg");
	ImageIcon B30 = new ImageIcon("blackli");
	ImageIcon B31 = new ImageIcon("bo2.jpg");
	ImageIcon B32 = new ImageIcon("battle.jpg");
	ImageIcon B33 = new ImageIcon("81.jpg");
	ImageIcon B34 = new ImageIcon("82.jpg");
	ImageIcon B35 = new ImageIcon("80.jpg");
	ImageIcon B36 = new ImageIcon("monacco.png");
	ImageIcon B37 = new ImageIcon("fra.png");
	ImageIcon B38 = new ImageIcon("vati.jpg");
	ImageIcon B39 = new ImageIcon("island.png");
	ImageIcon B40 = new ImageIcon("russland.png");
	ImageIcon B41 = new ImageIcon("irland.png");
	ImageIcon B42 = new ImageIcon("16.jpg");
	ImageIcon B43 = new ImageIcon("2.png");
	ImageIcon B44 = new ImageIcon("14.png");
	ImageIcon B45 = new ImageIcon("tokio.jpg");
	ImageIcon B46 = new ImageIcon("moskau.jpg");
	ImageIcon B47 = new ImageIcon("shanghai.jpg");
	
	
	String[] fragen = {            "Beliebtestes Spielt derzeit?",
            "Meist verkauftes Spiel allerzeiten?",
            "Belienteste Spiel-Genre?",


            "Wie viel Menschen leben in Deutschland?",
            "Welches ist das kleinste Land der Welt?",
            "Welches Land hat die nördlichste Hauptstadt? ",


            "Wie viel Bundesländer hat Deutschland?",
            "Was ist die größte Stadt der Welt?",
            "Welchen Wert hat Pi(π)?",


            "Was beliebteste Netflix-Serie?",
            "Was sind die beliebtestem Netflix-Generes?",
            "Was ist der Beliebtester Netflix-Film?",


            "Teurstes Auto der Welt?",
            "Beliebteste Automarke der Welt?",
            "Erfolgreicheste Automarke der Welt?",

            "Was ist das beliebteste Haustier der Welt?",
            "Was ist das freundlichste Tier der Welt?",
            "Was ist das gefährlichste Tier der Welt?",

  };
	
	
	String[][] moeglichkeiten = {
            {"Valorant","Elden Ring","Fortnite"},
            {"Minecraft","Super Mario","Tetris"},
            {"Actionspiele","Battle-Royal","Open World"},


            {"81 Millionen ","82 Millionen","80 Millionen"},
            { "Monaco","Frankreich","Vatikanstadt"},
            {  "Island","Russland","Irland"},


            { "16","2","14"},
            { "Tokio","Moskau","Shanghai"},
            { "3,14","3,44","3,46"},

            { "Stranger Things","Breaking bad","Blacklist"},
            { "Action/Abenteuer","Thriller/Horror","Komödien/Familienfilme"},
            { "6 Underground","Spenser Confidential","The Dark knight"},


            { "Mercedez Benz 300 SlR Uhlenhaut","Bugatti la Voiture Noire","Rolly-Royse sweptail"},
            { "Bmw","Mercedes","Lamborghini"},
            { "Toyota","Mercedes","Ford"},


            { "Katzen","Vögel","Hunde"},
            { "Faultiere","Capybaras","Koalas"},
            { "Petermännchen(Fisch)","Portugiesische Galeere(Quallen)","Barrakudas(Fisch)"},

};
	
	String[] antworten = {
	        "2",
	        "3",
	        "1",

	        "1",
	        "3",
	        "1",

	        "1",
	        "1",
	        "1",

	        "1",
	        "1",
	        "2",

	        "1",
	        "1",
	        "1",


	        "1",
	        "2",
	        "2",




	};

	
	ImageIcon[][] bilder  =  {		{B1,B4,B7,B3,B3,B3},
									{B2,B5,B8,B3,B3,B3},
									{B3,B6,B9,B3,B3,B3}
			
	};
	
	  String erraten;
	  String antwort;
	  int index;
	  int richtigeantwort = 0;
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
	JButton resetbutton = new JButton("reset");
	JLabel resetbutton_label = new JLabel();
	JLabel Antwort1_label = new JLabel();
	JLabel Antwort2_label = new JLabel();
	JLabel Antwort3_label = new JLabel();
	
	JTextField richtige_antworten = new JTextField();
	
	JLabel pic = new JLabel();
	JLabel Anzeige = new JLabel();
	
	public Abfrage() {
			
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920, 1080);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(null);
		frame.setResizable(true);
		frame.setBackground(Color.GREEN);
		
		
		
		textfeld.setBounds(155, 43, 650, 50);										//HÃ¶chste prioritÃ¤t
		textfeld.setBackground(Color.BLUE);										// Optional
		textfeld.setForeground(Color.WHITE);										// Optional
		textfeld.setFont(new Font("Ink Free", Font.BOLD,30));          				// WICHTIG! Ã„ndern
		textfeld.setBorder(BorderFactory.createBevelBorder(1));						// So lassen
		textfeld.setHorizontalAlignment(textfeld.CENTER);							// Optional	
		textfeld.setEditable(false);												// So lassen90ÃŸÃŸÃŸÃŸÃŸÃŸÃŸÃŸÃŸÃŸÃŸÃŸÃŸÃŸÃŸÃŸÃŸ
		textfeld.setText("Test");													//	Ã„ndern so bald fertig
										
		
		textbereich.setBounds(155, 93, 650, 50);	
		textbereich.setLineWrap(true);
		textbereich.setBackground(Color.BLUE);										
		textbereich.setForeground(Color.WHITE);										
		textbereich.setFont(new Font("Arial Black", Font.BOLD,30));          				
		textbereich.setBorder(BorderFactory.createBevelBorder(1));													
		textbereich.setEditable(false);											
		textbereich.setText("Test1");			
		
		
		button1.setBounds(200, 200, 500, 100); 										//Ã¤ndern
		button1.setFont(new Font("Arial Black", Font.BOLD, 20)); 
		button1.setBackground(Color.BLUE);
		button1.setForeground(Color.WHITE);	
		button1.setFocusable(false);
		button1.addActionListener(this);
		button1.setText("1");
		
		
		button2.setBounds(200, 400, 500, 100); 										//Ã¤ndern
		button2.setFont(new Font("Arial Black", Font.BOLD, 20)); 
		button2.setBackground(Color.BLUE);
		button2.setForeground(Color.WHITE);	
		button2.setFocusable(false);
		button2.addActionListener(this);
		button2.setText("2");
		
		button3.setBounds(200, 600, 500, 100); 										//Ã¤ndern
		button3.setFont(new Font("Arial Black", Font.BOLD, 20)); 
		button3.setBackground(Color.BLUE);
		button3.setForeground(Color.WHITE);	
		button3.setFocusable(false);
		button3.addActionListener(this);
		button3.setText("3");
		
		resetbutton.setBounds(1640, 10, 250, 100); 										//Ã¤ndern
		resetbutton.setFont(new Font("Arial Black", Font.BOLD, 20)); 
		resetbutton.setBackground(Color.BLUE);
		resetbutton.setForeground(Color.WHITE);	
		resetbutton.setFocusable(false);
		resetbutton.addActionListener(listener -> {

		      Antwort1_label.setText(moeglichkeiten[index][0]);
	            Antwort2_label.setText(moeglichkeiten[index][1]);
	            Antwort3_label.setText(moeglichkeiten[index][2]);
            index = 0;
           
            i = 0;
            antwort = "";
            button3.setText("3");
            button2.setText("2");
            button1.setText("1");
            textbereich.setText("Test1");
            textfeld.setText("Kategorie Gaming");
       
        });
		resetbutton.setText("Reset");
		
		Antwort1_label.setBounds(440, 300, 500, 100);
		Antwort1_label.setBackground(Color.BLUE);
		Antwort1_label.setForeground(Color.WHITE);
		Antwort1_label.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		
		Antwort2_label.setBounds(430, 500, 500, 100);
		Antwort2_label.setBackground(Color.BLUE);
		Antwort2_label.setForeground(Color.WHITE);
		Antwort2_label.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		Antwort3_label.setBounds(430, 700, 500, 100);
		Antwort3_label.setBackground(Color.BLUE);
		Antwort3_label.setForeground(Color.WHITE);
		Antwort3_label.setFont(new Font("Arial Black", Font.BOLD, 20));
		

		
		
		
		
		
		richtige_antworten.setBounds(825, 225, 200, 100);
		richtige_antworten.setBackground(Color.BLUE);
		richtige_antworten.setForeground(Color.BLACK);
		richtige_antworten.setFont(new Font("Arial Black", Font.BOLD, 20));
		richtige_antworten.setBorder(BorderFactory.createBevelBorder(1));
		richtige_antworten.setHorizontalAlignment(richtige_antworten.CENTER); // JTextField.CENTER
		richtige_antworten.setEditable(false);
		
		pic.setBounds(950, 150, 500, 550);
		pic.setVisible(false);
		
	                                              
		//frame.add(rest_zeit);
		frame.add(Antwort1_label);
		frame.add(Antwort2_label);
		frame.add(Antwort3_label);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(textbereich);
		frame.add(textfeld);
		frame.add(pic);
		frame.add(resetbutton);
        frame.add(resetbutton_label);
		frame.setVisible(true);
		
		
		
		
		N_Abfrage();
		
		}

	
		public void N_Abfrage() {
			
			if(index>= alle_fragen) {
				
				end();
				
			} 
			else {
				if(index==0) {
					textfeld.setText("Kategorie Gaming");
				}
				if(index==3) {
					textfeld.setText("Kategorie LÃ¤nder");
				}
				if(index==6) {
					textfeld.setText("Kategorie Allgemeinwissen");
				}
				if(index==9) {
					textfeld.setText("Kategorie Netflix-Serien");
				}
				if(index==12) {
					textfeld.setText("Kategorie Tiere");

				}
				if(index==15) {
					textfeld.setText("Kategorie Autos");
				}
				
				
				
				
				
				
				
				
				
				
				
				
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
					
					richtigeantwort++;
					
				}
				
				
				
			}
			
if(e.getSource()==button2) {
				
				antwort = "2";
				
				
				
				pic.setIcon(bilder[1][i]);		
						
				
				if (antwort == antworten[index]) {
					
					richtigeantwort++;
					
				}
			}
if(e.getSource()==button3) {
	
	antwort = "3";
	
	
	
	
	pic.setIcon(bilder[2][i]);	
		
	
	if (antwort == antworten[index]) {
		
		richtigeantwort++;
		
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
		
		
		public void end() {
			button1.setEnabled(false);
			button2.setEnabled(false);
			button3.setEnabled(false);
			
			ergebnis = (int)((richtigeantwort/(double)alle_fragen)*100);
			
			textfeld.setText("Dein Ergebnis");
			textbereich.setText("");
			Antwort1_label.setText("");
			Antwort2_label.setText("");
			Antwort3_label.setText("");
			richtige_antworten.setText("("+richtigeantwort+"/"+alle_fragen+ ")");
			
			frame.add(richtige_antworten);
			
		}
		

}
