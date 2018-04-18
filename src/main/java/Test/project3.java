package Test;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

import edu.yccc.java.samples.slack.SlackService;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class project3 {

	private JFrame frame;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project3 window = new project3();
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
	public project3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		pwdPassword = new JPasswordField();
		pwdPassword.setText("Password");
		pwdPassword.setBounds(284, 213, 113, 20);
		frame.getContentPane().add(pwdPassword);

		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				System.out.println("Call Slack Service!");
				SlackService slackService = new SlackService();
				slackService.sendMessage("#richard", "RCY383", "Hello!");
			}
		});
		btnEnter.setBounds(206, 144, 89, 23);
		frame.getContentPane().add(btnEnter);
	}
}
