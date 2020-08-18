package shapes;

import java.awt.*;

/**
 * @author wuliang
 * @date 2020/8/16
 */
public class Dot extends BaseShape {
    private final int DOT_SIZE = 3;

    public Dot(int x, int y, Color color){
        super();
    }

    @Override
    public int getWidth(){
        return DOT_SIZE;
    }

    @Override
    public int getHeight(){
        return DOT_SIZE;
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.fillRect(x-1,y-1,getWidth(),getHeight());
    }
}
