package Formula1.Repositorio;
import java.util.ArrayList;
import Formula1.Entidade.VeiculoF1;
import Formula1.Inteface.IVeiculoRepositorio;

public class VeiculoRepositorio implements IVeiculoRepositorio {
    public static ArrayList<VeiculoF1> listaVeiculo = new ArrayList<VeiculoF1>();


    public void listarVeiculos(){
        System.out.println("Lista de veiculos: \n");
        for (VeiculoF1 veiculo : listaVeiculo) {
            System.out.println("| Velocidade max: " + veiculo.getVelocidadeMaxima() +" | Modelo: "+veiculo.getModelo()+" |");
        }
    }


    public static VeiculoF1 removerVeiculo(){
        if (listaVeiculo.isEmpty()) {
            System.out.println("lista vazia");
        }else{
            System.out.println("Veiculo removido - "+listaVeiculo.getLast().getModelo());
            return listaVeiculo.removeLast();
         }
        return null;
    }


    public void buscarVeiculo() {

    }

}