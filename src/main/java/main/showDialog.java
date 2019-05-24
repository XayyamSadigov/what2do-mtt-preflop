/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author KhayyamS
 */
public final class showDialog extends javax.swing.JDialog {

    /**
     * Creates new form showDialog
     */
    public showDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    int stack;
    String position;
    String hand;
    Hand handObj;

    public showDialog(java.awt.Frame parent, boolean modal, int stack, String position, String hand) {
        super(parent, modal);
        initComponents();
        this.stack = stack;
        this.position = position;
        this.hand = hand;
        handObj = Database.get(stack, position, hand);

        if (handObj != null) {
            t_info.setText(handObj.getInfo());
            this.setTitle(hand + " on " + position + " with " + stack + "bb stack (" + handObj.getStack() + "bb)");
            getRfiOptions();
            getPushOptions();
            getVsOptions(handObj.getVs_rfiOptions(), vs_rfi_label, p_vs_rfi);
            getVsOptions(handObj.getVs_3betOptions(), vs_3bet_label, p_vs_3bet);
            getVsOptions(handObj.getVs_4betOptions(), vs_4bet_label, p_vs_4bet);
            getVsOptions(handObj.getVs_pushOptions(), vs_push_label, p_vs_push);
        } else {
            this.setTitle(hand + " on " + position + " with " + stack + "bb stack");
        }
    }

    public void getRfiOptions() {
        List<Option> options = handObj.getRfiOptions();

        if (!options.contains(Option.YES) && !options.contains(Option.NO)) {
            return;
        }

        for (Option option : options) {
            if (option == Option.YES) {
                rfi_label.setText(option.name());
                p_rfi.setBackground(java.awt.Color.green);
            }

            if (option == Option.NO) {
                rfi_label.setText(rfi_label.getText() + " | " + option.name());
            }
        }

        if (p_rfi.getBackground() != java.awt.Color.green) {
            p_rfi.setBackground(java.awt.Color.RED);
            rfi_label.setText("NO");
        }
    }

    public void getVsOptions(List<Option> options, JLabel label, JPanel panel) {

        if (!options.contains(Option.CALL)
                && !options.contains(Option.FOLD)
                && !options.contains(Option.ALL_IN)
                && !options.contains(Option.BLUFF_ALL_IN)
                && !options.contains(Option.BLUFF_RAISE)
                && !options.contains(Option.RAISE)) {
            return;
        }

        for (Option option : options) {
            if (option == Option.CALL) {
                label.setText(option.name());
                panel.setBackground(java.awt.Color.green);
            }

            if (option == Option.RAISE || option == Option.ALL_IN) {
                if (!label.getText().isEmpty()) {
                    label.setText(label.getText() + " | " + option.name());
                } else {
                    label.setText(option.name());
                }
                panel.setBackground(java.awt.Color.YELLOW);
            }

            if (option == Option.BLUFF_ALL_IN || option == Option.BLUFF_RAISE) {
                if (!label.getText().isEmpty()) {
                    label.setText(label.getText() + " | " + option.name());
                } else {
                    label.setText(option.name());
                }
                if (panel.getBackground() != java.awt.Color.green
                        && panel.getBackground() != java.awt.Color.YELLOW) {
                    panel.setBackground(java.awt.Color.BLUE);
                }
            }
        }

        if (panel.getBackground() != java.awt.Color.green
                && panel.getBackground() != java.awt.Color.YELLOW
                && panel.getBackground() != java.awt.Color.BLUE) {
            panel.setBackground(java.awt.Color.RED);
            label.setText("FOLD");
        }
    }

    public void getPushOptions() {
        List<Option> options = handObj.getPushOptions();

        if (!options.contains(Option.YES) && !options.contains(Option.NO)) {
            return;
        }

        for (Option option : options) {
            if (option == Option.YES) {
                push_label.setText(option.name());
                p_push.setBackground(java.awt.Color.green);
            }

            if (option == Option.NO) {
                push_label.setText(push_label.getText() + " | " + option.name());
            }
        }

        if (p_push.getBackground() != java.awt.Color.green) {
            p_push.setBackground(java.awt.Color.RED);
            push_label.setText("NO");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOk = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_info = new javax.swing.JTextArea();
        p_rfi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rfi_label = new javax.swing.JLabel();
        p_vs_rfi = new javax.swing.JPanel();
        vs_rfi_label = new javax.swing.JLabel();
        p_vs_3bet = new javax.swing.JPanel();
        vs_3bet_label = new javax.swing.JLabel();
        p_vs_4bet = new javax.swing.JPanel();
        vs_4bet_label = new javax.swing.JLabel();
        p_push = new javax.swing.JPanel();
        push_label = new javax.swing.JLabel();
        p_vs_push = new javax.swing.JPanel();
        vs_push_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnOk.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        t_info.setEditable(false);
        t_info.setColumns(20);
        t_info.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        t_info.setRows(5);
        jScrollPane1.setViewportView(t_info);

        p_rfi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RFI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36))); // NOI18N
        p_rfi.setMaximumSize(new java.awt.Dimension(400, 200));
        p_rfi.setPreferredSize(new java.awt.Dimension(400, 200));

        rfi_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rfi_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p_rfiLayout = new javax.swing.GroupLayout(p_rfi);
        p_rfi.setLayout(p_rfiLayout);
        p_rfiLayout.setHorizontalGroup(
            p_rfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_rfiLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1)
                .addContainerGap(258, Short.MAX_VALUE))
            .addComponent(rfi_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p_rfiLayout.setVerticalGroup(
            p_rfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_rfiLayout.createSequentialGroup()
                .addComponent(rfi_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_vs_rfi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "vs RFI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36))); // NOI18N
        p_vs_rfi.setMaximumSize(new java.awt.Dimension(400, 200));
        p_vs_rfi.setPreferredSize(new java.awt.Dimension(400, 200));

        vs_rfi_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vs_rfi_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p_vs_rfiLayout = new javax.swing.GroupLayout(p_vs_rfi);
        p_vs_rfi.setLayout(p_vs_rfiLayout);
        p_vs_rfiLayout.setHorizontalGroup(
            p_vs_rfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vs_rfi_label, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        p_vs_rfiLayout.setVerticalGroup(
            p_vs_rfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_vs_rfiLayout.createSequentialGroup()
                .addComponent(vs_rfi_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        p_vs_3bet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "vs 3bet", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36))); // NOI18N
        p_vs_3bet.setMaximumSize(new java.awt.Dimension(400, 200));
        p_vs_3bet.setPreferredSize(new java.awt.Dimension(400, 200));

        vs_3bet_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vs_3bet_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p_vs_3betLayout = new javax.swing.GroupLayout(p_vs_3bet);
        p_vs_3bet.setLayout(p_vs_3betLayout);
        p_vs_3betLayout.setHorizontalGroup(
            p_vs_3betLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vs_3bet_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p_vs_3betLayout.setVerticalGroup(
            p_vs_3betLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_vs_3betLayout.createSequentialGroup()
                .addComponent(vs_3bet_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        p_vs_4bet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "vs 4bet", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36))); // NOI18N
        p_vs_4bet.setMaximumSize(new java.awt.Dimension(400, 200));
        p_vs_4bet.setPreferredSize(new java.awt.Dimension(400, 200));

        vs_4bet_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vs_4bet_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p_vs_4betLayout = new javax.swing.GroupLayout(p_vs_4bet);
        p_vs_4bet.setLayout(p_vs_4betLayout);
        p_vs_4betLayout.setHorizontalGroup(
            p_vs_4betLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vs_4bet_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p_vs_4betLayout.setVerticalGroup(
            p_vs_4betLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_vs_4betLayout.createSequentialGroup()
                .addComponent(vs_4bet_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        p_push.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "push", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36))); // NOI18N
        p_push.setMaximumSize(new java.awt.Dimension(400, 200));
        p_push.setPreferredSize(new java.awt.Dimension(400, 200));

        push_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        push_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p_pushLayout = new javax.swing.GroupLayout(p_push);
        p_push.setLayout(p_pushLayout);
        p_pushLayout.setHorizontalGroup(
            p_pushLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(push_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        p_pushLayout.setVerticalGroup(
            p_pushLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_pushLayout.createSequentialGroup()
                .addComponent(push_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        p_vs_push.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "vs push", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36))); // NOI18N
        p_vs_push.setMaximumSize(new java.awt.Dimension(400, 200));
        p_vs_push.setPreferredSize(new java.awt.Dimension(400, 200));

        vs_push_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vs_push_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p_vs_pushLayout = new javax.swing.GroupLayout(p_vs_push);
        p_vs_push.setLayout(p_vs_pushLayout);
        p_vs_pushLayout.setHorizontalGroup(
            p_vs_pushLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vs_push_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        p_vs_pushLayout.setVerticalGroup(
            p_vs_pushLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_vs_pushLayout.createSequentialGroup()
                .addComponent(vs_push_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_rfi, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_vs_rfi, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_push, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_vs_push, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1209, Short.MAX_VALUE)
                    .addComponent(p_vs_4bet, javax.swing.GroupLayout.DEFAULT_SIZE, 1209, Short.MAX_VALUE)
                    .addComponent(p_vs_3bet, javax.swing.GroupLayout.DEFAULT_SIZE, 1209, Short.MAX_VALUE))
                .addGap(639, 639, 639))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_rfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_push, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p_vs_rfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_vs_push, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_vs_3bet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_vs_4bet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(482, 482, 482)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        dispose();
    }//GEN-LAST:event_btnOkActionPerformed

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
            java.util.logging.Logger.getLogger(showDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                showDialog dialog = new showDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel p_push;
    private javax.swing.JPanel p_rfi;
    private javax.swing.JPanel p_vs_3bet;
    private javax.swing.JPanel p_vs_4bet;
    private javax.swing.JPanel p_vs_push;
    private javax.swing.JPanel p_vs_rfi;
    private javax.swing.JLabel push_label;
    private javax.swing.JLabel rfi_label;
    private javax.swing.JTextArea t_info;
    private javax.swing.JLabel vs_3bet_label;
    private javax.swing.JLabel vs_4bet_label;
    private javax.swing.JLabel vs_push_label;
    private javax.swing.JLabel vs_rfi_label;
    // End of variables declaration//GEN-END:variables
}
