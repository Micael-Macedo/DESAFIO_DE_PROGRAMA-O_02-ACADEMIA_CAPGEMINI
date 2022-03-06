/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capfemini.questão.pkg3;

import java.util.Scanner;

/**
 *
 * @author micae
 */
public class CapgeminiQuestão3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int letras, Scont = 0;
        Scanner input = new Scanner(System.in);
	//Armazenamento da frase
	System.out.println("Digite o seu texto");
	String frase = input.nextLine();
        //Remoção dos espaços entre os textos
        String textos = frase.replace(" ", "");
        //Armazena a quantidade de letras da frase
        int qtdLetras = textos.length();
        //Realiza a raiz quadrada da quantidade de letras
        double rLetras = (double) Math.sqrt(qtdLetras);
        //Arredonda o valor caso o valor não seja inteiro
        int redondar = (int) Math.round(rLetras);
      
        //Armazenamento das letras na matriz
        char[][] pegString = new char[redondar][redondar];
        int quant= 0;
            for(int j = 0; j < redondar;j++){
                for(int i = 0; i < redondar;i++){
                    char[] posi = textos.toCharArray();
                    pegString[j][i] = posi[quant];
                    quant++;
                    if(quant == qtdLetras){
                        break;
                    }
                }
            }
        quant = 0;
        //Impressão das palavras codificadas
        for(int j = 0; j < redondar;j++){
            for(int i = 0; i < redondar;i++){
                System.out.print(pegString[i][j]);
                quant++;
                if(quant == frase.length()){
                    break;
                }
            }
            System.out.print(" ");
        }
    }
}
