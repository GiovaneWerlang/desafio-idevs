/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ids.util;

import javax.swing.JInternalFrame;

/**
 *
 * @author Giovane
 */
public class Util {
    //Classe Util contendo a utilidade de centralizar o frame/janela interna que será adicionada ao frame principal.
    //Metodo sem retorno centralizarFrame recebe um jInternalFrame
    public static void centralizarFrame(JInternalFrame jInternalFrame){ 
        jInternalFrame.setLocation( 
                //Invocado metodo para setar localizacao do jInternalFrame recebendo dois parametros inteiros x e y
                //x é calculado a partir da subtração da largura do desktopPane do frame principal onde o jInternalFrame é instanciado e da largura do jInternalFrame dividido por 2
                (jInternalFrame.getDesktopPane().getSize().width - jInternalFrame.getSize().width) / 2, 
                //y é calculado a partir da subtração da altura do desktopPane do frame principal onde o jInternalFrame é instanciado e da altura do jInternalFrame dividido por 2
                (jInternalFrame.getDesktopPane().getSize().height - jInternalFrame.getSize().height) / 2
                );
                
    }
}
