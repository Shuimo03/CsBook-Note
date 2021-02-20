package shapes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ImageEditor {
    private  EditorCanvas canvas;
    private CompoundShape compoundShape = new CompoundShape();

    public  ImageEditor(){
        canvas = new EditorCanvas();
    }

    public void loadShapes(Circle circle, CompoundShape compoundShape, Dot dot, CompoundShape shape){
        this.compoundShape.clear();
        canvas.refresh();
    }

     private class EditorCanvas extends Canvas{
         JFrame jFrame;

         private static final int PADDING = 10;

         EditorCanvas(){
            createFrame();
             refresh();
             addMouseListener(new MouseAdapter() {
                 @Override
                 public void mousePressed(MouseEvent e) {
                     compoundShape.unSelect();
                     compoundShape.selectChildAt(e.getX(),e.getY());
                     e.getComponent().repaint();
                     super.mousePressed(e);
                 }
             });
         }

         void createFrame(){
             jFrame = new JFrame();
             jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
             jFrame.setLocationRelativeTo(null);

             JPanel jPanel = new JPanel();
             Border border = BorderFactory.createEmptyBorder(PADDING,PADDING,PADDING,PADDING);
             jPanel.setBorder(border);
             jFrame.setContentPane(jPanel);

             jFrame.add(this);
             jFrame.setVisible(true);
             jFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
         }

         @Override
         public int getWidth(){
             return compoundShape.getX()+compoundShape.getWidth()+PADDING;
         }

         @Override
         public int getHeight(){
             return compoundShape.getY()+compoundShape.getHeight()+PADDING;
         }

         void refresh(){
             this.setSize(getWidth(),getHeight());
             jFrame.pack();
         }

         @Override
         public void paint(Graphics graphics){
             compoundShape.paint(graphics);
         }
     }
}
