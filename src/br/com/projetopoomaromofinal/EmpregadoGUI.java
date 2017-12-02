
package br.com.projetopoomaromofinal;

import javax.swing.JOptionPane;
public class EmpregadoGUI extends javax.swing.JFrame {
    
    private Empregado e;
    private GerenciarEmpregados ge;
    
    public EmpregadoGUI() {
        initComponents();
        ge = new GerenciarEmpregados();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodEmpregado = new javax.swing.JLabel();
        lblNomeEmpregado = new javax.swing.JLabel();
        lblSetor = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        lblRecolhimento = new javax.swing.JLabel();
        txtCodEmpregado = new javax.swing.JTextField();
        txtNomeEmpregado = new javax.swing.JTextField();
        txtSetor = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        btnCalcularInss = new javax.swing.JButton();
        lblCifrao = new javax.swing.JLabel();
        lblResultadoInss = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblCodEmpregado.setText("Código do  Empregado:");

        lblNomeEmpregado.setText("Nome do Empregado:");

        lblSetor.setText("Setor:");

        lblSalario.setText("Salário Bruto:");

        lblRecolhimento.setText("Recolhimento do INSS:");

        btnCalcularInss.setText("Calcular Recolhimento do INSS");
        btnCalcularInss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularInssActionPerformed(evt);
            }
        });

        lblCifrao.setText("R$ :");

        lblResultadoInss.setText("0");

        jButton1.setText("Apresentar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRecolhimento)
                        .addGap(121, 121, 121)
                        .addComponent(lblCifrao))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodEmpregado)
                            .addComponent(lblNomeEmpregado)
                            .addComponent(lblSetor)
                            .addComponent(lblSalario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCodEmpregado, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeEmpregado, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblResultadoInss, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnCalcularInss, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSetor, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblCodEmpregado)
                                            .addComponent(txtCodEmpregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addComponent(lblNomeEmpregado))
                                    .addComponent(txtNomeEmpregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(lblSetor))
                            .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(lblSalario))
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalcularInss)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRecolhimento)
                    .addComponent(lblCifrao)
                    .addComponent(lblResultadoInss))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(85, 85, 85))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularInssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularInssActionPerformed
        int codigo =0;
        double salario = 0.0;
        try{
        codigo = Integer.parseInt(txtCodEmpregado.getText());
       }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null, e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
       }
        String nome = txtNomeEmpregado.getText();
        String setor = txtSetor.getText();
        try{
        salario = Double.parseDouble(txtSalario.getText());
        }catch(NumberFormatException e1){
           JOptionPane.showMessageDialog(null, e1.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        e = new Empregado(codigo, nome, setor, salario);
        e.calcularInss();
        lblResultadoInss.setText(Double.toString(e.getRecolhimentoInss()));
    }//GEN-LAST:event_btnCalcularInssActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ge.adicionarEmpregado(e);
        limparFormulario();
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       GerenciarEmpregadosGUI tela = new GerenciarEmpregadosGUI(ge.listarEmpregado());
       tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void limparFormulario(){
        txtCodEmpregado.setText(null);
        txtNomeEmpregado.setText(null);
        txtSetor.setText(null);
        txtSalario.setText(null);
        lblResultadoInss.setText(null);
        txtCodEmpregado.requestFocus();
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmpregadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpregadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpregadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpregadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpregadoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularInss;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblCifrao;
    private javax.swing.JLabel lblCodEmpregado;
    private javax.swing.JLabel lblNomeEmpregado;
    private javax.swing.JLabel lblRecolhimento;
    private javax.swing.JLabel lblResultadoInss;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSetor;
    private javax.swing.JTextField txtCodEmpregado;
    private javax.swing.JTextField txtNomeEmpregado;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSetor;
    // End of variables declaration//GEN-END:variables
}
