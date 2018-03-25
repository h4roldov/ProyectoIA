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
public class Celda extends JComponent implements Constantes {
    
    public int x,y;
    
    public Celda(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.drawRect(x, y, anchuraCelda, alturaCelda);
    }
}
