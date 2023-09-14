
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AlarconAbap
 */
public class PessoaFisica extends Pessoa {

    List<Pessoa> pessoas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    private String cpf;

    public PessoaFisica(String id, String nome, String endereco, String telefone, String cpf) {
        super(id, nome, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void excluirPessoa(String id){
        pessoas.remove(id);
        System.out.println("Pessoa Física Deletada com sucesso");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "CPF: " + cpf;
    }

}
