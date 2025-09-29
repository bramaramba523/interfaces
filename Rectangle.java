package NewPack;
interface shape  //interface interface nmae
{
	double getArea();
}
class Rectangle implements shape {
	private double length;//heap
	private double width;
	
	public Rectangle(double length, double width)//parameter constructor
	{
		//l=length
		//w=width
		this.length=length;
		this.width=width;
	}
	public double getArea()
	{
		return length*width;
		
	}
}
class Triangle implements shape {
	private double base;//heap
	private double height;
	
	public Triangle(double base, double height)//parameterconstructor
	{
		//b=base
		//h=height
		this.base=base;
		this.height=height;
	}
	public double getArea()
	{
		return 0.5*base*height;
		
	}
}
class Circle implements shape {
	private double radius;//heap
	
	public Circle(double radius)//parameterconstructor
	{

		//r=radius
		this.radius=radius;
	
	}
	public double getArea()
	{
		return 3.14*radius;
		
	}
}
	