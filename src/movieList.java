import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class movieList extends JDialog {

	private JTextArea textArea;
	private Movie itermovie;
	private animMovies iteranimmovie;
	List<actor> movieactors = new ArrayList<>();
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			movieList dialog = new movieList();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public movieList() {
		setTitle("výpis všetkých filmov v databáze:");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			textArea = new JTextArea();
			textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			contentPanel.add(textArea);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("List");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int iterator=0;
						textArea.append("Toto sú  základné informácie o všetkých filmoch ktoré obsahuje databáza:\n");
						Set <String> klice =movieDatabase.getInstance().movies.keySet();

						for (String movie : klice) {
						itermovie = movieDatabase.getInstance().movies.get(movie);
						textArea.append("Film č:"+iterator);
						textArea.append("Názov filmu:" +itermovie.getName()+"\n");
						textArea.append("Režisér filmu:" +itermovie.getDirector()+"\n");
						textArea.append("Film vyšiel v:" +itermovie.getReleaseyear()+"\n");
						if(itermovie.isType()) {
							iteranimmovie=(animMovies) itermovie;
						textArea.append("Doporučený vek diváka pre daný film je "+iteranimmovie.getPegiyear()+"rokov \n");
						textArea.append("Animátory ktorý sa podielali na filme:\n");
						
						}
						else {
							textArea.append("Vo filme Hrajú:\n");	
						}
						actorDatabase.getInstance().actorsFromMovie(movie);
						for(actor a :actorDatabase.movieactorlist) {
							textArea.append(a.getName()+"\n");	
						}
						iterator++;
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
		}
	}

}
