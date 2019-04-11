package Rubrica;

import java.io.*;
import java.util.*;

import javax.annotation.processing.FilerException;

public class Rubrica {

	private HashMap<String, Contatto> rubrica;
	private static final String FILE_PATH = "data.csv";
	private BufferedReader reader;

	public Rubrica() {
		this.rubrica = new HashMap<String, Contatto>();
	}

	public void addContatto(Contatto contatto) {
		rubrica.put(contatto.getNome() + "" + contatto.getCognome(), contatto);
	}

	public void delContatto(String nome, String cognome) {
		rubrica.remove(nome + "" + cognome);
	}

	public Contatto cercaContatto(String nome, String cognome) {
		String key = new String(nome + "" + cognome);
		if(rubrica.containsKey(key)) {
			return rubrica.get(key);
		}
		return null;
		
	}

	public void toFile() throws FilerException, IOException {
		File f = new File(FILE_PATH);
		try {
			FileWriter writer = new FileWriter(f);
			for (Contatto tmp : this.rubrica.values()) {
				writer.append
				(tmp.getNome() + ";" + tmp.getCognome() + ";" + tmp.getTelefono().toString() + ";" + tmp.getCitta() + ";"
						+ tmp.getProvincia() + ";" + tmp.getCap() + ";" + tmp.getIndirizzo() + ";" + tmp.getEmail().toString() + ";"
						+ tmp.getData().toString() + ";" + tmp.getGruppo() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String fromFile() throws FilerException, IOException {
		String tmp = this.reader.readLine();
		if (tmp == null) {
			this.reader.close();
		}
		return tmp;
	}

	public void salvaRubrica() throws IOException {
	}

	public void caricaRubrica() throws IOException {

	}
}
