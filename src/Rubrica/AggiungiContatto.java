package Rubrica;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.annotation.processing.FilerException;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class AggiungiContatto extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Rubrica rub;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCognome;
	private JTextField textTelefono;
	private JTextField textCitta;
	private JTextField textProvincia;
	private JTextField textCap;
	private JTextField textIndirizzo;
	private JTextField textMail;
	private JTextField textData;
	private JTextField textGruppo;
	private JButton btnAdd;
	private JButton btnFile;
	
	private void clear() {
		textNome.setText(null);
		textCognome.setText(null);
		textTelefono.setText(null);
		textCitta.setText(null);
		textProvincia.setText(null);
		textCap.setText(null);
		textIndirizzo.setText(null);
		textMail.setText(null);
		textData.setText(null);
		textGruppo.setText(null);
	}
	

	/**
	 * Launch the application.
	 */
	
	public static void launch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AggiungiContatto frame = new AggiungiContatto();
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
	public AggiungiContatto() {
		rub = new Rubrica();
		setTitle("Aggiungi Contatto");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 150, 350, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 11, 56, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cognome");
		lblNewLabel_1.setBounds(10, 36, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setBounds(10, 61, 56, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Citt\u00E0");
		lblNewLabel_3.setBounds(10, 86, 56, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Provincia");
		lblNewLabel_4.setBounds(10, 111, 56, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CAP");
		lblNewLabel_5.setBounds(10, 136, 56, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Indirizzo");
		lblNewLabel_6.setBounds(10, 161, 56, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("E-mail");
		lblNewLabel_7.setBounds(10, 186, 56, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Data");
		lblNewLabel_8.setBounds(10, 211, 56, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblGruppo = new JLabel("Gruppo");
		lblGruppo.setBounds(10, 236, 56, 14);
		contentPane.add(lblGruppo);
		
		textNome = new JTextField();
		textNome.setBounds(93, 8, 174, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textCognome = new JTextField();
		textCognome.setBounds(93, 33, 174, 20);
		contentPane.add(textCognome);
		textCognome.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(93, 58, 174, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		textCitta = new JTextField();
		textCitta.setBounds(93, 83, 174, 20);
		contentPane.add(textCitta);
		textCitta.setColumns(10);
		
		textProvincia = new JTextField();
		textProvincia.setBounds(93, 108, 174, 20);
		contentPane.add(textProvincia);
		textProvincia.setColumns(10);
		
		textCap = new JTextField();
		textCap.setBounds(93, 134, 174, 20);
		contentPane.add(textCap);
		textCap.setColumns(10);
		
		textIndirizzo = new JTextField();
		textIndirizzo.setBounds(93, 159, 174, 20);
		contentPane.add(textIndirizzo);
		textIndirizzo.setColumns(10);
		
		textMail = new JTextField();
		textMail.setBounds(93, 183, 174, 20);
		contentPane.add(textMail);
		textMail.setColumns(10);
		
		textData = new JTextField();
		textData.setBounds(93, 208, 174, 20);
		contentPane.add(textData);
		textData.setColumns(10);
		
		textGruppo = new JTextField();
		textGruppo.setBounds(93, 233, 174, 20);
		contentPane.add(textGruppo);
		textGruppo.setColumns(10);

		btnFile = new JButton("A File");
		btnFile.setBounds(6, 291, 331, 23);
		btnFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				rub.toFile();
			} catch (FilerException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}});
		contentPane.add(btnFile);
		btnAdd = new JButton("Aggiungi Contatto");
		btnAdd.setBounds(6, 261, 331, 23);
		contentPane.add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Contatto toSave = 
					new Contatto(textNome.getText(), textCognome.getText(), 
								 Arrays.asList(textTelefono.getText().split(" ")),
								 textCitta.getText(), textProvincia.getText(), textCap.getText(),
								 textIndirizzo.getText(), 
								 Arrays.asList(textMail.getText().split(" ")), 
								 new SimpleDateFormat("dd.MM.yyyy").parse(textData.getText()),
								 textGruppo.getText());
					rub.addContatto(toSave);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				clear();
           }}  
        );
	}
}
