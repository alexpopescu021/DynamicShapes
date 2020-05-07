/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication;
import com.ace.pluginsapplication.interfaces.IShape;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class Canvas {
    public List<IShape> Shapes = new ArrayList<IShape>();
    private int Index=0;
    public void DrawShapes()
        {
            for(int i=0;i<Shapes.size();i++)
            {
                Shapes.get(i).Draw();
            }
              
        }
    public void AddShape(IShape shape)
    {
        shape.CreateShape();
        Shapes.add(shape);
        Index++;
        
    }
    public void RemoveShapes(int index)
    {
        Shapes.remove(index);
    }
    public void ModifyShapes(int index)
    {
        Shapes.get(index).ModifyShape();
    }
  
    
}
