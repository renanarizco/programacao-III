/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps5.pkgtry.pkg1;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class APS5TRY1 extends JFrame {
    boolean clicou = true;
    String c1;
    String c2;
    JButton pBtn;
    
    
    //static String imgs[] = {"/aps5/pkgtry/img/2b.png", "/aps5/pkgtry/img/a2.png"};
    static String logo = "/aps5/pkgtry/img/logo.png";
    
    
    public APS5TRY1() {
        int score = 1;
        this.getContentPane().setLayout(new BorderLayout());
        
        JPanel Superior = new JPanel(new GridLayout(1, 2));
        JTextField Score = new JTextField(score);
        Superior.add(new JLabel("Score: "));
        Superior.add(Score);
        Score.setEditable(false);
        
        this.getContentPane().add(Superior,BorderLayout.PAGE_START);
        
        JPanel Botoes = new JPanel(new GridLayout(2, 2));
        
        
        
        JButton botao1 = new JButton();
        JButton botao2 = new JButton();
        JButton botao3 = new JButton();
        JButton botao4 = new JButton();
        
        Botoes.add(botao1);
        Botoes.add(botao2);
        Botoes.add(botao3);
        Botoes.add(botao4);
        
        botao1.setIcon(new javax.swing.ImageIcon(getClass().getResource(logo)));
        botao2.setIcon(new javax.swing.ImageIcon(getClass().getResource(logo)));
        botao3.setIcon(new javax.swing.ImageIcon(getClass().getResource(logo)));
        botao4.setIcon(new javax.swing.ImageIcon(getClass().getResource(logo)));
        
        
        botao1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                botao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps5/pkgtry/img/2b.png")));
                
                if(clicou){   
                    
                    
                    
                    pBtn = botao1;
                    botao1.setEnabled(false);
                    clicou = false;
                    
                }else{
                    
                    botao1.setEnabled(true);
                    botao2.setEnabled(true);
                    botao3.setEnabled(true);
                    botao4.setEnabled(true);
                    
                    if(pBtn.getIcon().toString().equals(botao1.getIcon().toString())){
                    botao1.removeActionListener(this);
                    pBtn.removeActionListener(this);
                    }else{
                    botao1.setIcon(new javax.swing.ImageIcon(getClass().getResource(logo)));
                    pBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource(logo)));
                    }
                    clicou = true;
                }
                
            }
        });
        
        
        botao2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               botao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps5/pkgtry/img/2b.png")));
                
                if(clicou){   
                    pBtn = botao2;
                    
                    
                    clicou = false;
                }else{
                    botao1.setEnabled(true);
                    botao2.setEnabled(true);
                    botao3.setEnabled(true);
                    botao4.setEnabled(true);
                    
                    if(pBtn.getIcon().toString().equals(botao2.getIcon().toString())){
                    botao2.removeActionListener(this);
                    pBtn.removeActionListener(this);
                    }else{
                    botao2.setIcon(new javax.swing.ImageIcon(getClass().getResource(logo)));
                    pBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource(logo)));
                    }
                    
                    clicou = true;
                }
                
            }
        });
        
        botao3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                botao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps5/pkgtry/img/a2.png")));
                
                if(clicou){   
                    
                    
                    pBtn = botao3;
                    
                    clicou = false;
                }else{
                    
                    
                    if (pBtn.getIcon().toString().equals(botao3.getIcon().toString())) {
                        botao3.removeActionListener(this);
                        pBtn.removeActionListener(this);
                    } else {
                        botao3.setIcon(new javax.swing.ImageIcon(getClass().getResource(logo)));
                        pBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource(logo)));
                    }
                    clicou = true;
                }
                
            }
        });
        
        
        botao4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                botao4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aps5/pkgtry/img/a2.png")));
                
                if(clicou){   
                    
                    
                    pBtn = botao4;
                    
                    clicou = false;
                }else{
                    
                    
                    if (pBtn.getIcon().toString().equals(botao4.getIcon().toString())) {
                        botao4.removeActionListener(this);
                        pBtn.removeActionListener(this);
                    } else {
                        botao4.setIcon(new javax.swing.ImageIcon(getClass().getResource(logo)));
                        pBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource(logo)));
                    }
                    clicou = true;
                }
                
            }
        });
                
        
        
        this.getContentPane().add(Botoes, BorderLayout.CENTER);
        
    
        
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setVisible(true);
    }
    
    

    public static void main(String[] args) {
        new APS5TRY1();
    }
    
    
    
    
    
}
