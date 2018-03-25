/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligenciaartificial;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author haroldo
 */
public class Lienzo extends Canvas{
    public Laberinto laberinto;
    
    public Lienzo(){
        laberinto=new Laberinto();
        this.setBackground(Color.orange);
        this.setSize(laberinto.anchuraLaberinto,laberinto.alturaLaberinto);
    }
    
    @Override
    public void paint(Graphics g){
        laberinto.paintComponent(g);
    }
}
