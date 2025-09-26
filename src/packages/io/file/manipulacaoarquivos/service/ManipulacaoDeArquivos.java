package packages.io.file.manipulacaoarquivos.service;

import java.io.File;
import java.io.IOException;

public class ManipulacaoDeArquivos {

	private final String PATH = "C:\\Java IA";

	public ManipulacaoDeArquivos() {

	}

	public String getPATH() {
		return PATH;
	}

	// metodo que instancia um objeto do tipo File
	public File criaDiretorio(String directoryName) {
		File diretorio = new File(PATH, directoryName);
		return diretorio;
//		return diretorio.mkdir();

	}

	public boolean criaArquivo(String fileName) throws IOException {

		File arquivo = new File(getPATH(), fileName);
		return arquivo.createNewFile();
	}

}
