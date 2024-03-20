/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Exercicio1;

/**
 *
 * @author Rayssa Alves <coiso2024.go@gmail.com>
 *@date 18/03/2024
 *@brief Class Principal
 */
public class Principal {
    public static void main(String[] args) {
        
        Retangulo r = new Retangulo();
        
        System.out.println("Informe a largura do retângulo");
        r.altura = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Informe a altura do retângulo");
        r.largura =  new java.util.Scanner(System.in).nextDouble();
        System.out.println("Area: " + r.Area(r.largura, r.altura));
        System.out.println("Perimetro: " + r.Perimetro(r.largura, r.altura));
        System.out.println("Diagonal: " + r.Diagonal(r.largura, r.altura));
       
    }
}
	