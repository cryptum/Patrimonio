/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author Leopoldo
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public PrincipalView() {
        initComponents();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        pnlPrincipal = new javax.swing.JPanel();
        mnbPrincipal = new javax.swing.JMenuBar();
        mnuCadastrar = new javax.swing.JMenu();
        mniEntidade = new javax.swing.JMenuItem();
        mnuLocalizacao = new javax.swing.JMenu();
        mniUnidade = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniBloco = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniPiso = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniSala = new javax.swing.JMenuItem();
        mnuPatrimonio = new javax.swing.JMenu();
        mniIncluirPatrimonio = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniTipoSubtipo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniConservacaoStatus = new javax.swing.JMenuItem();
        mnuMovimentacoes = new javax.swing.JMenu();
        mnuRelatorios = new javax.swing.JMenu();
        mnuSobre = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setName("NUPSI"); // NOI18N

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 931, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        mnuCadastrar.setText("Cadastrar");

        mniEntidade.setText("Entidade");
        mniEntidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEntidadeActionPerformed(evt);
            }
        });
        mnuCadastrar.add(mniEntidade);

        mnuLocalizacao.setText("Localização");

        mniUnidade.setText("Unidade");
        mniUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUnidadeActionPerformed(evt);
            }
        });
        mnuLocalizacao.add(mniUnidade);
        mnuLocalizacao.add(jSeparator3);

        mniBloco.setText("Bloco");
        mniBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBlocoActionPerformed(evt);
            }
        });
        mnuLocalizacao.add(mniBloco);
        mnuLocalizacao.add(jSeparator4);

        mniPiso.setText("Piso");
        mniPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPisoActionPerformed(evt);
            }
        });
        mnuLocalizacao.add(mniPiso);
        mnuLocalizacao.add(jSeparator5);

        mniSala.setText("Sala");
        mniSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalaActionPerformed(evt);
            }
        });
        mnuLocalizacao.add(mniSala);

        mnuCadastrar.add(mnuLocalizacao);

        mnuPatrimonio.setText("Patrimônio");

        mniIncluirPatrimonio.setText("Incluir Patrimônio");
        mniIncluirPatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniIncluirPatrimonioActionPerformed(evt);
            }
        });
        mnuPatrimonio.add(mniIncluirPatrimonio);
        mnuPatrimonio.add(jSeparator1);

        mniTipoSubtipo.setText("Incluir Tipo ou Subtipo");
        mniTipoSubtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTipoSubtipoActionPerformed(evt);
            }
        });
        mnuPatrimonio.add(mniTipoSubtipo);
        mnuPatrimonio.add(jSeparator2);

        mniConservacaoStatus.setText("Incluir Grau de Conservacao ou Status");
        mniConservacaoStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConservacaoStatusActionPerformed(evt);
            }
        });
        mnuPatrimonio.add(mniConservacaoStatus);

        mnuCadastrar.add(mnuPatrimonio);

        mnbPrincipal.add(mnuCadastrar);

        mnuMovimentacoes.setText("Movimentações");
        mnbPrincipal.add(mnuMovimentacoes);

        mnuRelatorios.setText("Relatórios");
        mnbPrincipal.add(mnuRelatorios);

        mnuSobre.setText("Sobre");
        mnbPrincipal.add(mnuSobre);

        setJMenuBar(mnbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniEntidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEntidadeActionPerformed
        // TODO add your handling code here:
        EntidadeView entidade = new EntidadeView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(entidade);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniEntidadeActionPerformed

    private void mniIncluirPatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniIncluirPatrimonioActionPerformed
        // TODO add your handling code here:
        PatrimonioView patrimonio = new PatrimonioView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(patrimonio);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniIncluirPatrimonioActionPerformed

    private void mniTipoSubtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTipoSubtipoActionPerformed
        // TODO add your handling code here:
        TipoSubtipoView tipoSubtipo = new TipoSubtipoView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(tipoSubtipo);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniTipoSubtipoActionPerformed

    private void mniConservacaoStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConservacaoStatusActionPerformed
        ConservacaoStatusView conservacaoStatus = new ConservacaoStatusView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(conservacaoStatus);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniConservacaoStatusActionPerformed

    private void mniUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUnidadeActionPerformed
        // TODO add your handling code here:
        UnidadeView unidade = new UnidadeView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(unidade);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniUnidadeActionPerformed

    private void mniBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBlocoActionPerformed
        // TODO add your handling code here:
        BlocoView bloco = new BlocoView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(bloco);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniBlocoActionPerformed

    private void mniPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPisoActionPerformed
        // TODO add your handling code here:
        PisoView piso = new PisoView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(piso);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniPisoActionPerformed

    private void mniSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalaActionPerformed
        // TODO add your handling code here:
        SalaView sala = new SalaView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(sala);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniSalaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenuBar mnbPrincipal;
    private javax.swing.JMenuItem mniBloco;
    private javax.swing.JMenuItem mniConservacaoStatus;
    private javax.swing.JMenuItem mniEntidade;
    private javax.swing.JMenuItem mniIncluirPatrimonio;
    private javax.swing.JMenuItem mniPiso;
    private javax.swing.JMenuItem mniSala;
    private javax.swing.JMenuItem mniTipoSubtipo;
    private javax.swing.JMenuItem mniUnidade;
    private javax.swing.JMenu mnuCadastrar;
    private javax.swing.JMenu mnuLocalizacao;
    private javax.swing.JMenu mnuMovimentacoes;
    private javax.swing.JMenu mnuPatrimonio;
    private javax.swing.JMenu mnuRelatorios;
    private javax.swing.JMenu mnuSobre;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
