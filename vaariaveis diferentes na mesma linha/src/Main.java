

import java.util.Scanner;
// esse comando importa o scanner para ser usado no programa

public class Main {
    public static void main(String[] args) {
// essa é a declaração do objeto

        Scanner sc = new Scanner(System.in);
        // aqui está sendo criada a variável que entrará pelo teclado, vai ser encerrada quando não precisar mais dela.

        String lerLiteral;
        int lerInteiro;
        Double lerReal;

        System.out.print ( " Digite uma sequência Palavra, Numero inteiro e Número Real: ");

        lerLiteral = sc.next();
        lerInteiro = sc.nextInt();
        lerReal = sc.nextDouble();
        System.out.println(" Agora veja o que digitou = ");
        System.out.println( lerLiteral );
        System.out.println( lerReal );
        System.out.println( lerInteiro );


    sc.close();
        // aqui termina o uso do teclado, o recurso scanner sendo encerrrado
    }
}