import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        File file = new File("entrada.txt");
        try {
            Scanner sc = new Scanner(file);
            LinkedList<Aluno> alunos = new LinkedList<>();
            while (sc.hasNextLine()) {
                String linhaAnterior = sc.nextLine();
                String linhaAtual = sc.nextLine();
                String[] camposAnteriores = linhaAnterior.split(" ");
                String[] camposAtuais = linhaAtual.split(" ");

                Long matricula = Long.parseLong(camposAnteriores[0]);
                String nome = camposAnteriores[1] + " " + camposAnteriores[2];
                Double p1 = Double.parseDouble(camposAtuais[0]);
                Double p2 = Double.parseDouble(camposAtuais[1]);
                Double t1 = Double.parseDouble(camposAtuais[2]);
                Double t2 = Double.parseDouble(camposAtuais[3]);

                Aluno aluno = new Aluno(matricula, nome, p1, p2, t1, t2);
                alunos.add(aluno);
            }
            //PrintWriter, (Exercicio: Utilizar o PrintWriter para
            // imprimir os alunos em um arquivo chamado
            // saida.txt)
            Collections.sort(alunos);
            PrintWriter writer = new PrintWriter("saida.txt");
            for(Aluno aluno : alunos){
                writer.println(aluno);
            }
            sc.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!" + e.getMessage());
        }
    }
}
