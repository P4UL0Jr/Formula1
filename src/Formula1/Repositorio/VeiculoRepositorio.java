package Formula1.Repositorio;
import java.util.ArrayList;
import Formula1.Entidade.VeiculoF1;
import Formula1.Inteface.IVeiculoRepositorio;

public class VeiculoRepositorio implements IVeiculoRepositorio {
    public static ArrayList<VeiculoF1> listaVeiculo = new ArrayList<VeiculoF1>();


    public static void ultVeiculo(){
        if (listaVeiculo.isEmpty()) {
            System.out.println("A pilha está vazia");
        }else{
            System.out.println("Modelo: "+ listaVeiculo.getLast().getModelo()+" | Vel maxima: "+ listaVeiculo.getLast().getVelocidadeMaxima());  
        }
		
    }



    public void buscarVeiculo() {

    }

}