/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1593111
 */
public class Carro extends Veiculo implements Avaliavel {
    private int quantidadePortas;
    private int nota;
    
    public Carro(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo status, int qunatidadePortas){
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.quantidadePortas = quantidadePortas;
    }
    @Override
    public void avaliar(int nota){
        this.nota = nota;
        System.out.println("Carro avaliado com a nota: " + nota);
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("Carro");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano: " + getAnoFabricacao());
        System.out.println("Portas: " + quantidadePortas);
        System.out.println("Status: " + getStatus());
        System.out.println("Nota: " + nota);        
    }
    @Override
    public boolean possuiSeguroEspecial(){
        return false;
    }
}
