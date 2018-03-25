/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligenciaartificial;
import java.awt.Graphics;
import javax.swing.JComponent;
/**
 *
 * @author haroldo
 */
public class Laberinto extends JComponent implements Constantes{
  
    public int anchuraLaberinto, alturaLaberinto;
    public Celda[][] celdas;
   
    public Laberinto(){
        
        celdas = new Celda[anchuraMundoVirtual][alturaMundoVirtual];
        
        for (int i=0; i<anchuraMundoVirtual; i++)
            for(int j=0; j<alturaMundoVirtual; j++)
                celdas[i][j]= new Celda(i+(i*anchuraCelda),j+(j*alturaCelda));
        
        this.anchuraLaberinto=anchuraMundoVirtual*anchuraCelda;
        this.alturaLaberinto=alturaMundoVirtual*alturaCelda;
        this.setSize(anchuraLaberinto,alturaLaberinto);
    }
        @Override
        public void paintComponent(Graphics g){
            for(int i=0;i<anchuraMundoVirtual;i++)
                for(int j=0;j<alturaMundoVirtual;j++)
                    celdas[i][j].paintComponent(g);
        }
        
    
}
