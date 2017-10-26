package com.hfad.bitsandpizzas;

/**
 * Created by davidg on 04/05/2017.
 */

public class Stores{
    private String name;
    private int imageResourceId;

    public static final Stores[] stores = {
            new Stores("Cambridge", R.drawable.cambridge),
            new Stores("Sebastopol", R.drawable.sebastopol)
    };

    private Stores(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
