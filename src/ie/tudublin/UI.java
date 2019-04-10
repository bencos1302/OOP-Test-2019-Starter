package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	
	ArrayList<Colour> colours = new ArrayList<Colour>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	// Load Data
	public void loadColours()
	{
		Table c = loadTable("colours.csv", "header");
		for(TableRow row : c.rows())
		{
			Colour colour = new Colour(row);
			colours.add(colour);
		}
	}

	public void printColours()
	{
		for(Colour colour : colours)
		{
			System.out.println(colour);
		}
	}

	public Colour findColour(int value)
	{
		for (Colour colour : colours)
		{
			if(value == colour.getValue())
			{
				return colour;
			}
		}
		return null;
	}

	public void loadResistors()
	{
		Table res = loadTable("resistors.csv");
		for(TableRow row : res.rows())
		{
			Resistor resistor = new Resistor(row);
			resistors.add(resistor);
		}
	}

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		// separate(381);
		// separate(1);
		// separate(92);
	}

	public void setup() 
	{
		loadColours();
		loadResistors();	
	}

	public int border = 70;
	public int gap = 10;
	public int midX = 250;
	public int midY = 400;
	
	public void draw()
	{	
		rect(midX - border, 50, border * 2, border * 2);
		line(midX - border, 120,  midX - (border + 70), 120);
		line(midX + border, 120,  midX + (border + 70), 120);
		rect((midX + gap) - 70, 50, 10, 140);
		rect((midX + gap) - 40, 50, 10, 140);
		rect((midX + gap) - 10, 50, 10, 140);

		rect(midX - border, 240, border * 2, border * 2);
		line(midX - border, 310,  midX - (border + 70), 310);
		line(midX + border, 310,  midX + (border + 70), 310);
		rect((midX + gap) - 70, 240, 10, 140);
		rect((midX + gap) - 40, 240, 10, 140);
		rect((midX + gap) - 10, 240, 10, 140);

		rect(midX - border, 420, border * 2, border * 2);
		line(midX - border, 490,  midX - (border + 70), 490);
		line(midX + border, 490,  midX + (border + 70), 490);
		rect((midX + gap) - 70, 420, 10, 140);
		rect((midX + gap) - 40, 420, 10, 140);
		rect((midX + gap) - 10, 420, 10, 140);
		
		rect(midX - border, 610, border * 2, border * 2);
		line(midX - border, 680,  midX - (border + 70), 680);
		line(midX + border, 680,  midX + (border + 70), 680);
		rect((midX + gap) - 70, 610, 10, 140);
		rect((midX + gap) - 40, 610, 10, 140);
		rect((midX + gap) - 10, 610, 10, 140);
	}
}
