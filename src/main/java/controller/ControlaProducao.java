/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entidades.DAO.ClienteDAO;
import entidades.DAO.ProducaoDAO;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author henrique
 */
public class ControlaProducao {
   

    private ProducaoDAO pDAO = new ProducaoDAO();

    public void salvar(Cliente c) {
        pDAO.salvar(p);
    }

    public ArrayList<Cliente> recuperarTodos() {
        return pDAO.recuperarTodos();
    }
}
   
