import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class addMovie extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public String Moviename;
	public String Directornmae;
	public int Releaseyear;
	public int pegiyear;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			addMovie dialog = new addMovie();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public addMovie() {
		setTitle("Pridanie nového filmu:");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Moviename = textField.getText();
						Directornmae=textField_1.getText();	
						Releaseyear =(Integer) spinner_1.getValue();
						pegiyear= (Integer) spinner.getValue();
						if (rdbtnNewRadioButton.isSelected()) {
						movieDatabase.getInstance() .SetActMovie(Moviename, Directornmae, Releaseyear);
						}
						else {
						movieDatabase.getInstance() .SetAnimMovie(Moviename, Directornmae, Releaseyear,pegiyear);
						}
						}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						 System.exit(0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.NORTH);
			
			JLabel lblNewLabel = new JLabel("prosím zvolte si typ filmu:");
			panel.add(lblNewLabel);
			
			ButtonGroup choice = new ButtonGroup();
			rdbtnNewRadioButton = new JRadioButton("Hraný film");
			panel.add(rdbtnNewRadioButton);
			choice.add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Animovaný film");
			panel.add(rdbtnNewRadioButton_1);
			choice.add(rdbtnNewRadioButton_1);
			
			JPanel panel_1 = new JPanel();
			getContentPane().add(panel_1, BorderLayout.CENTER);
			panel_1.setLayout(new GridLayout(0, 2, 0, 0));
			
			JLabel lblNewLabel_1 = new JLabel("Názov filmu:");
			panel_1.add(lblNewLabel_1);
			
			textField = new JTextField();
			panel_1.add(textField);
			textField.setEditable(true);
			
			JLabel lblNewLabel_2 = new JLabel("Meno režiséra filmu:");
			panel_1.add(lblNewLabel_2);
			
			textField_1 = new JTextField();
			panel_1.add(textField_1);
			
			
			JLabel lblNewLabel_3 = new JLabel("Rok vydania filmu:");
			panel_1.add(lblNewLabel_3);
			
			spinner_1 = new JSpinner();
			spinner_1.setModel(new SpinnerNumberModel(Integer.valueOf(2000), null, null, Integer.valueOf(1)));
			panel_1.add(spinner_1);
			
			
			JLabel lblNewLabel_5 = new JLabel("Zadanie zoznamu hercov:");
			panel_1.add(lblNewLabel_5);
			
			JButton btnNewButton = new JButton("Pridanie Herca/ Animátora");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						addActor dialog = new addActor();
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			panel_1.add(btnNewButton);
			
			JLabel lblNewLabel_4 = new JLabel("Odporúčený vek diváka");
			panel_1.add(lblNewLabel_4);
			
			spinner = new JSpinner();
			panel_1.add(spinner);
			
			
			JLabel label = new JLabel("");
			panel_1.add(label);
			
			JLabel label_1 = new JLabel("");
			panel_1.add(label_1);
		
		
		
		}
		
		
	}
	private JTextField textField;
	private JTextField textField_1;
	private JSpinner spinner;
	private JSpinner spinner_1;
	private JRadioButton rdbtnNewRadioButton;
}
