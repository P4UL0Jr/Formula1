package Formula1.Entidade;

import java.util.Scanner;

public class Piloto {
    private String nome;
    private String nacionalidade;
    private String experiencia;
    private Veiculo veiculo;
    private Piloto proximoPiloto;



    public Piloto(String nome, String nacionalidade, String experiencia, Veiculo veiculo, Piloto piloto) {

        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setExperiencia(experiencia);
        this.setVeiculo(veiculo);
        this.setProximoPiloto(piloto);
    }

    public Piloto(String nomePiloto2, String nacionalidadePiloto2, String anoDeExperienciaPiloto2, String modeloCarroPiloto2, String velocidadeMaximaPiloto2, String pesoPiloto2) {

    }

    public Piloto() {

    }

    static Piloto salvandoDadosPiloto1(){
        Scanner inputDoPiloto = new Scanner(System.in);
        Scanner inputDoPilotoNumber = new Scanner(System.in);
        System.out.println("Digite o nome do PILOTO 1 ");
        String nomePiloto1 = inputDoPiloto.nextLine();
        System.out.println("Digite a nacionalidade do PILOTO 1");
        String nacionalidadePiloto1 = inputDoPiloto.nextLine();
        System.out.println("Digite o(os) anos de experiencia do PILOTO 1");
        String anoDeExperienciaPiloto1 = inputDoPilotoNumber.nextLine();
        System.out.println("Digite o modelo do carro do PILOTO 1");
        String modeloCarroPiloto1 = inputDoPiloto.nextLine();
        System.out.println("Digite a velocidade maxima do carro do PILOTO 1");
        String velocidadeMaximaPiloto1 = inputDoPilotoNumber.nextLine();
        System.out.println("Digite o peso do carro do PILOTO 1");
        String pesoPiloto1 = inputDoPilotoNumber.nextLine();
        Piloto p1 = new Piloto(nomePiloto1,nacionalidadePiloto1,anoDeExperienciaPiloto1,modeloCarroPiloto1,velocidadeMaximaPiloto1,pesoPiloto1);
        return p1;
    }
    static Piloto salvandoDadosPiloto2(){
        Scanner inputDoPiloto = new Scanner(System.in);
        Scanner inputDoPilotoNumber = new Scanner(System.in);
        System.out.println("Digite o nome do PILOTO 2 ");
        String nomePiloto2 = inputDoPiloto.nextLine();
        System.out.println("Digite a nacionalidade do PILOTO 2");
        String nacionalidadePiloto2 = inputDoPiloto.nextLine();
        System.out.println("Digite o(os) anos de experiencia do PILOTO 2");
        String anoDeExperienciaPiloto2 = inputDoPilotoNumber.nextLine();
        System.out.println("Digite o modelo do carro do PILOTO 2");
        String modeloCarroPiloto2 = inputDoPiloto.nextLine();
        System.out.println("Digite a velocidade maxima do carro do PILOTO 2");
        String velocidadeMaximaPiloto2 = inputDoPilotoNumber.nextLine();
        System.out.println("Digite o peso do carro do PILOTO 2");
        String pesoPiloto2 = inputDoPilotoNumber.nextLine();
        Piloto p2 = new Piloto(nomePiloto2,nacionalidadePiloto2,anoDeExperienciaPiloto2,modeloCarroPiloto2,velocidadeMaximaPiloto2,pesoPiloto2);
        return p2;
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

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Piloto getProximoPiloto() {
        return proximoPiloto;
    }

    public void setProximoPiloto(Piloto proximoPiloto) {
        this.proximoPiloto = proximoPiloto;
    }
}
