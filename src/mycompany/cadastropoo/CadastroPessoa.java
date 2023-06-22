package mycompany.cadastropoo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;

public class CadastroPessoa {

    private static final String ARQUIVO_PESSOAS = "pessoas.txt";

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("1 - Cadastrar Pessoa Física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.println("3 - Listar Pessoas Cadastradas");
            System.out.println("4 - Salvar em arquivo");
            System.out.println("5 - Carregar de arquivo");
            System.out.println("6 - Excluir Pessoa Fisica");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("ID: ");
                    String idPF = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomePF = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String enderecoPF = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefonePF = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    PessoaFisica pessoaFisica = new PessoaFisica(idPF, nomePF, enderecoPF, telefonePF, cpf);
                    pessoas.add(pessoaFisica);
                    System.out.println("Pessoa física cadastrada com sucesso!");
                    break;

                case 2:
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Id: ");
                    String idPJ = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomePJ = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String enderecoPJ = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefonePJ = scanner.nextLine();
                    System.out.print("CNPJ: ");
                    String cnpj = scanner.nextLine();

                    PessoaJuridica pessoaJuridica = new PessoaJuridica(idPJ, nomePJ, enderecoPJ, telefonePJ, cnpj);
                    pessoas.add(pessoaJuridica);
                    System.out.println("Pessoa jurídica cadastrada com sucesso!");
                    break;

                case 3:
                    System.out.println("Pessoas cadastradas:");
                    for (Pessoa pessoa : pessoas) {
                        System.out.println(pessoa);
                        System.out.println("-----------------------");
                    }
                    break;

                case 4:
                    try {
                    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(ARQUIVO_PESSOAS));
                    outputStream.writeObject(pessoas);
                    outputStream.close();
                    System.out.println("Dados salvos em arquivo com sucesso!");
                } catch (IOException e) {
                    System.out.println("Erro ao salvar dados em arquivo: " + e.getMessage());
                }
                break;

                case 5:
                    try {
                    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(ARQUIVO_PESSOAS));
                    pessoas = (ArrayList<Pessoa>) inputStream.readObject();
                    inputStream.close();
                    System.out.println("Dados carregados de arquivo com sucesso!");
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Erro ao carregar dados de arquivo: " + e.getMessage());
                }
                break;

                case 6:
                    
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Excluir ID: ");
                    String idDelete = scanner.nextLine();
                    System.out.print("Pessoa Fisica Excluida com Sucesso! ");
                    break;


                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha uma opção válida.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}
