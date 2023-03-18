package ParaGerente;


import Principal.TelaLogin;

public class TelaGerente extends javax.swing.JFrame {

    public TelaGerente() {
        //Adicionar um título ao topo da tela
        setTitle("Tela Gerente");
        initComponents();
        this.setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        Fundo = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        mCadastro = new javax.swing.JMenu();
        cFuncionario = new javax.swing.JMenuItem();
        cProcedimento = new javax.swing.JMenuItem();
        cCliente = new javax.swing.JMenuItem();
        mSair = new javax.swing.JMenu();
        cClose = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\lucas\\Downloads\\logo_page-0001 (2) (1).jpg")); // NOI18N

        mCadastro.setText("Cadastro");

        cFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cFuncionario.setText("Cadastrar Funcionario");
        cFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cFuncionarioActionPerformed(evt);
            }
        });
        mCadastro.add(cFuncionario);

        cProcedimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cProcedimento.setText("Cadastrar Procedimento");
        cProcedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cProcedimentoActionPerformed(evt);
            }
        });
        mCadastro.add(cProcedimento);

        cCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cCliente.setText("Cadastro Cliente");
        cCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cClienteActionPerformed(evt);
            }
        });
        mCadastro.add(cCliente);

        jMenuBar3.add(mCadastro);

        mSair.setText("Sair");
        mSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSairActionPerformed(evt);
            }
        });

        cClose.setText("Deslogar");
        cClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCloseActionPerformed(evt);
            }
        });
        mSair.add(cClose);

        jMenuBar3.add(mSair);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSairActionPerformed

    }//GEN-LAST:event_mSairActionPerformed

    private void cCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCloseActionPerformed
        //para fechar a tela quando clicar
        dispose();
        //Para quando clicar no botao abrir outra tela
        TelaLogin tela1 = new TelaLogin();
        tela1.setVisible(true);
    }//GEN-LAST:event_cCloseActionPerformed

    private void cFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cFuncionarioActionPerformed
        //Para quando clicar no botao abrir outra tela
        GerenteCadastraFuncionario tela = new GerenteCadastraFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_cFuncionarioActionPerformed

    private void cProcedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cProcedimentoActionPerformed
        ////Para quando clicar no botao abrir outra tela
        GerenteCadastraProcedimento tela = new GerenteCadastraProcedimento();
        tela.setVisible(true);
    }//GEN-LAST:event_cProcedimentoActionPerformed

    private void cClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cClienteActionPerformed
        GerenteCadastraProcedimento tela = new GerenteCadastraProcedimento();
        tela.setVisible(true);
    }//GEN-LAST:event_cClienteActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JMenuItem cCliente;
    private javax.swing.JMenuItem cClose;
    private javax.swing.JMenuItem cFuncionario;
    private javax.swing.JMenuItem cProcedimento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mSair;
    // End of variables declaration//GEN-END:variables
}
