package ParaFuncionario;

import Principal.TelaLogin;

public class TelaFuncionario extends javax.swing.JFrame {
   public TelaFuncionario() {
       //Código para colocar um nome na tela
        setTitle("Tela Funcionário");
        initComponents();
        //Código para realocar a tela no centro
        this.setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mCadastro = new javax.swing.JMenu();
        cProduto = new javax.swing.JMenuItem();
        cCliente = new javax.swing.JMenuItem();
        mSair = new javax.swing.JMenu();
        cClose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lucas\\Downloads\\logo_page-0001 (2) (1).jpg")); // NOI18N

        mCadastro.setText("Cadastro");

        cProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cProduto.setText("Cadastrar Procedimento");
        cProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cProdutoActionPerformed(evt);
            }
        });
        mCadastro.add(cProduto);

        cCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cCliente.setText("Cadastro Cliente");
        cCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cClienteActionPerformed(evt);
            }
        });
        mCadastro.add(cCliente);

        jMenuBar1.add(mCadastro);

        mSair.setText("Sair");

        cClose.setText("Deslogar");
        cClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCloseActionPerformed(evt);
            }
        });
        mSair.add(cClose);

        jMenuBar1.add(mSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cProdutoActionPerformed
       //Acrescentar uma tela quando clicar no botao
        CadastroProcedimentoLFuncionario tela = new CadastroProcedimentoLFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_cProdutoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Para sempre abrir em tela maximizada
        //this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void cCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCloseActionPerformed
        //para fechar a tela quando clicar
        dispose();
        //Para quando clicar no botao abrir outra tela
        TelaLogin tela1 = new TelaLogin();
        tela1.setVisible(true);
    }//GEN-LAST:event_cCloseActionPerformed

    private void cClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cClienteActionPerformed
        CadastroClienteLfuncionario tela = new CadastroClienteLfuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_cClienteActionPerformed
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cCliente;
    private javax.swing.JMenuItem cClose;
    private javax.swing.JMenuItem cProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mSair;
    // End of variables declaration//GEN-END:variables
}
