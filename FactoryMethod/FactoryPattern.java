package FactoryMethod;

//import java.awt.*;

import java.awt.*;

/**
 * Created by Cclub on 2/10/2017.
 */
public class FactoryPattern
{
    public static void main(String[] args)
    {
        java.util.Scanner scan=new java.util.Scanner(System.in);
        String a=scan.next();

      AbstractFactory  shapefactory=FactoryProducer.getFactory("SHAPE");
       IShape shape =shapefactory.getshape(a);
        shape.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        IColor color=colorFactory.getcolor(a);
        color.fill();




    }
}
