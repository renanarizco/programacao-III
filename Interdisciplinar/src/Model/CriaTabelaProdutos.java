package Model;

import Controller.VariaveisGlobais;
import Controller.Produto;
import Model.CriaTabelaClientes;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;



public class CriaTabelaProdutos {

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
    
    public void CriaTabelaProduto_DB() throws SQLException {
        connect();
        try {
            stat = c.createStatement();
            op = "Create table produtos(id int identity, codBarras varchar(80), qntEstoque int, nome varchar(100), descricao varchar(200), fornecedor varcar(80), categoria varchar(50), valor varchar(30), valor_custo varchar(30));";
            stat.executeUpdate(op);       //Here is the problem
            stat.close();
            System.out.println("Criado com Sucesso");
        } catch (SQLException e) {
            System.err.println("Ocoreu um erro ao criar a tabela.");
        }
        c.close();
    }
    
    public void cadProduto(Produto novoProduto) throws SQLException {
        connect();
        try {
            stat = c.createStatement();
            op = "INSERT INTO produtos(id, codBarras, qntEstoque, nome, descricao, fornecedor, categoria, valor, valor_custo) VALUES('"+novoProduto.getId()+"','"+novoProduto.getCodBarras()+"','"+novoProduto.getQntEstoque()+"','"+novoProduto.getNome()+"','"+novoProduto.getDescricao()+"','"+novoProduto.getFornecedor()+"','"+novoProduto.getCategoria()+"','"+novoProduto.getValor()+"','"+novoProduto.getValorCusto()+"')";
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
    
    public void SelectIDProdutos(VariaveisGlobais id) throws SQLException {
        connect();
        try {         
            VariaveisGlobais VG = new VariaveisGlobais();
            
            stat = c.createStatement();
            op = "SELECT * FROM produtos WHERE id = (SELECT MAX(id) FROM produtos) ";
            System.out.println(op);  
            ResultSet rs = stat.executeQuery(op);
            while(rs.next())
            {
                
                id.setCodigoProduto(rs.getInt("id"));
               
            }
             stat.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null ,"Ocorreu um erro ao buscar o maior id no banco");
            return;
        }
        c.close();
    }
    
    
     public void DeleteProdutoPorId(String Id) throws SQLException {
        String verificaID = "";
        connect();
        try {         
            VariaveisGlobais VG = new VariaveisGlobais();
            
            stat = c.createStatement();
            op = "SELECT id FROM produtos WHERE id='" +Id+"'";
            System.out.println(op);  
            ResultSet rs = stat.executeQuery(op);
            while(rs.next())
            {                
                verificaID = rs.getString("id"); 
            }
             stat.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null ,"Ocorreu um erro ao buscar o maior id no banco");
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
            op = "DELETE FROM produtos WHERE id='"+Id+"'";
            System.out.println(op);            
            stat.executeUpdate(op);       
            stat.close();
            JOptionPane.showMessageDialog(null ,"O produto foi deletado!");    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null ,"O id informado não esta cadastrado");
            return;
        }
        c.close();
    }  
    
     }  
     
     
     public void AltProduto(Produto novoProduto) throws SQLException {
        connect();
        try {
            stat = c.createStatement();      
            op = "UPDATE produtos SET id = " + novoProduto.getId() 
                    + ", codBarras = " + novoProduto.getCodBarras()                    
                    + ", qntEstoque = " + novoProduto.getQntEstoque()
                    + ", nome = '" + novoProduto.getNome() 
                    + "', descricao = '" + novoProduto.getDescricao()
                    + "', fornecedor = '" + novoProduto.getFornecedor()
                    + "', categoria = '" + novoProduto.getCategoria()
                    + "', valor = '" + novoProduto.getValor()
                    + "', valor_custo = '"  + novoProduto.getValorCusto() + "' where id=" +novoProduto.getId();
                       
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
}
