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
        super(0,0,Color.BLACK);

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
    public 
}
