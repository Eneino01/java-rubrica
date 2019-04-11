package Rubrica;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RubricaGui {

	JFrame frmRubrica;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RubricaGui window = new RubricaGui();
					window.frmRubrica.setVisible(true);
					window.frmRubrica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RubricaGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRubrica = new JFrame();
		frmRubrica.setTitle("Rubrica");
		frmRubrica.setResizable(false);
		frmRubrica.setBounds(100, 100, 360, 226);
		frmRubrica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRubrica.getContentPane().setLayout(null);

		JButton btnAggiungi = new JButton("AGGIUNGI");
		btnAggiungi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AggiungiContatto.launch();
			}
		});
		btnAggiungi.setToolTipText("Aggiungi un contatto alla rubrica");
		btnAggiungi.setBounds(74, 89, 105, 36);
		frmRubrica.getContentPane().add(btnAggiungi);

		JLabel lblAggiungiUnContatto = new JLabel("Aggiungi un contatto o visualizza la tabella dei contatti");
		lblAggiungiUnContatto.setHorizontalAlignment(SwingConstants.CENTER);
		lblAggiungiUnContatto.setBounds(10, 11, 334, 14);
		frmRubrica.getContentPane().add(lblAggiungiUnContatto);

		JButton btnRubrica = new JButton("VISUALIZZA");
		btnRubrica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostraRubrica.launch();

			}
		});
		btnRubrica.setToolTipText("Aggiungi un contatto alla rubrica");
		btnRubrica.setBounds(189, 89, 105, 36);
		frmRubrica.getContentPane().add(btnRubrica);
	}
}
