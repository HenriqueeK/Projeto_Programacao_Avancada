/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.DAO;

import apoio.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Safra;

/**
 *
 * @author henrique
 */
public class SafraDAO {
    
    private ResultSet resultadoQ = null; // interface que representa o resultado de uma consulta SQL executada em um banco de dados
    
    public void salvar(Safra s) throws SQLException {
        String sql = ""
                + "INSERT INTO safra (nome, descricao, data_inicio, data_fim) VALUES ("
                + "'" + s.getNome() + "',"
                + "'" + s.getDescricao() + "',"
                + "'" + s.getDataInicio() + "',"
                + "'" + s.getDataFim() + "'"
                + ")";

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

    public ArrayList<Safra> recuperarTodos() throws SQLException {
        ArrayList<Safra> safra = new ArrayList();
        
        String sql = ""
                + "SELECT * FROM safra ";

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            Safra s = new Safra();

            s.setId(resultadoQ.getInt("id_safra"));
            s.setNome(resultadoQ.getString("nome"));
            s.setDescricao(resultadoQ.getString("descricao"));
            s.setDataInicio(resultadoQ.getString("data_inicio"));
            s.setDataFim(resultadoQ.getString("data_fim"));

            safra.add(s);
        }

        return safra;
    }
    
    public void excluir(int id) throws SQLException {
        String sql = ""
                + "DELETE FROM safra WHERE id_safra = " + id;

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }
}
