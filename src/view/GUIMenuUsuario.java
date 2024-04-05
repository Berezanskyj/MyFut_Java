/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.UsuarioVO;
import servicos.AlteracaoServicos;
import servicos.ServicosFactory;

/**
 *
 * @author berez
 */
public class GUIMenuUsuario extends javax.swing.JInternalFrame {

    
    DefaultTableModel dtm = new DefaultTableModel(
                new Object[][]{},
            new Object[]{"ID", "NOME", "TELEFONE", "EMAIl", "CPF", "SENHA"}
    );
    /**
     * Creates new form GUIUsuario
     */
    public GUIMenuUsuario() {
        initComponents();
        preencherTabelaRegistro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuario = new javax.swing.JTable();
        jtID = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jtSenha = new javax.swing.JTextField();
        jtCpf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jbtnPreencher = new javax.swing.JButton();
        jbtnLimpar = new javax.swing.JButton();
        jbtnAlterar = new javax.swing.JButton();
        jbtnDeletar = new javax.swing.JButton();
        jbtnConfirmar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Menu Usuario");

        jPanel1.setBackground(new java.awt.Color(240, 228, 206));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/malandrinho 1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-removebg 1.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jtUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "TELEFONE", "E-MAIL", "CPF", "SENHA"
            }
        ));
        jScrollPane1.setViewportView(jtUsuario);

        jtID.setBackground(new java.awt.Color(217, 217, 217));
        jtID.setFocusable(false);

        jtTelefone.setBackground(new java.awt.Color(217, 217, 217));

        jtNome.setBackground(new java.awt.Color(217, 217, 217));

        jLabel3.setForeground(new java.awt.Color(138, 117, 53));
        jLabel3.setText("ID");

        jLabel4.setForeground(new java.awt.Color(138, 117, 53));
        jLabel4.setText("NOME");

        jLabel5.setForeground(new java.awt.Color(138, 117, 53));
        jLabel5.setText("TELEFONE");

        jLabel6.setForeground(new java.awt.Color(138, 117, 53));
        jLabel6.setText("CPF");

        jLabel7.setForeground(new java.awt.Color(138, 117, 53));
        jLabel7.setText("SENHA");

        jtEmail.setBackground(new java.awt.Color(217, 217, 217));

        jtSenha.setBackground(new java.awt.Color(217, 217, 217));

        jtCpf.setBackground(new java.awt.Color(217, 217, 217));

        jLabel8.setForeground(new java.awt.Color(138, 117, 53));
        jLabel8.setText("E-MAIL");

        jbtnPreencher.setText("PREENCHER");
        jbtnPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPreencherActionPerformed(evt);
            }
        });

        jbtnLimpar.setText("LIMPAR");
        jbtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparActionPerformed(evt);
            }
        });

        jbtnAlterar.setText("ALTERAR");
        jbtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAlterarActionPerformed(evt);
            }
        });

        jbtnDeletar.setText("DELETAR");
        jbtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarActionPerformed(evt);
            }
        });

        jbtnConfirmar.setText("CONFIRMAR");
        jbtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtID)
                                        .addComponent(jtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(jtTelefone))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtEmail)
                                        .addComponent(jtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(jtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnPreencher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jbtnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbtnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDeletar)
                    .addComponent(jbtnLimpar))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAlterar)
                    .addComponent(jbtnPreencher))
                .addGap(4, 4, 4)
                .addComponent(jbtnConfirmar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPreencherActionPerformed
        preencherTabelaRegistro();
    }//GEN-LAST:event_jbtnPreencherActionPerformed

    private void jbtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparActionPerformed
        limparTabela();
    }//GEN-LAST:event_jbtnLimparActionPerformed

    private void jbtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmarActionPerformed
        confirmarAlteracao();
        limparTabela();
        preencherTabelaRegistro();
    }//GEN-LAST:event_jbtnConfirmarActionPerformed

    private void jbtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarActionPerformed
        alterarUsuario();
        limparTabela();
        preencherTabelaRegistro();
    }//GEN-LAST:event_jbtnAlterarActionPerformed

    private void jbtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarActionPerformed
        deletarUsuario();
        limparTabela();
        preencherTabelaRegistro();
    }//GEN-LAST:event_jbtnDeletarActionPerformed


    private void preencherTabelaRegistro(){
        try{
            AlteracaoServicos as = ServicosFactory.getAlteracaoServicos();
            
            ArrayList<UsuarioVO> reg = new ArrayList<>();
            
            reg = as.buscarUsuario();
            
            for (int i = 0; i < reg.size(); i++){
                dtm.addRow(new String[] {
                    String.valueOf(reg.get(i).getIdusuario() ),
                    String.valueOf(reg.get(i).getNome() ),
                    String.valueOf(reg.get(i).getTelefone() ),
                    String.valueOf(reg.get(i).getEmail() ),
                    String.valueOf(reg.get(i).getCpf() ),
                    String.valueOf(reg.get(i).getSenha() ),
                                });
            }//end of for
            
            jtUsuario.setModel(dtm);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro! GUIUsuario.preencherTabela" + e.getMessage());
        }
    } // end of preencher
    
        
    private void limparTabela(){
        dtm.setNumRows(0);
    } // end of limpar
    
    private void deletarUsuario(){
        try{
            int linha = jtUsuario.getSelectedRow();
            
            if(linha == -1) {
                JOptionPane.showMessageDialog(
                    null,
                    "Por favor selecione uma linha!");
            }else{
                AlteracaoServicos as = ServicosFactory.getAlteracaoServicos();
                String codUsuario = (String) jtUsuario.getValueAt(linha, 0);
                as.deletarUsuario(Long.parseLong(codUsuario));
                
                JOptionPane.showMessageDialog(
                    null,
                    "Colaborador excluido com sucesso!");
            } 
        } catch (Exception e){
            JOptionPane.showMessageDialog(
                null,
                "Erro ao deletar usuario! GUIUsuario.deletar" + e.getMessage());
        }
    } // end of filtrar
    
    private void alterarUsuario(){
        int linha = jtUsuario.getSelectedRow();
        if(linha != -1){

            jtID.setText((String) jtUsuario.getValueAt(linha, 0));
            jtNome.setText((String) jtUsuario.getValueAt(linha, 1));
            jtTelefone.setText((String) jtUsuario.getValueAt(linha, 2));
            jtEmail.setText((String) jtUsuario.getValueAt(linha, 3));
            jtCpf.setText((String) jtUsuario.getValueAt(linha, 4));
            jtSenha.setText((String) jtUsuario.getValueAt(linha, 5));
        }else{
            JOptionPane.showMessageDialog(
                null,
                "Você não selecionou nenhuma linha!");
        }
    }
    
    public void confirmarAlteracao(){
        try{
            UsuarioVO cVO = new UsuarioVO();

                                   
            if(jtNome.getText().isEmpty() ||
                    jtTelefone.getText().isEmpty() ||
                    jtEmail.getText().isEmpty() ||
                    jtCpf.getText().isEmpty() ||
                    jtSenha.getText().isEmpty()
                    ) {
                    JOptionPane.showMessageDialog(
                    null,
                    "Erro! Por favor insira as informacoes corretamente!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            } else{
                cVO.setIdusuario(Integer.parseInt(jtID.getText()));
                cVO.setNome(jtNome.getText());
                cVO.setTelefone(jtTelefone.getText());
                cVO.setEmail(jtEmail.getText());
                cVO.setCpf(jtCpf.getText());
                cVO.setSenha(jtSenha.getText());
                                
                AlteracaoServicos as = ServicosFactory.getAlteracaoServicos();
                as.alterarUsuario(cVO);
                
                JOptionPane.showMessageDialog(
                    null,
                    "Registro alterado com sucesso!");
                
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro!" + e.getMessage());
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAlterar;
    private javax.swing.JButton jbtnConfirmar;
    private javax.swing.JButton jbtnDeletar;
    private javax.swing.JButton jbtnLimpar;
    private javax.swing.JButton jbtnPreencher;
    private javax.swing.JTextField jtCpf;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtSenha;
    private javax.swing.JTextField jtTelefone;
    private javax.swing.JTable jtUsuario;
    // End of variables declaration//GEN-END:variables
}
