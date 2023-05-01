import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;


public class rozhranie extends JFrame {
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rozhranie frame = new rozhranie();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public rozhranie() {
		setTitle("Filmová databáza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Pridať Film");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					addMovie dialog = new addMovie();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Upraviť Film");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					updatemovie dialog = new updatemovie();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Zmazať Film");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					deleteMovie dialog = new deleteMovie();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Pridať hodnotenie exsistujúcemu filmu");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("výpis filmov v databáze");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Vyhladanie filmu");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("výpis filmov podľa apojenia herca");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Exportovanie filmu do súboru");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Inportovanie filmu zo súboru");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnNewButton_8);
	}
	
	
	private JPanel contentPane;


}


