/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Endereco;
import model.Pessoa;

/**
 *
 * @author arauj
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
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

        jPanelDadosPessoais = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelCPF = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabelDataNascimento = new javax.swing.JLabel();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jPanelEndereco = new javax.swing.JPanel();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jFormattedTextFieldNumero = new javax.swing.JFormattedTextField();
        jLabelCEP = new javax.swing.JLabel();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jButtonGerarRelatorio = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jPanelRelatorio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRelatorio = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO");

        jPanelDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNome.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelCPF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCPF.setText("CPF:");

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelDataNascimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDataNascimento.setText("Data de Nascimento:");

        try {
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataNascimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
        jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
        jPanelDadosPessoaisLayout.setHorizontalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLabelDataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosPessoaisLayout.setVerticalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelCPF)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataNascimento)
                    .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEndereco.setText("Endereço:");

        jTextFieldEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNumero.setText("Número:");

        jFormattedTextFieldNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelCEP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCEP.setText("CEP:");

        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCEP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelBairro.setText("Bairro:");

        jTextFieldBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCidade.setText("Cidade:");

        jTextFieldCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanelEnderecoLayout = new javax.swing.GroupLayout(jPanelEndereco);
        jPanelEndereco.setLayout(jPanelEnderecoLayout);
        jPanelEnderecoLayout.setHorizontalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldNumero))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabelCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelBairro)
                                .addGap(181, 181, 181))
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnderecoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelEnderecoLayout.setVerticalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCEP)
                    .addComponent(jLabelBairro)
                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonGerarRelatorio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGerarRelatorio.setText("Gerar Relatório");
        jButtonGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatorioActionPerformed(evt);
            }
        });

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jPanelRelatorio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatório", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTextAreaRelatorio.setEditable(false);
        jTextAreaRelatorio.setColumns(20);
        jTextAreaRelatorio.setFont(new java.awt.Font("Monospaced", 2, 12)); // NOI18N
        jTextAreaRelatorio.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRelatorio);

        javax.swing.GroupLayout jPanelRelatorioLayout = new javax.swing.GroupLayout(jPanelRelatorio);
        jPanelRelatorio.setLayout(jPanelRelatorioLayout);
        jPanelRelatorioLayout.setHorizontalGroup(
            jPanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelRelatorioLayout.setVerticalGroup(
            jPanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelatorioLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButtonGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGerarRelatorio)
                    .addComponent(jButtonNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(534, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioActionPerformed

        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setNome(jTextFieldNome.getText());
        novaPessoa.setCpf(jFormattedTextFieldCPF.getText());
        novaPessoa.setDataNascimento(jFormattedTextFieldDataNascimento.getText());

        Endereco novoEndereco = new Endereco();
        novoEndereco.setEndereco(jTextFieldEndereco.getText());
        if (jFormattedTextFieldNumero.getText() != null && jFormattedTextFieldNumero.getText().trim().length() > 0) {
            try {
                novoEndereco.setNumero(Integer.valueOf(jFormattedTextFieldNumero.getText()));
            } catch (NumberFormatException e) {
                novoEndereco.setNumero(0);
            }
        } else {
            novoEndereco.setNumero(0);
        }
        novoEndereco.setCep(jFormattedTextFieldCEP.getText());
        novoEndereco.setBairro(jTextFieldBairro.getText());
        novoEndereco.setCidade(jTextFieldCidade.getText());
        novaPessoa.setEndereco(novoEndereco);

        gerarRelatorio(novaPessoa);
    }//GEN-LAST:event_jButtonGerarRelatorioActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFieldNome.setText("");
        jFormattedTextFieldCPF.setText("");
        jFormattedTextFieldDataNascimento.setText("");
        jTextFieldEndereco.setText("");
        jFormattedTextFieldNumero.setText("");
        jFormattedTextFieldCEP.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void gerarRelatorio(Pessoa pessoa) {
        String texto = "==== Dados Pessoais ===="
                + "\nNome: " + pessoa.getNome()
                + "\nCPF: " + pessoa.getCpf()
                + "\nDt Nascimento: " + pessoa.getDataNascimento()
                + "\n\n==== Endereço ===="
                + "\nEndereço: " + pessoa.getEndereco().getEndereco()
                + "\nNº: " + pessoa.getEndereco().getNumero()
                + "\nCEP: " + pessoa.getEndereco().getCep()
                + "\nBairro: " + pessoa.getEndereco().getBairro()
                + "\nCidade: " + pessoa.getEndereco().getCidade();
        jTextAreaRelatorio.setText(texto);
    }

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerarRelatorio;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldNumero;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JPanel jPanelDadosPessoais;
    private javax.swing.JPanel jPanelEndereco;
    private javax.swing.JPanel jPanelRelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaRelatorio;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}