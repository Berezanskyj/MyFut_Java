/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.PartidaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.PartidaVO;
import servicos.PartidaServicos;
import servicos.ProprietarioServicos;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 832000223
 */
public class GUIRegistroPartida extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public GUIRegistroPartida() {
        initComponents();
        listarQuadras();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        numero_quadra = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tel_responsavel = new javax.swing.JFormattedTextField();
        cancela = new javax.swing.JButton();
        registra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nome_responsavel = new javax.swing.JTextField();
        qtd_jogadores = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        local = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        endereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcbCalendar = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro de Partida");

        jPanel1.setBackground(new java.awt.Color(240, 228, 206));

        jLabel7.setForeground(new java.awt.Color(138, 117, 53));
        jLabel7.setText("LOCAL");

        jLabel8.setForeground(new java.awt.Color(138, 117, 53));
        jLabel8.setText("TELEFONE DO RESPONSÁVEL");

        numero_quadra.setEnabled(false);
        numero_quadra.setFocusable(false);

        jLabel9.setForeground(new java.awt.Color(138, 117, 53));
        jLabel9.setText("NÚMERO DA QUADRA");

        try {
            tel_responsavel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cancela.setBackground(new java.awt.Color(217, 217, 217));
        cancela.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        cancela.setText("VOLTAR");
        cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaActionPerformed(evt);
            }
        });

        registra.setBackground(new java.awt.Color(217, 217, 217));
        registra.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        registra.setText("CADASTRAR");
        registra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-removebg 1.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel5.setForeground(new java.awt.Color(138, 117, 53));
        jLabel5.setText("NOME DO RESPONSÁVEL");

        qtd_jogadores.setEnabled(false);
        qtd_jogadores.setFocusable(false);

        jLabel6.setForeground(new java.awt.Color(138, 117, 53));
        jLabel6.setText("QUANTIDADE DE JOGADORES");

        jButton1.setText("Carregar Infos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        endereco.setEnabled(false);
        endereco.setFocusable(false);

        jLabel10.setForeground(new java.awt.Color(138, 117, 53));
        jLabel10.setText("ENDEREÇO");

        jLabel11.setForeground(new java.awt.Color(138, 117, 53));
        jLabel11.setText("DATA DA PARTIDA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(tel_responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(registra, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(cancela, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcbCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(qtd_jogadores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numero_quadra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(local, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(14, 14, 14))
                    .addComponent(endereco)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(local, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(4, 4, 4)
                        .addComponent(numero_quadra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(qtd_jogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tel_responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registra, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancela, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
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

    private void cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaActionPerformed
        //
    }//GEN-LAST:event_cancelaActionPerformed

    private void registraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraActionPerformed
        cadastrar();
    }//GEN-LAST:event_registraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparInfos();
        listarInfos();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    private void cadastrar(){
        try{
            
            if(nome_responsavel.getText().isEmpty() ||
                    tel_responsavel.getText().isEmpty() ||
                    endereco.getText().isEmpty()
                    ) {
                JOptionPane.showMessageDialog(
                        null,
                        "Preencha todos os campos",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            } else {
                PartidaVO pVO = new PartidaVO();
                SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
                jcbCalendar.setDateFormat(formatoData);
                Date dataSelecionada = jcbCalendar.getDate();
                String dataFormatada = formatoData.format(dataSelecionada);
                
                
                
                pVO.setNome_responsavel(nome_responsavel.getText());
                pVO.setTelefone_responsavel(tel_responsavel.getText());
                pVO.setIdquadra(idquadra.get(local.getSelectedIndex()));
                String n_quadra = (String) numero_quadra.getSelectedItem();
                int n_quadra_formatado = Integer.parseInt(n_quadra);
                pVO.setNum_quadra(n_quadra_formatado);
                String mx_jg = (String) qtd_jogadores.getSelectedItem();
                int mx_jg_frmt = Integer.parseInt(mx_jg);
                pVO.setMax_jogadores(mx_jg_frmt);
                pVO.setEndereco_quadra(endereco.getText());
                pVO.setData_partida(dataFormatada);
                
                
                
                PartidaServicos ps = servicos.ServicosFactory.getPartidaServicos();
                ps.cadastrarPartida(pVO);
                
                JOptionPane.showMessageDialog(
                    null,
                    "Registrado com sucesso! "); 
                
            }
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar partida! " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE );
        }
    }
    
    Vector<Integer> idquadra = new Vector<>();
   
    
    private void listarQuadras(){
        
        try{
            
            PartidaDAO pDAO = new PartidaDAO();
            
            
            ResultSet rs = pDAO.listarQuadras();
            
            while(rs.next()){
                idquadra.addElement(rs.getInt(1));
                local.addItem(rs.getString(2));
            }
            
        } catch (SQLException se){
            JOptionPane.showMessageDialog(null, "Erro", "Erro", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    private void listarInfos(){
        
        try{
            
            PartidaDAO pDAO = new PartidaDAO();
            
            Integer indice;
            
            indice = idquadra.get(local.getSelectedIndex());
            
            ResultSet rs = pDAO.listarInfos(indice);
                
            while(rs.next()){
                numero_quadra.addItem(rs.getString(1));
                qtd_jogadores.addItem(rs.getString(2));
                endereco.setText(rs.getString(3));
            }
                

            
        } catch (SQLException se){
            JOptionPane.showMessageDialog(null, "Erro" + se.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limparInfos(){
        numero_quadra.removeAllItems();
        qtd_jogadores.removeAllItems();
        endereco.setText("");
    }
    
    private String DataPartida(){
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        jcbCalendar.setDateFormat(formatoData);
        
        // Obtendo a data selecionada
        Date dataSelecionada = jcbCalendar.getDate();
        
        String dataFormatada = formatoData.format(dataSelecionada);
        
        return dataFormatada;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancela;
    private javax.swing.JTextField endereco;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private de.wannawork.jcalendar.JCalendarComboBox jcbCalendar;
    private javax.swing.JComboBox<String> local;
    private javax.swing.JTextField nome_responsavel;
    private javax.swing.JComboBox<String> numero_quadra;
    private javax.swing.JComboBox<String> qtd_jogadores;
    private javax.swing.JButton registra;
    private javax.swing.JFormattedTextField tel_responsavel;
    // End of variables declaration//GEN-END:variables

}
