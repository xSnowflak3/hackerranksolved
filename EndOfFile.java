/*O desafio é 
1- ler N linhas até alcançar EOF 
2- imprimir N linhas contendo:
    a) o número da linha + espaço
    b) o conteúdo da linha 

observação: Hint: Java's Scanner.hasNext() method is helpful for this problem.
 hasNext serve pra saber se ainda há alguma coisa para ler
*/

import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       int counter = 1; // o contador vai contar quantas linhas tem

       while (scan.hasNext()){ //while para o loop acontecer enquanto tiver algo para ler
       	System.out.println (counter + " " + scan.nextLine()); //nextLine serve para imprimir toda a linha
       	i++
       }


    }
}