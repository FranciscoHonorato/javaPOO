/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import banco.ArCondicionado;
import modeloDAO.ArCondiDAO;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;

/**
 *
 * @author Prosperar1 - RIO
 */
public class TelaCadastroProd extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form TelaCadastroProd
     */
    public TelaCadastroProd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(SystemColor.menu);
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator1.setBackground(new Color(230, 230, 250));
        jSeparator1.setForeground(new Color(100, 149, 237));
        jSeparator1.setBounds(49, 57, 599, 10);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(new Color(100, 149, 237));
        jLabel2.setBounds(27, 73, 36, 17);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setForeground(new Color(100, 149, 237));
        jLabel4.setBounds(27, 149, 122, 17);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setForeground(new Color(100, 149, 237));
        jLabel5.setBounds(27, 216, 70, 17);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setForeground(new Color(100, 149, 237));
        jLabel6.setBounds(27, 301, 29, 17);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setForeground(new Color(100, 149, 237));
        jLabel7.setBounds(364, 73, 43, 17);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setForeground(new Color(100, 149, 237));
        jLabel8.setBounds(364, 149, 26, 17);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setForeground(new Color(100, 149, 237));
        jLabel9.setBounds(364, 216, 57, 17);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setForeground(new Color(100, 149, 237));
        jLabel10.setBounds(364, 301, 66, 17);
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setForeground(new Color(100, 149, 237));
        jLabel11.setBounds(364, 391, 30, 17);
        cancelar = new javax.swing.JButton();
        cancelar.setBackground(SystemColor.inactiveCaption);
        cancelar.setBounds(364, 471, 85, 25);
        gravar = new javax.swing.JButton();
        gravar.setBackground(SystemColor.inactiveCaption);
        gravar.setBounds(487, 471, 73, 25);
        marca = new javax.swing.JTextField();
        marca.setForeground(new Color(128, 128, 128));
        marca.setBounds(27, 96, 195, 23);
        modelo = new javax.swing.JTextField();
        modelo.setForeground(new Color(128, 128, 128));
        modelo.setBounds(364, 96, 196, 23);
        peso = new javax.swing.JTextField();
        peso.setForeground(new Color(128, 128, 128));
        peso.setBounds(27, 324, 85, 23);
        valor = new javax.swing.JTextField();
        valor.setForeground(new Color(128, 128, 128));
        valor.setBounds(364, 414, 112, 23);
        tipo = new javax.swing.JComboBox<>();
        tipo.setForeground(new Color(128, 128, 128));
        tipo.setBackground(SystemColor.inactiveCaption);
        tipo.setBounds(364, 172, 84, 23);
        efiEnergetica = new javax.swing.JComboBox<>();
        efiEnergetica.setForeground(new Color(128, 128, 128));
        efiEnergetica.setBackground(SystemColor.inactiveCaption);
        efiEnergetica.setBounds(27, 172, 85, 23);
        voltagem = new javax.swing.JComboBox<>();
        voltagem.setForeground(new Color(128, 128, 128));
        voltagem.setBackground(SystemColor.inactiveCaption);
        voltagem.setBounds(364, 239, 84, 23);
        capacidade = new javax.swing.JComboBox<>();
        capacidade.setForeground(new Color(128, 128, 128));
        capacidade.setBackground(SystemColor.inactiveCaption);
        capacidade.setBounds(27, 239, 85, 23);
        dimensoes = new javax.swing.JTextField();
        dimensoes.setForeground(new Color(128, 128, 128));
        dimensoes.setBounds(364, 324, 196, 23);
        jLabel13 = new javax.swing.JLabel();
        jLabel13.setForeground(new Color(100, 149, 237));
        jLabel13.setBounds(27, 391, 70, 17);
        quantidade = new javax.swing.JSpinner();
        quantidade.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
        quantidade.setForeground(new Color(128, 128, 128));
        quantidade.setBounds(27, 414, 43, 24);

        jButton1.setText("jButton1");

        jTextField7.setText("jTextField7");

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Marca");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Efici\u00EAncia Energ\u00E9tica");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Capacidade");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Peso");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Modelo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Tipo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Voltagem");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Dimens\u00F5es");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Valor");

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelar.setText("Limpar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        gravar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gravar.setText("Gravar");
        gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarActionPerformed(evt);
            }
        });

        marca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });

        modelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });

        peso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Janela", "Split", "Industrial" }));

        efiEnergetica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        efiEnergetica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "A", "B", "C" }));

        voltagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        voltagem.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "110", "220", "380"}));

        capacidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        capacidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "7.500 Btus", "9.000 Btus", "12.000 Btus", "24.000 Btus", "36.000 Btus" }));

        dimensoes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Quantidade");

        quantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        quantidade.setValue(1);
      

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        jPanel1.setLayout(null);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(100, 149, 237));
        jLabel1.setBounds(131, 11, 390, 28);
        
                jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                jLabel1.setText("Cadastro de Condicionadores de AR");
                jPanel1.add(jLabel1);
        jPanel1.add(jSeparator1);
        jPanel1.add(jLabel6);
        jPanel1.add(jLabel13);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel5);
        jPanel1.add(marca);
        jPanel1.add(efiEnergetica);
        jPanel1.add(capacidade);
        jPanel1.add(quantidade);
        jPanel1.add(peso);
        jPanel1.add(gravar);
        jPanel1.add(cancelar);
        jPanel1.add(jLabel7);
        jPanel1.add(modelo);
        jPanel1.add(jLabel8);
        jPanel1.add(tipo);
        jPanel1.add(jLabel9);
        jPanel1.add(voltagem);
        jPanel1.add(jLabel10);
        jPanel1.add(dimensoes);
        jPanel1.add(jLabel11);
        jPanel1.add(valor);
        
        JLabel lblNewLabel_1 = new JLabel("Valor Total");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setForeground(new Color(100, 149, 237));
        lblNewLabel_1.setBounds(487, 391, 89, 17);
        jPanel1.add(lblNewLabel_1);
        
        JLabel total = new JLabel("");
       
        total.setFont(new Font("Tahoma", Font.PLAIN, 14));
        total.setBounds(487, 420, 78, 14);
        jPanel1.add(total);
        
        JLabel planodeFundo = new JLabel("New label");
        planodeFundo.setIcon(new ImageIcon("D:\\Imagens\\img4.jpg"));
        planodeFundo.setBounds(0, -21, 1515, 564);
        jPanel1.add(planodeFundo);
        getContentPane().setLayout(layout);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloActionPerformed

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaActionPerformed
    private void gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarActionPerformed
    	
    //validac�o de dados func�o inserir
    	inserirDados();
		
// TODO add your handling code here:
    }//GEN-LAST:event_gravarActionPerformed
    
    
        
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    	
    	limparCampo();
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> capacidade;
    private javax.swing.JTextField dimensoes;
    private javax.swing.JComboBox<String> efiEnergetica;
    private javax.swing.JButton gravar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField peso;
    private javax.swing.JSpinner quantidade;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JTextField valor;
    private javax.swing.JComboBox<String> voltagem;
    
  
    
    private void inserirDados() {
    	if(marca.getText()==null || marca.getText().trim().length()==0) {
			JOptionPane.showMessageDialog(null, " Digite a marca corretamente!");
			}
		if(efiEnergetica.getSelectedItem()==null || efiEnergetica.getSelectedItem().toString().trim().length()==0) {
			JOptionPane.showMessageDialog(null, "Selecione a efici�ncia energ�tica!");
		}
		if(capacidade.getSelectedItem()==null || capacidade.getSelectedItem().toString().trim().length()==0) {
			JOptionPane.showMessageDialog(null, "Selecione capacidade!");
			}
		if(peso.getText()==null || peso.getText().trim().length()==0) {
			JOptionPane.showMessageDialog(null, "Insira um peso valido!");
			}
		if(modelo.getText()==null || modelo.getText().trim().length()==0) {
			JOptionPane.showMessageDialog(null, " Digite um modelo!");
			}
		if(tipo.getSelectedItem()==null || tipo.getSelectedItem().toString().trim().length()==0) {
			JOptionPane.showMessageDialog(null, "Selecione tipo!");
			}
		if(voltagem.getSelectedItem()==null || voltagem.getSelectedItem().toString().trim().length()==0) {
			JOptionPane.showMessageDialog(null, "Selecione capacidade!");
			}
		if(dimensoes.getText()==null || dimensoes.getText().trim().length()==0) {
			JOptionPane.showMessageDialog(null, " Digite as dimens�es do produto!");
			}
		if(Double.parseDouble(valor.getText())<1) {
		    JOptionPane.showMessageDialog(null,"Informe um valor maior que 1");
		    }
		else {
        ArCondicionado ar = new ArCondicionado();
        ArCondiDAO dao = new ArCondiDAO();
        ar.setMarca(marca.getText());
        ar.setModelo(modelo.getText());
        ar.setTipo(tipo.getSelectedItem().toString());
        ar.setCapacidade(capacidade.getSelectedItem().toString());
        ar.setVoltagem(voltagem.getSelectedItem().toString());
        ar.setEfiEnergetica(efiEnergetica.getSelectedItem().toString());
        ar.setDimensoes(dimensoes.getText());
        ar.setPeso(Double.parseDouble(peso.getText()));
        ar.setQuantidade(Integer.parseInt(quantidade.getValue().toString()));
        ar.setValor(Double.parseDouble(valor.getText()));
        dao.create(ar);
		}//fim else
    }
    
    
   public void  limparCampo(){
    	marca.setText("");
    	efiEnergetica.setSelectedItem("Selecione");
    	capacidade.setSelectedItem("Selecione");
    	peso.setText("");
    	quantidade.setValue(1);
    	modelo.setText("");
    	tipo.setSelectedItem("Selecione");
    	voltagem.setSelectedItem("Selecione");
    	dimensoes.setText("");
    	valor.setText(null);
    	
    	}
   
   /*public void valoTotal() {
	   int x=(Integer.parseInt(quantidade.getValue().toString()));
       double y=(Double.parseDouble(valor.getText()));
       double resultado = x*y;
       total.setDouble(double.value(resultado));  	
       }
   */	
}

