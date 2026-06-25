
package controller;

import entidades.DAO.CustoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Custo;

/**
 *
 * @author henrique
 */
public class ControlaCusto {
    
    private CustoDAO cDAO = new CustoDAO();

    public boolean salvar(Custo c) {
        try {
            cDAO.salvar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar custo: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean editar(Custo c) {
        try {
            cDAO.editar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar: " + ex.getMessage());
            return false;
        }
    }

    public ArrayList<Custo> recuperarTodos() {
        try {
            return cDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar custo: " + ex.getMessage());
            return null;
        }
    }
    
    public Custo recuperarUm(int id){
        try {
            return cDAO.recuperarUm(id);
        } catch (SQLException ex) {
            System.out.println("Erro ao recuperar Custo: " + ex.getMessage());
            return null;
        }
    }
    
    public boolean excluir(int id){
        try {
            cDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir Custo: " + ex.getMessage());
            return false;
        }
    }   
   
}