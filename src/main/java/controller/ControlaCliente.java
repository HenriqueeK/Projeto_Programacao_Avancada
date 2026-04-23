/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entidades.DAO.ClienteDAO;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author henrique
 */
public class ControlaCliente {
   

    private ClienteDAO cDAO = new ClienteDAO();

    public void salvar(Cliente c) {
        cDAO.salvar(c);
    }

    public ArrayList<Cliente> recuperarTodos() {
        return cDAO.recuperarTodos();
    }
}
   
