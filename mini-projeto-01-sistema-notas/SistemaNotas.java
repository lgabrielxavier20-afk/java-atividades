import java.util.Scanner;

public class SistemaNotas {
    public static boolean aprovado(double nota) {
        return nota >= 7;
    }

    public static double media(double soma, int quantidade) {
        double media = soma / quantidade;
        return media;
    }

    public static double maior(double a, double b) {
        double maior = a;

        if (b >= maior) {
            maior = b;
        }
        return maior;
    }

    public static double menor(double a, double b) {
        double menor = a;
        if (b <= menor) {
            menor = b;
        }
        return menor;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double n;
        double maior = 0;
        double menor = 10;
        double soma = 0;
        double media = 0;
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a nota do aluno " + i + ": ");
            n = sc.nextDouble();

            soma += n;
            maior = maior(n, maior);
            menor = menor(n, menor);
            media = media(soma, 5);
            if (aprovado(n)) {
                aprovados++;
            } else {
                reprovados++;
            }

        }
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);


        sc.close();

    }
}
