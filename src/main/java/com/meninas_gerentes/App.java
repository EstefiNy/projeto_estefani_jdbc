package com.meninas_gerentes;


import com.meninas_gerentes.dao.ProfessorDao;
import com.meninas_gerentes.dao.ProfessorPojo;
import com.meninas_gerentes.modelo.Professor;

public class App {
    public static void main( String[] args )
    {
     
        Professor Professor = new Professor();
        Professor.setNome("Estefani");
        Professor.setIdade(18);
        Professor.setEndereco("Rua Primeiro de Maio, 66");
        
        ProfessorPojo ProfessorPojo = new ProfessorPojo();
        ProfessorPojo.setNome(Professor.getNome());
        ProfessorPojo.setIdade(Professor.getIdade());
        ProfessorPojo.setEndereco(Professor.getEndereco());


        
        //Cadastra
        ProfessorDao ProfessorDao = new ProfessorDao();
        ProfessorDao.cadastrarProfessor(ProfessorPojo);
        

        /* 
        //Alterar
        ProfessorDao ProfessorDao = new ProfessorDao();
        ProfessorDao.cadastrarProfessor(ProfessorPojo);
        */

        /* 
        //Deletar
        ProfessorDao ProfessorDao = new ProfessorDao();
        ProfessorDao.cadastrarProfessor(ProfessorPojo);
        */

        /* 
        //Consultar
        ProfessorDao ProfessorDao = new ProfessorDao();
        ProfessorDao.cadastrarProfessor(ProfessorPojo);
        */

        System.out.println("Operações CRUD concluídas.");

    }
}