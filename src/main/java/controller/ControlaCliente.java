/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entidades.DAO.ClienteDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author roveda
 */
public class ControlaCliente {

    private ClienteDAO cDAO = new ClienteDAO();

    public boolean salvar(Cliente c) {
        try {
            cDAO.salvar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar cliente: " + ex.getMessage());
            return false;
        }
    }

    public ArrayList<Cliente> recuperarTodos() {
        try {
            return cDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar cliente: " + ex.getMessage());
            return null;
        }
    }
    
    public boolean excluir(int id){
        try {
            cDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir Cliente: " + ex.getMessage());
            return false;
        }
    }   
}