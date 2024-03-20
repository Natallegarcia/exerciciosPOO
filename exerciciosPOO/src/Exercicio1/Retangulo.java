/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Exercicio1;

/**
 *
 * @author Rayssa Alves <coiso2024.go@gmail.com>
 *@date 18/03/2024
 *@brief Class Retangulo
 */
public class Retangulo {

    double largura; 
    double altura; 
  
public double Area(double largura, double altura){
    return largura * altura;
}

public double Perimetro(double largura, double altura){
    return 2*(altura+largura);
}

public double Diagonal(double largura, double altura){
  return  Math.sqrt((Math.pow(largura, 2) + Math.pow(altura, 2)));
}
}
