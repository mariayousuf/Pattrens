package FactoryMethod;

/**
 * Created by Cclub on 2/15/2017.
 */
public abstract class AbstractFactory
{
    abstract IColor getcolor(String color);
    abstract IShape getshape(String shape);

}
