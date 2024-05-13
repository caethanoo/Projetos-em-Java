package exercicios.deintroducao.nojava;
import java.util.Scanner;

public class clubedeFutebol {
    public static void main(String[] args) {
        int idade;
        String nome;
        Scanner categoria = new Scanner(System.in);
        int menu;


        System.out.println("******************");
        System.out.println("Qual seu nome?");


        nome = categoria.nextLine();
        System.out.println("Olá" + "" + nome);

        System.out.println("Qual sua idade?");
        idade = categoria.nextInt();
        System.out.println("Sua idade é " + " " + idade);

        System.out.println("CATEGORIA:");
        System.out.println("1: De 05 a 10");
        System.out.println("2: De 11 a 15");
        System.out.println("3 :De 16 a 20");
        System.out.println("4: De 21 a 25");

        System.out.println("Escolha uma opção: ");

        menu = categoria.nextInt();



        switch (menu){
            case 1:
                System.out.println("INFANTIL");
                break;
            case 2:
                System.out.println("JUVENIL");
                break;
            case 3:
                System.out.println("JUNIOR");
                break;
            case 4:
                System.out.println("PROFISSIONAL");
                break;

            default:
                System.out.println("Apenas números de  1 a 4");


        }










    }
}
