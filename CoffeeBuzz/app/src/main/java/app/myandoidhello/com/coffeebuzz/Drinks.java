package app.myandoidhello.com.coffeebuzz;


public class Drinks {
    private String name;
    private String desc;
    private int imageID;

    public static final Drinks[] drinks = {
        new Drinks("Latte","this is a description for late",R.drawable.latte),
        new Drinks("Cappuccino","this is a description for Cappuccino",R.drawable.cap),
        new Drinks("Beans","this is a description for Beans",R.drawable.beans)

    };

    private Drinks (String name, String desc,int imageID){
        this.name = name;
        this.desc=desc;
        this.imageID = imageID;
    }

    public String getDesc(){
        return desc;
    }
    public String getName(){
        return name;
    }
    public int getImageID(){
        return imageID;
    }
    public String toString(){
        return this.name;
    }

}
