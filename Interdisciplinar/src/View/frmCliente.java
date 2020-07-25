/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Cliente;
import Model.CriaTabelaClientes;
import Controller.VariaveisGlobais;
import Model.WebServiceCep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author UNIFAFIBE
 */
public class frmCliente extends javax.swing.JFrame {

    /**
     * Creates new form cadCliente
     */
    public frmCliente() {
        initComponents();
        this.setFocusable(true);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCEP.setEnabled(false);
        txtNumero.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        txtCPF.setEnabled(false);
        txtCNPJ.setEnabled(false);
        txtCelular.setEnabled(false);
        txtEmail.setEnabled(false);
        txtRG.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtdataNascimento.setEnabled(false);
        cmbUF.setEnabled(false);
        cmbTipoPessoa.setEnabled(false);
    }

    int id;
    int verificaAbertura;

    public frmCliente(int id, int verificaAbertura) {
        initComponents();
        this.id = id;
        this.setLocationRelativeTo(null);
        this.verificaAbertura = verificaAbertura;
    }

    @SuppressWarnings("unchecked")
    String route = "C:\\Users\\User\\Desktop\\Inter 2.3\\mart.db";
    Connection c = null;
    Statement stat = null;
    String op;

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

        txtNome = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lbEndereco = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lbNumero = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        lbUf = new javax.swing.JLabel();
        cmbUF = new javax.swing.JComboBox();
        lbCep = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        lbPessoa = new javax.swing.JLabel();
        cmbTipoPessoa = new javax.swing.JComboBox();
        lbCpf = new javax.swing.JLabel();
        lbCnpj = new javax.swing.JLabel();
        lbRg = new javax.swing.JLabel();
        lbDataNascimento = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbCelular = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        txtCEP = new javax.swing.JFormattedTextField();
        txtRG = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtCNPJ = new javax.swing.JFormattedTextField();
        txtdataNascimento = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        lbPesquisar = new javax.swing.JLabel();
        lbSalvar = new javax.swing.JLabel();
        lbDeletar = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        lbIncluir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setMinimumSize(new java.awt.Dimension(672, 384));
        setResizable(false);
        setSize(new java.awt.Dimension(672, 384));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbNome.setText("Nome:");

        txtCodigoCliente.setEnabled(false);
        txtCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoClienteActionPerformed(evt);
            }
        });

        lbID.setText("ID:");
        lbID.setToolTipText("Clique para habilitar ou desabilitar o campo (Codigo do Cliente)");
        lbID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbIDMouseClicked(evt);
            }
        });

        lbEndereco.setText("Endereço:");

        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        lbNumero.setText("Nº:");

        lbBairro.setText("Bairro:");

        lbCidade.setText("Cidade:");

        lbUf.setText("UF:");

        cmbUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

        lbCep.setText("CEP:");

        lbEmail.setText("Email:");

        lbPessoa.setText("Pessoa:");

        cmbTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fisíca", "Juridica" }));

        lbCpf.setText("CPF:");

        lbCnpj.setText("CNPJ:");

        lbRg.setText("RG:");

        lbDataNascimento.setText("Data de Nascimento:");

        lbTelefone.setText("Telefone:");

        lbCelular.setText("Celular:");

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.setPreferredSize(new java.awt.Dimension(131, 57));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });
        txtCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCEPKeyTyped(evt);
            }
        });

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtdataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        lbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N

        lbDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        lbIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_add_insert_new_14983.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbRg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbCnpj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCidade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lbEmail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmail)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbCelular)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbUf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(lbDataNascimento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtdataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco)
                        .addGap(18, 18, 18)
                        .addComponent(lbNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lbBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCep)
                        .addGap(13, 13, 13)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbIncluir)
                .addGap(5, 5, 5)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lbDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(lbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lbIncluir)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNumero)
                        .addComponent(lbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCep, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbEndereco)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataNascimento)
                    .addComponent(txtdataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRg, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        lbPesquisar.getAccessibleContext().setAccessibleName("label_search");
        lbDeletar.getAccessibleContext().setAccessibleName("label_delete");

        setBounds(0, 0, 688, 353);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O Campo nome precisa ser preenchido");

        } else {
            //Gera id para o cadastro de cliente
            VariaveisGlobais id = new VariaveisGlobais();
            CriaTabelaClientes pesquisar = new CriaTabelaClientes();

            ///Objetos para salvar
            Cliente novoCliente = new Cliente();
            novoCliente.setNome(txtNome.getText());
            novoCliente.setCodigo(Integer.valueOf(txtCodigoCliente.getText()));
            novoCliente.setEndereco(txtEndereco.getText());
            novoCliente.setNumero(txtNumero.getText());
            novoCliente.setBairro(txtBairro.getText());
            novoCliente.setCidade(txtCidade.getText());
            novoCliente.setUf(cmbUF.getSelectedItem().toString());
            novoCliente.setCep(txtCEP.getText());
            novoCliente.setEmail(txtEmail.getText());
            novoCliente.setTipo_pessoa(cmbTipoPessoa.getSelectedItem().toString());
            novoCliente.setCpf(txtCPF.getText());
            novoCliente.setCnpj(txtCNPJ.getText());
            novoCliente.setRg(txtRG.getText());
            novoCliente.setTelefone(txtTelefone.getText());
            novoCliente.setCelular(txtCelular.getText());
            novoCliente.setData_nascimento(txtdataNascimento.getText());
            CriaTabelaClientes cadastrar = new CriaTabelaClientes();
            try {

                connect();
                //verifica se o cadastro existe pelo id
                stat = c.createStatement();
                op = "SELECT id FROM clientes WHERE id='" + txtCodigoCliente.getText() + "'";
                System.out.println(op);
                ResultSet rs = stat.executeQuery(op);
                if (rs.next()) {    //se existir so da update
                    stat.close();
                    cadastrar.AltCliente(novoCliente);
                } else {   //se não existir ele insere
                    stat.close();
                    cadastrar.cadCliente(novoCliente);
                }

            } catch (SQLException e) {

            } catch (Exception ex) {
                Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //limpa os campos
        txtNome.setText("");
        txtCodigoCliente.setText("");
        txtEndereco.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtCEP.setText("");
        txtCPF.setText("");
        txtEmail.setText("");
        txtCNPJ.setText("");
        txtRG.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtdataNascimento.setText("");
        txtNome.setFocusable(true);

        //altera uso dos botoes
        btnSalvar.setEnabled(false);
        btnIncluir.setEnabled(true);

        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCEP.setEnabled(false);
        txtNumero.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        txtCPF.setEnabled(false);
        txtCNPJ.setEnabled(false);
        txtCelular.setEnabled(false);
        txtEmail.setEnabled(false);
        txtRG.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtdataNascimento.setEnabled(false);
        cmbUF.setEnabled(false);
        cmbTipoPessoa.setEnabled(false);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (txtCodigoCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo código cliente está vazio");
            return;
        } else {
            int resposta;
            resposta = JOptionPane.showConfirmDialog(null, "Deseja deletar o cliente?");
            if (resposta == JOptionPane.YES_OPTION) {
                CriaTabelaClientes deleta = new CriaTabelaClientes();
                try {
                    String id = txtCodigoCliente.getText();
                    deleta.DeleteClientePorId(id);
                    txtCodigoCliente.setText("");

                    txtNome.setText("");
                    txtCodigoCliente.setText("");
                    txtEndereco.setText("");
                    txtNumero.setText("");
                    txtBairro.setText("");
                    txtCidade.setText("");
                    txtCEP.setText("");
                    txtCPF.setText("");
                    txtEmail.setText("");
                    txtCNPJ.setText("");
                    txtRG.setText("");
                    txtTelefone.setText("");
                    txtCelular.setText("");
                    txtdataNascimento.setText("");
                    txtNome.setFocusable(true);

                    //altera uso dos botoes
                    btnSalvar.setEnabled(false);
                    btnIncluir.setEnabled(true);

                    txtNome.setEnabled(false);
                    txtEndereco.setEnabled(false);
                    txtCEP.setEnabled(false);
                    txtNumero.setEnabled(false);
                    txtBairro.setEnabled(false);
                    txtCidade.setEnabled(false);
                    txtCPF.setEnabled(false);
                    txtCNPJ.setEnabled(false);
                    txtCelular.setEnabled(false);
                    txtEmail.setEnabled(false);
                    txtRG.setEnabled(false);
                    txtTelefone.setEnabled(false);
                    txtdataNascimento.setEnabled(false);
                    cmbUF.setEnabled(false);
                    cmbTipoPessoa.setEnabled(false);
                } catch (SQLException ex) {
                    Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //fecha o frm atual
        dispose();
        //chama o frm de pesquisa
        frmPesquisaClientes form = new frmPesquisaClientes();
        form.setVisible(true);


    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void lbIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIDMouseClicked
        if (txtCodigoCliente.isEnabled()) {
            txtCodigoCliente.setEnabled(false);
        } else {
            txtCodigoCliente.setEnabled(true);
        }
    }//GEN-LAST:event_lbIDMouseClicked

    private void txtCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        VariaveisGlobais id = new VariaveisGlobais();
        CriaTabelaClientes pesquisar = new CriaTabelaClientes();

        txtNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtCEP.setEnabled(true);
        txtNumero.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCidade.setEnabled(true);
        txtCPF.setEnabled(true);
        txtCNPJ.setEnabled(true);
        txtCelular.setEnabled(true);
        txtEmail.setEnabled(true);
        txtRG.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtdataNascimento.setEnabled(true);
        cmbUF.setEnabled(true);
        cmbTipoPessoa.setEnabled(true);

        txtNome.setText("");
        txtCodigoCliente.setText("");
        txtEndereco.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtCEP.setText("");
        txtCPF.setText("");
        txtEmail.setText("");
        txtCNPJ.setText("");
        txtRG.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtdataNascimento.setText("");
        txtNome.setFocusable(true);

        btnSalvar.setEnabled(true);
        btnIncluir.setEnabled(false);

        try {
            pesquisar.SelectIDCliente(id);
        } catch (SQLException ex) {
            Logger.getLogger(frmCadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        int cod = id.getCodigoCliente();
        cod = cod + 1;
        txtCodigoCliente.setText(String.valueOf(cod));

    }//GEN-LAST:event_btnIncluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Recebe a pesquisa feita e exibe nos campos 
        if (verificaAbertura == 1) {
            connect();
            try {
                VariaveisGlobais VG = new VariaveisGlobais();

                stat = c.createStatement();
                op = "SELECT * FROM clientes WHERE id='" + id + "'";
                System.out.println(op);
                ResultSet rs = stat.executeQuery(op);
                while (rs.next()) {
                    txtCodigoCliente.setText(Integer.toString(rs.getInt("id")));
                    txtNome.setText(rs.getString("nome"));
                    txtEndereco.setText(rs.getString("endereco"));
                    txtNumero.setText(rs.getString("numero_end"));
                    txtBairro.setText(rs.getString("bairro"));
                    txtCidade.setText(rs.getString("cidade"));
                    cmbUF.setSelectedItem(rs.getString("uf"));
                    txtCEP.setText(rs.getString("cep"));
                    txtEmail.setText(rs.getString("email"));
                    cmbTipoPessoa.setSelectedItem(rs.getString("tipo_pessoa"));
                    txtCPF.setText(rs.getString("cpf"));
                    txtCNPJ.setText(rs.getString("cnpj"));
                    txtRG.setText(rs.getString("rg"));
                    txtdataNascimento.setText(rs.getString("data_nascimento"));
                    txtTelefone.setText(rs.getString("telefone"));
                    txtCelular.setText(rs.getString("celular"));

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

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        //O Campo aceita somente numeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtCEPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCEPKeyTyped
        //O Campo aceita somente numeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCEPKeyTyped

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        /*WebServiceCep webServiceCep = WebServiceCep.searchCep(txtCEP.getText());
        String rua = webServiceCep.getLogradouro();
        String bairro = webServiceCep.getBairro();
        String cidade = webServiceCep.getCidade();
        String uf = webServiceCep.getUf();

        txtEndereco.setText(webServiceCep.getLogradouroType() + " " + rua);
        txtBairro.setText(bairro);
        txtCidade.setText(cidade);
        cmbUF.setSelectedItem(uf);*/
    }//GEN-LAST:event_txtCEPActionPerformed

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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    public JButton receberBotaoIncluir() {
        return btnIncluir;
    }

    public JTextField receberRua() {
        return txtEndereco;
    }

    public JTextField receberBairro() {
        return txtBairro;
    }

    public JTextField receberCidade() {
        return txtCidade;
    }

    public JComboBox receberUF() {
        return cmbUF;
    }

    public JTextField receberNumero() {
        return txtNumero;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbTipoPessoa;
    private javax.swing.JComboBox cmbUF;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbDataNascimento;
    private javax.swing.JLabel lbDeletar;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbIncluir;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbPesquisar;
    private javax.swing.JLabel lbPessoa;
    private javax.swing.JLabel lbRg;
    private javax.swing.JLabel lbSalvar;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbUf;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JFormattedTextField txtdataNascimento;
    // End of variables declaration//GEN-END:variables
}
