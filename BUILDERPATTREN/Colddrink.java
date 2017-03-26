package BUILDERPATTREN;

/**
 * Created by glab on 3/2/17.
 */
public abstract class Colddrink implements Items {
    @Override
    public String name() {
        return null;
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public float price() {
        return 0;
    }
}
