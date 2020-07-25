/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.frmPesquisarProdutos;
import Model.CriaTabelaClientes;
import Model.CriaTabelaProdutos;
import Controller.VariaveisGlobais;
import Controller.Produto;
import Model.Pilha;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rena
 */
public class frmCadastrarProduto extends javax.swing.JFrame {

    /**
     * Creates new form frmCadastrarProduto
     */
    public frmCadastrarProduto() {
        initComponents();

        this.cmbCategoria.setEnabled(false);
        this.cmbFornecedor.setEnabled(false);
        this.txtNome.setEnabled(false);
        this.txtDescricao.setEnabled(false);
        this.txtEstoque.setEnabled(false);
        this.txtId.setEnabled(false);
        this.txtPreco.setEnabled(false);
        this.txtPrecoCusto.setEnabled(false);
        this.txtCodBarras.setEnabled(false);

    }
    int id;
    int verificaAbertura;

    public frmCadastrarProduto(int id, int verificaAbertura) {
        initComponents();
        this.id = id;
        this.verificaAbertura = verificaAbertura;
    }

    @SuppressWarnings("unchecked")
    String route = "C:\\Users\\User\\Desktop\\Inter 2.3\\mart.db";
    Connection c = null;
    Statement stat = null;
    String op;

    public static Pilha pil = new Pilha();

    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:mart.db");
            if (c != null) {
                System.out.println("Connected to db.");
            }
        } catch (SQLException ex) {
            System.err.println("Couldn't connect." + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CriaTabelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodBarras = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        cmbFornecedor = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JFormattedTextField();
        txtPrecoCusto = new javax.swing.JFormattedTextField();
        btnPesquisar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        lbDeletar = new javax.swing.JLabel();
        lbPesquisar = new javax.swing.JLabel();
        lbSalvar = new javax.swing.JLabel();
        lbIncluir = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setName("frmCadastrarProduto"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(600, 500));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nome do produto:");

        jLabel4.setText("Fornecedor:");

        txtEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstoqueKeyTyped(evt);
            }
        });

        jLabel5.setText("Qtd. de estoque:");

        jLabel6.setText("Preço:");

        jLabel8.setText("Código de barras:");

        txtCodBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodBarrasKeyTyped(evt);
            }
        });

        jLabel9.setText("Categoria:");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Eletronico", "Alimenticio", "Informatica" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        jLabel10.setText("Descrição:");

        cmbFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmbFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFornecedorActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");
        jLabel2.setToolTipText("Clique para habilitar ou desabilitar o campo (ID)");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        txtId.setEnabled(false);

        jLabel12.setText("Preço Custo:");

        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        txtPrecoCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        txtPrecoCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoCustoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelProdutoLayout = new javax.swing.GroupLayout(PanelProduto);
        PanelProduto.setLayout(PanelProdutoLayout);
        PanelProdutoLayout.setHorizontalGroup(
            PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelProdutoLayout.createSequentialGroup()
                            .addGroup(PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel8))
                            .addGap(9, 9, 9))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProdutoLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(PanelProdutoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel10)
                        .addGap(10, 10, 10)))
                .addGroup(PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescricao)
                    .addComponent(txtNome)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProdutoLayout.createSequentialGroup()
                        .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProdutoLayout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
            .addGroup(PanelProdutoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProdutoLayout.createSequentialGroup()
                        .addComponent(cmbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel6))
                    .addGroup(PanelProdutoLayout.createSequentialGroup()
                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(txtPrecoCusto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelProdutoLayout.setVerticalGroup(
            PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProdutoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(9, 9, 9)
                .addGroup(PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnSalvarKeyTyped(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        lbDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N

        lbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        lbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N

        lbIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_add_insert_new_14983.png"))); // NOI18N

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lbDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        setSize(new java.awt.Dimension(610, 353));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void txtPrecoCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoCustoActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /* CriaTabelaProdutos pesquisar = new CriaTabelaProdutos();
        VariaveisGlobais id = new VariaveisGlobais();        
        try {
            pesquisar.SelectIDProdutos(id);
        } catch (SQLException ex) {
            Logger.getLogger(frmCadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }       
       int cod = id.getCodigoProduto();
       cod = cod + 1;
       txtId.setText(String.valueOf(cod));
         */

        connect();
        try {
            VariaveisGlobais VG = new VariaveisGlobais();

            stat = c.createStatement();
            op = "SELECT * FROM fornecedores";
            System.out.println(op);
            ResultSet rs = stat.executeQuery(op);
            while (rs.next()) {

                cmbFornecedor.addItem(rs.getString("nome"));

            }
            stat.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar o maior id no banco");
            return;
        }
        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmCadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (txtId.isEnabled()) {
            txtId.setEnabled(false);
        } else {
            txtId.setEnabled(true);
        }
    }//GEN-LAST:event_jLabel2MouseClicked


    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O Campo nome precisa ser preenchido");

        } else {
            //Gera id para o cadastro de cliente
            VariaveisGlobais id = new VariaveisGlobais();
            CriaTabelaProdutos pesquisar = new CriaTabelaProdutos();

            ///Objetos para salvar
            Produto novoProduto = new Produto();

            novoProduto.setNome(txtNome.getText());
            novoProduto.setId(Integer.valueOf(txtId.getText()));
            novoProduto.setCodBarras(txtCodBarras.getText());
            novoProduto.setDescricao(txtDescricao.getText());
            novoProduto.setQntEstoque(txtEstoque.getText());
            novoProduto.setCategoria(cmbCategoria.getSelectedItem().toString());
            novoProduto.setFornecedor(cmbFornecedor.getSelectedItem().toString());
            novoProduto.setValor(txtPreco.getText());
            novoProduto.setValorCusto(txtPrecoCusto.getText());

            this.cmbCategoria.setEnabled(false);
            this.cmbFornecedor.setEnabled(false);
            this.txtNome.setEnabled(false);
            this.txtDescricao.setEnabled(false);
            this.txtEstoque.setEnabled(false);
            this.txtId.setEnabled(false);
            this.txtPreco.setEnabled(false);
            this.txtPrecoCusto.setEnabled(false);
            this.txtCodBarras.setEnabled(false);

            CriaTabelaProdutos cadastra = new CriaTabelaProdutos();
            try {

                connect();
                try {
                    VariaveisGlobais VG = new VariaveisGlobais();
                    //verifica se o cadastro existe pelo id
                    stat = c.createStatement();
                    op = "SELECT id FROM produtos WHERE id='" + txtId.getText() + "'";
                    System.out.println(op);
                    ResultSet rs = stat.executeQuery(op);
                    if (rs.next()) {    //se existir so da update
                        stat.close();
                        cadastra.AltProduto(novoProduto);
                        pil.Inserir(txtId.getText());
                        
                    } else {   //se não existir ele insere
                        stat.close();
                        cadastra.cadProduto(novoProduto); 
                        pil.Inserir(txtId.getText());
                        
          
                    }

                } catch (SQLException e) {

                    // JOptionPane.showMessageDialog(null ,"Ocorreu um erro ao buscar o maior id no banco");
                    return;
                }

                txtNome.setText("");
                txtCodBarras.setText("");
                txtDescricao.setText("");
                txtEstoque.setText("");
                txtId.setText("");
                txtNome.setText("");
                txtPreco.setText("");
                txtPrecoCusto.setText("");
                txtNome.setFocusable(true);

                btnSalvar.setEnabled(false);
                btnIncluir.setEnabled(true);

            } catch (Exception ex) {
                Logger.getLogger(frmCadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo id esta vazio");
            return;
        } else {
            int resposta;
            resposta = JOptionPane.showConfirmDialog(null, "Deseja deleta o produto?");
            if (resposta == JOptionPane.YES_OPTION) {
                CriaTabelaProdutos deleta = new CriaTabelaProdutos();
                try {
                    String id = txtId.getText();
                    deleta.DeleteProdutoPorId(id);
                    txtId.setText("");
                    txtCodBarras.setText("");
                    txtEstoque.setText("");
                    txtDescricao.setText("");
                    txtNome.setText("");
                    txtPreco.setText("");
                    txtPrecoCusto.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(frmCadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        dispose();
        frmPesquisarProdutos form = new frmPesquisarProdutos();
        form.setVisible(true);

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        //Recebe a pesquisa feita e exibe nos campos 
        if (verificaAbertura == 1) {
            connect();
            try {
                VariaveisGlobais VG = new VariaveisGlobais();

                stat = c.createStatement();
                op = "SELECT * FROM produtos WHERE id='" + id + "'";
                System.out.println(op);
                ResultSet rs = stat.executeQuery(op);
                while (rs.next()) {
                    txtId.setText(Integer.toString(rs.getInt("id")));
                    txtCodBarras.setText(rs.getString("codBarras"));
                    txtEstoque.setText(rs.getString("qntEstoque"));
                    txtNome.setText(rs.getString("nome"));
                    txtDescricao.setText(rs.getString("descricao"));
                    txtPreco.setText(rs.getString("valor"));
                    txtPrecoCusto.setText(rs.getString("valor_custo"));
                    cmbCategoria.setSelectedItem(rs.getString("categoria"));
                    cmbFornecedor.setSelectedItem(rs.getString("fornecedor"));

                }
                btnSalvar.setEnabled(true);
                stat.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar o maior id no banco");
                return;
            }
        } else if (verificaAbertura != 1) {

        }
        verificaAbertura = 0;

    }//GEN-LAST:event_formWindowActivated

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        VariaveisGlobais id = new VariaveisGlobais();
        CriaTabelaProdutos pesquisar = new CriaTabelaProdutos();
        //Limpa todos campos
        txtNome.setText("");
        txtCodBarras.setText("");
        txtDescricao.setText("");
        txtEstoque.setText("");
        txtId.setText("");
        txtNome.setText("");
        txtPreco.setText("");
        txtPrecoCusto.setText("");
        txtNome.setFocusable(true);

        this.cmbCategoria.setEnabled(true);
        this.cmbFornecedor.setEnabled(true);
        this.txtNome.setEnabled(true);
        this.txtDescricao.setEnabled(true);
        this.txtEstoque.setEnabled(true);
        this.txtPreco.setEnabled(true);
        this.txtPrecoCusto.setEnabled(true);
        this.txtCodBarras.setEnabled(true);

        //gera novo id          
        try {
            pesquisar.SelectIDProdutos(id);
        } catch (SQLException ex) {
            Logger.getLogger(frmCadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        int cod = id.getCodigoProduto();
        cod = cod + 1;
        txtId.setText(String.valueOf(cod));

        btnIncluir.setEnabled(false);
        btnSalvar.setEnabled(true);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnSalvarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyTyped

    }//GEN-LAST:event_btnSalvarKeyTyped

    private void txtCodBarrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodBarrasKeyTyped
        //O Campo aceita somente numeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodBarrasKeyTyped

    private void txtEstoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstoqueKeyTyped
        //O Campo aceita somente numeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEstoqueKeyTyped

    private void cmbFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFornecedorActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelProduto;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbCategoria;
    private javax.swing.JComboBox cmbFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbDeletar;
    private javax.swing.JLabel lbIncluir;
    private javax.swing.JLabel lbPesquisar;
    private javax.swing.JLabel lbSalvar;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JFormattedTextField txtPrecoCusto;
    // End of variables declaration//GEN-END:variables
}
