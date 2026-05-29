/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entidades.DAO.ClienteDAO;
import entidades.DAO.ProducaoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Producao;

/**
 *
 * @author henrique
 */
public class ControlaProducao {
   
    private ProducaoDAO pDAO = new ProducaoDAO();

    public boolean salvar(Producao p) {
        try {
            pDAO.salvar(p);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar produção: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean editar(Producao p) {
        try {
            pDAO.editar(p);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar: " + ex.getMessage());
            return false;
        }
    }

    public ArrayList<Producao> recuperarTodos() {
        try {
            return pDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar produção: " + ex.getMessage());
            return null;
        }
    }
    
    public Producao recuperarUm(int id){
        try {
            return pDAO.recuperarUm(id);
        } catch (SQLException ex) {
            System.out.println("Erro ao recuperar produção: " + ex.getMessage());
            return null;
        }
    }
    
    public boolean excluir(int id){
        try {
            pDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir produção: " + ex.getMessage());
            return false;
        }
    }   
}
   
