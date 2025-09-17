/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner enterScanner = new Scanner(System.in);
        double num_1;
        double num_2;

        System.out.println("Digite o primeiro número:");
        num_1 = enterScanner.nextInt();

        System.out.println("Digite o segundo número:");
        num_2 = enterScanner.nextInt();

        double c = num_1 - num_2; // subtração
        double d = num_1 * num_2; // multiplicação
        double e = num_1 / num_2; // divisão inteira

        System.out.println("O resultado da subtração: " + c);
        System.out.println("O resultado da multiplicação: " + d);
        System.out.println("O resultado da divisão: " + e);

        enterScanner.close();}}
        
        
    