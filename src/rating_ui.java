import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

public class rating_ui extends JDialog {
	public String findname;
	public Movie findmovie;
	public int Rateing;
	public String Coment;
	private animMovies findanimmovie;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNewRadioButton_1;
	JRadioButton rdbtnNewRadioButton_2;
	JRadioButton rdbtnNewRadioButton_3;
	JRadioButton rdbtnNewRadioButton_4;
	JRadioButton rdbtnNewRadioButton_5;
	JRadioButton rdbtnNewRadioButton_6;
	JRadioButton rdbtnNewRadioButton_7;
	JRadioButton rdbtnNewRadioButton_8;
	JRadioButton rdbtnNewRadioButton_9;

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			rating_ui dialog = new rating_ui();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public rating_ui() {
		setTitle("udelenie hodnotenia filmu:");
		setBounds(100, 100, 800, 300);
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
						if(rdbtnNewRadioButton.isSelected()) {
						 Rateing=1;
						}
						if(rdbtnNewRadioButton_1.isSelected()) {
							 Rateing=2;
							}
						if(rdbtnNewRadioButton_2.isSelected()) {
							 Rateing=3;
							}
						if(rdbtnNewRadioButton_3.isSelected()) {
							 Rateing=4;
							}
						if(rdbtnNewRadioButton_4.isSelected()) {
							 Rateing=5;
							}
						if(rdbtnNewRadioButton_5.isSelected()) {
							 Rateing=6;
							}
						if(rdbtnNewRadioButton_6.isSelected()) {
							 Rateing=7;
							}
						if(rdbtnNewRadioButton_7.isSelected()) {
							 Rateing=8;
							}
						if(rdbtnNewRadioButton_8.isSelected()) {
							 Rateing=9; 
							}
						if(rdbtnNewRadioButton_9.isSelected()) {
							 Rateing=10;
							}
						Coment=textField_1.getText();
						movieDatabase.getInstance().addrateing(findname, Rateing, Coment);
						dispose();
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
						 dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.NORTH);
			
			JLabel lblNewLabel = new JLabel("prosím zadajte názov filmu ktorý chcete upraviť:");
			panel.add(lblNewLabel);
			
			textField_2 = new JTextField();
			panel.add(textField_2);
			textField_2.setColumns(10);
			
			JButton btnNajsFilm = new JButton("najsť film");
			btnNajsFilm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				findname=textField_2.getText();
				if(movieDatabase.getInstance().movies.containsKey(findname));{
				findmovie=movieDatabase.getInstance().movies.get(findname);
				}
				if(findmovie.isType()) {
					findanimmovie=(animMovies) findmovie; 
				}
				else {
					rdbtnNewRadioButton_5.setVisible(false);
					rdbtnNewRadioButton_6.setVisible(false);
					rdbtnNewRadioButton_7.setVisible(false);
					rdbtnNewRadioButton_8.setVisible(false);
					rdbtnNewRadioButton_9.setVisible(false);
				}
				}
			});
			panel.add(btnNajsFilm);
			
			JPanel panel_1 = new JPanel();
			getContentPane().add(panel_1, BorderLayout.CENTER);
			panel_1.setLayout(new GridLayout(0, 2, 0, 0));
			
			JLabel lblNewLabel_1 = new JLabel("Pirdajte hodnotenie filmu:");
			panel_1.add(lblNewLabel_1);
			
			ButtonGroup rateing = new ButtonGroup();
			JPanel panel_2 = new JPanel();
			panel_1.add(panel_2);
			panel_2.setLayout(new GridLayout(1, 0, 0, 0));
			
			rdbtnNewRadioButton = new JRadioButton("1");
			panel_2.add(rdbtnNewRadioButton);
			rateing.add(rdbtnNewRadioButton);
			
			rdbtnNewRadioButton_1 = new JRadioButton("2");
			panel_2.add(rdbtnNewRadioButton_1);
			rateing.add(rdbtnNewRadioButton_1);
			
			rdbtnNewRadioButton_2 = new JRadioButton("3");
			panel_2.add(rdbtnNewRadioButton_2);
			rateing.add(rdbtnNewRadioButton_2);
			
			rdbtnNewRadioButton_3 = new JRadioButton("4");
			panel_2.add(rdbtnNewRadioButton_3);
			rateing.add(rdbtnNewRadioButton_3);
			
			rdbtnNewRadioButton_4 = new JRadioButton("5");
			panel_2.add(rdbtnNewRadioButton_4);
			rateing.add(rdbtnNewRadioButton_4);
			
			rdbtnNewRadioButton_5 = new JRadioButton("6");
			panel_2.add(rdbtnNewRadioButton_5);
			rateing.add(rdbtnNewRadioButton_5);
			
			rdbtnNewRadioButton_6 = new JRadioButton("7");
			panel_2.add(rdbtnNewRadioButton_6);
			rateing.add(rdbtnNewRadioButton_6);
			
			rdbtnNewRadioButton_7 = new JRadioButton("8");
			panel_2.add(rdbtnNewRadioButton_7);
			rateing.add(rdbtnNewRadioButton_7);
			
			rdbtnNewRadioButton_8 = new JRadioButton("9");
			panel_2.add(rdbtnNewRadioButton_8);
			rateing.add(rdbtnNewRadioButton_8);
			
			rdbtnNewRadioButton_9 = new JRadioButton("10");
			panel_2.add(rdbtnNewRadioButton_9);
			rateing.add(rdbtnNewRadioButton_9);
			
			JLabel lblNewLabel_2 = new JLabel("prýpadný slovný komentár vášho hodnotenia");
			panel_1.add(lblNewLabel_2);
			
			textField_1 = new JTextField();
			panel_1.add(textField_1);
			
			
			JLabel label = new JLabel("");
			panel_1.add(label);
			
			JLabel label_1 = new JLabel("");
			panel_1.add(label_1);
		
		
		
		}
		
		
	}
	private JTextField textField_1;
	private JTextField textField_2;
}
