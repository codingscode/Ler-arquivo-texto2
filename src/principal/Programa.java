package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		
		String caminho = "C:\\.......\\textoexemplo.txt";
		FileReader leitor = null;
		BufferedReader carregador = null;
		
		try {
			leitor = new FileReader(caminho);
			carregador = new BufferedReader(leitor);
			
			String linha = carregador.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = carregador.readLine();
			}
			
		}
		catch(IOException e) {
		   System.out.println("Erro: " + e.getMessage());
		}
		finally {
			try {
				if(carregador != null) {
					carregador.close();
				}
                if(leitor != null) {
					leitor.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
