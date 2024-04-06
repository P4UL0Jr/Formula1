package Formula1.GUI;
import Formula1.Entidade.Piloto;
import Formula1.Entidade.VeiculoF1;
import Formula1.Repositorio.EquipeRepositorio;
import Formula1.Entidade.Equipe;
import Formula1.Repositorio.PilotoRepositorio;
import Formula1.Repositorio.VeiculoRepositorio;
import Formula1.Servico.EquipeServico;
import Formula1.Servico.PilotoServico;
import Formula1.Servico.VeiculoServico;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //////////////
        VeiculoF1 v1 = new VeiculoF1("CarroTeste1", 442.2);
        Piloto p1 = new Piloto("Piloto1Teste","NacionaliadeP1Teste", v1);
        VeiculoF1 v2 = new VeiculoF1("CarroTeste2", 354.4);
        Piloto p2 = new Piloto("Piloto2Teste", "NacionalidadeP2Teste", v2);
        EquipeServico.criandoEquipe("Equipe1Teste", p1, p2);
        //////////////////
        System.out.println("Bem-Vindo(a) a FormulaF1\n");
        int i = 1;
        while (i!=2) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("[1] Registrar nova Equipe");
            System.out.println("[2] Listar todas equipes registradas");
            System.out.println("[3] Excluir");
            System.out.print("--> ");
            int escolha = sc.nextInt();

            try {

                switch (escolha) {
                    case 1:

                        System.out.println("Modelo do carro: ");
                        String nomeCarro1 = sc.nextLine();
                        System.out.println("Velocidade maxima: ");
                        Double velocidadeMaxima1 = sc.nextDouble();
                        VeiculoF1 novoF1 = new VeiculoF1(nomeCarro1, velocidadeMaxima1);
                        VeiculoServico.adicionarVeiculo(novoF1);
                        System.out.println("Nome do piloto: ");
                        String nomePiloto1 = sc.nextLine();
                        System.out.println("Nacionalidade: ");
                        String nacionalidade1 = sc.nextLine();
                        Piloto piloto1 = new Piloto(nomePiloto1, nacionalidade1, novoF1);
                        PilotoServico.salvandoPiloto(piloto1);

                        System.out.println("Modelo do carro: ");
                        String nomeCarro2 = sc.nextLine();
                        System.out.println("Velocidade maxima: ");
                        Double velocidadeMaxima2 = sc.nextDouble();
                        VeiculoF1 novoF2 = new VeiculoF1(nomeCarro2, velocidadeMaxima2);
                        VeiculoServico.adicionarVeiculo(novoF2);
                        System.out.println("Nome do piloto: ");
                        String nomePiloto2 = sc.nextLine();
                        System.out.println("Nacionalidade: ");
                        String nacionalidade2 = sc.nextLine();
                        Piloto piloto2 = new Piloto(nomePiloto2, nacionalidade2, novoF2);
                        PilotoServico.salvandoPiloto(piloto2);

                        System.out.println("Nome da equipe: ");
                        String nomeEquipe = sc.nextLine();
                        EquipeServico.criandoEquipe(nomeEquipe, piloto1, piloto2);


                        break;
                    case 2:
                        EquipeRepositorio.print();
                        break;
                    case 3:
                        exclusao();
                    default:
                        System.out.println("Opção inválida, tente novamente!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Opção inválida, tente novamente!");
            }



        }
        sc.close();
    }


    public static void exclusao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Excluir");
        System.out.println("[1] Remover ultimo veiculo");
        System.out.println("[2] Remover primeiro piloto");
        System.out.println("[3] Remover equipe");
        System.out.print("-->");
        int escolha = sc.nextInt();
        try {
            switch (escolha) {
                case 1:
                    System.out.println("Removendo veiculo");
                    EquipeRepositorio.removerElemento(null,null,null,VeiculoRepositorio.removerVeiculo());
                    break;
                case 2:
                    System.out.println("Removendo piloto");
                    EquipeRepositorio.removerElemento(null,null,PilotoRepositorio.removendoEquipeDaLista(), null);
                    break;
                case 3:
                    System.out.println("Removendo equipe");
                    System.out.println("Nome da equipe a ser removida");
                    String nomeEquipe = "Equipe1Teste"; //sc.nextLine();
                    EquipeRepositorio.removerElemento(null,nomeEquipe,null,null);
                    break;
            }
        }catch (Exception e){
            System.out.println("Opção inválida, tente novamente!");
        }
    }
}