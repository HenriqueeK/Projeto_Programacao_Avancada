/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entidades.DAO.SafraDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Safra;

/**
 *
 * @author henrique
 */
public class ControlaSafra {
    
    private SafraDAO sDAO = new SafraDAO();

    public boolean salvar(Safra s) {
        try {
            sDAO.salvar(s);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar safra: " + ex.getMessage());
            return false;
        }
    }

    public ArrayList<Safra> recuperarTodos() {
        try {
            return sDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar safra: " + ex.getMessage());
            return null;
        }
    }
    
}
