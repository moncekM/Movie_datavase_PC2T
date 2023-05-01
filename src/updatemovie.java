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

public class updatemovie extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public String Moviename;
	public String Directornmae;
	public int Releaseyear;
	public int pegiyear;
	public String findname;
	public Movie findmovie;
	private animMovies findanimmovie;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			updatemovie dialog = new updatemovie();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public updatemovie() {
		setTitle("Upravenie exsistujúceho filmu:");
		setBounds(100, 100, 529, 300);
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
						if (findmovie.isType()) {
							movieDatabase.getInstance() .updateAnimMovie(Moviename, Directornmae, Releaseyear, pegiyear);
							}
							else {
								movieDatabase.getInstance() .updteActMovie(Moviename, Directornmae, Releaseyear);
							
							}
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
				textField.setText(findmovie.getName());
				textField_1.setText(findmovie.getDirector());	
				spinner_1.setValue(findmovie.getReleaseyear());
				if(findmovie.isType()) {
					findanimmovie=(animMovies) findmovie;
					pegiyear= (Integer) spinner.getValue(); 
				}
				
				}
				
				}
			});
			panel.add(btnNajsFilm);
			
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
			
			JButton btnNewButton = new JButton("úprava zoznamu hercov / animátorov");
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
	private JTextField textField_2;
}
