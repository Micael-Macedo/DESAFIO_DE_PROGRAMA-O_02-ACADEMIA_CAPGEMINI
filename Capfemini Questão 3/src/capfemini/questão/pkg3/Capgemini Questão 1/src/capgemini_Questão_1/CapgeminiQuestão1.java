/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capgemini_Questão_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author micae
 */
public class CapgeminiQuestão1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num;
        
        //Definir a quantidade dos valores para a lista
	do{
            System.out.println("Digite a quantidade impar de elementos para a lista de número:");
            num =input.nextInt();
            //Conferir se o valor é impar
            if(num%2 == 0){
                System.out.println("Opção inválida, digite um valor impar");
            }
	}while(num%2 == 0);
        
	//Declaração da lista	
	List<Integer> lista = new ArrayList<>();
        int i, j, aux, maior;
	//Armazenar valores na lista
	for(i = 0; i<num;i++){
            System.out.println("Digite o valor para a posição: " + i);
            int valor = input.nextInt();
            lista.add(valor);
	}
        //Organizar os valores da lista
	for (i = 0; i < num; i++){
            for (j = 0; j < num; j++){
                if (lista.get(i) < lista.get(j)){
                    aux = lista.get(i);
                    maior = lista.get(j);
                    lista.set(i,maior);
                    lista.set(j, aux);
                }
            }
        }
        //Imprime a mediana da lista
	System.out.println("Valor na Mediana = " + lista.get(num/2));
    }
    
}
