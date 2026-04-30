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
    
    ControlaProducao cp = new ControlaProducao();
    
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
        txtProduto = new javax.swing.JLabel();
        txtNomeSafra = new javax.swing.JLabel();
        nomeProduto = new javax.swing.JTextField();
        txtDataInicio = new javax.swing.JLabel();
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
        dataFim1 = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setClosable(true);
        setTitle("Cadastro de produção");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField5)
                            .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addGap(44, 44, 44))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(30, 30, 30))
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
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butAtualizar)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butAtualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tabela de Produções", jPanel4);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtProduto.setText("Produto");
        jPanel1.add(txtProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 46, -1, -1));

        txtNomeSafra.setText("Nome da Safra");
        jPanel1.add(txtNomeSafra, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 110, -1, 25));

        nomeProduto.addActionListener(this::nomeProdutoActionPerformed);
        jPanel1.add(nomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 69, 549, -1));

        txtDataInicio.setText("Data de Inicio");
        jPanel1.add(txtDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 316, -1, -1));

        txtDataFim.setText("Data de Fim");
        jPanel1.add(txtDataFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 316, -1, -1));
        jPanel1.add(precoUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 275, 549, -1));

        txtQuantidadeProduzida.setText("Quantidade Produzida");
        jPanel1.add(txtQuantidadeProduzida, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 182, -1, -1));
        jPanel1.add(quantidadeProduzida, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 211, 549, -1));

        txtPrecoUnitario.setText("Preço Unitário estimado");
        jPanel1.add(txtPrecoUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 252, -1, -1));
        jPanel1.add(dataFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 345, 250, -1));

        cadastraCusto.setText("Você Deseja Cadastrar um Custo?");
        cadastraCusto.addActionListener(this::cadastraCustoActionPerformed);
        jPanel1.add(cadastraCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 439, -1, -1));

        salvar.setText("Salvar");
        salvar.addActionListener(this::salvarActionPerformed);
        jPanel1.add(salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, -1, -1));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(this::cancelarActionPerformed);
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, -1, -1));

        nomeSafra.addActionListener(this::nomeSafraActionPerformed);
        jPanel1.add(nomeSafra, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 141, 549, -1));
        jPanel1.add(dataFim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 345, 250, -1));

        jTabbedPane1.addTab("Produção", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Cadastro de Produção");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void montaTabela() {
        ArrayList<Producao> tarefas = cp.recuperarTodos();
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

    private void butAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAtualizarActionPerformed
//         montaTabela();
    }//GEN-LAST:event_butAtualizarActionPerformed

    private void nomeSafraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeSafraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeSafraActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
//        String txtDataInicio = dataInicio.getText();
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
//        p.setDataInicio(txtDataInicio);
        p.setDataFim(txtDataFim);
        p.setQuantidade(quantidade);
        p.setPrecoUnitario(preco);

        //        cp2.salvar(p);

        nomeProduto.setText("");
        nomeSafra.setText("");
        quantidadeProduzida.setText("");
//        precoUnitario.setText("");
//        dataInicio.setText("");
        dataFim.setText("");      // TODO add your handling code here:
    }//GEN-LAST:event_salvarActionPerformed

    private void cadastraCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastraCustoActionPerformed

    private void nomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAtualizar;
    private javax.swing.JButton cadastraCusto;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField dataFim;
    private javax.swing.JTextField dataFim1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
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
