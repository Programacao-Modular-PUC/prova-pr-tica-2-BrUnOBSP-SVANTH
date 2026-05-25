/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;
import java.util.ArrayList;

public class aluguelBasico extends Aluguel{
    private ArrayList<Veiculo> veiculos;
    
    public aluguelBasico(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status){
        super(nomeCliente, quantidadeDias, valorTotal, status);
        veiculos = new ArrayList<>();
    }
    public void adicionarVeiculo(Veiculo v){
        veiculos.add(v);
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("Aluguel Basico");
        System.out.println("Cliente: " + getNomeCliente());
        System.out.println("Dias: " + getQuantidadeDias());
        
        for (Veiculo v : veiculos){
            System.out.println("-" + v.getModelo());
        }
    }
     @Override
    public boolean possuiSeguroIncluso(){
        return false;
    }
}
