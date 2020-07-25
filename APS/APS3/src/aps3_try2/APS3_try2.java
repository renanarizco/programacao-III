package aps3_try2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;


public class APS3_try2 extends NovoJFrame
{


    public APS3_try2(){
       
        JButton botao = new JButton("Login");
        botao.setBounds(50, 50, 80, 40);
        this.getContentPane().add(botao);
        this.getContentPane().setLayout(null);
        
        JPasswordField pass = new JPasswordField();
        pass.setBounds(200, 50, 120, 40);
        this.getContentPane().add(pass);
        
        this.setVisible(true);
        this.setSize(400, 200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    
    
    public static void main(String[] args) 
    {
        //new APS3_try2();
        new NovoJFrame();
    }
    
}
