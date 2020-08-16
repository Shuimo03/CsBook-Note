package shapes;

import java.awt.*;

/**
 * @author wuliang
 * @date 2020/8/16
 * 提供基本功能的抽象形状
 */
public class BaseShape implements Shape{

    public int x;
    public int y;
    public Color color;
    private  boolean selected = false;

    BaseShape(int x, int y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public int getX(){
        return x;
    }

    @Override
    public int getY(){
        return y;
    }

    @Override
    public int getWidth(){
        return 0;
    }

    @Override
    public int getHeight(){
        return 0;
    }

    @Override
    public void move(int x, int y){
        this.x += x;
        this.y += y;
    }

    @Override
    public boolean isInsideBounds(int x,int y){
        return x > getX() && x <(getX() + getWidth()) &&
                y > getY() && y < (getY() + getHeight());
    }

    @Override
    public void select(){
        selected = true;
    }

    @Override
    public void unSelect(){
        selected = false;
    }

    @Override
    public boolean isSelected(){
        return selected;
    }

    void enableSelectionStyle (Graphics graphics){
        graphics.setColor(Color.LIGHT_GRAY);
    }

    void disableSelectionStyle(Graphics graphics){
        graphics.setColor(color);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setStroke(new BasicStroke());
    }

    @Override
    public void paint(Graphics graphics){
        if (isSelected()){
            enableSelectionStyle(graphics);
        }
        else{
            disableSelectionStyle(graphics);
        }
    }
}
