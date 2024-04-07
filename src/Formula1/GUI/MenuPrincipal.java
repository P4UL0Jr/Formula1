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
import java.lang.Exception;
import Formula1.Entidade.Piloto;
import Formula1.Entidade.VeiculoF1;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-Vindo(a) a FormulaF1\n");
        int i = 1;
        
        while (i!=2) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("[1] Registrar nova Equipe");
            System.out.println("[2] Listar todas equipes registradas");
            System.out.println("[3] Ultimo veiculo");
            System.out.println("[4] Primeiro piloto");
            System.out.println("[5] Excluir equipe");
            System.out.print("--> ");
            int escolha = sc.nextInt();

            try {

                switch (escolha) {
                    case 1:
                        System.out.println("Registrando nova equipe\n");
                        Thread.sleep(1000);

                        //piloto 1
                        System.out.println("Digite as informações do primeiro Piloto: \n");
                        sc.nextLine();
                        System.out.println("Modelo do carro: ");
                        String nomeCarro1 = sc.nextLine();
                        System.out.println("Velocidade maxima: ");
                        Double velocidadeMaxima1 = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Nome do piloto: ");
                        String nomePiloto1 = sc.nextLine();
                        System.out.println("Nacionalidade: ");
                        String nacionalidade1 = sc.nextLine();

                        VeiculoF1 novoF1 = new VeiculoF1(nomeCarro1, velocidadeMaxima1);
                        VeiculoServico.adicionarVeiculo(novoF1);
                        Piloto piloto1 = new Piloto(nomePiloto1, nacionalidade1, novoF1);
                        PilotoServico.salvandoPiloto(piloto1);

                        //piloto 2
                        System.out.println("\nDigite as informações do segundo Piloto: \n");
                        System.out.println("Modelo do carro: ");
                        String nomeCarro2 = sc.nextLine();
                        System.out.println("Velocidade maxima: ");
                        Double velocidadeMaxima2 = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Nome do piloto: ");
                        String nomePiloto2 = sc.nextLine();
                        System.out.println("Nacionalidade: ");
                        String nacionalidade2 = sc.nextLine();

                        VeiculoF1 novoF2 = new VeiculoF1(nomeCarro2, velocidadeMaxima2);
                        VeiculoServico.adicionarVeiculo(novoF2);
                        Piloto piloto2 = new Piloto(nomePiloto2, nacionalidade2, novoF2);
                        PilotoServico.salvandoPiloto(piloto2);

                        //equipe
                        System.out.println("Nome da equipe: ");
                        String nomeEquipe = sc.nextLine();
                        EquipeServico.criandoEquipe(nomeEquipe, piloto1, piloto2);
                        Thread.sleep(1000);
                        System.out.println("Equipe registrada com sucesso!\n");
                        Thread.sleep(2000);
                        
                        break;
                    case 2:
                        EquipeRepositorio.print();
                        break;
                    case 3:
                        VeiculoRepositorio.ultVeiculo();
                        break;
                    case 4:
                        PilotoRepositorio.PrimeiroPiloto();
                        break;
                    case 5:
                        sc.nextLine();
                        System.out.println("Digite o nome da equipe que deseja excluir: ");
                        String nomeEquipeExcluir = sc.nextLine();
                        System.out.println("Excluindo equipe " + nomeEquipeExcluir + "...");
                        EquipeRepositorio.removerElemento(null, nomeEquipeExcluir);
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente!");
                        break;
                 }} catch (Exception e) {
                            System.out.println("Opção inválida, tente novamente!");
                            e.printStackTrace();
                            System.err.println(e.getMessage());
                        }
            }

        sc.close();

        }


 
}