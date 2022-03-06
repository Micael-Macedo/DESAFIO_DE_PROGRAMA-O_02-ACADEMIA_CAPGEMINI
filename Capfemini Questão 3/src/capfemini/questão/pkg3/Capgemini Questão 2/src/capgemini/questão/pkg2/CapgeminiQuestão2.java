/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capgemini.questão.pkg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author micae
 */
public class CapgeminiQuestão2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int tam, x;
        
        //Definir tamanho do vetor
	System.out.println("Digite o tamanho do vetor");
	tam = input.nextInt();
        //Definir o valor que deverá ser a diferença entre os valores da lista
	System.out.println("Digite o valor para ser a diferença");
        x = input.nextInt();
	
        List<Integer> vetor = new ArrayList<>();
	int i, j, pares = 0;
        //Armazenar valores na lista
	for(i = 0; i < tam; i++){
            System.out.println("Digite o valor na posição "+ i);
            int valor = input.nextInt();
            vetor.add(valor);
	}
        //Realiza a inspeção dos valores para encontrar pares que tenha o valor da sua diferença 
	for(j = 0; j < tam; j++){
            for(i = 0; i < tam; i++){
		if((vetor.get(i) - vetor.get(j) == x) && !(Objects.equals(vetor.get(i), vetor.get(j)))){
                    pares++;
		}
            }	
	}
        //Imprime a quantidade de número de elementos pares da lista com a diferença igual ao valor previamente declarado
	System.out.println("Quantidade de número de elementos pares do vetor com a diferença igual ao valor = " + pares);
    } 
}
