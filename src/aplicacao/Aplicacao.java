/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacao;

/**
 *
 * @author 20162si0340
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SplashScreen(1000).showSplash();
        new LoginForm().setVisible(true);
    }
    
}
