package Formula1.Entidade;

import java.util.Scanner;

public class Piloto {
    private String nome;
    private String nacionalidade;
    private VeiculoF1 veiculo;
    

    public Piloto(String nome, String nacionalidade, VeiculoF1 veiculo) {

        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setVeiculo(veiculo);
        
    }

    public Piloto(String nomePiloto2, String nacionalidadePiloto2, String anoDeExperienciaPiloto2, String modeloCarroPiloto2, String velocidadeMaximaPiloto2, String pesoPiloto2) {

    }

    public Piloto() {

    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public VeiculoF1 getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(VeiculoF1 veiculo) {
        this.veiculo = veiculo;
    }

}
