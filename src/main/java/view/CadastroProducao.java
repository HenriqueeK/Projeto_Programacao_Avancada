/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.ControlaProducao;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Producao;
import model.Produto;
import model.Safra;

/**
 *
 * @author henrique
 */
public class CadastroProducao extends javax.swing.JInternalFrame {
    
    ControlaProducao cp2 = new ControlaProducao();
    
    public CadastroProducao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaProducao = new javax.swing.JTable();
        butAtualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JLabel();
        txtNomeSafra = new javax.swing.JLabel();
        nomeProduto = new javax.swing.JTextField();
        txtDataInicio = new javax.swing.JLabel();
        dataInicio = new javax.swing.JTextField();
        txtDataFim = new javax.swing.JLabel();
        precoUnitario = new javax.swing.JTextField();
        txtQuantidadeProduzida = new javax.swing.JLabel();
        quantidadeProduzida = new javax.swing.JTextField();
        txtPrecoUnitario = new javax.swing.JLabel();
        dataFim = new javax.swing.JTextField();
        cadastraCusto = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        nomeSafra = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setClosable(true);

        jLabel8.setText("+ Custo de Produção");

        jLabel9.setText("Descrição");

        jLabel10.setText("Valor");

        jTextField5.setText("R$");

        jButton4.setText("Cancelar");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton5.setText("Salvar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField5)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addGap(45, 45, 45)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Custo", jPanel3);

        tabelaProducao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tabelaProducao);

        butAtualizar.setText("Atualizar");
        butAtualizar.addActionListener(this::butAtualizarActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butAtualizar)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butAtualizar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tabela de Produções", jPanel4);

        jLabel1.setText("+ Nova Produção");

        txtProduto.setText("Produto");

        txtNomeSafra.setText("Nome da Safra");

        nomeProduto.addActionListener(this::nomeProdutoActionPerformed);

        txtDataInicio.setText("Data de Inicio");

        dataInicio.addActionListener(this::dataInicioActionPerformed);

        txtDataFim.setText("Data de Fim");

        txtQuantidadeProduzida.setText("Quantidade Produzida");

        txtPrecoUnitario.setText("Preço Unitário estimado");

        cadastraCusto.setText("Você Deseja Cadastrar um Custo?");
        cadastraCusto.addActionListener(this::cadastraCustoActionPerformed);

        salvar.setText("Salvar");
        salvar.addActionListener(this::salvarActionPerformed);

        cancelar.setText("Cancelar");
        cancelar.addActionListener(this::cancelarActionPerformed);

        nomeSafra.addActionListener(this::nomeSafraActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(521, 521, 521))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecoUnitario)
                    .addComponent(txtNomeSafra)
                    .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantidadeProduzida, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeProduzida)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(precoUnitario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtDataInicio)
                                    .addGap(216, 216, 216)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDataFim)
                                .addComponent(dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cadastraCusto)
                            .addGap(131, 131, 131)
                            .addComponent(cancelar)
                            .addGap(18, 18, 18)
                            .addComponent(salvar)))
                    .addComponent(txtProduto)
                    .addComponent(nomeSafra, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(txtProduto)
                .addGap(15, 15, 15)
                .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeSafra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeSafra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtQuantidadeProduzida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quantidadeProduzida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPrecoUnitario)
                .addGap(11, 11, 11)
                .addComponent(precoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataFim)
                    .addComponent(txtDataInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastraCusto)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(salvar)
                        .addComponent(cancelar)))
                .addGap(1, 1, 1))
        );

        jTabbedPane1.addTab("Produção", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void montaTabela() {
        ArrayList<Producao> tarefas = cp2.recuperarTodos();
        if (tarefas == null) {
            System.out.println("Ocorreu um erro ao consultar as tarefas");
        } else {
            tabelaProducao.setModel(new AbstractTableModel() {
                @Override
                public String getColumnName(int column) {
                    switch (column) {
                        case 0:
                            return "Nome do Produto";
                        case 1:
                            return "Nome da Safra";
                        case 2:
                            return "Quantidade Produzida";
                        case 3:
                            return "Preço Unitario Extimado";
                        case 4:
                            return "Data de Inicio";
                        case 5:
                            return "Data de Fim";
                        default:
                            return "";
                    }
                }

                @Override
                public int getColumnCount() {
                    return 6;
                }

                @Override
                public int getRowCount() {
                    return tarefas.size();
                }

                @Override
                public Object getValueAt(int rowIndex, int columnIndex) {
                    Producao t = tarefas.get(rowIndex);

                    if (t != null) {
                        switch (columnIndex) {
                            case 0:
                                return t.getProduto();
                            case 1:
                                return t.getSafra();
                            case 2:
                                return t.getQuantidade();
                            case 3:
                                return t.getPrecoUnitario();
                            case 4:
                                return t.getDataInicio();
                            case 5:
                                return t.getDataFim();
                        }

                    }

                    return "n/d";
                }
            });
        }
    }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

    private void cadastraCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastraCustoActionPerformed

    private void dataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataInicioActionPerformed

    private void nomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeProdutoActionPerformed

    private void nomeSafraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeSafraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeSafraActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        String txtDataInicio = dataInicio.getText();
        String txtDataFim = dataFim.getText();
        double quantidade = Double.parseDouble(quantidadeProduzida.getText());
        double preco = Double.parseDouble(precoUnitario.getText());
        
        Produto produto = new Produto();
        produto.setNome(nomeProduto.getText());
        
        Safra safra = new Safra();
        safra.setNome(nomeSafra.getText());
        
        Producao p = new Producao();
        p.setProduto(produto);        
        p.setSafra(safra);
        p.setDataInicio(txtDataInicio);
        p.setDataFim(txtDataFim);
        p.setQuantidade(quantidade);
        p.setPrecoUnitario(preco);
        
        cp2.salvar(p);
        
        nomeProduto.setText("");
        nomeSafra.setText("");
        quantidadeProduzida.setText("");
        precoUnitario.setText("");
        dataInicio.setText("");
        dataFim.setText("");      // TODO add your handling code here:
    }//GEN-LAST:event_salvarActionPerformed

    private void butAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAtualizarActionPerformed
         montaTabela();
    }//GEN-LAST:event_butAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAtualizar;
    private javax.swing.JButton cadastraCusto;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField dataFim;
    private javax.swing.JTextField dataInicio;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JTextField nomeSafra;
    private javax.swing.JTextField precoUnitario;
    private javax.swing.JTextField quantidadeProduzida;
    private javax.swing.JButton salvar;
    private javax.swing.JTable tabelaProducao;
    private javax.swing.JLabel txtDataFim;
    private javax.swing.JLabel txtDataInicio;
    private javax.swing.JLabel txtNomeSafra;
    private javax.swing.JLabel txtPrecoUnitario;
    private javax.swing.JLabel txtProduto;
    private javax.swing.JLabel txtQuantidadeProduzida;
    // End of variables declaration//GEN-END:variables
}
