import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class update_actorlist extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JTextArea textArea;
	private JTextField textField;
	private String Actorname;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			update_actorlist dialog = new update_actorlist();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public update_actorlist() {
		setTitle("upravenie zoznamu Hercov:");
		setBounds(100, 100, 498, 185);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JLabel lblNewLabel_1 = new JLabel("Meno Herca:");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				panel.add(lblNewLabel_1);
			}
			{
				textField = new JTextField();
				panel.add(textField);
				textField.setColumns(10);
			}
		}
		{
			textArea = new JTextArea();
			contentPanel.add(textArea, BorderLayout.NORTH);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("add actor");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Actorname = textField.getText();
						actorDatabase.tempactorlist.add(new actor (Actorname));
						actorDatabase.getInstance().addactor("");
						dispose();
					}
				});
				{
					JButton btnNewButton = new JButton("Show Actors");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						for (actor a :actorDatabase.movieactorlist) {
						textArea.append(a.getName()+"\n");
						}
						}
					});
					buttonPane.add(btnNewButton);
				}
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
				{
					JButton btnNewButton_1 = new JButton("remove actor");
					btnNewButton_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Actorname = textField.getText();
							actorDatabase.tempactorlist.add(new actor (Actorname));
							actorDatabase.getInstance().romoveactor("");
							dispose();
						}
					});
					buttonPane.add(btnNewButton_1);
				}
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		}

}
