
package controller;

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author henrique
 */
public class ControlaProduto {
    
     ArrayList<Produto> ps = new ArrayList<Produto>();
    
    public void salvar(Produto p){
        ps.add(p);
    }
    
    public void imprimirTodos(){
        for (int i = 0; i < ps.size(); i++) {
            System.out.println(ps.get(i).getNome());
//            System.out.println(ps[i]);
        }
    }
    
    public ArrayList<Produto> recuperarTodos(){
        return ps;
    }
    
}
