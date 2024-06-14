package com.meninas_gerentes.dao;

import java.sql.PreparedStatement;
import com.meninas_gerentes.conexao.Conexao;


public class ProfessorDao {
    
    public void cadastrarProfessor(ProfessorDao professorPojo) {

        Conexao conexao = new Conexao();

        String sql = "insert into pessoa(nome, disciplina, agenda) values (?, ?, ?)";

        PreparedStatement ps = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);
    
            ps.setString(1, professorPojo.getNome());
            ps.setString(2, professorPojo.getDisciplina());
            ps.setString(3, professorPojo.getAgenda());
          
            ps.execute();

            ps.close();

            System.out.println("Dados inseridos com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro com os dados.");
        }
    }

    private String getAgenda() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAgenda'");
    }

    private String getDisciplina() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDisciplina'");
    }

    private String getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    } 
}