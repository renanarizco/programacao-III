package Model;

import Controller.Cliente;
import Controller.VariaveisGlobais;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;



public class CriaTabelaClientes {

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

    public void CriaTabelaCliente_DB() throws SQLException {
        connect();
        try {
            stat = c.createStatement();
            op = "Create table clientes(id int identity, nome varchar(80), endereco varchar(100), numero_end varchar(10), bairro varchar(80), cidade varcar(80), uf varchar(2), cep varchar(30), email varchar(100), tipo_pessoa varchar(20), cpf varchar(40), cnpj varchar(50), rg varchar(40), data_nascimento varchar(20), telefone varchar(20), celular varchar(21));";
            stat.executeUpdate(op);       //Here is the problem
            stat.close();
            System.out.println("Criado com Sucesso");
        } catch (SQLException e) {
            System.err.println("Ocoreu um erro ao criar a tabela.");
        }
        c.close();
    }

    public void cadCliente(Cliente novoCliente) throws SQLException {
        connect();
        try {
            stat = c.createStatement();
            op = "INSERT INTO clientes(id, nome, endereco, numero_end, bairro, cidade, uf, cep, email, tipo_pessoa, cpf, cnpj, rg, data_nascimento, telefone, celular) VALUES('"+novoCliente.getCodigo()+"','"+novoCliente.getNome()+"','"+novoCliente.getEndereco()+"','"+novoCliente.getNumero()+"','"+novoCliente.getBairro()+"','"+novoCliente.getCidade()+"','"+novoCliente.getUf()+"','"+novoCliente.getCep()+"','"+novoCliente.getEmail()+"','"+novoCliente.getTipo_pessoa()+"','"+novoCliente.getCpf()+"','"+novoCliente.getCnpj()+"','"+novoCliente.getRg()+"','"+novoCliente.getData_nascimento()+"','"+novoCliente.getTelefone()+"','"+novoCliente.getCelular()+"')";
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
    
    public void SelectIDCliente(VariaveisGlobais id) throws SQLException {
        connect();
        try {         
            VariaveisGlobais VG = new VariaveisGlobais();
            
            stat = c.createStatement();
            op = "SELECT * FROM clientes WHERE id = (SELECT MAX(id) FROM clientes) ";
            System.out.println(op);  
            ResultSet rs = stat.executeQuery(op);
            while(rs.next())
            {
                
                id.setCodigoCliente(rs.getInt("id"));
               
            }
             stat.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null ,"Ocorreu um erro ao buscar o maior id no banco");
            return;
        }
        c.close();
    }
    public void DeleteClientePorId(String Id) throws SQLException {
        String verificaID = "";
        connect();
        try {         
            VariaveisGlobais VG = new VariaveisGlobais();
            
            stat = c.createStatement();
            op = "SELECT id FROM clientes WHERE id='" +Id+"'";
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
            JOptionPane.showMessageDialog(null ,"O Cliente não existe!");
            return;
        }
        else
        {
          connect();
        try {               
            
            stat = c.createStatement();
            op = "DELETE FROM clientes WHERE id='"+Id+"'";
            System.out.println(op);            
            stat.executeUpdate(op);       
            stat.close();
            JOptionPane.showMessageDialog(null ,"O cliente foi deletado!");    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null ,"O id informado não esta cadastrado");
            return;
        }
        c.close();
    }  
    }
    
     public void AltCliente(Cliente novoCliente) throws SQLException {
        connect();
        try {
            stat = c.createStatement();      
            op = "UPDATE clientes SET id = " + novoCliente.getCodigo()
                    + ", nome = '" + novoCliente.getNome()
                    + "', endereco = '" + novoCliente.getEndereco()
                    + "', numero_end = '" + novoCliente.getNumero()
                    + "', bairro = '" + novoCliente.getBairro()
                    + "', uf = '" + novoCliente.getUf()
                    + "', cep = '" + novoCliente.getCep()
                    + "', email = '" + novoCliente.getEmail()
                    + "', tipo_pessoa = '" + novoCliente.getTipo_pessoa()
                    + "', cpf = '" + novoCliente.getCpf()
                    + "', cnpj = '" + novoCliente.getCnpj()
                    + "', rg = '" + novoCliente.getRg()
                    + "', data_nascimento = '" + novoCliente.getData_nascimento()
                    + "', telefone = '" + novoCliente.getTelefone()  
                    + "', celular = '"  + novoCliente.getCelular()+ "' where id=" +novoCliente.getCodigo();
                       
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
