package ie.tudublin;

import processing.data.TableRow;

public class Colour
{
    private String colour;
    private int r;
    private int g;
    private int b;
    private int value;

    public void setColour(String colour)
    {
        this.colour = colour;
    }
    public String getColour()
    {
        return colour;
    }

    public void setR(int r)
    {
        this.r = r;
    }
    public int getR()
    {
        return r;
    }

    public void setG(int g)
    {
        this.g = g;
    }
    public int getG()
    {
        return g;
    }

    public void setB(int b)
    {
        this.b = b;
    }
    public int getB()
    {
        return b;
    }

    public void setValue(int value)
    {
        this.value = value;
    }
    public int getValue()
    {
        return value;
    }

    public String toString()
    {
        return colour + "\t" + r + "\t" + g + "\t" + b + "\t" + value + "\t";  
    }

    public Colour(TableRow row)
    {
        colour = row.getString("colour");
        r = row.getInt("r");
        g = row.getInt("g");
        b = row.getInt("b");
        value = row.getInt("value");
    }

    public Colour()
    {
        
    }
}