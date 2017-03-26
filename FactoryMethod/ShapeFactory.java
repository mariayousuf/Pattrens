package FactoryMethod;

/**
 * Created by Cclub on 2/10/2017.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    IColor getcolor(String color) {
        return null;
    }

    public IShape getshape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE"))

        {

            return new Circle();

        }
        else if (shape.equalsIgnoreCase("TRIANGLE"))
        {
            return new Triangle();
        }
        else if(shape.equalsIgnoreCase("SQUARE"))
        {
            return new Square();
        }
        return  null;


}

}
