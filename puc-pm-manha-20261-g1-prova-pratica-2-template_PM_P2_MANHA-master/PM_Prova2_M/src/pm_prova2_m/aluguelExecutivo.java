/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;
import java.util.ArrayList;

public class aluguelExecutivo extends Aluguel implements Avaliavel {
    private ArrayList<Veiculo> veiculos;
    private int nota;
    
    public aluguelExecutivo(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status){
        super(nomeCliente, quantidadeDias, valorTotal, status);
        
        veiculos = new ArrayList<>();
    }
    public void adicionarVeiculo(Veiculo v){
        veiculos.add(v);}
    @Override
   public void avaliar(int nota){
       this.nota = nota;
        System.out.println("Aluguel executivo avaliado com a nota: " + nota);
   }
   
   @Override
    public void exibirDetalhes(){
        System.out.println("Aluguel Executivo");
        System.out.println("Cliente: " + getNomeCliente());
        System.out.println("Nota: " + nota);
        
        for (Veiculo v : veiculos){
            System.out.println("-" + v.getModelo());
        }
    }
    
     @Override
    public boolean possuiSeguroIncluso(){
        return false;
    }
    
}
