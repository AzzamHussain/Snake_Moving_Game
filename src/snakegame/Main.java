/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;
import java.awt.Color;
//import javafx.scene.paint.Color;
import javax.swing.JFrame;

/**
 *
 * @author Home
 */
public class Main {
    
    public static void main(String args[]){
        JFrame frame=new JFrame("Snake game");
        frame.setBounds(10,10,905,700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel panel=new GamePanel();
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);
        
        
        frame.setVisible(true);
    }
    
}
