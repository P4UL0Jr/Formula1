package Formula1.Repositorio;

import Formula1.Entidade.Piloto;

public class PilotoRepositorio {
    public static Piloto primeiro;
    public void lista(){
        primeiro=null;
    }
    public void print(){
         for(Piloto n = primeiro; n != null; n = n.getProximoPiloto()){
            System.out.println("nome: "+n.getNome()+" carro: "+n.getVeiculo());
             }
        }

    public static Piloto getPrimeiro() {
        return primeiro;
    }

    public static void setPrimeiro(Piloto primeiro) {
        PilotoRepositorio.primeiro = primeiro;
    }
}
