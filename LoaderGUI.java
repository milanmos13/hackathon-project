import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.TextArea;
import java.awt.AWTException;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class LoaderGUI {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	
	public static ArrayList<String> linkks = new ArrayList<String>();
	public static String unm;
	public static String pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException, AWTException, InterruptedException{
		
			
	}
	
	public void run() {
		try {
			LoaderGUI window = new LoaderGUI();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create the application.
	 */
	public LoaderGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 634, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//labels
		Label Username = new Label("Enter your PAUSD Username:");
		Username.setBounds(10, 10, 161, 22);
		frame.getContentPane().add(Username);
		//labels
		JLabel linkHeader = new JLabel("List the Zoom links to all of your classes (in order if possible ) :");
		linkHeader.setBounds(10, 96, 351, 31);
		frame.getContentPane().add(linkHeader);
		//labels
		Label Username_1 = new Label("Enter your PAUSD Password:");
		Username_1.setBounds(10, 57, 161, 22);
		frame.getContentPane().add(Username_1);
		//username field
		textFieldName = new JTextField();
		textFieldName.setBounds(177, 12, 125, 20);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		//password field
		textField = new JTextField();
		textField.setBounds(177, 59, 125, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		//link fields
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(33, 132, 125, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(33, 163, 125, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(33, 194, 125, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(33, 225, 125, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(33, 256, 125, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(33, 287, 125, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(33, 318, 125, 20);
		frame.getContentPane().add(textField_7);
		//submit button and action
		JButton btnNewButton = new JButton("Submit All");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linkks.add(textField_1.getText());
				linkks.add(textField_2.getText());
				linkks.add(textField_3.getText());
				linkks.add(textField_4.getText());
				linkks.add(textField_5.getText());
				linkks.add(textField_6.getText());
				linkks.add(textField_7.getText());
				
				unm = textFieldName.getText();
				pw = textField.getText();
				
			}
		});
		btnNewButton.setBounds(452, 384, 125, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("S.E.L.F Link:");
		lblNewLabel.setBounds(10, 360, 80, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_8 = new JTextField();
		textField_8.setText("");
		textField_8.setBounds(87, 357, 132, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		//numbering of link fields
		JLabel lblNewLabel_1 = new JLabel("1:");
		lblNewLabel_1.setBounds(10, 134, 20, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2:");
		lblNewLabel_1_1.setBounds(10, 166, 20, 17);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3:");
		lblNewLabel_1_2.setBounds(10, 197, 20, 17);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("4:");
		lblNewLabel_1_2_1.setBounds(10, 228, 20, 17);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("5:");
		lblNewLabel_1_2_2.setBounds(10, 259, 20, 17);
		frame.getContentPane().add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("6:");
		lblNewLabel_1_2_3.setBounds(10, 290, 20, 17);
		frame.getContentPane().add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("7:");
		lblNewLabel_1_2_4.setBounds(10, 321, 20, 17);
		frame.getContentPane().add(lblNewLabel_1_2_4);
	}
}
