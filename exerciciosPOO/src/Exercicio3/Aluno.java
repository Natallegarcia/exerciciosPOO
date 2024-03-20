/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

/**
 *
 * @author Nátalle
 */
public class Aluno {
    double media = 6.0;
    String nome; 
    double primeiroTri;
    double segundoTri;
    double terceiroTri;
    double notaFinal;
   
    
    
  public String getNome(){
     return nome;
 }
 public void setNome (String nome ){
     this.nome = nome;
 }
  public double getPrimeiro(){
     return primeiroTri;
 }
 public void setPrimeiro (double primeiroTri ){
     this.primeiroTri = primeiroTri;
 }    
   public double getSegundo(){
     return segundoTri;
 }
 public void setSegundo (double segundoTri ){
     this.segundoTri = segundoTri;
 }
 public double getTerceiro(){
     return terceiroTri;
 }
 public void setTerceiro (double terceiroTri ){
     this.terceiroTri = terceiroTri;
 }
 public double  notaFinal (double primeiroTri, double segundoTri, double terceiroTri){
        return (primeiroTri + segundoTri+ terceiroTri)/3;
 
 }
 public double resultado ( double media, double notaFinal){
         return  media - notaFinal; 
     
 }
}
