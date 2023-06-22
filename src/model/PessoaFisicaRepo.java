package model;
import java.util.ArrayList;


public class PessoaFisicaRepo {
    private final ArrayList<PessoaFisica> pessoasFisicas;
    
    private int id;
    public PessoaFisicaRepo() {
        this.pessoasFisicas = new ArrayList<>();
    }

    public void inserir(PessoaFisica pessoa) {
        this.pessoasFisicas.add(pessoa);
    }

    
    

    
}