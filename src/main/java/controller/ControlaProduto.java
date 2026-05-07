
package controller;

import entidades.DAO.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author henrique
 */
public class ControlaProduto {
    
    private ProdutoDAO pDAO = new ProdutoDAO();

    public boolean salvar(Produto p) {
        try {
            pDAO.salvar(p);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar Produto: " + ex.getMessage());
            return false;
        }
    }

    public ArrayList<Produto> recuperarTodos() {
        try {
            return pDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar Produto: " + ex.getMessage());
            return null;
        }
    }
    
    public boolean excluir(int id){
        try {
           pDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir Produto: " + ex.getMessage());
            return false;
        }
    } 
    
}
