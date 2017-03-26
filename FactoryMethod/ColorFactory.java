package FactoryMethod;

/**
 * Created by Cclub on 2/16/2017.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    IColor getcolor(String color)
    {
        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;

    }

    @Override
    IShape getshape(String shape) {
        return null;
    }
}
