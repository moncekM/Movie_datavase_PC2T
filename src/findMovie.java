import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class findMovie extends JDialog {

	public String findname;
	public Movie findmovie;
	public int Rateing;
	public String Coment;
	private animMovies findanimmovie;
	private JTextArea textArea;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			findMovie dialog = new findMovie();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public findMovie() {
		setTitle("Upravenie exsistujúceho filmu:");
		setBounds(100, 100, 529, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPanel.add(textArea);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
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
				textArea.append("Názov filmu:" +findmovie.getName()+"\n");
				textArea.append("Režisér filmu:" +findmovie.getDirector()+"\n");
				textArea.append("Film vyšiel v:" +findmovie.getReleaseyear()+"\n");
				if(findmovie.isType()) {
					findanimmovie=(animMovies) findmovie;
					textArea.append("Doporučený vek diváka pre daný film je "+findanimmovie.getPegiyear()+"rokov \n");
					textArea.append("Animátory ktorý sa podielali na filme:\n");
				}
				else {
					textArea.append("Vo filme Hrajú:\n");
				}
				actorDatabase.getInstance().actorsFromMovie(findname);
				for(actor a :actorDatabase.movieactorlist) {
					textArea.append(a.getName()+"\n");	
				}
				}
				
				}
			});
			panel.add(btnNajsFilm);
		
		
		
		}
	}
	private JTextField textField_2;
}
