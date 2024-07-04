package com.meninas_gerentes;


import com.meninas_gerentes.dao.ProfessorDao;
import com.meninas_gerentes.dao.ProfessorPojo;
import com.meninas_gerentes.modelo.Professor;

public class App {
    
    public static void main( String[] args )
    {

        /* Cadastrar
        Professor professor = new Professor();
        professor.setNome("Marcos");
        professor.setDisciplina("Matemática");
        professor.setAgenda("av Carlos gomes");
        
        ProfessorPojo professorPojo = new ProfessorPojo();
        professorPojo.setNome(Professor.getNome());
        professorPojo.setDiscplina(Professor.getDisciplina());
        professorPojo.setAgenda(Professor.getAgenda());
                
        
        ProfessorDao professorDao = new ProfessorDao();
        professorDao.cadastrarProfessor(ProfessorPojo);
        
        ==================================================================*/

        /* ALTERAR
        Professor professor = new Professor();
        professor.setNome("Marcos");
        professor.setDisciplina("Física");
        professor.setAgenda("av Carlos gomes");

        ProfessorPojo professorPojo = new ProfessorPojo();
        professorPojo.setNome(professor.getNome());
        professorPojo.setDiscplina(professor.getDisciplina());
        professorPojo.setAgenda(professor.getAgenda());

        professorPojo.setId(2);

        ProfessorDao professorDao = new ProfessorDao();
        professorDao.alterarProfessor(professorPojo);
        ==================================================================*/

        /* DELETAR
        ProfessorPojo professorPojo = new ProfessorPojo();
        professorPojo.setId(1);

        ProfessorDao professorDao = new ProfessorDao();
        professorDao.deletarProfessor(professorPojo);

        ==================================================================*/

        













        System.out.println("Operações CRUD concluídas.");

    }
}