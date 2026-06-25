/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author henrique
 */
public class Custo {
    
    private int id;
    private Producao producao;
    private TipoCusto tipoCusto;
    private double valor;

    public Custo() {
    }

    public Custo(Producao producao, TipoCusto tipoCusto, String descricao, double valor) {
        this.producao = producao;
        this.tipoCusto = tipoCusto;
        this.valor = valor;
    }
    
    
    public Producao getProducao() {
        return producao;
    }

    public void setProducao(Producao producao) {
        this.producao = producao;
    }

    public TipoCusto getTipoCusto() {
        return tipoCusto;
    }

    public void setTipoCusto(TipoCusto tipoCusto) {
        this.tipoCusto = tipoCusto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
