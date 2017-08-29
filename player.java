package MoveTest;

import java.awt.Rectangle;

public class player {
    private Rectangle bounding;
    private float f_posx;
    private float f_posy;
    
    public player (int x, int y, int size) {
    	bounding = new Rectangle (x, y, size, size);
    	f_posx = x;
    	f_posy = y;
    }
    
    public void update (boolean up, boolean down, boolean left, boolean right) {
    	if(up) {
		}
		if(down) {
		}
		if(right)f_posx+=5;
		if(left)f_posx-=5;
		
		bounding.x=(int)f_posx;
		bounding.y=(int)f_posy;
    }
    
    public Rectangle getBounding() {
    	return bounding;
    }
}
