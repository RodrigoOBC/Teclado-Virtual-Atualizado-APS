/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.poo;

import java.util.Random;
import java.lang.*;

/**
 *
 * @author rodri
 */
public class contar_erros_acertos {
    
    private String escrita = "";
    int index = 0;
    int tamanhoPangrama = 0;
    private int acertos;
    private int erros;
    private float porcentagemAcerto;
    
    public contar_erros_acertos(String letra) {
        
    }
    
    public void setEscrita(String letra)
    {
        this.escrita += letra;
    }
    public String getEscrita()
    {
        return escrita;
    }
    
    public void tamanho_pan(String n)
    {
        tamanhoPangrama = n.length();
    }
    public boolean contagem(String pangrama ,char letra, String fraseAtual){
        //Realiza a verificação da tecla pressionada
        
        tamanhoPangrama = pangrama.length();
            
            
            if(pangrama.charAt(index)==letra){//verifica se a letra do pangrama indexada e igual à letra pressionada            
                if(pangrama.contains(fraseAtual)){
                    index++;//incrementa o index para proxima letra
                    setA();//incrementa a quantidade de acertos
                    setP();//recalcula a porcentagem de acerto 
                    return true;    
                }else{
                    setE();
                    setP();
                    return false;
                }
                
            }else{
                setE();//incrementa a quantidade de erros
                setP();//recalcula a porcentagem de acerto
                return false;
            }
            
            
        

       
    }
    public void setA(){//incrementa a quantidade de acertos
        acertos++;
    }
     public void setE(){//incrementa a quantidade de erros
        erros++;
    }
     public int getAcertos(){//captura a quantidade de acertos
        return acertos;
    }
    
    public int getErros(){//captura a quantidade de erros
        return erros;
    }
    public void setP(){
        //calcula a porcentagem de acertos
        float total = getAcertos() + getErros();
        porcentagemAcerto = (getAcertos()/total)*100;
    }
     public float getP(){//captura a porcentagem de acertos
        return porcentagemAcerto;
    }    
    public void zerar()
    {
        erros = 0;
        acertos = 0;
    }
}
