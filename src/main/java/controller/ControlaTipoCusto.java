/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entidades.DAO.TipoCustoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.TipoCusto;

/**
 *
 * @author henrique
 */
public class ControlaTipoCusto {
    
    private TipoCustoDAO tDAO = new TipoCustoDAO();

    public boolean salvar(TipoCusto t) {
        try {
            tDAO.salvar(t);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar o Tipo de Produto: " + ex.getMessage());
            return false;
        }
    }

    public ArrayList<TipoCusto> recuperarTodos() {
        try {
            return tDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar o Tipo de Produto: " + ex.getMessage());
            return null;
        }
    }
    
    public boolean excluir(int id){
        try {
            tDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir o Tipo de Produto: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean editar(TipoCusto t) {
        try {
            tDAO.editar(t);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar: " + ex.getMessage());
            return false;
        }
    }
    
    public TipoCusto recuperarUm(int id){
        try {
            return tDAO.recuperarUm(id);
        } catch (SQLException ex) {
            System.out.println("Erro ao recuperar o Tipo de Produto: " + ex.getMessage());
            return null;
        }
    }
    
}
