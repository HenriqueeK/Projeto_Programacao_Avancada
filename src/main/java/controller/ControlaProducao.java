/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entidades.DAO.ClienteDAO;
import entidades.DAO.ProducaoDAO;
import java.util.ArrayList;
import model.Cliente;
import model.Producao;

/**
 *
 * @author henrique
 */
public class ControlaProducao {
   
     ArrayList<Producao> ps = new ArrayList<Producao>();
    
    public void salvar(Producao p){
        ps.add(p);
    }
    
    public void imprimirTodos(){
        for (int i = 0; i < ps.size(); i++) {
            System.out.println(ps.get(i).getProduto());
            System.out.println(ps.get(i));
        }
    }
    
    public ArrayList<Producao> recuperarTodos(){
        return ps;
    }
}
   
