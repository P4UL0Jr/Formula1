package Formula1.Servico;

import Formula1.Entidade.VeiculoF1;
import Formula1.Inteface.IVeiculoServico;
import Formula1.Repositorio.VeiculoRepositorio;

public class VeiculoServico implements IVeiculoServico{
  
  public static void adicionarVeiculo(VeiculoF1 veiculo) {
    System.out.println("Veiculo " + veiculo.getModelo()+" adicionado com sucesso");
    VeiculoRepositorio.listaVeiculo.addLast(veiculo);
  }
  
  public static VeiculoF1 removerVeiculo(String modelo){
    System.out.println("Veiculo removido com sucesso!");
    return null;
  }

  public static VeiculoF1 buscarVeiculo(String modelo){
    return null;

  }

  public static VeiculoF1 listarVeiculos(){
    return null;
  }
}