package entidades.DAO;

import apoio.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.TipoCusto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henrique
 */
public class ProducaoDAO {
   
    private ResultSet resultadoQ = null; // interface que representa o resultado de uma consulta SQL executada em um banco de dados
    
    public void salvar(TipoCusto t) throws SQLException {
        String sql = ""
                + "INSERT INTO cliente (, cpf, telefone, endereco) VALUES ("
                + "'" + t.getNome() + "',"
                + "'" + t.getCpf() + "',"
                + "'" + t.getTelefone() + "',"
                + "'" + t.getEndereco() + "' "
                + ")";

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }
    
    public void editar(Cliente c) throws SQLException {
        String sql = ""
                + "UPDATE cliente SET "
                + "nome = '" + c.getNome() + "',"
                + "cpf= '" + c.getCpf() + "',"
                + "telefone = '" + c.getTelefone() + "',"
                + "endereco = '" + c.getEndereco() + "' "
                + "WHERE id_cliente = " + c.getId();

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

    public ArrayList<Cliente> recuperarTodos() throws SQLException {
        ArrayList<Cliente> cliente = new ArrayList();
        
        String sql = ""
                + "SELECT * FROM cliente ";

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            Cliente c = new Cliente();

            c.setId(resultadoQ.getInt("id_cliente"));
            c.setNome(resultadoQ.getString("nome"));
            c.setCpf(resultadoQ.getString("cpf"));
            c.setTelefone(resultadoQ.getString("telefone"));
            c.setEndereco(resultadoQ.getString("endereco"));

            cliente.add(c);
        }

        return cliente;
    }
    
    
    public Cliente recuperarUm(int id) throws SQLException {

        String sql = ""
                + "SELECT * FROM cliente WHERE id_cliente = " + id;

        resultadoQ = ConexaoBD.executeQuery(sql);

        if (resultadoQ.next()) {
            Cliente c = new Cliente();

            c.setId(resultadoQ.getInt("id_cliente"));
            c.setNome(resultadoQ.getString("nome"));
            c.setCpf(resultadoQ.getString("cpf"));
            c.setTelefone(resultadoQ.getString("telefone"));
            c.setEndereco(resultadoQ.getString("endereco"));

            return c;
        }

        return null;
    }

    
    public void excluir(int id) throws SQLException {
        String sql = ""
                + "DELETE FROM cliente WHERE id_cliente = " + id;

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }
    
}
