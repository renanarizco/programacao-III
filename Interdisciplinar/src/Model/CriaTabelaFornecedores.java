/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.VariaveisGlobais;
import Controller.Fornecedor;
import Model.CriaTabelaClientes;
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
 * @author Murilo
 */
public class CriaTabelaFornecedores {
    
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
    
    public void CriaTabelaFornecedores_DB() throws SQLException {
        connect();
        try {
            stat = c.createStatement();
            op = "Create table fornecedores(id int identity, nome varchar(80), cnpj varchar(50), cidade varchar(80), endereco varchar(80), cep varcar(30), uf varchar(2), bairro varchar(50), telefone varchar(40), email varchar(80));";
            stat.executeUpdate(op);       //Here is the problem
            stat.close();
            System.out.println("Criado com Sucesso");
        } catch (SQLException e) {
            System.err.println("Ocoreu um erro ao criar a tabela.");
        }
        c.close();
    }
    
    public void SelectIDFornecedor(VariaveisGlobais id) throws SQLException {
        connect();
        try {         
            VariaveisGlobais VG = new VariaveisGlobais();
            
            stat = c.createStatement();
            op = "SELECT * FROM fornecedores WHERE id = (SELECT MAX(id) FROM fornecedores) ";
            System.out.println(op);  
            ResultSet rs = stat.executeQuery(op);
            while(rs.next())
            {
                
                id.setCodigoFornecedor(rs.getInt("id"));
               
            }
             stat.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null ,"Ocorreu um erro ao buscar o maior id no banco");
            return;
        }
        c.close();
    }
    
    public void cadFornecedor(Fornecedor forn) throws SQLException {
        connect();
        try {
            stat = c.createStatement();
            op = "INSERT INTO fornecedores(id, nome, cnpj, cidade, endereco, cep, uf, bairro, telefone, email) VALUES('"+forn.getId()+"','"+forn.getNome()+"','"+forn.getCNPJ()+"','"+forn.getCidade()+"','"+forn.getEndereco()+"','"+forn.getCep()+"','"+forn.getUf()+"','"+forn.getBairro()+"','"+forn.getTelefone()+"','"+forn.getEmail()+"')";
            System.out.println(op);
            stat.executeUpdate(op);       //Here is the problem
            stat.close();
            JOptionPane.showMessageDialog(null ,"Cadastrado com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null ,"Ocorreu um erro no cadastro");
            return;
        }
        c.close();
    }
    
    public void AltFornecedores(Fornecedor forn) throws SQLException {
        connect();
        try {
            stat = c.createStatement();      
            op = "UPDATE fornecedores SET id = " + forn.getId() 
                    + ", nome = '" + forn.getNome()
                    + "', cnpj = '" + forn.getCNPJ()
                    + "', cidade = '" + forn.getCidade()
                    + "', endereco = '" + forn.getEndereco()
                    + "', cep = '" + forn.getCep()
                    + "', uf = '" + forn.getUf()
                    + "', bairro = '" + forn.getBairro()
                    + "', telefone = '" + forn.getTelefone()
                    + "', email = '"  + forn.getEmail()+ "' where id=" +forn.getId();
                       
            System.out.println(op);
            stat.executeUpdate(op);       //Here is the problem
            stat.close();
            JOptionPane.showMessageDialog(null ,"Alterado com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null ,"Ocorreu um erro no update");
            return;
        }
        c.close();
    }
    
     public void DeleteFornecedoresID(String Id) throws SQLException {
        String verificaID = "";
        connect();
        try {         
            VariaveisGlobais VG = new VariaveisGlobais();
            
            stat = c.createStatement();
            op = "SELECT id FROM fornecedores WHERE id='" +Id+"'";
            System.out.println(op);  
            ResultSet rs = stat.executeQuery(op);
            while(rs.next())
            {                
                verificaID = rs.getString("id"); 
            }
             stat.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null ,"Ocorreu um erro ao buscar o id no banco");
            return;
        }
        c.close();
        
        if(verificaID == "")
        {
            JOptionPane.showMessageDialog(null ,"O produto não existe!");
            return;
        }
        else
        {
          connect();
        try {               
            
            stat = c.createStatement();
            op = "DELETE FROM fornecedores WHERE id='"+Id+"'";
            System.out.println(op);            
            stat.executeUpdate(op);       
            stat.close();
            JOptionPane.showMessageDialog(null ,"O fornecedor foi deletado!");    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null ,"O id informado não esta cadastrado");
            return;
        }
        c.close();
    }  
    
     }
    
}
