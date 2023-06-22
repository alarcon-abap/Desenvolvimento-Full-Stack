package model;

import java.io.Serializable;

/**
 *
 * @author olive
 */
public class Pessoa implements Serializable {

    private String id;
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String id, String nome, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return   "ID: " + id + "\n"
                + "Nome: " + nome + "\n"
                + "Endereço: " + endereco + "\n"
                + "Telefone: " + telefone;
    }
}
