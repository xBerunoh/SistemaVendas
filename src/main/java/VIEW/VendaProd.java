/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import MODEL.Estoque;
import DAO.EstoqueDAO;
import DAO.FuncionarioDAO;


import DAO.VendaDAO;

import MODEL.Funcionario;
import MODEL.Venda;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiz
 */
public class VendaProd extends javax.swing.JFrame {
        public double PrecoUnitario;
        public double valorTotalVenda;
        static String valorTotalStr;
        public String quantidadeTotal;
    //listando dados da tabela
    public void listar(){
    
    EstoqueDAO dao = new EstoqueDAO();
    List<Estoque> lista = dao.getLista();
        
    DefaultTableModel dados = (DefaultTableModel) tabelaDeProdutos.getModel();
    dados.setNumRows(0);
    
    
    for(Estoque c: lista){
        
        dados.addRow(new Object[]{
            c.getId_produto(),
            c.getDescricao(),
            c.getPreco(),
            c.getQuantidade()
                
            
                
        });
    
    }
    
        
    
    }
    public VendaProd() {
        initComponents();
    }

    public void listarFuncionario(){
    
    FuncionarioDAO dao = new FuncionarioDAO();
    List<Funcionario> lista = dao.getLista();
        
    DefaultTableModel dados = (DefaultTableModel) TabelaFuncionario.getModel();
    dados.setNumRows(0);
    
    
    for(Funcionario c: lista){
        
        dados.addRow(new Object[]{
            c.getId_funcionario(),
            c.getFuncao(),
            c.getNome(),
           
                
            
                
        });
    
    }
    
        
    }
    public void mostraPreco(){
    double preco = Double.parseDouble(txtPreco.getText());
        int quantia = Integer.parseInt(txtQuantidade.getText());
        int codigo = Integer.parseInt(txtCodigoDados.getText());
        double valorTot = quantia*PrecoUnitario;
        String precostr = String.valueOf(valorTot);
        txtPreco.setText(precostr);
        

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
        painelDaTabelaClientes = new javax.swing.JTabbedPane();
        painelDadosProduto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoDados = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnPesquisaNomeDadosPessoais = new javax.swing.JButton();
        txtPreco = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodFuncionario = new javax.swing.JTextField();
        txtNomeFunc = new javax.swing.JTextField();
        btnPesquisaFuncionario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        painelConsultaEstoque = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDeProdutos = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtNomeConsultaCliente = new javax.swing.JTextField();
        btnPesquisaCliente = new javax.swing.JToggleButton();
        painelConsultaFuncionario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaFuncionario = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        PesquisaFuncionario = new javax.swing.JTextField();
        BotaoFuncionario = new javax.swing.JToggleButton();
        btnFinalVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Venda de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Codigo: ");

        txtCodigoDados.setEditable(false);
        txtCodigoDados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCodigoDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoDadosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Descrição:");

        txtDescricao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Quantidade:");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Preço:");

        btnPesquisaNomeDadosPessoais.setText("Pesquisar");
        btnPesquisaNomeDadosPessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaNomeDadosPessoaisActionPerformed(evt);
            }
        });

        txtPreco.setEditable(false);

        jLabel5.setText("Funcionário:");

        jLabel6.setText("Codigo Funcionário: ");

        txtCodFuncionario.setEditable(false);

        txtNomeFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeFuncKeyPressed(evt);
            }
        });

        btnPesquisaFuncionario.setText("Pesquisa");
        btnPesquisaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaFuncionarioActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosProdutoLayout = new javax.swing.GroupLayout(painelDadosProduto);
        painelDadosProduto.setLayout(painelDadosProdutoLayout);
        painelDadosProdutoLayout.setHorizontalGroup(
            painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 1079, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisaNomeDadosPessoais)
                        .addGap(54, 54, 54))
                    .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                        .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoDados, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                                .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1))
                                    .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                                        .addComponent(txtNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPesquisaFuncionario)))))
                        .addContainerGap(576, Short.MAX_VALUE))))
        );
        painelDadosProdutoLayout.setVerticalGroup(
            painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosProdutoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaNomeDadosPessoais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtCodFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaFuncionario))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        painelDaTabelaClientes.addTab("Venda", painelDadosProduto);

        tabelaDeProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Preço", "Quantidade"
            }
        ));
        tabelaDeProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDeProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDeProdutos);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Nome:");

        txtNomeConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeConsultaClienteActionPerformed(evt);
            }
        });
        txtNomeConsultaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeConsultaClienteKeyPressed(evt);
            }
        });

        btnPesquisaCliente.setText("Pesquisar");
        btnPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConsultaEstoqueLayout = new javax.swing.GroupLayout(painelConsultaEstoque);
        painelConsultaEstoque.setLayout(painelConsultaEstoqueLayout);
        painelConsultaEstoqueLayout.setHorizontalGroup(
            painelConsultaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(881, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        painelConsultaEstoqueLayout.setVerticalGroup(
            painelConsultaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaEstoqueLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(painelConsultaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addGroup(painelConsultaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomeConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisaCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelDaTabelaClientes.addTab("Consulta de Estoque", painelConsultaEstoque);

        TabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Função", "Nome"
            }
        ));
        TabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaFuncionario);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Nome:");

        PesquisaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaFuncionarioActionPerformed(evt);
            }
        });
        PesquisaFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PesquisaFuncionarioKeyPressed(evt);
            }
        });

        BotaoFuncionario.setText("Pesquisar");
        BotaoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConsultaFuncionarioLayout = new javax.swing.GroupLayout(painelConsultaFuncionario);
        painelConsultaFuncionario.setLayout(painelConsultaFuncionarioLayout);
        painelConsultaFuncionarioLayout.setHorizontalGroup(
            painelConsultaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PesquisaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(881, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        painelConsultaFuncionarioLayout.setVerticalGroup(
            painelConsultaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaFuncionarioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(painelConsultaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addGroup(painelConsultaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PesquisaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotaoFuncionario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelDaTabelaClientes.addTab("Consulta de Funcionarios", painelConsultaFuncionario);

        btnFinalVenda.setText("Finalizar Venda");
        btnFinalVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelDaTabelaClientes)
            .addGroup(layout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(btnFinalVenda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(painelDaTabelaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnFinalVenda)
                .addGap(36, 36, 36))
        );

        setSize(new java.awt.Dimension(1400, 663));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoDadosActionPerformed

    private void txtNomeConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeConsultaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeConsultaClienteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       ///caregar a lista
       listar();
       listarFuncionario();

        
    }//GEN-LAST:event_formWindowActivated

    private void tabelaDeProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDeProdutosMouseClicked
        // passar dados da tabela para o painel de Dados Pessoais
        painelDaTabelaClientes.setSelectedIndex(0);
        txtCodigoDados.setText(tabelaDeProdutos.getValueAt(tabelaDeProdutos
                .getSelectedRow(), 0).toString());
        
       
        txtDescricao.setText(tabelaDeProdutos.
        getValueAt(tabelaDeProdutos.getSelectedRow(), 1).toString());

       txtPreco.setText(tabelaDeProdutos.
               getValueAt(tabelaDeProdutos.getSelectedRow(), 2).toString());
       
       txtQuantidade.setText("1");
       String precoUnidade = (tabelaDeProdutos.getValueAt(tabelaDeProdutos.getSelectedRow(), 2).toString());
       PrecoUnitario = Double.parseDouble(precoUnidade);
       quantidadeTotal = (tabelaDeProdutos.getValueAt(tabelaDeProdutos.getSelectedRow(), 3).toString());
    
       
       
        
        
    }//GEN-LAST:event_tabelaDeProdutosMouseClicked

    private void btnPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaClienteActionPerformed
        // Botao pesquisar na tabela de clientes
        
        String nome = "%"+txtNomeConsultaCliente.getText()+"%";
         EstoqueDAO dao = new EstoqueDAO();
    List<Estoque> lista = dao.buscaProdutoPorNome(nome);
        
    DefaultTableModel dados = (DefaultTableModel) tabelaDeProdutos.getModel();
    dados.setNumRows(0);
    
    
  for(Estoque c: lista){
        
        dados.addRow(new Object[]{
            c.getId_produto(),
            c.getDescricao(),
            c.getPreco(),
            c.getQuantidade()
                
            
                
        });
    
    }
    }//GEN-LAST:event_btnPesquisaClienteActionPerformed

    private void txtNomeConsultaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeConsultaClienteKeyPressed
        // Pesquisa enquanto digita
         String nome = "%"+txtNomeConsultaCliente.getText()+"%";
         EstoqueDAO dao = new EstoqueDAO();
    List<Estoque> lista = dao.buscaProdutoPorNome(nome);
        
    DefaultTableModel dados = (DefaultTableModel) tabelaDeProdutos.getModel();
    dados.setNumRows(0);
    
    
    for(Estoque c: lista){
        
        dados.addRow(new Object[]{
            c.getId_produto(),
            c.getDescricao(),
            c.getPreco(),
            c.getQuantidade()
                
            
                
        });
    
    }
    }//GEN-LAST:event_txtNomeConsultaClienteKeyPressed

    private void btnPesquisaNomeDadosPessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaNomeDadosPessoaisActionPerformed
        // Pesquisar na tela dados pessoais
        try {
            String nome = txtDescricao.getText();
            Estoque obj = new Estoque();
            EstoqueDAO dao = new EstoqueDAO();
            
            obj = dao.consultaPorNome(nome);
            if(obj.getDescricao()!= null){
            txtCodigoDados.setText(String.valueOf(obj.getId_produto()));
            
               String precoString = Double.toString(obj.getPreco());
        String quantidadeString = Integer.toString(obj.getQuantidade());
               txtDescricao.setText(obj.getDescricao());
               txtPreco.setText(precoString);
               txtQuantidade.setText(quantidadeString);
            }else{
            JOptionPane.showMessageDialog(null, "PRODUTO NÃO ENCONTRADO");
            
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
           
    }//GEN-LAST:event_btnPesquisaNomeDadosPessoaisActionPerformed

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
      
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
      try {
            String nome = txtDescricao.getText();
            Estoque obj = new Estoque();
            EstoqueDAO dao = new EstoqueDAO();
            
            obj = dao.consultaPorNome(nome);
            if(obj.getDescricao()!= null){
            txtCodigoDados.setText(String.valueOf(obj.getId_produto()));
                
            
        String precoString = Double.toString(obj.getPreco());
        String quantidadeString = Integer.toString(obj.getQuantidade());
               txtDescricao.setText(obj.getDescricao());
               txtPreco.setText(precoString);
               txtQuantidade.setText("1");
               
            }else{
            JOptionPane.showMessageDialog(null, "PRODUTO NÃO ENCONTRADO");
            
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
       }
    }//GEN-LAST:event_txtDescricaoKeyPressed

    private void btnFinalVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalVendaActionPerformed
        // TODO add your handling code here:
        String desc = txtDescricao.getText();
        double preco = Double.parseDouble(txtPreco.getText());
        int quantia = Integer.parseInt(txtQuantidade.getText());
        int codigo = Integer.parseInt(txtCodigoDados.getText());
        int codigoFuncionario = Integer.parseInt(txtCodFuncionario.getText());
        double valorTot = quantia*PrecoUnitario;
        int quantiaAtualizada = (Integer.parseInt(quantidadeTotal))-quantia;
         String precostr = String.valueOf(valorTot);
        valorTotalStr = precostr;
        
        Venda vendaFim = new Venda();
        vendaFim.setFk_estoque(codigo);
        vendaFim.setFk_funcionario(codigoFuncionario);
        vendaFim.setQuantidade_item(quantia);
        vendaFim.setValor_total(valorTot);
        VendaDAO dao = new VendaDAO();
        dao.adiciona(vendaFim);
        
      Estoque estoque = new Estoque();
        estoque.setQuantidade(quantiaAtualizada);
        estoque.setId_produto(codigo);
        EstoqueDAO estDao = new EstoqueDAO();
        estDao.alteraQuantidade
        (estoque);
                
        
       vendaFeita vendido = new vendaFeita();
       vendido.setVisible(true);
        
    }//GEN-LAST:event_btnFinalVendaActionPerformed


    private void TabelaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaFuncionarioMouseClicked
painelDaTabelaClientes.setSelectedIndex(0);
        txtCodFuncionario.setText(TabelaFuncionario.getValueAt(TabelaFuncionario
                .getSelectedRow(), 0).toString());
        
       
        txtNomeFunc.setText(TabelaFuncionario.
        getValueAt(TabelaFuncionario.getSelectedRow(), 2).toString());

          }//GEN-LAST:event_TabelaFuncionarioMouseClicked

    private void PesquisaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisaFuncionarioActionPerformed

    private void PesquisaFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisaFuncionarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisaFuncionarioKeyPressed

    private void BotaoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoFuncionarioActionPerformed

    private void btnPesquisaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaFuncionarioActionPerformed
  // Pesquisar na tela Dados Funcionario
        try {
            String nome = txtDescricao.getText();
            Funcionario obj = new Funcionario();
            FuncionarioDAO dao = new FuncionarioDAO();
            
            obj = dao.consultaFuncionarioPorNome(nome);
            if(obj.getNome()!= null){
            txtCodFuncionario.setText(String.valueOf(obj.getId_funcionario()));
               txtNomeFunc.setText(obj.getNome());
            }else{
            JOptionPane.showMessageDialog(null, " FUNCIONARIO NÃO ENCONTRADO");
            
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
               }//GEN-LAST:event_btnPesquisaFuncionarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostraPreco();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNomeFuncKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeFuncKeyPressed
  if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
      try {
            String nome = txtDescricao.getText();
            Funcionario obj = new Funcionario();
            FuncionarioDAO dao = new FuncionarioDAO();
            
            obj = dao.consultaFuncionarioPorNome(nome);
            if(obj.getNome()!= null){
            txtCodFuncionario.setText(String.valueOf(obj.getId_funcionario()));
               txtNomeFunc.setText(obj.getNome());
   
               
            }else{
            JOptionPane.showMessageDialog(null, "FUNCIONARIO NÃO ENCONTRADO");
            
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
       }    }//GEN-LAST:event_txtNomeFuncKeyPressed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed


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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotaoFuncionario;
    private javax.swing.JTextField PesquisaFuncionario;
    private javax.swing.JTable TabelaFuncionario;
    private javax.swing.JButton btnFinalVenda;
    private javax.swing.JToggleButton btnPesquisaCliente;
    private javax.swing.JButton btnPesquisaFuncionario;
    private javax.swing.JButton btnPesquisaNomeDadosPessoais;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painelConsultaEstoque;
    private javax.swing.JPanel painelConsultaFuncionario;
    private javax.swing.JTabbedPane painelDaTabelaClientes;
    private javax.swing.JPanel painelDadosProduto;
    private javax.swing.JTable tabelaDeProdutos;
    private javax.swing.JTextField txtCodFuncionario;
    private javax.swing.JTextField txtCodigoDados;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNomeConsultaCliente;
    private javax.swing.JTextField txtNomeFunc;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
