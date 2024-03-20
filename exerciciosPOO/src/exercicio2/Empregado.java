/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author Nátalle
 */
public class Empregado {
     String nome; 
    double salarioBruto;
    double taxa ; 

    
 public String getNome(){
     return nome;
 }
 public void setNome (String nome){
     this.nome = nome;
 }
public double DadosFuncionario( double salarioBruto){
    return salarioBruto;  
}
public double  IncrementarSalario (double salarioBruto, double taxa){
        return  salarioBruto + salarioBruto*(taxa/100);
}

}
