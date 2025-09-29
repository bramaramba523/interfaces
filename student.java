package NewPack;

interface studentdetails
{
	int getId();
	String getName();
	String getClassName();

}
class Student implements studentdetails {

	private int id;//heap
	private  String name;
	private String className;
	
	
	public Student(int id,String name, String classname)//parameter constructor
	{
		this.id=id;
		this.name=name;
		this.className=className;
	}
public int getId()
{
	return id;
}
public String getName()
{
	return name;
}
public String getClassName() {
	return className;
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student=new Student(1,"brama","10 grade");
System.out.println("id:+student.getId()");
System.out.println("name:+student.getName()");
System.out.println("classNmae:+student.getclassName()");

	}

}
