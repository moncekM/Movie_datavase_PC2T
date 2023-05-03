import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ListofActors extends JDialog {
	
	public String findname;
	public actor findactor;
	public int Rateing;
	public String Coment;
	private animMovies findanimmovie;
	private JTextArea textArea;
	private List<rateing> findrateinglist;

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListofActors dialog = new ListofActors();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListofActors() {
		setTitle("Výpis Hercov podľa mena/ alebo hercov ktorý sa podielali na viac ako 1 filme:");
		setBounds(100, 100, 670, 300);
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
				JButton okButton = new JButton("List");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						for (actor a :actorDatabase.multimovieactor) {
							textArea.append("Umelec"+a.getName()+" sa podielal na: \n");
						for (String m :a.movielist){
							textArea.append(m+"\n");	
						}
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
						 dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.NORTH);
			
			JLabel lblNewLabel = new JLabel("prosím zadajte meno hladanáho herca:");
			panel.add(lblNewLabel);
			
			textField_2 = new JTextField();
			panel.add(textField_2);
			textField_2.setColumns(10);
			
			JButton btnNajsFilm = new JButton("najsť herca:");
			btnNajsFilm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				findname=textField_2.getText();
				if(actorDatabase.getInstance().actors.containsKey(findname));{
				findactor= actorDatabase.getInstance().actors.get(findname);
				textArea.append(findactor.getName()+"Sa podielal na : \n");
				for (String m :findactor.movielist) {
				textArea.append(m+"\n");	
				}
				
				}
				if(true != actorDatabase.getInstance().actors.containsKey(findname));{
					JOptionPane.showMessageDialog(null, "hladaný herec, nexsistuje");	
				}
				}
			});
			panel.add(btnNajsFilm);
		
		
		
		}
	}
	private JTextField textField_2;
}


