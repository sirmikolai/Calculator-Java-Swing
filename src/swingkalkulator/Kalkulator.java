package swingkalkulator;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Kalkulator extends javax.swing.JFrame {

    Operacja operacja = new Operacja();

    public Kalkulator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        number0 = new javax.swing.JButton();
        kropka = new javax.swing.JButton();
        wynik = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        number1 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        mnozenie = new javax.swing.JButton();
        czyszczenie = new javax.swing.JButton();
        dzielenie = new javax.swing.JButton();
        textField = new javax.swing.JTextField();
        dodawanie = new javax.swing.JButton();
        odejmowanie = new javax.swing.JButton();
        usuwanie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        number0.setText("0");
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ActionPerformed(evt);
            }
        });

        kropka.setBackground(new java.awt.Color(51, 102, 255));
        kropka.setText(".");
        kropka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kropkaActionPerformed(evt);
            }
        });

        wynik.setBackground(new java.awt.Color(51, 102, 255));
        wynik.setText("=");
        wynik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wynikActionPerformed(evt);
            }
        });

        number2.setText("2");
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });

        number3.setText("3");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });

        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });

        number4.setText("4");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });

        number5.setText("5");
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ActionPerformed(evt);
            }
        });

        number6.setText("6");
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ActionPerformed(evt);
            }
        });

        number7.setText("7");
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ActionPerformed(evt);
            }
        });

        number8.setText("8");
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ActionPerformed(evt);
            }
        });

        number9.setText("9");
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ActionPerformed(evt);
            }
        });

        mnozenie.setBackground(new java.awt.Color(51, 255, 0));
        mnozenie.setText("*");
        mnozenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnozenieActionPerformed(evt);
            }
        });

        czyszczenie.setBackground(new java.awt.Color(255, 0, 51));
        czyszczenie.setText("C");
        czyszczenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                czyszczenieActionPerformed(evt);
            }
        });

        dzielenie.setBackground(new java.awt.Color(51, 204, 0));
        dzielenie.setText("/");
        dzielenie.setToolTipText("");
        dzielenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dzielenieActionPerformed(evt);
            }
        });

        textField.setEditable(false);
        textField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textField.setText("0");

        dodawanie.setBackground(new java.awt.Color(51, 255, 51));
        dodawanie.setText("+");
        dodawanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodawanieActionPerformed(evt);
            }
        });

        odejmowanie.setBackground(new java.awt.Color(51, 255, 51));
        odejmowanie.setText("-");
        odejmowanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odejmowanieActionPerformed(evt);
            }
        });

        usuwanie.setBackground(new java.awt.Color(255, 0, 51));
        usuwanie.setText("CE");
        usuwanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuwanieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(number4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kropka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(number2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(number8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(number6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(number3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wynik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuwanie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mnozenie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dzielenie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dodawanie, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(odejmowanie, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(czyszczenie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(czyszczenie)
                    .addComponent(usuwanie))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number7)
                    .addComponent(number8)
                    .addComponent(number9)
                    .addComponent(dodawanie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number4)
                    .addComponent(number5)
                    .addComponent(number6)
                    .addComponent(odejmowanie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number1)
                    .addComponent(number2)
                    .addComponent(number3)
                    .addComponent(mnozenie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number0)
                    .addComponent(kropka)
                    .addComponent(wynik)
                    .addComponent(dzielenie))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wynikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wynikActionPerformed
        if (!textField.getText().equals("-")) {
            operacja.setLiczba2(textField.getText());
        }
        Float wynik = operacja.podajWynik();
        if(wynik.toString().endsWith(".0")) {
            textField.setText(wynik.toString().substring(0, wynik.toString().length() - 2));
        } else {
            textField.setText(wynik.toString());
        }
    }//GEN-LAST:event_wynikActionPerformed

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed
        if (textField.getText().equals("0")) {
            textField.setText("3");
        } else {
            textField.setText(textField.getText() + "3");
        }
    }//GEN-LAST:event_number3ActionPerformed

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ActionPerformed
        if (textField.getText().equals("0")) {
            textField.setText("6");
        } else {
            textField.setText(textField.getText() + "6");
        }
    }//GEN-LAST:event_number6ActionPerformed

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed
        if (textField.getText().equals("0")) {
            textField.setText("4");
        } else {
            textField.setText(textField.getText() + "4");
        }
    }//GEN-LAST:event_number4ActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
        if (textField.getText().equals("0")) {
            textField.setText("1");
        } else {
            textField.setText(textField.getText() + "1");
        }
    }//GEN-LAST:event_number1ActionPerformed

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ActionPerformed
        if (textField.getText().equals("0")) {
            textField.setText("7");
        } else {
            textField.setText(textField.getText() + "7");
        }
    }//GEN-LAST:event_number7ActionPerformed

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ActionPerformed
        if (textField.getText().equals("0")) {
            textField.setText("9");
        } else {
            textField.setText(textField.getText() + "9");
        }
    }//GEN-LAST:event_number9ActionPerformed

    private void kropkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kropkaActionPerformed
        if(!textField.getText().contains(".")) {
            textField.setText(textField.getText() + ".");
        }
    }//GEN-LAST:event_kropkaActionPerformed

    private void mnozenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnozenieActionPerformed
        if (!textField.getText().equals("-")) {
            operacja.setLiczba1(textField.getText());
        }
        operacja.setRodzajOperacji(RodzajOperacji.MNOZENIE);
        textField.setText("0");
    }//GEN-LAST:event_mnozenieActionPerformed

    private void czyszczenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_czyszczenieActionPerformed
        textField.setText("0");
    }//GEN-LAST:event_czyszczenieActionPerformed

    private void dzielenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dzielenieActionPerformed
        if (!textField.getText().equals("-")) {
            operacja.setLiczba1(textField.getText());
        }
        operacja.setRodzajOperacji(RodzajOperacji.DZIELENIE);
        textField.setText("0");
    }//GEN-LAST:event_dzielenieActionPerformed

    private void dodawanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodawanieActionPerformed
        if (!textField.getText().equals("-")) {
            operacja.setLiczba1(textField.getText());
        }
        operacja.setRodzajOperacji(RodzajOperacji.DODAWANIE);
        textField.setText("0");
    }//GEN-LAST:event_dodawanieActionPerformed

    private void odejmowanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odejmowanieActionPerformed
        if (textField.getText().equals("0")) {
            textField.setText("-");
        } else {
            if (!textField.getText().equals("-")) {
                operacja.setLiczba1(textField.getText());
            }
            operacja.setRodzajOperacji(RodzajOperacji.ODEJMOWANIE);
            textField.setText("0");
        }
    }//GEN-LAST:event_odejmowanieActionPerformed

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ActionPerformed
        if (!textField.getText().equals("0")) {
            textField.setText(textField.getText() + "0");
        }
    }//GEN-LAST:event_number0ActionPerformed

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ActionPerformed
        if (textField.getText().equals("0")) {
            textField.setText("5");
        } else {
            textField.setText(textField.getText() + "5");
        }
    }//GEN-LAST:event_number5ActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
        if (textField.getText().equals("0")) {
            textField.setText("2");
        } else {
            textField.setText(textField.getText() + "2");
        }
    }//GEN-LAST:event_number2ActionPerformed

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ActionPerformed
        if (textField.getText().equals("0")) {
            textField.setText("8");
        } else {
            textField.setText(textField.getText() + "8");
        }
    }//GEN-LAST:event_number8ActionPerformed

    private void usuwanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuwanieActionPerformed
        int lengthOfString = textField.getText().length();
        String textFromField = textField.getText();
        if (lengthOfString > 1) {
            textField.setText(textFromField.substring(0, lengthOfString - 1));
        } else {
            textField.setText("0");
        }
    }//GEN-LAST:event_usuwanieActionPerformed

public class Operacja {
    private float liczba1 = 0f;
    private float liczba2 = 0f;
    private RodzajOperacji rodzajOperacji;

    Operacja() {}

    public float getLiczba1() {
        return this.liczba1;    
    }

    public float getLiczba2() {
        return this.liczba2;    
    }

    public void setLiczba1(String tekst) {
        try {
            this.liczba1 = Float.parseFloat(tekst);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setLiczba2(String tekst) {
        try {
            this.liczba2 = Float.parseFloat(tekst);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setRodzajOperacji(RodzajOperacji rodzajOperacji) {
        this.rodzajOperacji = rodzajOperacji;
    }
    
    public float podajWynik() {
        if (rodzajOperacji == RodzajOperacji.DODAWANIE) {
            return this.liczba1 + this.liczba2;
        } else if (rodzajOperacji == RodzajOperacji.ODEJMOWANIE) {
            return this.liczba1 - this.liczba2;
        } else if (rodzajOperacji == RodzajOperacji.MNOZENIE) {
            return this.liczba1 * this.liczba2;
        } else { 
            if (this.liczba2 != 0) {
                return this.liczba1 / this.liczba2;
            } else {
                return 0;
            }
        }
    }

}
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                Kalkulator kalkulator = new Kalkulator();
                kalkulator.setVisible(true);
                kalkulator.setTitle("KALKULATOR");
                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (int) ((dimension.getWidth() - kalkulator.getWidth()) / 2);
                int y = (int) ((dimension.getHeight() - kalkulator.getHeight()) / 2);
                kalkulator.setLocation(x, y);
            }
        });
    }

    public enum RodzajOperacji {
        DODAWANIE(), ODEJMOWANIE(), MNOZENIE(), DZIELENIE();

        RodzajOperacji() {}
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton czyszczenie;
    private javax.swing.JButton dodawanie;
    private javax.swing.JButton dzielenie;
    private javax.swing.JButton kropka;
    private javax.swing.JButton mnozenie;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JButton odejmowanie;
    private javax.swing.JTextField textField;
    private javax.swing.JButton usuwanie;
    private javax.swing.JButton wynik;
    // End of variables declaration//GEN-END:variables
}
