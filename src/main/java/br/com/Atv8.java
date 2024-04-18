package br.com;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Atv8{
    public static void main( String[] args ) {
        Pessoa pessoa = null;
        Path inputPath = Paths.get("pessoa.dat");

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(inputPath.toFile()))) {
            pessoa = (Pessoa) inputStream.readObject();
            System.out.println("Detalhes da pessoa:");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            // Adicione outros detalhes da pessoa conforme necessário
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while reading the input file.");
            e.printStackTrace();
        }
    }
}
