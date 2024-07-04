package com.meninas_gerentes.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.meninas_gerentes.conexao.Conexao;
import com.meninas_gerentes.modelo.Professor;


public class ProfessorDao {
    
    public void cadastrarProfessor(ProfessorPojo professorPojo) {

        Conexao conexao = new Conexao();

        String sql = "insert into professor(nome, disciplina, agenda) values (?, ?, ?)";

        PreparedStatement ps = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);
    
            ps.setString(1, professorPojo.getNome());
            ps.setString(2, professorPojo.getDiscplina());
            ps.setString(3, professorPojo.getAgenda());
          
            ps.execute();

            ps.close();

            System.out.println("Dados inseridos com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro com os dados.");
        }
    }


    /**
     * @param professorPojo
     */
    public void alterarProfessor(ProfessorPojo professorPojo) {

        Conexao conexao = new Conexao();

        String sql = "update professor set nome=?, disciplina=?, agenda=? where id=?";

        PreparedStatement ps = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);    
            
            ps.setString(1, professorPojo.getNome());
            ps.setString(2, professorPojo.getDiscplina());
            ps.setString(3, professorPojo.getAgenda());
           
            ps.setInt(4, professorPojo.getId());
          
            ps.executeUpdate();

            System.out.println("Dados alterados com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro ao alterar os dados do professor.");
        }
            finally{
                conexao.getConexao();
            }
    }

    

    public void deletarProfessor(ProfessorPojo professorPojo) {

        Conexao conexao = new Conexao();

        String sql = "delete from professor where id=?";

        PreparedStatement ps = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);
    
            ps.setInt(1, professorPojo.getId());
          
            ps.executeUpdate();

            System.out.println("Professor excluído com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro excluir o professor.");
        }
            finally{
                conexao.getConexao();
            }
    }

    public void consultarProfessor(ProfessorDao professorPojo) {

        Conexao conexao = new Conexao();

        String sql = "select * from professor";

        PreparedStatement ps = null;

        ResultSet rs = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);
    
            rs = ps.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                String disciplina = rs.getString("disciplina");
                String agenda = rs.getString("agenda");
                
                Professor professor = new Professor(nome, disciplina, agenda);
               
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro ao ler os dados do professor.");
        }
            finally{
                conexao.getConexao();
            }
    }


































    private String getAgenda() {
        return null;
    }

    private String getDisciplina() {
        return null;
    }

    private String getNome() {
        return null;
    } 
}