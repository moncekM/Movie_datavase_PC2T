import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

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

public class addMovie extends JDialog {

	private final JPanel contentPanel = new JPanel();

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
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.NORTH);
			
			JLabel lblNewLabel = new JLabel("prosím zvolte si typ filmu:");
			panel.add(lblNewLabel);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Hraný film");
			panel.add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Animovaný film");
			panel.add(rdbtnNewRadioButton_1);
			
			JPanel panel_1 = new JPanel();
			getContentPane().add(panel_1, BorderLayout.CENTER);
			panel_1.setLayout(new GridLayout(0, 2, 0, 0));
			
			JLabel lblNewLabel_1 = new JLabel("Názov filmu:");
			panel_1.add(lblNewLabel_1);
			
			textField = new JTextField();
			panel_1.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Meno režiséra filmu:");
			panel_1.add(lblNewLabel_2);
			
			textField_1 = new JTextField();
			panel_1.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblNewLabel_3 = new JLabel("Rok vydania filmu:");
			panel_1.add(lblNewLabel_3);
			
			textField_2 = new JTextField();
			panel_1.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblNewLabel_5 = new JLabel("Zadajte zoznam hercov, jednotlivé Mená oddelujte bodkočiarkou:");
			panel_1.add(lblNewLabel_5);
			
			textField_3 = new JTextField();
			panel_1.add(textField_3);
			textField_3.setColumns(10);
			
			JLabel lblNewLabel_4 = new JLabel("Odporúčený vek diváka");
			panel_1.add(lblNewLabel_4);
			
			JSpinner spinner = new JSpinner();
			panel_1.add(spinner);
			
			JLabel label = new JLabel("");
			panel_1.add(label);
			
			JLabel label_1 = new JLabel("");
			panel_1.add(label_1);
		}
		
	}
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
}
