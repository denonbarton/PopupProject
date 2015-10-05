package input.model;

public class Thing
{
	private String name;
	private int age;
	private double weight;
	private int doesNotMatter;
	
	/** made to get and set the name, age and weight
	 * 
	 */
	public Thing()

	{
		age = -99;
		weight = -.0000009;
		name = "";
	}
	
	/**
	 * resets for new user input
	 * @param name sets user input for "name"
	 * @param age sets user input for "age"
	 * @param weight sets user input for "weight"
	 */
	public Thing(String name, int age, double weight)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}

	public double getWeight()
	{
		return weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	
	public String toString()

	{
		String thingInfo = name + " is " + age + "years old and weighs " + weight;
		return thingInfo;
		
		/**
		 * finalizes the user input and puts it in its place
		 */
	}
}

