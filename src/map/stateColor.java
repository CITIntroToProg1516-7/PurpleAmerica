/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;
import java.awt.Color;
/**
 *
 * @author hcps-rozarioed
 */
public class stateColor {
    
    public Color colorPalette(int rVotes, int dVotes, int oVotes){
        int total = rVotes + dVotes + oVotes; 
        int rRatio = rVotes/total;
        int dRatio = dVotes/total; 
        int oRatio = oVotes/total;
        return new Color(rRatio, dRatio, oRatio);
    }
    
}
