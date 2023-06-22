/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author olive
 */
public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String id, String nome, String endereco, String telefone, String cnpj) {
        super(id, nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "CNPJ: " + cnpj;
    }
}
