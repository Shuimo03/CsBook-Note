package shapes;

import java.awt.*;

/**
 * @author wuliang
 * @date 2020/8/16
 * 圆形
 */

public class Circle extends BaseShape {

    public int radius;

    public Circle(int x, int y, int radius, Color color){
        super();
        this.radius = radius;
    }

    @Override
    public int getWidth(){
        return  radius * 2;
    }

    @Override
    public int getHeight(){
        return radius * 2;
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.drawOval(x,y,getWidth()-1,getHeight()-1);
    }
}
