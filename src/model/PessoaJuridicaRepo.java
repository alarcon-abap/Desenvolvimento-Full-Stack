/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author olive
 */
import java.io.Serializable;

import java.io.Serializable;

public class PessoaJuridicaRepo implements Serializable {
    private String cnpj;
    private String nome;
    private int id;
    private boolean excluida;

    public PessoaJuridicaRepo(String cnpj, int id, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.id = id;
    }

    public String getCnpj(int id1) {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome(int id1) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId(int id1) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isExcluida() {
        return excluida;
    }

    public void setExcluida(boolean excluida) {
        this.excluida = excluida;
    }
    
    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", id=" + id +
                ", excluida=" + excluida +
                '}';
    }
}