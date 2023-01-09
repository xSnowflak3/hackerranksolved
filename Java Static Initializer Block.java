/* Enunciado:
Blocos Estáticos de Inicialização são executados sempre que uma classe é carregada, e você pode inicializar 
variáveis estáticas nesses blocos.

É hora de testar seu conhecimento em Blocos Estáticos de Inicialização. Você pode ler sobre isso aqui:
https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html

Você recebeu a classe Solution com o método main. Complete o código dado para que ele forneça a área de um paralelogramo
com largura B e altura H. Você deve ler as variáveis pelo standart input.

Se B<=0 e H<=0, o output deve ser: 
java.lang.Exception: Breadth and height must be positive

Formado o input:
Há duas linhas para o input. A primeira contem B, a segunda contem H.

Restrições 
-100<= B <= 100
-100<= H <= 100
*/

import java.io.*;
import java.util.*;

public class Solution {
static int breadthP;
        static int heightP;
        
        
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        int breadthP = scan.nextInt();
        int heightP = scan.nextInt();
        scan.close();

        if((breadthP <=0 || heightP <=0) || (100 <=breadthP || 100<=heightP )){
            System.out.println ("java.lang.Exception: Breadth and height must be positive");
        }else {
            int areaP = breadthP*heightP;
            System.out.println (areaP);
        }
    }
}



	
