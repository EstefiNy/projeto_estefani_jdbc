package com.meninas_gerentes;


import com.meninas_gerentes.dao.PessoaDao;
import com.meninas_gerentes.dao.PessoaPojo;
import com.meninas_gerentes.modelo.Pessoa;

public class App {
    public static void main( String[] args )
    {
     
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Estefani");
        pessoa.setIdade(18);
        pessoa.setEndereco("Rua Primeiro de Maio, 66");
        
        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setIdade(pessoa.getIdade());
        pessoaPojo.setEndereco(pessoa.getEndereco());


        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.cadastrarPessoa(pessoaPojo);
    }
}