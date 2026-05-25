/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1593111
 */
public class Van extends Veiculo implements Avaliavel, Inspecionavel {
    private int maxPassageiros;
    private int nota;
    
    public Van(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo status, int maxPassageiros){
     super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
     this.maxPassageiros = maxPassageiros;
    }
    
   @Override
   public void avaliar(int nota){
       this.nota = nota;
        System.out.println("Van avaliada com a nota: " + nota);
   }
   @Override
    public void realizarInspecao(){
        System.out.println("Inspecao realizada na van: " + getModelo());
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("Moto");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Status: " + getStatus());
        System.out.println("Maximo passageiros: " + maxPassageiros);
    }
    
    @Override
    public boolean possuiSeguroEspecial(){
        return false;
    }
}
