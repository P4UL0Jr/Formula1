package Formula1.Repositorio;

import java.util.ArrayList;

import Formula1.Entidade.Equipe;
import Formula1.Entidade.Piloto;
import Formula1.Entidade.VeiculoF1;

public class PilotoRepositorio {
    public static ArrayList<Piloto> pilotoList = new ArrayList<>();

    public static Piloto removendoEquipeDaLista() {
        if(pilotoList.isEmpty()) {
            System.out.println("A fila esta vazia");
        }else {
            System.out.println("removeu o piloto: "+pilotoList.get(0).getNome());
            return pilotoList.removeFirst();
            
        }
        return null;
    }
    public void mostrandoTodosPilotos(){
        System.out.println("Mostrando pilotos!");

        for (int index =0; index<pilotoList.size(); index++){
            System.out.println("||||| PILOTO "+index+1+" |||||");
            System.out.println(" Nome - "+ pilotoList.get(index).getNome());
            System.out.println(" Nacionalidade - "+ pilotoList.get(index).getNacionalidade());
            System.out.println(" Modelo - "+ pilotoList.get(index).getVeiculo().getModelo());
            System.out.println(" Velocidade - "+ pilotoList.get(index).getVeiculo().getVelocidadeMaxima());
            
        }
    }


    
}
