package application;

import entities.Aluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Aluno> list = new ArrayList<>();

        System.out.println();
        System.out.print("Entre com o numero de Aluno: ");
        int n = sc.nextInt();

        // pegando os dados do aluno
        for (int i = 1; i <= n ; i++) {
            System.out.println("Aluno #" + i + ":");
            System.out.println();
        
            System.out.print("Matricula: ");
            int matricula = sc.nextInt();

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Quantidade de Presença: ");
            int presenca = sc.nextInt();

            Aluno aluno = new Aluno(matricula, nome, presenca);
            list.add(aluno);

            // pegando as notas
            for (int j = 1; j <= 3 ; j++) {
                System.out.println("Informe a nota #" + j + ": ");
                double nota = sc.nextDouble();
                aluno.addNotas(nota);
            }
        }

        //LEITURA
        System.out.println();
        System.out.println("RESULTADOS DOS ALUNOS:");
        System.out.println();
        
        // Imprimindo os resutados do aluno
        for (Aluno aluno : list) {
            System.out.println("Aluno: "+ aluno.getName());
            System.out.println("Notas: " + aluno.mostraNotas());
            System.out.println("Media: " + aluno.media());
            System.out.println("Porcentagem de Presença: " + aluno.porcentagem() + "%");
            System.out.println("Status do Aluno: " + aluno.statusAluno());
            System.out.println();
        }
        sc.close();
    }
}
