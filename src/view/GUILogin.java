/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.LoginDAO;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.LoginVO;

/**
 *
 * @author berez
 */
public class GUILogin extends javax.swing.JFrame {

    
    /**
     * Creates new form NewJFrame
     */
    public GUILogin() {
        initComponents();
        listarPerfis();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpAreaDeTrabalho = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnLogar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jbtnRegistro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbtnRegistro1 = new javax.swing.JButton();
        jtfSenha = new javax.swing.JPasswordField();
        jcbMostrarSenha = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        cbxPerfil = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusTraversalPolicyProvider(true);
        setResizable(false);

        jdpAreaDeTrabalho.setBackground(new java.awt.Color(240, 228, 206));
        jdpAreaDeTrabalho.setFocusCycleRoot(true);
        jdpAreaDeTrabalho.setFocusTraversalPolicyProvider(true);
        jdpAreaDeTrabalho.setInheritsPopupMenu(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/malandrinho 1.png"))); // NOI18N

        jbtnLogar.setBackground(new java.awt.Color(217, 217, 217));
        jbtnLogar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jbtnLogar.setText("LOGAR");
        jbtnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogarActionPerformed(evt);
            }
        });
        jbtnLogar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnLogarKeyPressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-removebg 1.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jtfLogin.setBackground(new java.awt.Color(217, 217, 217));

        jbtnRegistro.setBackground(new java.awt.Color(217, 217, 217));
        jbtnRegistro.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jbtnRegistro.setText("CANCELAR");
        jbtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistroActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(138, 117, 53));
        jLabel4.setText("USUARIO");

        jLabel5.setForeground(new java.awt.Color(138, 117, 53));
        jLabel5.setText("SENHA");

        jbtnRegistro1.setBackground(new java.awt.Color(217, 217, 217));
        jbtnRegistro1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jbtnRegistro1.setText("REGISTRAR");
        jbtnRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistro1ActionPerformed(evt);
            }
        });

        jtfSenha.setBackground(new java.awt.Color(217, 217, 217));

        jcbMostrarSenha.setBackground(new java.awt.Color(240, 228, 206));
        jcbMostrarSenha.setText("Mostrar Senha");
        jcbMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMostrarSenhaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo de perfil" }));

        javax.swing.GroupLayout jdpAreaDeTrabalhoLayout = new javax.swing.GroupLayout(jdpAreaDeTrabalho);
        jdpAreaDeTrabalho.setLayout(jdpAreaDeTrabalhoLayout);
        jdpAreaDeTrabalhoLayout.setHorizontalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpAreaDeTrabalhoLayout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addGroup(jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jdpAreaDeTrabalhoLayout.createSequentialGroup()
                        .addComponent(jbtnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jbtnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))
                    .addGroup(jdpAreaDeTrabalhoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jdpAreaDeTrabalhoLayout.createSequentialGroup()
                                    .addGroup(jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jdpAreaDeTrabalhoLayout.createSequentialGroup()
                                            .addComponent(jcbMostrarSenha)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(jbtnRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(41, 41, 41))))
        );
        jdpAreaDeTrabalhoLayout.setVerticalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpAreaDeTrabalhoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(70, 70, 70)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRegistro1)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMostrarSenha)
                    .addComponent(cbxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpAreaDeTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpAreaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
        
    private void logar(){
        
        if (jtfLogin.getText().isEmpty() || jtfSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
            
            LoginVO lVO = new LoginVO();
            lVO.setLogin(jtfLogin.getText() );
            lVO.setSenha(jtfSenha.getText());
            lVO.setIdPerfil(idperfil.get(cbxPerfil.getSelectedIndex() -1));
            
            LoginDAO lDAO = new LoginDAO();
            ResultSet rs = lDAO.autenticarLogin(lVO);
            
            if(rs.next() ){
                //Chamando Tela que desejo abrir
                GUIPrincipal gp = new GUIPrincipal();
                gp.setVisible(true);
                
                dispose();
                
                if(idperfil.get(cbxPerfil.getSelectedIndex() -1) == 1){
                    gp.jmiRegistroPartida.setFocusable(true);
                    gp.jmiRegistroPartida.setEnabled(true);
                } else if (idperfil.get(cbxPerfil.getSelectedIndex() -1) == 2){
                    gp.jmiRegistroQuadra.setFocusable(true);
                    gp.jmiRegistroQuadra.setEnabled(true);
                } else{
                    gp.jmiMenuProprietario.setFocusable(true);
                    gp.jmiMenuProprietario.setEnabled(true);
                    gp.jmiMenuUsuario.setFocusable(true);
                    gp.jmiMenuUsuario.setEnabled(true);
                    gp.jmiRegistroProprietario.setFocusable(true);
                    gp.jmiRegistroProprietario.setEnabled(true);
                    gp.jmiRegistroUsuario.setFocusable(true);
                    gp.jmiRegistroUsuario.setEnabled(true);
                    gp.jmiRegistroQuadra.setFocusable(true);
                    gp.jmiRegistroQuadra.setEnabled(true);
                    gp.jmiRegistroPartida.setFocusable(true);
                    gp.jmiRegistroPartida.setEnabled(true);
                }
                
                    
                    
                    
            }else{
                //Enviar mensagem de incorreto
                JOptionPane.showMessageDialog(null, "Login ou Senha inválidos! ");
            }
            
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro! GUILogin" + se.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }//fim do método Logar
    
    private void cadastrar(){
        dispose();
        GUICadastro gr = new GUICadastro();
        gr.setVisible(true);
    }
    
    Vector<Integer> idperfil = new Vector<>();
    
    private void listarPerfis(){
        
        try{
            
            LoginDAO lDAO = new LoginDAO();
            
            ResultSet rs = lDAO.listarPerfis();
            
            while(rs.next()){
                idperfil.addElement(rs.getInt(1));
                cbxPerfil.addItem(rs.getString(2));
            }
            
        } catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Erro ao listar perfis! " + se, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    private void jbtnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogarActionPerformed
        logar();
    }//GEN-LAST:event_jbtnLogarActionPerformed

    private void jbtnLogarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnLogarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            logar();
        }
    }//GEN-LAST:event_jbtnLogarKeyPressed

    private void jbtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistroActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnRegistroActionPerformed

    private void jbtnRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistro1ActionPerformed
       cadastrar();
    }//GEN-LAST:event_jbtnRegistro1ActionPerformed

    private void jcbMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMostrarSenhaActionPerformed
        if(jcbMostrarSenha.isSelected()){
            jtfSenha.setEchoChar((char)0);
        } else {
            jtfSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_jcbMostrarSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxPerfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtnLogar;
    private javax.swing.JButton jbtnRegistro;
    private javax.swing.JButton jbtnRegistro1;
    private javax.swing.JCheckBox jcbMostrarSenha;
    private javax.swing.JPanel jdpAreaDeTrabalho;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables

    
    
}