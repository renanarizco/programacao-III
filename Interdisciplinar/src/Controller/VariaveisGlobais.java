/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Murilo
 */
public class VariaveisGlobais {
    
    //CODIGO CLIENTES
    private int CodigoCliente;
    public void setCodigoCliente(int CodigoCliente)
    {
        this.CodigoCliente = CodigoCliente;
    }
    public int getCodigoCliente()
    {
        return this.CodigoCliente;
    }   
    
    //Verifica Cliente se Existe
    private String VerificaClie;
    public void setVerificaClie(String VerificaClie)
    {
        this.VerificaClie = VerificaClie;
    }
    public String getVerificaClie(int CodigoProduto)
    {
        return this.VerificaClie;
    } 
    
    //Codigo Produduto
    private int CodigoProduto;

    public int getCodigoProduto() {
        return CodigoProduto;
    }

    public void setCodigoProduto(int CodigoProduto) {
        this.CodigoProduto = CodigoProduto;
    }
    
    //Codigo id do produto para passar para outro frm
       private int CodigoIdProduto;
       public int getCodigoIdProduto() {
        return CodigoIdProduto;
    }

    public void setCodigoIdProduto(int CodigoIdProduto) {
        this.CodigoIdProduto = CodigoIdProduto;
    }
    
    private int codigoFornecedor;

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }
    
}
