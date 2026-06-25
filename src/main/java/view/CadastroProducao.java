/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import apoio.Formatacao;
import controller.ControlaProducao;
import entidades.DAO.CombosDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.Cliente;
import model.Producao;
import model.Produto;
import model.Safra;
import model.ComboItem;

/**
 *
 * @author henrique
 */
public class CadastroProducao extends javax.swing.JInternalFrame {
    
    ControlaProducao cp = new ControlaProducao();
    int codigo = 0;
    
    public CadastroProducao() {
        initComponents();
        popularCombos();
        montaTabela();
        Formatacao.formatarData(cxDataInicio);
        Formatacao.formatarData(cxDataFim);
    }

    @SuppressWarnings("unchecked")
    
    
    private void popularCombos() {
        CombosDAO dao = new CombosDAO();
        dao.popularCombo("produto", comboProduto);
        dao.popularCombo("safra", comboSafra);
        dao.popularCombo("cliente", comboCliente);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        label1 = new java.awt.Label();
        producao = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtProduto = new javax.swing.JLabel();
        txtNomeSafra = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JLabel();
        txtDataFim = new javax.swing.JLabel();
        txtQuantidadeProduzida = new javax.swing.JLabel();
        txtPrecoUnitario = new javax.swing.JLabel();
        bntSalvar = new javax.swing.JButton();
        comboProduto = new javax.swing.JComboBox<>();
        comboSafra = new javax.swing.JComboBox<>();
        txtCliente = new javax.swing.JLabel();
        comboCliente = new javax.swing.JComboBox<>();
        cxQuantidadeProduzida = new javax.swing.JTextField();
        cxPrecoUnitario = new javax.swing.JFormattedTextField();
        cxDataInicio = new javax.swing.JFormattedTextField();
        cxDataFim = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducao = new javax.swing.JTable();
        bntAtualizar = new javax.swing.JButton();
        bntEditar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        label1.setText("label1");

        setClosable(true);
        setTitle("Cadastro de produção");

        txtProduto.setText("Produto");

        txtNomeSafra.setText("Nome da Safra");

        txtDataInicio.setText("Data de Inicio");

        txtDataFim.setText("Data de Fim");

        txtQuantidadeProduzida.setText("Quantidade Produzida");

        txtPrecoUnitario.setText("Preço Unitário estimado");

        bntSalvar.setText("Salvar");
        bntSalvar.addActionListener(this::bntSalvarActionPerformed);

        comboProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboSafra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtCliente.setText("Cliente");

        comboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomeSafra)
                    .addComponent(comboSafra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeProduzida)
                    .addComponent(txtPrecoUnitario)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(bntSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDataInicio)
                                .addGap(207, 207, 207))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cxDataInicio)
                                .addGap(47, 47, 47)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDataFim)
                                .addGap(177, 177, 177))
                            .addComponent(cxDataFim)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProduto)
                            .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCliente)))
                    .addComponent(cxQuantidadeProduzida)
                    .addComponent(cxPrecoUnitario))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduto)
                    .addComponent(txtCliente))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(txtNomeSafra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(comboSafra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txtQuantidadeProduzida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxQuantidadeProduzida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtPrecoUnitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataInicio)
                    .addComponent(txtDataFim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        producao.addTab("Produção", jPanel1);

        tblProducao.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProducao);

        bntAtualizar.setText("Atualizar");
        bntAtualizar.addActionListener(this::bntAtualizarActionPerformed);

        bntEditar.setText("Editar");
        bntEditar.addActionListener(this::bntEditarActionPerformed);

        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(this::bntExcluirActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bntExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntEditar)
                        .addGap(18, 18, 18)
                        .addComponent(bntAtualizar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntAtualizar)
                    .addComponent(bntEditar)
                    .addComponent(bntExcluir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        producao.addTab("Tabela Produção", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(producao, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(producao, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            tblProducao.setModel(new AbstractTableModel() {
                @Override
                public String getColumnName(int column) {
                    switch (column) {
                        case 0:
                            return "Id";
                        case 1:
                            return "Cliente";
                        case 2:
                            return "Produto";
                        case 3:
                            return "Safra";
                        case 4:
                            return "Quantidade";
                        case 5:
                            return "Preço Unitário";
                        case 6:
                            return "Data de Inicio";
                        case 7:
                            return "Data de Fim";
                        default:
                            return "";
                    }
                }

                @Override
                public int getColumnCount() {
                    return 8;
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
                                return t.getId();
                            case 1:
                                return t.getCliente().getNome();
                            case 2:
                                return t.getProduto().getNome();
                            case 3:
                                return t.getSafra().getNome();
                            case 4:
                                return t.getQuantidade();
                            case 5:
                                return t.getPrecoUnitario();
                            case 6:
                                return t.getDataInicio();
                            case 7:
                                return t.getDataFim();
                        }

                    }

                    return "n/d";
                }
            });
        }
    }
    
    
    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
        String dataInicio = cxDataInicio.getText();
        String dataFim = cxDataFim.getText();
        double quantidade = Double.parseDouble(cxQuantidadeProduzida.getText());
        double preco = Double.parseDouble(cxPrecoUnitario.getText());

        Produto produto = new Produto();
        ComboItem itemProduto = (ComboItem) comboProduto.getSelectedItem();
        produto.setId(itemProduto.getCodigo());

        Safra safra = new Safra();
        ComboItem itemSafra = (ComboItem) comboSafra.getSelectedItem();
        safra.setId(itemSafra.getCodigo());
        
        Cliente cliente = new Cliente();
        ComboItem itemCliente = (ComboItem) comboCliente.getSelectedItem();
        cliente.setId(itemCliente.getCodigo());
        
        String dataInicioFormatado = cxDataInicio.getText();
        
        String dataFimFormatado = cxDataFim.getText();

        Producao p = new Producao();
        p.setProduto(produto);
        p.setSafra(safra);
        p.setDataInicio(dataInicioFormatado);
        p.setDataFim(dataFimFormatado);
        p.setQuantidade(quantidade);
        p.setPrecoUnitario(preco);
        p.setCliente(cliente);
        
        boolean retorno = false;
        
        if (cxDataInicio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data de Início é obrigatória!");
            return;
        }
        if (cxDataFim.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data de Fim é obrigatória!");
            return;
        }
        if (cxQuantidadeProduzida.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Quantidade é obrigatória!");
            return;
        }
        if (cxPrecoUnitario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preço Unitário é obrigatório!");
            return;
        }
        
        if (codigo == 0) {
            retorno = cp.salvar(p);
        } else {
            p.setId(codigo);
            retorno = cp.editar(p);
        }
        
        if (retorno) {
            
            if (codigo == 0) {
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um custo para esta produção?", "Custo", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    CadastroCusto tela = new CadastroCusto();
                    this.getParent().add(tela);
                    tela.setVisible(true);
                }

                } else {
                    codigo = 0;
                    JOptionPane.showMessageDialog(null, "Editado com sucesso");
            }
            
                comboProduto.setSelectedIndex(0);
                comboSafra.setSelectedIndex(0);
                cxQuantidadeProduzida.setText("");
                cxPrecoUnitario.setText("");
                cxDataInicio.setText("");
                cxDataFim.setText("");

            cxQuantidadeProduzida.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro, verifique os logs.");
        }
        
        montaTabela();
    }//GEN-LAST:event_bntSalvarActionPerformed

    private void bntAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtualizarActionPerformed
        montaTabela();
    }//GEN-LAST:event_bntAtualizarActionPerformed

    private void bntEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarActionPerformed
        String idString = String.valueOf(tblProducao.getValueAt(tblProducao.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);

        Producao p = cp.recuperarUm(id);
        if (p != null) {
            codigo = p.getId();

            CombosDAO dao = new CombosDAO();

            ComboItem itemProduto = new ComboItem();
            itemProduto.setCodigo(p.getProduto().getId());
            dao.definirItemCombo(comboProduto, itemProduto);

            ComboItem itemSafra = new ComboItem();
            itemSafra.setCodigo(p.getSafra().getId());
            dao.definirItemCombo(comboSafra, itemSafra);

            ComboItem itemCliente = new ComboItem();
            itemCliente.setCodigo(p.getCliente().getId());
            dao.definirItemCombo(comboCliente, itemCliente);

            cxQuantidadeProduzida.setText(String.valueOf(p.getQuantidade()));
            cxPrecoUnitario.setText(String.valueOf(p.getPrecoUnitario()));
            cxDataInicio.setText(p.getDataInicio());
            cxDataFim.setText(p.getDataFim());

            producao.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao editar!");
        }       // TODO add your handling code here:
    }//GEN-LAST:event_bntEditarActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        String idString = String.valueOf(tblProducao.getValueAt(tblProducao.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);

        boolean retorno = cp.excluir(id);
        if (retorno) {
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
            montaTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir!");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_bntExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAtualizar;
    private javax.swing.JButton bntEditar;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JComboBox<String> comboCliente;
    private javax.swing.JComboBox<String> comboProduto;
    private javax.swing.JComboBox<String> comboSafra;
    private javax.swing.JFormattedTextField cxDataFim;
    private javax.swing.JFormattedTextField cxDataInicio;
    private javax.swing.JFormattedTextField cxPrecoUnitario;
    private javax.swing.JTextField cxQuantidadeProduzida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label1;
    private javax.swing.JTabbedPane producao;
    private javax.swing.JTable tblProducao;
    private javax.swing.JLabel txtCliente;
    private javax.swing.JLabel txtDataFim;
    private javax.swing.JLabel txtDataInicio;
    private javax.swing.JLabel txtNomeSafra;
    private javax.swing.JLabel txtPrecoUnitario;
    private javax.swing.JLabel txtProduto;
    private javax.swing.JLabel txtQuantidadeProduzida;
    // End of variables declaration//GEN-END:variables
}