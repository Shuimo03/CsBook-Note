package shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wuliang
 * @date 2020/8/16
 *  三角形
 */

public class CompoundShape extends BaseShape{
    protected List<Shape> children = new ArrayList<>();
    public CompoundShape(int x, int y, Color color){
        super();

    }

    public CompoundShape(Rectangle rectangle, Dot dot, Dot dot1, Dot dot2, Dot dot3) {
        super();
    }

    public CompoundShape(int i, int i1, int i2, Color red) {
    }

    public CompoundShape() {

    }

    public void add (Shape component){
        children.add(component);
    }

    public void remove(Shape child){
        children.remove(child);
    }

    public void clear(){
        children.clear();
    }

    @Override
    public int getX(){
        if(children.size() == 0){
            return 0;
        }

        int x = children.get(0).getX();

        for(Shape child : children){
            if(child.getX() < x){
                x = child.getX();
            }
        }
        return x;
    }

    @Override
    public int getY(){
        if(children.size() == 0){
            return 0;
        }

        int y = children.get(0).getY();

        for(Shape child : children){
            if(child.getY() < y){
                y = child.getY();
            }
        }

        return y;
    }

    @Override
    public int getWidth(){
        int maxWidth = 0;
        int x = getX();

        for(Shape child : children){
            int childsRelativeX = child.getX() - x;
            int childWidth = childsRelativeX + child.getWidth();
            if(childWidth  > maxWidth){
                maxWidth = childWidth;
            }
        }
        return maxWidth;
    }

    @Override
    public int getHeight(){

        int maxHeight = 0;
        int y = getY();

        for(Shape child : children){
            int childsRelativeY = child.getY() - y;
            int childHeight = childsRelativeY + child.getHeight();
            if (childHeight > maxHeight){
                maxHeight = childHeight;
            }
        }
        return maxHeight;
    }

    @Override
    public void move(int x, int y){
        for (Shape child : children){
            child.move(x, y);
        }
    }

    @Override
    public boolean isInsideBounds(int x, int y){
        for(Shape child : children){
            if (child.isInsideBounds(x,y)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void unSelect(){
        super.unSelect();

        for(Shape child : children){
            child.unSelect();
        }
    }

    public boolean selectChildAt(int x, int y){
        for(Shape child : children){
            if(child.isInsideBounds(x, y)){
                child.select();;
                return true;
            }
        }
        return false;
    }

    @Override
    public void paint(Graphics graphics){
        if(isSelected()){
            enableSelectionStyle(graphics);
            graphics.drawRect(getX()-1,getY()-1,getWidth()+1,getHeight()+1);
            disableSelectionStyle(graphics);
        }
    }
}
