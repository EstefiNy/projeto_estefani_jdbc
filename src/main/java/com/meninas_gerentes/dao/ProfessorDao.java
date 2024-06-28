package com.meninas_gerentes.dao;

import java.sql.PreparedStatement;
import com.meninas_gerentes.conexao.Conexao;


public class ProfessorDao {
    
    public void cadastrarProfessor(ProfessorDao professorPojo) {

        Conexao conexao = new Conexao();

        String sql = "insert into professor(nome, disciplina, agenda) values (?, ?, ?)";

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


    public void alterarProfessor(ProfessorDao professorPojo) {

        Conexao conexao = new Conexao();

        String sql = "update professor set nome=?, disciplina=?, agenda=? where id=?";

        PreparedStatement ps = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);
    
            ps.setString(1, professor.getNome());
            ps.setString(2, professor.getDisciplina());
            ps.setString(3, professor.getAgenda());
            ps.setInt(4, professor.getId());
          
            ps.executeUpdate();

            System.out.println("Dados alterados com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro ao alterar os dados do professor.");
        }
            finally{
                conexao.fecharConexao();
            }
    }

    public void deletarProfessor(ProfessorDao professorPojo) {

        Conexao conexao = new Conexao();

        String sql = "delete from professor where id=?";

        PreparedStatement ps = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);
    
            ps.setInt(1, id);
          
            ps.executeUpdate();

            System.out.println("Professor excluído com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro excluir o professor.");
        }
            finally{
                conexao.fecharConexao();
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
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String disciplina = rs.getString("disciplina");
                String agenda = rs.getString("agenda");
                
                Professor professor = new Professor(id, nome, disciplina, agenda);
                listaProfessores.add(professor);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro ao ler os dados do professor.");
        }
            finally{
                conexao.fecharConexao();
            }
    }


































    private String getAgenda() {
    }

    private String getDisciplina() {
    }

    private String getNome() {
    } 
}