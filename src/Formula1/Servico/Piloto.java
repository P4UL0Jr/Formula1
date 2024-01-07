package Formula1;

import java.util.Scanner;

public class Piloto extends VeiculoF1{
    private String nome;
    private String nacionalidade;
    private int experiencia;



    public Piloto(String nome, String nacionalidade, int experiencia, String modelo, double velocidadeMaxima, double peso) {


        this.setModelo(modelo);
        this.setVelocidadeMaxima(velocidadeMaxima);
        this.setPeso(peso);
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setExperiencia(experiencia);
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
        int anoDeExperienciaPiloto1 = inputDoPilotoNumber.nextInt();
        System.out.println("Digite o modelo do carro do PILOTO 1");
        String modeloCarroPiloto1 = inputDoPiloto.nextLine();
        System.out.println("Digite a velocidade maxima do carro do PILOTO 1");
        double velocidadeMaximaPiloto1 = inputDoPilotoNumber.nextDouble();
        System.out.println("Digite o peso do carro do PILOTO 1");
        double pesoPiloto1 = inputDoPilotoNumber.nextDouble();
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
        int anoDeExperienciaPiloto2 = inputDoPilotoNumber.nextInt();
        System.out.println("Digite o modelo do carro do PILOTO 2");
        String modeloCarroPiloto2 = inputDoPiloto.nextLine();
        System.out.println("Digite a velocidade maxima do carro do PILOTO 2");
        double velocidadeMaximaPiloto2 = inputDoPilotoNumber.nextDouble();
        System.out.println("Digite o peso do carro do PILOTO 2");
        double pesoPiloto2 = inputDoPilotoNumber.nextDouble();
        Piloto p2 = new Piloto(nomePiloto2,nacionalidadePiloto2,anoDeExperienciaPiloto2,modeloCarroPiloto2,velocidadeMaximaPiloto2,pesoPiloto2);
        return p2;
    }

    @Override
    public void exibirEspecificacoes() {

        System.out.println("Velocidade Maxima: "+getVelocidadeMaxima());
        System.out.println("Peso: "+getPeso());
        System.out.println("Modelo: "+getModelo());
        System.out.println(getNome());
        System.out.println(getNacionalidade());
        System.out.println(getExperiencia());
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
