package shapes;

import java.awt.*;

/**
 * @author wuliang
 * @date    2020/8/16
 * 通用形状接口
 */
public interface Shape {

    int getX();
    int getY();
    int getWidth();
    int getHeight();

    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();

    boolean isSelected();
    void paint(Graphics graphics);
}
