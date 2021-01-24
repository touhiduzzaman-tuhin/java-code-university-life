
package Calculation;

/**
 *
 * @author Tuhin
 */
public class Calculation extends javax.swing.JFrame {

    
    double num,ans;
    int calculation;
    
    public Calculation() {
        initComponents();
        
        jRadioButton1.setEnabled(false);
    }
    
    public void arithmetic_operation()
    {
        switch(calculation)
        {
            case 1:
                ans = num + Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                
            case 2:
                ans = num - Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                
           case 3:
                ans = num * Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                
         case 4:
                ans = num / Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;    
            
            
        }
    }
    
    public void enable()
    {
        jTextField1.setEnabled(true);
        
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(true);
        
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        division.setEnabled(true);
        zero.setEnabled(true);
        equal.setEnabled(true);
        multi.setEnabled(true);
        decimal.setEnabled(true);
        cancel.setEnabled(true);
        back.setEnabled(true);
    }
    
    public void disable()
    {
        jTextField1.setEnabled(false);
        
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(false);
             
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        plus.setEnabled(false);
        minus.setEnabled(false);
        division.setEnabled(false);
        zero.setEnabled(false);
        equal.setEnabled(false);
        multi.setEnabled(false);
        decimal.setEnabled(false);
        cancel.setEnabled(false);
        back.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        three = new javax.swing.JButton();
        one = new javax.swing.JButton();
        division = new javax.swing.JButton();
        two = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        six = new javax.swing.JButton();
        four = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        five = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        back = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, 40));

        three.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        getContentPane().add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 50, 40));

        one.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        getContentPane().add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, 40));

        division.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        getContentPane().add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 50, 40));

        two.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        getContentPane().add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 50, 40));

        equal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        getContentPane().add(equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 120, 40));

        zero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        getContentPane().add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 50, 40));

        decimal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });
        getContentPane().add(decimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 50, 40));

        nine.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        getContentPane().add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 50, 40));

        seven.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        getContentPane().add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 40));

        minus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        getContentPane().add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 50, 40));

        eight.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        getContentPane().add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 50, 40));

        six.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        getContentPane().add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 50, 40));

        four.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        getContentPane().add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, 40));

        multi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        multi.setText("*");
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });
        getContentPane().add(multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 50, 40));

        five.setBackground(new java.awt.Color(102, 102, 255));
        five.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        getContentPane().add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 50, 40));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton1.setText("ON");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2.setText("OFF");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, -1, 30));

        back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back.setText("<--");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 40));

        cancel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancel.setText("C");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, 40));

        plus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        getContentPane().add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, 40));

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 150, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_fiveActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_eightActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        
        num = Double.parseDouble(jTextField1.getText());
        calculation = 2;
        jTextField1.setText("");
        jLabel1.setText(num + "-");
    }//GEN-LAST:event_minusActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        
        num = Double.parseDouble(jTextField1.getText());
        calculation = 4;
        jTextField1.setText("");
        jLabel1.setText(num + "/");
    }//GEN-LAST:event_divisionActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_threeActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "7");
    }//GEN-LAST:event_sevenActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_nineActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        
        num = Double.parseDouble(jTextField1.getText());
        calculation = 1;
        jTextField1.setText("");
        jLabel1.setText(num + "+");
    }//GEN-LAST:event_plusActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        
        num = Double.parseDouble(jTextField1.getText());
        calculation = 3;
        jTextField1.setText("");
        jLabel1.setText(num + "*");
    }//GEN-LAST:event_multiActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        
        jTextField1.setText(jTextField1.getText() + "0");
    }//GEN-LAST:event_zeroActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        
        jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_decimalActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        
        jTextField1.setText("");
    }//GEN-LAST:event_cancelActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        
        disable();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        enable();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
        int length = jTextField1.getText().length();
        int number = jTextField1.getText().length() - 1;
        String store;
        
        if(length > 0)
        {
            StringBuilder back = new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store = back.toString();
            jTextField1.setText(store);
            
        }
        
        
    }//GEN-LAST:event_backActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        
        arithmetic_operation();
        jLabel1.setText("");
    }//GEN-LAST:event_equalActionPerformed

    
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
            java.util.logging.Logger.getLogger(Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JButton decimal;
    private javax.swing.JButton division;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton minus;
    private javax.swing.JButton multi;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton plus;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
