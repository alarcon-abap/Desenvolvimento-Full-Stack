/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author olive
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
        System.out.println("Pessoa Física Escluida com sucesso");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "CPF: " + cpf;
    }

}
