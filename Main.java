import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Digite um valor para retirada: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
// condiçao valor invalido
        while (valor == 0 || valor == 1 || valor == 3) {
            System.out.print("Valor invalido! Estao disponiveis notas de 2, 5, 10, 20, 50, 100 e 200! ");
            valor = sc.nextInt();
        }
// condiçao de numeros exceçao
        String exc = String.valueOf(valor);
        int cond = exc.charAt(exc.length() - 1) - '0';
// repetiçao de contagem de notas e retorno do valor
        while (valor > 0){
            if (cond == 1 || cond == 3) {
                valor = valor - 5;
                valor = cont200(valor);
                valor = cont100(valor);
                valor = cont50(valor);
                valor = cont20(valor);
                valor = cont10(valor);
                System.out.println("1 nota(s) de 5");
                valor = cont2(valor);
            } else if (cond == 6 || cond == 8) {
                valor = cont200(valor);
                valor = cont100(valor);
                valor = cont50(valor);
                valor = cont20(valor);
                valor = cont10(valor);
                valor = cont2(valor);
            } else {
                valor = cont200(valor);
                valor = cont100(valor);
                valor = cont50(valor);
                valor = cont20(valor);
                valor = cont10(valor);
                valor = cont5(valor);
                valor = cont2(valor);
            }
        }
    }

// funçoes de contagem de notas
    private static int cont2(int x) {
        int qtd = x / 2;
        if (qtd != 0){
            System.out.println(qtd + " nota(s) de 2");
        }
        return x % 2;
    }

    private static int cont5(int x) {
        int qtd = x / 5;
        if (qtd != 0){
            System.out.println(qtd + " nota(s) de 5");
        }
        return x % 5;
    }

    private static int cont10(int x) {
        int qtd = x / 10;
        if (qtd != 0){
            System.out.println(qtd + " nota(s) de 10");
        }
        return x % 10;
    }

    private static int cont20(int x) {
        int qtd = x / 20;
        if (qtd != 0){
            System.out.println(qtd + " nota(s) de 20");
        }
        return x % 20;
    }

    private static int cont50(int x) {
        int qtd = x / 50;
        if (qtd != 0){
            System.out.println(qtd + " nota(s) de 50");
        }
        return x % 50;
    }

    private static int cont100(int x) {
        int qtd = x / 100;
        if (qtd != 0){
            System.out.println(qtd + " nota(s) de 100");
        }
        return x % 100;
    }

    private static int cont200(int x) {
        int qtd = x / 200;
        if (qtd != 0){
            System.out.println(qtd + " nota(s) de 200");
        }
        return x % 200;
    }
}