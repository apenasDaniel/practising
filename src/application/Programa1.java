package application;

import entities.Produto1;

import java.util.Locale;
import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Produto1 produto = new Produto1();
        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome: ");
        produto.name = scan.nextLine();
        System.out.print("Preço: ");
        produto.price = scan.nextDouble();
        System.out.print("Quantidade no estoque: ");
        produto.quantity = scan.nextInt();

        System.out.println(produto.name + produto.price + produto.quantity);



        scan.close();
    }
}
