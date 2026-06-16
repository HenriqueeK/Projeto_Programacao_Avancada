/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoprogramacaoavencada;

import view.TelaPrincipal;
import apoio.ConexaoBD;
import javax.swing.JOptionPane;
import view.TelaLogin;

/**
 *
 * @author henrique
 */
public class ProjetoProgramacaoAvencada {

    public static void main(String[] args) {        
        try {
            ConexaoBD.getInstance().getConnection();
            TelaLogin tl = new TelaLogin();
            tl.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados!\nPor favor entre em contato com o suporte.");
        } finally {
            ConexaoBD.getInstance().shutdown();
        }
    }
}