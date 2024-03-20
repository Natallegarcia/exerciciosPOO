/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;
import java.util.Scanner;

/**
 *
 * @author Nátalle
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Empregado emp = new Empregado();
        
        System.out.println("Informe o nome do funcionário");
        emp.nome = sc.nextLine();
        System.out.println("Informe o valor do salário bruto");
        emp.salarioBruto = sc.nextDouble();
        System.out.println("Informe a taxa de porcentagem do acréscimo salarial: ");
        emp.taxa = sc.nextDouble();
        
        System.out.println("Nome: " + emp.nome);
        System.out.println("Salário Bruto: " + emp.DadosFuncionario(emp.salarioBruto));
        System.out.println("Acréscimo salarial '%' : " + emp.taxa);
        System.out.println("Salário com aumento: " + emp.IncrementarSalario(emp.salarioBruto, emp.taxa));
        
    }
}
