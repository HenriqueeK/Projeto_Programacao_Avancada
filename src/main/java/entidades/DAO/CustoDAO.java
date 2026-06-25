/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.DAO;

import apoio.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Custo;
import model.Producao;
import model.TipoCusto;

/**
 *
 * @author henrique
 */
public class CustoDAO {
    
    private ResultSet resultadoQ = null; // interface que representa o resultado de uma consulta SQL executada em um banco de dados
    
    public void salvar(Custo c) throws SQLException {
        String sql = ""
                + "INSERT INTO custo (id_producao, id_tipo_custo, valor) VALUES ("
                + "'" + c.getProducao().getId() + "',"
                + "'" + c.getTipoCusto().getId() + "',"
                + "" + c.getValor() + " "
                + ")";

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }
    
    public void editar(Custo c) throws SQLException {
        String sql = ""
                + "UPDATE custo SET "
                + "id_producao = " + c.getProducao().getId() + ","
                + "id_tipo_custo = " + c.getTipoCusto().getId() + ","
                + "valor = " + c.getValor() + " "
                + "WHERE id_custo = " + c.getId();

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

    public ArrayList<Custo> recuperarTodos() throws SQLException {
        ArrayList<Custo> custo = new ArrayList();
        
        String sql = ""
                + "SELECT * FROM custo ";

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            Custo c = new Custo();

            c.setId(resultadoQ.getInt("id_custo"));
            
            Producao producao = new Producao();
            producao.setId(resultadoQ.getInt("id_producao"));
            c.setProducao(producao);
            
            TipoCusto tipoCusto = new TipoCusto();
            tipoCusto.setId(resultadoQ.getInt("id_tipo_custo"));
            c.setTipoCusto(tipoCusto);

            c.setValor(resultadoQ.getDouble("valor"));

            custo.add(c);
        }

        return custo;
    }
    
    
    public Custo recuperarUm(int id) throws SQLException {

        String sql = ""
                + "SELECT * FROM custo WHERE id_custo = " + id;

        resultadoQ = ConexaoBD.executeQuery(sql);

        if (resultadoQ.next()) {
            Custo c = new Custo();

            c.setId(resultadoQ.getInt("id_custo"));
            
            Producao producao = new Producao();
            producao.setId(resultadoQ.getInt("id_producao"));
            c.setProducao(producao);
            
            TipoCusto tipoCusto = new TipoCusto();
            tipoCusto.setId(resultadoQ.getInt("id_tipo_custo"));
            c.setTipoCusto(tipoCusto);

            c.setValor(resultadoQ.getDouble("valor"));

            return c;
        }

        return null;
    }

    
    public void excluir(int id) throws SQLException {
        String sql = ""
                + "DELETE FROM custo WHERE id_custo = " + id;

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

}
