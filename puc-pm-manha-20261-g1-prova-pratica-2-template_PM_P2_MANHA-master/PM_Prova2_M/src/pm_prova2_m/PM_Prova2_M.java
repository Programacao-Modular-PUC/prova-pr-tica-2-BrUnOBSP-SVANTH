/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pm_prova2_m;
import java.util.ArrayList;
import java.util.Scanner;

public class PM_Prova2_M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Aluguel> alugueis = new ArrayList<>();
        
        Carro carro = new Carro(
        "AAA-1111", 
        "Civic",
        2022,
        250,
        10000,
        StatusVeiculo.DISPONIVEL,
        4);
        
        Moto moto = new Moto(
        "BBB-2222",
        "XRE 3000",
        2021,
        120,        
        5000,
        StatusVeiculo.DISPONIVEL,
        300);
        
        Van van = new Van(
        "CCC-3333",
        "Sprinter",
        2020,
        400,
        30000,
        StatusVeiculo.MANUTENCAO,
        15);
        
        veiculos.add(carro);
        veiculos.add(moto);
        veiculos.add(van);
        
        aluguelBasico basico = new aluguelBasico(
        "Bruno",
        3,
        750,
        StatusAluguel.ATIVO);
        
        aluguelExecutivo executivo = new aluguelExecutivo(
        "Carlos",
        5,
        2000,
        StatusAluguel.ATIVO);
        
        alugueis.add(basico);
        alugueis.add(executivo);
        
        int opcao;
        do{
            System.out.println("Menu");
            System.out.println("1 - Associar veiculo ao aluguel");
            System.out.println("2- Exibir veiculos");
            System.out.println("3- Exibir alugueis");
            System.out.println("4- Exibir veiculos disponiveis");
            System.out.println("5- Avaliar");
            System.out.println("6- Realizar inspecao");
            System.out.println("7- Remover veiculs em manutencao");
            System.out.println("0- Sair");
            
            opcao = sc.nextInt();
        
        switch(opcao){
            case 1:
                basico.adicionarVeiculo(carro);
                executivo.adicionarVeiculo(moto);
                
                System.out.println("Veiculos adicionados!");
                break;
                
            case 2:
                for (Veiculo v : veiculos){
                    v.exibirDetalhes();
                }
                break;
                
            case 3:
                for (Aluguel a : alugueis){
                    a.exibirDetalhes();
                }
                break;
            case 4:
                for (Veiculo v : veiculos){
                    if(v.getStatus() == StatusVeiculo.DISPONIVEL){
                        v.exibirDetalhes();
                    }
                }
                break;
            case 5:
                carro.avaliar(10);
                van.avaliar(9);
                break;
            case 6:
                moto.realizarInspecao();
                van.realizarInspecao();
                break;
                
            case 7:
                veiculos.removeIf(
                v -> v.getStatus() == StatusVeiculo.MANUTENCAO);
             System.out.println("Veiculos removidos!");
             break;
            case 0:
                System.out.println("Sistema encerrado!");
                break;
                
            default:
                System.out.println("opcao invalida");
        }
    
    }while (opcao != 0);
    sc.close();
}
}
    

