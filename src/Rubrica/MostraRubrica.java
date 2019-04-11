package Rubrica;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
//import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostraRubrica extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */

	public static void launch() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostraRubrica frame = new MostraRubrica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void main(String[] args) {
		launch();
	}

	/**
	 * Create the frame.
	 */
	public MostraRubrica() {
		setTitle("Mostra Rubrica");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setLayout(new MigLayout("", "[424px,grow][]", "[][251px]"));

		JButton btnNewButton = new JButton("Cerca");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		textField = new JTextField();
		textField.setToolTipText("Cerca un contatto in Rubrica");
		contentPane.add(textField, "cell 0 0,growx");
		textField.setColumns(10);
		contentPane.add(btnNewButton, "cell 1 0,growx,aligny center");

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "Cognome", "Telefono", "Citta",
				"Provincia", "CAP", "Indirizzo", "Email", "Data", "Gruppo" }));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(table, "cell 0 1 2 1,grow");
	}
}
