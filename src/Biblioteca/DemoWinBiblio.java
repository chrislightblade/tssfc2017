/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class DemoWinBiblio extends javax.swing.JFrame {

    /**
     * Creates new form DemoWinBiblio2
     */
    Biblioteca bib;
    Dipendente dip;
    DefaultListModel modelLibri = new DefaultListModel();
    DefaultListModel modelClienti = new DefaultListModel();
    DefaultListModel modelPrestiti = new DefaultListModel();

    public DemoWinBiblio(Biblioteca bib) {
        this.bib = bib;
        initComponents();
        //String nomedip;
        dip = bib.getElencodipendenti().get(0);
        String dipendente = dip.getNome() + " " + dip.getRuolo();
        jlTitoloWin.setText("Form Gestione Biblioteca " + new Date().toString() + "\n " + dipendente);
        refreshLibri();
        refreshClienti();
        refreshPrestiti();
    }

    private void refreshLibri() {
        modelLibri = new DefaultListModel();
        for (Libro l : bib.getElencolibri()) {
            modelLibri.addElement(l.getInfo());
        }
        jLibri.setModel(modelLibri);
    }

    private void refreshClienti() {
        modelClienti = new DefaultListModel();
        for (Cliente c : bib.getElencoclienti()) {
            modelClienti.addElement(c.getInfo());
        }
        jClienti.setModel(modelClienti);
    }

    private void refreshPrestiti() {
        modelPrestiti = new DefaultListModel();
        for (Prestito p : bib.getElencoprestiti()) {
            if(p.getDataRestituzione() == null)
            modelPrestiti.addElement(p.getNote());
        }
        jPrestiti.setModel(modelPrestiti);
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
        jTextPane1 = new javax.swing.JTextPane();
        jSpinner1 = new javax.swing.JSpinner();
        jlTitoloWin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtTitolo = new javax.swing.JTextField();
        jtAutore = new javax.swing.JTextField();
        jbAddLibro = new javax.swing.JButton();
        jtMsgLibri = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jBDelLibro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jClienti = new javax.swing.JList<>();
        jLClienti = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLibri = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPrestiti = new javax.swing.JList<>();
        jBCreaPrestito = new javax.swing.JButton();
        jLMsgPrestito = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextFieldNOme = new javax.swing.JTextField();
        jTextFieldCognome = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlTitoloWin.setBackground(new java.awt.Color(255, 0, 0));
        jlTitoloWin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitoloWin.setText("Form Gestione Biblioteca");

        jLabel2.setText("Titolo");

        jLabel3.setText("Autore");

        jtTitolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTitoloActionPerformed(evt);
            }
        });

        jbAddLibro.setText("Aggiungi Libro");
        jbAddLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddLibroActionPerformed(evt);
            }
        });

        jtMsgLibri.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtMsgLibri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(jtTitolo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbAddLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtAutore))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtTitolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtAutore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbAddLibro)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jtMsgLibri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jBDelLibro.setText("Elimina Libro");
        jBDelLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelLibroActionPerformed(evt);
            }
        });

        jClienti.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jClienti);

        jLClienti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLClienti.setText("Clienti");

        jLibri.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jLibri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLibriMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jLibri);

        jPrestiti.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jPrestiti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPrestitiMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jPrestiti);

        jBCreaPrestito.setText("Crea Prestito");
        jBCreaPrestito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCreaPrestitoActionPerformed(evt);
            }
        });

        jLMsgPrestito.setText("...");
        jLMsgPrestito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMsgPrestitoMouseClicked(evt);
            }
        });

        jButton1.setText("Elimina Prestito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(jLMsgPrestito, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBCreaPrestito, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBCreaPrestito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLMsgPrestito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setText("Aggiungi Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextFieldNOme.setText("nome");
        jTextFieldNOme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNOmeActionPerformed(evt);
            }
        });

        jTextFieldCognome.setText("cognome");
        jTextFieldCognome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCognomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitoloWin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBDelLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLClienti))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jTextFieldNOme)
                            .addComponent(jTextFieldCognome))))
                .addGap(287, 287, 287))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlTitoloWin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBDelLibro)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jTextFieldNOme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLClienti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtTitoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTitoloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTitoloActionPerformed

    private void jbAddLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddLibroActionPerformed
        // TODO add your handling code here:
        String ris = "";

        ris = dip.aggLibro(jtTitolo.getText(), jtAutore.getText(), bib);
        jtMsgLibri.setText(ris);
        jtTitolo.setText("");
        jtAutore.setText("");
        refreshClienti();
        refreshLibri();
    }//GEN-LAST:event_jbAddLibroActionPerformed

    private void jBDelLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelLibroActionPerformed
        // TODO add your handling code here:
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int index = jLibri.getSelectedIndex();
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String ris = dip.removeLibro(index, bib);
        jtMsgLibri.setText(ris);
        refreshLibri();
    }//GEN-LAST:event_jBDelLibroActionPerformed

    private void jLibriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLibriMouseClicked
        // TODO add your handling code here:
        //jtMsgLibri.setText(modelLibri.get(jLibri.getSelectedIndex()).toString());
        jtMsgLibri.setText(jLibri.getSelectedValue());

    }//GEN-LAST:event_jLibriMouseClicked

    private void jBCreaPrestitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCreaPrestitoActionPerformed
        // TODO add your handling code here:
        int indexCliente = jClienti.getSelectedIndex();
        int codCliente = bib.getElencoclienti().get(indexCliente).getCodCliente();
        int indexLibro = jLibri.getSelectedIndex();
        int codLibro = bib.getElencolibri().get(indexLibro).getCodLibro();
        if (bib.isDisponibile(codLibro) && bib.isClienteMoroso(codCliente)) {
            jLMsgPrestito.setText(dip.aggNewPrestito(codCliente, codLibro, jClienti.getSelectedValue() + " - " + jLibri.getSelectedValue(), bib));
        } else {
            String report = "";
            if (!bib.isClienteMoroso(codCliente)) {
                report += "Il cliente è moroso.\n";
            }
            if (!bib.isDisponibile(codLibro)) {
                report += "Il libro non è disponibile.\n";
            }
            JOptionPane.showMessageDialog(null, report);
        }
        refreshPrestiti();

    }//GEN-LAST:event_jBCreaPrestitoActionPerformed

    private void jPrestitiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPrestitiMouseClicked
        // TODO add your handling code here:
        jLMsgPrestito.setText(modelPrestiti.get(jPrestiti.getSelectedIndex()).toString());
    }//GEN-LAST:event_jPrestitiMouseClicked

    private void jLMsgPrestitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMsgPrestitoMouseClicked
        // TODO add your handling code here:
        jLMsgPrestito.setText("");
    }//GEN-LAST:event_jLMsgPrestitoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int index = jPrestiti.getSelectedIndex();
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //String ris = bib.eliminaPrestito(index, bib); 
        String code = jPrestiti.getSelectedValue();
        int posquadrachiusa = code.indexOf(']');
        code = code.substring(1, posquadrachiusa);
        index = Integer.parseInt(code);
        String ris = dip.eliminaPrestito(bib.getElencoprestiti().get(index -1), bib);
        jLMsgPrestito.setText(ris);
        refreshPrestiti();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String nome = jTextFieldNOme.getText();
        String cognome = jTextFieldCognome.getText();
        dip.aggNewCliente(nome, cognome, bib);
        refreshClienti();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldCognomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCognomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCognomeActionPerformed

    private void jTextFieldNOmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNOmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNOmeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCreaPrestito;
    private javax.swing.JButton jBDelLibro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JList<String> jClienti;
    private javax.swing.JLabel jLClienti;
    private javax.swing.JLabel jLMsgPrestito;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jLibri;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JList<String> jPrestiti;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextFieldCognome;
    private javax.swing.JTextField jTextFieldNOme;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton jbAddLibro;
    private javax.swing.JLabel jlTitoloWin;
    private javax.swing.JTextField jtAutore;
    private javax.swing.JLabel jtMsgLibri;
    private javax.swing.JTextField jtTitolo;
    // End of variables declaration//GEN-END:variables
}
