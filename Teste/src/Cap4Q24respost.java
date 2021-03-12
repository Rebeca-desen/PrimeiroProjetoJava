
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author André
 */
public class Cap4Q24respost {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {    
       double preco;
       double acrescimo;
       double imposto;
       String  produto;
       double desconto;
       double preco_acrescimo;
       double cincoporc=0.05;
       double tresporc=0.03;
       double oitoporc=0.08;
        
      JOptionPane.showMessageDialog(null, "Este programa vai calcular o valor do produto final, contando com as dispesas e os impostos", null, JOptionPane.INFORMATION_MESSAGE);
        
              double Option;
              String VInformado;
             
            
              VInformado=JOptionPane.showInputDialog(null, "Agora os cuidados que o produto precisa \n" 
                +"1- O produto necessita de refrigeração\n"
                +"2- O produto não precisa de refrigeração\n", null, JOptionPane.QUESTION_MESSAGE);
              Option=Double.valueOf(VInformado); 
               
           if (Option==1 ){
                   String SecOption;
         
            
             
               VInformado=JOptionPane.showInputDialog(null, "Selecione o tipo do produto \n" 
                +"A- Alimentação \n"
                +"L- Limpeza \n"
                +"V- Vestuário\n", null, JOptionPane.QUESTION_MESSAGE);
      
             SecOption=String.valueOf(VInformado); 
             switch(SecOption) {
              case "A" :
             VInformado=JOptionPane.showInputDialog(null, "Qual o nome do produto?", null, JOptionPane.QUESTION_MESSAGE);
             produto=String.valueOf(VInformado);
             VInformado=JOptionPane.showInputDialog(null, "Qual o valor do produto " + produto + "?", null, JOptionPane.QUESTION_MESSAGE);
             preco=Double.valueOf(VInformado);
           
                if (preco < 15 ) {
                acrescimo=2;
                preco_acrescimo= preco + acrescimo; 
                 JOptionPane.showMessageDialog(null, "O valor + o acrescimo ficará: " + preco_acrescimo, null, JOptionPane.INFORMATION_MESSAGE);
                  
                      if (preco_acrescimo < 25)
                             {
                                 
                             imposto= preco_acrescimo + (cincoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                               }; 
                             
                             }else {
                             imposto= preco_acrescimo + (oitoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                     }
                                     };
                                     
                } else {
                    acrescimo=5;
                    preco_acrescimo= preco + acrescimo; 
                     JOptionPane.showMessageDialog(null, "O valor + o acrescimo ficará: " + preco_acrescimo, null, JOptionPane.INFORMATION_MESSAGE);
                  
                      if (preco_acrescimo < 25)
                             {
                                 
                             imposto= preco_acrescimo + (cincoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                               }; 
                             
                             }else {
                             imposto= preco_acrescimo + (oitoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                     }
                                     };
                                     
                     };
                               
             
                    
        break;
             case "L":
                   VInformado=JOptionPane.showInputDialog(null, "Qual o nome do produto?", null, JOptionPane.QUESTION_MESSAGE);
                   produto=String.valueOf(VInformado);
                   VInformado=JOptionPane.showInputDialog(null, "Qual o valor do produto " + produto + "?", null, JOptionPane.QUESTION_MESSAGE);
                   preco=Double.valueOf(VInformado);
                
                   if(preco < 10) {
                           acrescimo=1.50;
                           preco_acrescimo= preco + acrescimo; 
                           
                           JOptionPane.showMessageDialog(null, "O valor + o acrescimo ficará: " + preco_acrescimo, null, JOptionPane.INFORMATION_MESSAGE);
                  
                      if (preco_acrescimo < 25)
                             {
                                 
                             imposto= preco_acrescimo + (cincoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                               }; 
                             
                             }else {
                              imposto= preco_acrescimo + (oitoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                     }
                      };
                           
                           
               } else {
                           acrescimo=2.50;
                           preco_acrescimo= preco + acrescimo; 
                              JOptionPane.showMessageDialog(null, "O valor + o acrescimo ficará: " + preco_acrescimo, null, JOptionPane.INFORMATION_MESSAGE);
                  
                      if (preco_acrescimo < 25)
                             {
                                 
                             imposto= preco_acrescimo + (cincoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                               }; 
                             
                             }else {
                             imposto= preco_acrescimo + (oitoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                    }
                            };                           
                   }; 
        break;
            case "V": 
                   VInformado=JOptionPane.showInputDialog(null, "Qual o nome do produto?", null, JOptionPane.QUESTION_MESSAGE);
                   produto=String.valueOf(VInformado);
                   VInformado=JOptionPane.showInputDialog(null, "Qual o valor do produto " + produto + "?", null, JOptionPane.QUESTION_MESSAGE);
                   preco=Double.valueOf(VInformado);
             
                   if(preco < 30) {
                           acrescimo=3;
                           preco_acrescimo= preco + acrescimo; 
                             JOptionPane.showMessageDialog(null, "O valor + o acrescimo ficará: " + preco_acrescimo, null, JOptionPane.INFORMATION_MESSAGE);
                  
                      if (preco_acrescimo < 25)
                             {
                                 
                             imposto= preco_acrescimo + (cincoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                               }; 
                             
                             }else {
                             imposto= preco_acrescimo + (oitoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                     }
                                     };
                   } else {
                           acrescimo=2.50;
                           preco_acrescimo= preco + acrescimo; 
                            JOptionPane.showMessageDialog(null, "O valor + o acrescimo ficará: " + preco_acrescimo, null, JOptionPane.INFORMATION_MESSAGE);
                  
                      if (preco_acrescimo < 25)
                             {
                                 
                             imposto= preco_acrescimo + (cincoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                               }; 
                             
                             }else {
                             imposto=preco_acrescimo + (oitoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                     }
                      };
                   }
        break;
                
        default: JOptionPane.showMessageDialog(null, "Fim" , null, JOptionPane.INFORMATION_MESSAGE);
                   
        }
                   
                   }else{
                   double SecOption;
                   
                    VInformado=JOptionPane.showInputDialog(null, "Selecione o tipo do produto \n" 
                    +"1- Alimentação \n"
                    +"2- Limpeza \n"
                    +"3- Vestuário\n", null, JOptionPane.QUESTION_MESSAGE);
      
                     SecOption=Double.valueOf(VInformado); 
                    if( SecOption==1) {
                        
                    VInformado=JOptionPane.showInputDialog(null, "Qual o nome do produto?", null, JOptionPane.QUESTION_MESSAGE);
                    produto=String.valueOf(VInformado);
                    VInformado=JOptionPane.showInputDialog(null, "Qual o valor do produto " + produto + "?", null, JOptionPane.QUESTION_MESSAGE);
                    preco=Double.valueOf(VInformado);
                   
                    acrescimo=8;
                    preco_acrescimo= preco + acrescimo;
                    JOptionPane.showMessageDialog(null, "Valor com acrescimo: R$ " + preco_acrescimo,null, JOptionPane.INFORMATION_MESSAGE );
                             
                   
                    
                          if (preco_acrescimo < 25)
                             {
                                 
                             imposto=preco_acrescimo + (cincoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             
              
                             JOptionPane.showMessageDialog(null, "Produto sem desconto", null, JOptionPane.INFORMATION_MESSAGE);
                            
                                     if (imposto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + imposto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= imposto || imposto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + imposto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + imposto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                               }; 
                             
                             }else {
                             imposto= preco_acrescimo + (oitoporc*preco_acrescimo);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             
                             
                             JOptionPane.showMessageDialog(null, "Produto sem desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                              
                                     if (imposto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + imposto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= imposto || imposto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + imposto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + imposto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                              
                                 }; 
                             
                             
                                }
                         
                              
                                 }else{
                             
                    VInformado=JOptionPane.showInputDialog(null, "Qual o nome do produto?", null, JOptionPane.QUESTION_MESSAGE);
                    produto=String.valueOf(VInformado);
                    VInformado=JOptionPane.showInputDialog(null, "Qual o valor do produto " + produto + "?", null, JOptionPane.QUESTION_MESSAGE);
                    preco=Double.valueOf(VInformado);
                    
                        if (preco < 25)
                             {
                                 
                             imposto= preco + (cincoporc*preco);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                               }; 
                             
                             }else {
                             imposto= preco + (oitoporc*preco);
                             JOptionPane.showMessageDialog(null, "Valor com impostos: R$" + imposto,null, JOptionPane.INFORMATION_MESSAGE );
                             
                             JOptionPane.showMessageDialog(null, "Adicionando desconto", null, JOptionPane.INFORMATION_MESSAGE);
                             desconto=imposto - (tresporc*imposto);
                             JOptionPane.showMessageDialog(null, "O preço com desconto ficará " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                             
                              
                                     if (desconto < 50){
                                     JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                     JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                             
                             
                                     } else{
                                 
                                            if(50 >= desconto || desconto <= 100){
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                                 
                                     
                                            } else{
                                            JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + desconto, null, JOptionPane.INFORMATION_MESSAGE);
                                            JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                                                     }
                                     }
                      };
                        
                    }
                             
                             
                                }
         }
             
               

      }

    

