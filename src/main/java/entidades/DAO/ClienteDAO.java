/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.DAO;

import apoio.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author roveda
 */
public class ClienteDAO {

    private ResultSet resultadoQ = null; // interface que representa o resultado de uma consulta SQL executada em um banco de dados
    
    public void salvar(Cliente c) throws SQLException {
        String sql = ""
                + "INSERT INTO cliente (nome, cpf, telefone, endereco) VALUES ("
                + "'" + c.getNome() + "',"
                + "'" + c.getCpf() + "',"
                + "'" + c.getTelefone() + "',"
                + "'" + c.getEndereco() + "' "
                + ")";

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

}
