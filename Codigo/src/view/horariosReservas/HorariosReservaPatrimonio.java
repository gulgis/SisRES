/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.horariosReservas;

import control.ManterResSalaAluno;
import control.ManterResSalaProfessor;
import exception.ClienteException;
import exception.PatrimonioException;
import exception.ReservaException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ReservaSalaAluno;
import model.ReservaSalaProfessor;
import model.Patrimonio;

/**
 * 
 * @author Parley
 */
public abstract class HorariosReservaPatrimonio extends javax.swing.JDialog {

    protected String data;
    int mes;
    protected Patrimonio p;

    protected abstract DefaultTableModel fillTable(Patrimonio p);

    protected abstract void cancelarReservaAction(int indexLinha);

    protected abstract void reservarAction();

    protected abstract void alterarAction(int indexLinha);

    public HorariosReservaPatrimonio(java.awt.Frame parent, boolean modal, String data, Patrimonio p) {
        super(parent, modal);
        this.data = data;
        this.setTitle(data);
	this.p = p;
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")// <editor-fold defaultstate="collapsed"
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel3 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                reservarButton = new javax.swing.JButton();
                alterarButton = new javax.swing.JButton();
                cancelarReservaButton = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                reservasTable = new javax.swing.JTable();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                reservarButton.setText("Reservar");
                reservarButton.setName("ReservarButton"); // NOI18N
                reservarButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                reservarButtonActionPerformed(evt);
                        }
                });

                alterarButton.setText("Alterar Reserva");
                alterarButton.setName("AlterarButton"); // NOI18N
                alterarButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                alterarButtonActionPerformed(evt);
                        }
                });

                cancelarReservaButton.setText("Cancelar Reserva");
                cancelarReservaButton.setName("CancelarReservaButton"); // NOI18N
                cancelarReservaButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cancelarReservaButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(reservarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addComponent(cancelarReservaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addComponent(alterarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(reservarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelarReservaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(175, Short.MAX_VALUE))
                );

                jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {alterarButton, cancelarReservaButton, reservarButton});

                reservasTable.setModel(fillTable(this.p));
                reservasTable.setName("ReservasTable"); // NOI18N
                jScrollPane1.setViewportView(reservasTable);

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel2, jScrollPane1});

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void cancelarReservaButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelarReservaButtonActionPerformed
        int indexLinha;
        indexLinha = this.reservasTable.getSelectedRow();
        if (indexLinha < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha!", "Erro", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        cancelarReservaAction(indexLinha);
        this.reservasTable.setModel(fillTable(this.p));
    }// GEN-LAST:event_cancelarReservaButtonActionPerformed

    private void reservarButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_reservarButtonActionPerformed
        reservarAction();
        this.reservasTable.setModel(fillTable(this.p));
    }// GEN-LAST:event_reservarButtonActionPerformed

    private void alterarButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_alterarButtonActionPerformed
        int indexLinha;
        indexLinha = this.reservasTable.getSelectedRow();
        if (indexLinha < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha!", "Erro", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        alterarAction(indexLinha);
        this.reservasTable.setModel(fillTable(this.p));
    }// GEN-LAST:event_alterarButtonActionPerformed
        // Variables declaration - do not modify//GEN-BEGIN:variables
        protected javax.swing.JButton alterarButton;
        protected javax.swing.JButton cancelarReservaButton;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        protected javax.swing.JButton reservarButton;
        protected javax.swing.JTable reservasTable;
        // End of variables declaration//GEN-END:variables
}
