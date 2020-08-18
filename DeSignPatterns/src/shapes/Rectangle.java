package shapes;

import java.awt.*;

/**
 * @author wuliang
 * @date 2020/8/16
 *  三角形
 */
public class Rectangle extends BaseShape {

    public int  width;
    public int  height;

    public Rectangle(int x, int y, int width, int height, Color color){

        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth(){
        return width;
    }

    @Override
    public int getHeight(){
        return height;
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.drawRect(x,y,getWidth()-1,getHeight()-1);
    }
}
