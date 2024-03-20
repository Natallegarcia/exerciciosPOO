/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;
import java.util.Scanner;

/**
 *
 * @author Nátalle
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Aluno al = new Aluno ();
        
        System.out.println("Informe o nome do Aluno: ");
        al.nome = sc.nextLine();
        System.out.println("Informe a média do PRIMEIRO trimestre");
        al.primeiroTri = sc.nextDouble();
         System.out.println("Informe a média do SEGUNDO trimestre");
        al.segundoTri = sc.nextDouble();
        System.out.println("Informe a média do TERCEIRO trimestre");
        al.terceiroTri = sc.nextDouble();
        
        
        
        if (al.notaFinal(al.primeiroTri, al.segundoTri, al.terceiroTri) <=5.9) {
		          System.out.println("Reprovado");
                          System.out.println("Média Geral   " + al.notaFinal(al.primeiroTri, al.segundoTri, al.terceiroTri) );
                          System.out.println("Faltou " +  al.resultado(al.media, al.notaFinal(al.primeiroTri, al.segundoTri, al.terceiroTri)) + "   pontos");
	} else if (al.notaFinal(al.primeiroTri, al.segundoTri, al.terceiroTri) >=6.0) {
		          System.out.println("Aprovado!! ");
                          System.out.println("Média Geral   " + al.notaFinal(al.primeiroTri, al.segundoTri, al.terceiroTri));
        }
        
        
        
        
        
        
        
    }
}
        


    
      


        


