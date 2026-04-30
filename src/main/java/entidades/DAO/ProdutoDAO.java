/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.DAO;

import apoio.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author henrique
 */
public class ProdutoDAO {
    
    private ResultSet resultadoQ = null; // interface que representa o resultado de uma consulta SQL executada em um banco de dados
    
    public void salvar(Produto p) throws SQLException {
        String sql = ""
                + "INSERT INTO produto (nome, unidade) VALUES ("
                + "'" + p.getNome() + "',"
                + "'" + p.getUnidade() + "'"
                + ")";

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

    public ArrayList<Produto> recuperarTodos() throws SQLException {
        ArrayList<Produto> produto = new ArrayList();
        
        String sql = ""
                + "SELECT * FROM produto ";

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            Produto p = new Produto();

            p.setId(resultadoQ.getInt("id_produto"));
            p.setNome(resultadoQ.getString("nome"));
            p.setUnidade(resultadoQ.getString("unidade"));

            produto.add(p);
        }

        return produto;
    }
    
}
