import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;

public class playGame {

	private JFrame frame;
	private JTextField getAlpha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					playGame window = new playGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static JLabel e1,e2,e3,e4,e5,e6,e7,e8,e9,correctanswer,chances,scores;
	private static ArrayList<JLabel>labels = new ArrayList<JLabel>();
	private static ArrayList<String>list = new ArrayList<String>();
	private static String word="";
	private static int chance,score=0;
	private JButton reset;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	/**
	 * Create the application.
	 */
	public playGame() {
		initialize();
        list.add("WORDLE");
        list.add("SCRABBLE");
        list.add("QUIZZES");
        list.add("CODING");
        list.add("WANDER");
        list.add("DISTINCT");
        list.add("EXPRESS");
        list.add("COMMAND");
        list.add("SIGNAL");
        list.add("IRONIC");
        list.add("SYNONYMS");
        list.add("OBJECTIVE");
        list.add("DIVISIBLE");
        list.add("EDITOR");
        list.add("MASTERY");
        list.add("SOME");
        list.add("SCHEDULE");
        list.add("CULTURE");
        list.add("COUNTRY");
        list.add("INDIA");
        list.add("LIBRARY");
        list.add("EXPECT");
        list.add("MEET");
        list.add("STORY");
        list.add("IMPROVE");
        list.add("TOPICS");
        list.add("FRIENDS");
        list.add("TRAVEL");
        list.add("HOBBY");
        list.add("GREAT");
        list.add("ADVANCE");
        list.add("PEOPLE");
        list.add("BECAUSE");
        list.add("MOMENT");
        list.add("ALTHOUGH");
        list.add("POLICY");
        list.add("PROBABLY");
        list.add("BEHIND");
        list.add("REMAIN");
        list.add("SUGGEST");
        list.add("RAISE");
        list.add("FORMER");
        list.add("ECONOMY");
        list.add("MARKET");
        list.add("INCIDENT");
        list.add("ITSELF");
        list.add("EITHER");
        list.add("QUITE");
        list.add("PICTURE");
        list.add("DESCRIBE");
        list.add("PERSONAL");
        list.add("CENTURY");
        list.add("ENERGY");
        list.add("REALIZE");
        list.add("MATERIAL");
        list.add("FUTURE");
        getsetword();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setForeground(new Color(153, 204, 255));
		frame.setBackground(new Color(204, 153, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 1004, 696);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Guess the Alphabets");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel.setBounds(235, 20, 533, 75);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(77, 117, 845, 440);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		e2 = new JLabel("__");
		e2.setHorizontalAlignment(SwingConstants.CENTER);
		e2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		e2.setForeground(new Color(0, 0, 0));
		e2.setBackground(Color.MAGENTA);
		e2.setBounds(237, 107, 43, 50);
		panel.add(e2);
		
		e3 = new JLabel("__");
		e3.setHorizontalAlignment(SwingConstants.CENTER);
		e3.setForeground(Color.BLACK);
		e3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		e3.setBackground(Color.MAGENTA);
		e3.setBounds(290, 107, 43, 50);
		panel.add(e3);
		
		e4 = new JLabel("__");
		e4.setHorizontalAlignment(SwingConstants.CENTER);
		e4.setForeground(Color.BLACK);
		e4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		e4.setBackground(Color.MAGENTA);
		e4.setBounds(343, 107, 43, 50);
		panel.add(e4);
		
		e5 = new JLabel("__");
		e5.setHorizontalAlignment(SwingConstants.CENTER);
		e5.setForeground(Color.BLACK);
		e5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		e5.setBackground(Color.MAGENTA);
		e5.setBounds(396, 107, 43, 50);
		panel.add(e5);
		
		e6 = new JLabel("__");
		e6.setHorizontalAlignment(SwingConstants.CENTER);
		e6.setForeground(Color.BLACK);
		e6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		e6.setBackground(Color.MAGENTA);
		e6.setBounds(449, 107, 43, 50);
		panel.add(e6);
		
		e7 = new JLabel("__");
		e7.setHorizontalAlignment(SwingConstants.CENTER);
		e7.setForeground(Color.BLACK);
		e7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		e7.setBackground(Color.MAGENTA);
		e7.setBounds(502, 107, 43, 50);
		panel.add(e7);
		
		e8 = new JLabel("__");
		e8.setHorizontalAlignment(SwingConstants.CENTER);
		e8.setForeground(Color.BLACK);
		e8.setFont(new Font("Tahoma", Font.PLAIN, 32));
		e8.setBackground(Color.MAGENTA);
		e8.setBounds(555, 107, 43, 50);
		panel.add(e8);
		
		e1 = new JLabel("__");
		e1.setHorizontalAlignment(SwingConstants.CENTER);
		e1.setForeground(Color.BLACK);
		e1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		e1.setBackground(Color.MAGENTA);
		e1.setBounds(184, 107, 43, 50);
		panel.add(e1);
		
		e9 = new JLabel("__");
		e9.setHorizontalAlignment(SwingConstants.CENTER);
		e9.setForeground(Color.BLACK);
		e9.setFont(new Font("Tahoma", Font.PLAIN, 32));
		e9.setBackground(Color.MAGENTA);
		e9.setBounds(608, 107, 43, 50);
		panel.add(e9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(132, 97, 578, 67);
		panel.add(panel_1);
		
		JLabel lblEnterAlphabet = new JLabel("Enter Alphabet");
		lblEnterAlphabet.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnterAlphabet.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblEnterAlphabet.setBounds(253, 223, 220, 50);
		panel.add(lblEnterAlphabet);
		
		getAlpha = new JTextField();
		getAlpha.setBackground(new Color(255, 153, 153));
		getAlpha.setHorizontalAlignment(SwingConstants.CENTER);
		getAlpha.setFont(new Font("Tahoma", Font.PLAIN, 26));
		getAlpha.setBounds(483, 223, 83, 50);
		panel.add(getAlpha);
		getAlpha.setColumns(10);

		JButton btnNewButton = new JButton("check");
		btnNewButton.setBackground(new Color(255, 204, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alpha = getAlpha.getText();
				if(alpha.length()==1)
				{
					String al = alpha.toUpperCase();
					checkContains(al);
					getAlpha.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please enter a valid Alphabet");
					getAlpha.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 26));
		btnNewButton.setBounds(331, 323, 170, 36);
		panel.add(btnNewButton);
		
		correctanswer = new JLabel("Correct Answer is");
		correctanswer.setForeground(Color.RED);
		correctanswer.setHorizontalAlignment(SwingConstants.CENTER);
		correctanswer.setFont(new Font("Symphony Black", Font.BOLD, 26));
		correctanswer.setBounds(184, 29, 467, 49);
		panel.add(correctanswer);
		labels.add(e1);
		labels.add(e2);
		labels.add(e3);
		labels.add(e4);
		labels.add(e5);
		labels.add(e6);
		labels.add(e7);
		labels.add(e8);
		labels.add(e9);
		
		reset = new JButton("reset");
		reset.setBackground(new Color(255, 204, 204));
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setUnderline();
				getsetword();
				correctanswer.setVisible(false);
				reset.setVisible(false);
			}
		});
		reset.setFont(new Font("SansSerif", Font.BOLD, 26));
		reset.setBounds(331, 381, 170, 36);
		panel.add(reset);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(153, 204, 153));
		panel_3.setBounds(10, 10, 137, 27);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		scores = new JLabel("Score - "+score);
		scores.setBounds(10, 0, 127, 27);
		panel_3.add(scores);
		scores.setHorizontalAlignment(SwingConstants.LEFT);
		scores.setFont(new Font("Symphony Black", Font.BOLD, 22));
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(153, 204, 153));
		panel_4.setBounds(685, 10, 150, 27);
		panel.add(panel_4);
		
		chances = new JLabel("Chances - "+chance);
		chances.setBounds(10, 0, 143, 27);
		panel_4.add(chances);
		chances.setHorizontalAlignment(SwingConstants.LEFT);
		chances.setFont(new Font("Symphony Black", Font.BOLD, 22));
		
		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(153, 204, 153));
		panel_5.setBounds(291, 28, 254, 50);
		panel.add(panel_5);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 204, 255));
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(235, 20, 533, 75);
		frame.getContentPane().add(panel_2);
		
		labels.get(0).setVisible(false);
		labels.get(1).setVisible(false);
		labels.get(2).setVisible(false);
		labels.get(3).setVisible(false);
		labels.get(4).setVisible(false);
		labels.get(5).setVisible(false);
		labels.get(6).setVisible(false);
		labels.get(7).setVisible(false);
		labels.get(8).setVisible(false);
		reset.setVisible(false);
		correctanswer.setVisible(false);
	}
	public void checkContains(String alpha)
	{
		char ch = alpha.charAt(0);
		if(chance>0)
		{
			boolean b=false;
			for(int i=0;i<word.length();i++)
			{
				if(word.charAt(i)==ch)
				{
					labels.get(i).setText(alpha);
					b=true;
				}
			}
			if(b==false)
			{
				chance-=1;
				chances.setText("Chances - "+chance);
			}

			if(chance==0)
			{
				correctanswer.setVisible(true);
				for(int i=0;i<word.length();i++)
				{
					labels.get(i).setText(word.charAt(i)+"");
				}
				reset.setVisible(true);
			}
			else if(getthewordtocheck().equals(word))
			{
				score+=10;
				scores.setText("Score - "+score);
				setUnderline();
				getsetword();
			}
		}
	}
	public String getWord()
	{
		String word="";
		Random rd = new Random();
		int num = rd.nextInt(56);
		word = list.get(num);
		return word;
	}
	public void getsetword()
	{
		word = getWord();
		for(int i=0;i<word.length();i++)
		{
			labels.get(i).setVisible(true);
		}
		chance = word.length();
		chances.setText("Chances - "+chance);
	}
	public void setUnderline()
	{
		for(int i=0;i<9;i++)
		{
			labels.get(i).setText("__");
			labels.get(i).setVisible(false);
		}
	}
	public String getthewordtocheck()
	{
		String getword="";
		for(int i=0;i<word.length();i++)
			getword+=labels.get(i).getText();
		return getword;
	}
}
