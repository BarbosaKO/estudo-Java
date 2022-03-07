package Excecoes;

import java.io.*;

public class Excecao{
	public byte[] leLinha(){
		byte[] linha = new byte[22];
		try{
			System.in.read(linha);
		}catch(IOException e){
			e.printStackTrace();
		}
		return linha;
	}

	public void escreveLinha(){
		String linha = new String(leLinha());
		System.out.println(linha);
	}

	public static void main(String args[]){
		Excecao minhaExcecao = new Excecao();
		System.out.println("Escreva uma mensagem: ");
		minhaExcecao.escreveLinha();
	}
}
