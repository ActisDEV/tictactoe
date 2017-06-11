/*
 * The MIT License
 *
 * Copyright 2017 Denis Karev.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package game.ui;

/**
 *
 * @author Денис
 */
public class AIPlayField extends javax.swing.JFrame {
   
    MainMenu menu = new MainMenu();
    /**
     * Creates new form AIPlayField
     */
    public AIPlayField() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pos00 = new javax.swing.JTextField();
        pos01 = new javax.swing.JTextField();
        pos02 = new javax.swing.JTextField();
        pos10 = new javax.swing.JTextField();
        pos11 = new javax.swing.JTextField();
        pos12 = new javax.swing.JTextField();
        pos20 = new javax.swing.JTextField();
        pos21 = new javax.swing.JTextField();
        pos22 = new javax.swing.JTextField();
        info = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pos00.setEditable(false);
        pos00.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        pos00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pos00.setToolTipText("1:1");
        pos00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos00MouseClicked(evt);
            }
        });

        pos01.setEditable(false);
        pos01.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        pos01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pos01.setToolTipText("1:2");
        pos01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos01MouseClicked(evt);
            }
        });

        pos02.setEditable(false);
        pos02.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        pos02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pos02.setToolTipText("1:3");
        pos02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos02MouseClicked(evt);
            }
        });

        pos10.setEditable(false);
        pos10.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        pos10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pos10.setToolTipText("2:1");
        pos10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos10MouseClicked(evt);
            }
        });

        pos11.setEditable(false);
        pos11.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        pos11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pos11.setToolTipText("2:2");
        pos11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos11MouseClicked(evt);
            }
        });

        pos12.setEditable(false);
        pos12.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        pos12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pos12.setToolTipText("2:3");
        pos12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos12MouseClicked(evt);
            }
        });

        pos20.setEditable(false);
        pos20.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        pos20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pos20.setToolTipText("3:1");
        pos20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos20MouseClicked(evt);
            }
        });

        pos21.setEditable(false);
        pos21.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        pos21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pos21.setToolTipText("3:2");
        pos21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos21MouseClicked(evt);
            }
        });

        pos22.setEditable(false);
        pos22.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        pos22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pos22.setToolTipText("3:3");
        pos22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos22MouseClicked(evt);
            }
        });

        info.setEditable(false);
        info.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N

        clearButton.setText("Очистить");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Выйти");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pos00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pos01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pos02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pos10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pos11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pos20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pos21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pos22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(info)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pos00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pos10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pos22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(closeButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pos00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos00MouseClicked

    }//GEN-LAST:event_pos00MouseClicked

    private void pos01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos01MouseClicked

    }//GEN-LAST:event_pos01MouseClicked

    private void pos02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos02MouseClicked

    }//GEN-LAST:event_pos02MouseClicked

    private void pos10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos10MouseClicked

    }//GEN-LAST:event_pos10MouseClicked

    private void pos11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos11MouseClicked

    }//GEN-LAST:event_pos11MouseClicked

    private void pos12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos12MouseClicked

    }//GEN-LAST:event_pos12MouseClicked

    private void pos20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos20MouseClicked
 
    }//GEN-LAST:event_pos20MouseClicked

    private void pos21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos21MouseClicked

    }//GEN-LAST:event_pos21MouseClicked

    private void pos22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos22MouseClicked

    }//GEN-LAST:event_pos22MouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        pos00.setText("");
        pos01.setText("");
        pos02.setText("");
        pos10.setText("");
        pos11.setText("");
        pos12.setText("");
        pos20.setText("");
        pos21.setText("");
        pos22.setText("");
        info.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AIPlayField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AIPlayField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AIPlayField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AIPlayField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AIPlayField().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField info;
    private javax.swing.JTextField pos00;
    private javax.swing.JTextField pos01;
    private javax.swing.JTextField pos02;
    private javax.swing.JTextField pos10;
    private javax.swing.JTextField pos11;
    private javax.swing.JTextField pos12;
    private javax.swing.JTextField pos20;
    private javax.swing.JTextField pos21;
    private javax.swing.JTextField pos22;
    // End of variables declaration//GEN-END:variables
}