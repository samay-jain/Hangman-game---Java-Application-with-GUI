import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SwingUtilities;
import javax.swing.JProgressBar;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class splash {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					splash window = new splash();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	JProgressBar pb;
	/**
	 * Create the application.
	 * @throws InterruptedException 
	 */
	public splash() throws InterruptedException {
		initialize();
		waitSplash();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws InterruptedException 
	 */
	private void initialize() throws InterruptedException {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\kindpng_4578518.png"));
		lblNewLabel.setBounds(142, 116, 684, 394);
		frame.getContentPane().add(lblNewLabel);
		
		pb = new JProgressBar();
		pb.setForeground(new Color(0, 51, 102));
		pb.setBounds(142, 520, 684, 11);
		frame.getContentPane().add(pb);
		
		JLabel lblNewLabel_1 = new JLabel("Guess the Alphabets");
		lblNewLabel_1.setForeground(new Color(255, 153, 204));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(142, 31, 684, 75);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(0, 102, 153));
		panel.setBounds(260, 43, 450, 56);
		frame.getContentPane().add(panel);
		frame.setForeground(new Color(204, 153, 255));
		frame.setBackground(new Color(0, 153, 255));
		frame.setBounds(100, 100, 975, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void waitSplash() throws InterruptedException
	{
		Runnable newthread = new Runnable() {
			public void run() {
				pb.setMinimum(0);
				pb.setMaximum(1000000);
				for(int i=0;i<10000001;i++)
				{
					final int j=i;
					SwingUtilities.invokeLater(new Runnable() {
						public void run()
						{
							pb.setValue(j);
						}
					});
					if(i==1000000)
					{
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						frame.setVisible(false);
						playGame.main(null);
					}
				}
			}
		};
		new Thread(newthread).start();
	}
}
