/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.BlocoDAO;
import dao.UnidadeDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.BlocoM;
import model.UnidadeM;

/**
 *
 * @author Leopoldo
 */
public class BlocoView extends javax.swing.JInternalFrame {

    /**
     * Creates new form BlocoView
     */
    public BlocoView() {
        blocoDAO = new BlocoDAO();
        listaBloco = new ArrayList<>();
        listaUnidade = new ArrayList<>();
        unidadeDAO = new UnidadeDAO();
        initComponents();
        this.setVisible(true);
        atualizaBoxUnidade();
    }

    BlocoM bloco;
    BlocoDAO blocoDAO;
    List<BlocoM> listaBloco;
    List<UnidadeM> listaUnidade;
    UnidadeDAO unidadeDAO;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIDBloco = new javax.swing.JLabel();
        tfdIDBloco = new javax.swing.JTextField();
        tfdDescricaoBloco = new javax.swing.JTextField();
        lblDescricaoBloco = new javax.swing.JLabel();
        btnAlterarBloco = new javax.swing.JButton();
        btnExcluirBloco = new javax.swing.JButton();
        btnSalvarBloco = new javax.swing.JButton();
        btnNovoBloco = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbeBloco = new javax.swing.JTable();
        cbxUnidade = new javax.swing.JComboBox<>();
        lblSelecUnidade1 = new javax.swing.JLabel();
        btnCancelarBloco = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Bloco");

        lblIDBloco.setText("ID");

        tfdIDBloco.setEditable(false);

        tfdDescricaoBloco.setEnabled(false);

        lblDescricaoBloco.setText("Descrição");

        btnAlterarBloco.setText("Alterar");
        btnAlterarBloco.setEnabled(false);
        btnAlterarBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarBlocoActionPerformed(evt);
            }
        });

        btnExcluirBloco.setText("Excluir");
        btnExcluirBloco.setEnabled(false);
        btnExcluirBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirBlocoActionPerformed(evt);
            }
        });

        btnSalvarBloco.setText("Salvar");
        btnSalvarBloco.setEnabled(false);
        btnSalvarBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarBlocoActionPerformed(evt);
            }
        });

        btnNovoBloco.setText("Novo");
        btnNovoBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoBlocoActionPerformed(evt);
            }
        });

        tbeBloco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbeBloco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbeBlocoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbeBloco);

        cbxUnidade.setEnabled(false);
        cbxUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUnidadeActionPerformed(evt);
            }
        });

        lblSelecUnidade1.setText("Selecione a unidade:");

        btnCancelarBloco.setText("Cancelar");
        btnCancelarBloco.setEnabled(false);
        btnCancelarBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBlocoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricaoBloco)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblIDBloco)
                                        .addGap(152, 152, 152))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(tfdIDBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSelecUnidade1)
                                    .addComponent(cbxUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfdDescricaoBloco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovoBloco, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarBloco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelarBloco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterarBloco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDBloco)
                    .addComponent(lblSelecUnidade1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdIDBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescricaoBloco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdDescricaoBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirBloco)
                    .addComponent(btnAlterarBloco)
                    .addComponent(btnCancelarBloco)
                    .addComponent(btnSalvarBloco)
                    .addComponent(btnNovoBloco))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void atualizaBoxUnidade() {
        cbxUnidade.removeAllItems();
        cbxUnidade.addItem("--Selecione--");
        try {
            listaUnidade = unidadeDAO.listaTodos();
        } catch (SQLException ex) {
            Logger.getLogger(EntidadeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        String dados[][] = new String[listaUnidade.size()][5];
        int i = 0;
        for (UnidadeM uni : listaUnidade) {
            cbxUnidade.addItem(uni.getNome());
        }

    }

    public void atualizaTabelaBloco() {

        try {
            listaBloco = blocoDAO.listaTodos();
        } catch (SQLException ex) {
            Logger.getLogger(EntidadeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        String dados[][] = new String[listaBloco.size()][4];
        int i = 0;
        for (BlocoM blo : listaBloco) {
            dados[i][0] = String.valueOf(blo.getId());
            dados[i][1] = blo.getDescricao();
            dados[i][2] = blo.getUnidadeM().getNome();
            i++;
        }
        String tituloColuna[] = {"ID", "Nome", "Unidade Pertencente"};
        DefaultTableModel tabelaCliente = new DefaultTableModel();
        tabelaCliente.setDataVector(dados, tituloColuna);
        tbeBloco.setModel(new DefaultTableModel(dados, tituloColuna) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tbeBloco.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbeBloco.getColumnModel().getColumn(1).setPreferredWidth(300);
        tbeBloco.getColumnModel().getColumn(2).setPreferredWidth(200);

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbeBloco.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbeBloco.setRowHeight(25);
        tbeBloco.updateUI();
    }

    private void cbxUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUnidadeActionPerformed
        // TODO add your handling code here:
        atualizaTabelaBloco();
        tfdDescricaoBloco.requestFocusInWindow();
    }//GEN-LAST:event_cbxUnidadeActionPerformed

    private void tbeBlocoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbeBlocoMouseClicked
        tfdIDBloco.setText(tbeBloco.getValueAt(tbeBloco.getSelectedRow(), 0).toString());
        tfdDescricaoBloco.setText(tbeBloco.getValueAt(tbeBloco.getSelectedRow(), 1).toString());
        btnAlterarBloco.setEnabled(true);
        btnSalvarBloco.setEnabled(false);
        btnExcluirBloco.setEnabled(true);
        cbxUnidade.setEnabled(false);
       
    }//GEN-LAST:event_tbeBlocoMouseClicked

    private void btnSalvarBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarBlocoActionPerformed
        if (tfdDescricaoBloco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha todos os campos", "Erro", JOptionPane.WARNING_MESSAGE);
            tfdDescricaoBloco.requestFocusInWindow();
        } else if (tfdIDBloco.getText().isEmpty()){
            bloco = new BlocoM();
            bloco.setDescricao(tfdDescricaoBloco.getText());
            bloco.setUnidadeM(pegaUnidade());
            try {
                blocoDAO.salvar(bloco);
                JOptionPane.showMessageDialog(null, "Gravado com Sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE); 
                atualizaTabelaBloco();
                preparaSalvareCancelar();
                desativaCampos();
                limpaCamposBloco();
            } catch (SQLException ex) {
                Logger.getLogger(EntidadeView.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            bloco = new BlocoM();
            bloco.setId(Integer.parseInt(tfdIDBloco.getText()));
            bloco.setDescricao(tfdDescricaoBloco.getText());
            try {
                blocoDAO.alterar(bloco);
                JOptionPane.showMessageDialog(null, "Bloco atualizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                atualizaTabelaBloco();
                preparaSalvareCancelar();
                desativaCampos();
                limpaCamposBloco();
        limpaCamposBloco();
            } catch (SQLException ex) {
                Logger.getLogger(EntidadeView.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());

            }
            
            
        }
        
    }//GEN-LAST:event_btnSalvarBlocoActionPerformed

    private void btnExcluirBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirBlocoActionPerformed
        if (tfdIDBloco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um Bloco", "Erro", JOptionPane.WARNING_MESSAGE);
        } else {
            bloco = new BlocoM();
            bloco.setId(Integer.parseInt(tfdIDBloco.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja Excluir: " + tfdDescricaoBloco.getText() + " ?");
            if (confirma == 0) {
                try {
                    blocoDAO.excluir(bloco);
                    atualizaTabelaBloco();
                    limpaCamposBloco();
                    preparaExcluir();
                } catch (SQLException ex) {
                    Logger.getLogger(EntidadeView.class.getName()).log(Level.SEVERE, null, ex);
                    if (ex.getErrorCode() == 1451) {
                        JOptionPane.showMessageDialog(null, "Impossível excluir esse Bloco, ele já possui Pisos cadastrados!", "Erro", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
                    }
                }

            }
        }
    }//GEN-LAST:event_btnExcluirBlocoActionPerformed

    private void btnNovoBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoBlocoActionPerformed
        limpaCamposBloco();
        preparaNovo();
        ativaCampos();
        cbxUnidade.requestFocusInWindow();
        
    }//GEN-LAST:event_btnNovoBlocoActionPerformed

    private void btnAlterarBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarBlocoActionPerformed
        preparaAlterar();
        ativaCampos();
        cbxUnidade.setEnabled(false);
    }//GEN-LAST:event_btnAlterarBlocoActionPerformed

    private void btnCancelarBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBlocoActionPerformed
        // TODO add your handling code here:
        limpaCamposBloco();
        preparaSalvareCancelar();
        desativaCampos();
    }//GEN-LAST:event_btnCancelarBlocoActionPerformed
    
    public void preparaAlterar(){
        btnNovoBloco.setEnabled(false);
        btnExcluirBloco.setEnabled(false);
        btnAlterarBloco.setEnabled(false);
        btnSalvarBloco.setEnabled(true);
        btnCancelarBloco.setEnabled(true);
        cbxUnidade.setEnabled(true);
        tbeBloco.setEnabled(false);
        tbeBloco.clearSelection();
        
    }
    public void limpaCamposBloco() {
        tfdIDBloco.setText("");
        tfdDescricaoBloco.setText("");

    }
    
    public void preparaNovo(){
        btnNovoBloco.setEnabled(false);
        btnSalvarBloco.setEnabled(true);
        btnCancelarBloco.setEnabled(true);
        tbeBloco.setEnabled(false);
        tbeBloco.clearSelection();
    }
    
    public void preparaSalvareCancelar(){
        btnNovoBloco.setEnabled(true);
        btnSalvarBloco.setEnabled(false);
        btnCancelarBloco.setEnabled(false);
        tbeBloco.setEnabled(true);
        
    }
    
    public void desativaCampos(){
        tfdDescricaoBloco.setEnabled(false);
        cbxUnidade.setEnabled(false);
    }
    
    public void preparaExcluir(){
        btnExcluirBloco.setEnabled(false);
        btnAlterarBloco.setEnabled(false);
    }
    public void ativaCampos(){
        tfdDescricaoBloco.setEnabled(true);
        cbxUnidade.setEnabled(true);
    }
    public UnidadeM pegaUnidade() {
        try {
            if (cbxUnidade.getSelectedIndex() == 0 ){
                JOptionPane.showMessageDialog(null, "Selecione uma Unidade.");
            }else {
                return unidadeDAO.buscaNome(cbxUnidade.getSelectedItem().toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(BlocoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarBloco;
    private javax.swing.JButton btnCancelarBloco;
    private javax.swing.JButton btnExcluirBloco;
    private javax.swing.JButton btnNovoBloco;
    private javax.swing.JButton btnSalvarBloco;
    private javax.swing.JComboBox<String> cbxUnidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricaoBloco;
    private javax.swing.JLabel lblIDBloco;
    private javax.swing.JLabel lblSelecUnidade1;
    private javax.swing.JTable tbeBloco;
    private javax.swing.JTextField tfdDescricaoBloco;
    private javax.swing.JTextField tfdIDBloco;
    // End of variables declaration//GEN-END:variables
}
