package Formula1.Repositorio;
import java.util.ArrayList;

import Formula1.Entidade.VeiculoF1;
import Formula1.Inteface.IVeiculoRepositorio;

public class VeiculoRepositorio implements IVeiculoRepositorio {
    public static ArrayList listaVeiculo = new ArrayList<VeiculoF1>();

    public void listarVeiculos(){
        System.out.println("Lista de veiculos: \n");
        for (VeiculoF1 veiculo : listaVeiculo) {
            System.out.println("| Velocidade max: " + veiculo.getVelocidadeMaxima() + " | Peso: "+veiculo.getPeso()+" | Modelo: "+veiculo.getModelo()+" |");
        }
    }
    public void removerVeiculo(){
        if (listaVeiculo.isEmpty()) {
            System.out.println("lista vazia");
        }else{
            System.out.println("Veiculo removido - "+listaVeiculo.removeLast());   
         }
    }
    
}