/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.BlocoDAO;
import dao.GrauConservacaoDAO;
import dao.OrgaoDAO;
import dao.PatrimonioDAO;
import dao.PisoDAO;
import dao.SubTipoDAO;
import dao.TipoDAO;
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
import model.GrauConservacaoM;
import model.OrgaoM;
import model.PatrimonioM;
import model.PisoM;
import model.SalaM;
import model.SubTipoM;
import model.TipoM;
import model.UnidadeM;

/**
 *
 * @author NUPSI-02
 */
public class ConsultaView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaView
     */

    List<PatrimonioM> listaPatrimonio;
    List<UnidadeM> listaUnidade;
    UnidadeDAO unidadeDAO;
    List<BlocoM> listaBloco;
    BlocoDAO blocoDAO;
    List<PisoM> listaPiso;
    PisoDAO pisoDAO;
    UnidadeM unidadeM;
    BlocoM blocoM;
    PisoM pisoM;
    OrgaoM orgao;
    OrgaoDAO orgaoDAO;
    GrauConservacaoM conservacao;
    GrauConservacaoDAO conservacaoDAO;
    TipoM tipo;
    TipoDAO tipoDAO;
    SubTipoM subtipo;
    SubTipoDAO subtipoDAO;
    
    
    PatrimonioDAO patrimonioDAO;
    public ConsultaView() {
        initComponents();
        this.setVisible(true);
        lblId.setText("");
        lblBloco.setText("");
        lblCodigo.setText("");
        lblComposto.setText("");
        lblConservacao.setText("");
        lblDescricao.setText("");
        lblOrgao.setText("");
        lblPiso.setText("");
        lblSala.setText("");
        lblStatus.setText("");
        lblSubtipo.setText("");
        lblUnidade.setText("");
        patrimonioDAO = new PatrimonioDAO();
        preencheFiltro();
        listaPatrimonio = new ArrayList<>();
        listaUnidade = new ArrayList<>();
        unidadeDAO = new UnidadeDAO();
        listaBloco = new ArrayList<>();
        blocoDAO = new BlocoDAO();
        listaPiso = new ArrayList<>();
        pisoDAO = new PisoDAO();
        orgaoDAO = new OrgaoDAO();
        conservacaoDAO = new GrauConservacaoDAO();
        tipoDAO = new TipoDAO();
        tipo = new TipoM();
        subtipo = new SubTipoM();
        subtipoDAO = new SubTipoDAO();
        
    }
    
    public void preencheFiltro(){
        cbxFiltro.removeAllItems();
        cbxFiltro.addItem("--Selecione--");
        cbxFiltro.addItem("ID Sala");
        cbxFiltro.addItem("Codigo");
        cbxFiltro.addItem("Descrição");
        cbxFiltro.addItem("Orgão");
        cbxFiltro.addItem("Conservação");
        cbxFiltro.addItem("Subtipo");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbeBusca = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblSubtipo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblBloco = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblComposto = new javax.swing.JLabel();
        lblConservacao = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblOrgao = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblSala = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblUnidade = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPiso = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbxFiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta");

        tbeBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbeBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbeBuscaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbeBusca);

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigo.setText("Codigo:");

        lblSubtipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSubtipo.setText("Subtipo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Descrição:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Codigo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Subtipo:");

        lblId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblId.setText("ID:");

        lblDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescricao.setText("Descrição:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Orgão:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Bloco:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Unidade:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText(" Composto:");

        lblBloco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBloco.setText("Bloco:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Conservação:");

        lblComposto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblComposto.setText("Composto:");

        lblConservacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblConservacao.setText("Conservação:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Piso:");

        lblOrgao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOrgao.setText("Orgão:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Sala:");

        lblSala.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSala.setText("Sala:");

        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStatus.setText("Status:");

        lblUnidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUnidade.setText("Unidade:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Status:");

        lblPiso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPiso.setText("Piso:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFiltroActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrgao)
                            .addComponent(lblComposto)
                            .addComponent(lblSala)
                            .addComponent(lblPiso)
                            .addComponent(lblBloco)
                            .addComponent(lblUnidade)
                            .addComponent(lblStatus)
                            .addComponent(lblConservacao)
                            .addComponent(lblSubtipo)
                            .addComponent(lblCodigo)
                            .addComponent(lblDescricao)
                            .addComponent(lblId))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigo)
                    .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtipo)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConservacao)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnidade)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloco)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPiso)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSala)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrgao)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComposto)
                    .addComponent(jLabel13)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void atualizaTabelaBusca(){
         String dados[][] = new String[listaPatrimonio.size()][8];
        int i = 0;
        for (PatrimonioM pat : listaPatrimonio) {
            dados[i][0] = String.valueOf(pat.getId());
            dados[i][1] = pat.getCodigo();
            dados[i][2] = pat.getDescricao();
            dados[i][3] = pat.getSubTipo().getDescricao();
            dados[i][4] = pat.getSala().getDescricao();
            dados[i][5] = pat.getGrau_conservacao().getDescricao();
            dados[i][6] = pat.getStatus().getNome();
            dados[i][7] = pat.getEntidade().getNome();
            i++;
        }
        String tituloColuna[] = {"ID", "Codigo", "Descrição", "Subtipo", "Sala", "Grau de Conservação", "Status", "Entidade"};
        DefaultTableModel tabelaCliente = new DefaultTableModel();
        tabelaCliente.setDataVector(dados, tituloColuna);
        tbeBusca.setModel(new DefaultTableModel(dados, tituloColuna) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        
        

        tbeBusca.getColumnModel().getColumn(0).setPreferredWidth(60);
        tbeBusca.getColumnModel().getColumn(1).setPreferredWidth(90);
        tbeBusca.getColumnModel().getColumn(2).setPreferredWidth(215);
        tbeBusca.getColumnModel().getColumn(3).setPreferredWidth(215);
        tbeBusca.getColumnModel().getColumn(4).setPreferredWidth(100);
        tbeBusca.getColumnModel().getColumn(5).setPreferredWidth(90);
        tbeBusca.getColumnModel().getColumn(6).setPreferredWidth(90);
        tbeBusca.getColumnModel().getColumn(7).setPreferredWidth(90);

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbeBusca.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbeBusca.setRowHeight(25);
        tbeBusca.updateUI();
    
    } 

    private void tbeBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbeBuscaMouseClicked

        PatrimonioM patri = pegaPatrimonio();
        
        lblId.setText(patri.getId().toString());
        lblBloco.setText(patri.getSala().getPiso().getBloco().getDescricao());
        lblCodigo.setText(patri.getCodigo());
                    
        if(patri.getKit()){
            lblComposto.setText("Sim");
        }else{
            lblComposto.setText("Não");
        }

        lblConservacao.setText(patri.getGrau_conservacao().getDescricao());
        lblDescricao.setText(patri.getDescricao());
        lblOrgao.setText(patri.getEntidade().getNome());
        lblPiso.setText(patri.getSala().getPiso().getDescricao());
        lblSala.setText(patri.getSala().getDescricao());
        lblStatus.setText(patri.getStatus().getNome());
        lblSubtipo.setText(patri.getSubTipo().getDescricao());
        lblUnidade.setText(patri.getSala().getPiso().getBloco().getUnidadeM().getNome());
    }//GEN-LAST:event_tbeBuscaMouseClicked

    private void cbxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFiltroActionPerformed

    }//GEN-LAST:event_cbxFiltroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(txtCodigo.getText().equals("") || cbxFiltro.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Selecione um Filtro!!");
        }else{

            try {
                if(cbxFiltro.getSelectedItem().toString().equals("ID Sala")){
                    listaPatrimonio = null;
                    try{
                        listaPatrimonio = patrimonioDAO.listaTodosSala(Integer.parseInt(txtCodigo.getText()));
                            
                        if(listaPatrimonio.size() < 1)
                            JOptionPane.showMessageDialog(null, "Sala não Encontrada");
                        
                    }catch(java.lang.NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Digite caracteres válidos!\n(Somente Numeros)");
                    }
                    

                }else
                if(cbxFiltro.getSelectedItem().toString().equals("Codigo")) {
                    listaPatrimonio = null;
                    listaPatrimonio = patrimonioDAO.buscaPatrimonio(txtCodigo.getText());
                    
                    if(listaPatrimonio.size() < 1)
                           JOptionPane.showMessageDialog(null, "Código não Encontrado");
                }else
                if(cbxFiltro.getSelectedItem().toString().equals("Descrição")){
                    listaPatrimonio = null;
                    listaPatrimonio = patrimonioDAO.buscaDescricao(txtCodigo.getText());
                    
                    if(listaPatrimonio.size() < 1)
                           JOptionPane.showMessageDialog(null, "Descrição não Encontrada");
                }else
                if(cbxFiltro.getSelectedItem().toString().equals("Orgão")){
                    listaPatrimonio = null;
                    try{
                        orgao = orgaoDAO.buscaNome(txtCodigo.getText());   
                    
                        listaPatrimonio = patrimonioDAO.buscaOrgao(orgao.getId());
                    }catch(java.lang.NullPointerException ex){
                        JOptionPane.showMessageDialog(null, "Digite um orgão valido!" );
                    }
                }else
                if(cbxFiltro.getSelectedItem().toString().equals("Conservação")){
                    listaPatrimonio = null;
                    try{
                            conservacao = conservacaoDAO.buscaNome(txtCodigo.getText());
                            listaPatrimonio = patrimonioDAO.buscaConservacao(conservacao.getId());  
                     }catch(java.lang.NullPointerException ex){
                        JOptionPane.showMessageDialog(null, "Digite uma Conservação valida!" );
                    }
                    
                    if(listaPatrimonio.size() < 1)
                           JOptionPane.showMessageDialog(null, "Conservação não Encontrada");
                }else
                if(cbxFiltro.getSelectedItem().toString().equals("Subtipo")){
                    try{
                        subtipo = subtipoDAO.buscaNome(txtCodigo.getText());
                        listaPatrimonio = patrimonioDAO.buscaSubtipo(subtipo.getId());  
                     }catch(java.lang.NullPointerException ex){
                        JOptionPane.showMessageDialog(null, "Digite um SubTipo valido!" );
                    }
                }

                
                    atualizaTabelaBusca();
                

            } catch (SQLException ex) {
                Logger.getLogger(ConsultaView.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ""+ex.getMessage());
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public PatrimonioM pegaPatrimonio(){
        try {
            PatrimonioM patrimo = patrimonioDAO.busca(Integer.parseInt(tbeBusca.getValueAt(tbeBusca.getSelectedRow(), 0).toString()));
            return patrimo;
        } catch (SQLException ex) {
            Logger.getLogger(PatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloco;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblComposto;
    private javax.swing.JLabel lblConservacao;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblOrgao;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lblSala;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSubtipo;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JTable tbeBusca;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
