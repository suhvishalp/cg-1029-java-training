
public class Employee {
	
	private int id;
	private String age;
	private String name;
	private String panCard;
	
	public Employee() {
		super();
	}


	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Employee(int id, String age, String name, String panCard) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.panCard = panCard;
	}

	public Employee(int id, String name, String panCard) {
		super();
		this.id = id;
		this.name = name;
		this.panCard = panCard;
	}

	public static Employee createEmployee(int id, int age, String name, String panCard)throws InvalidAgeExpcetion, InvalidPanCardException {
		//validate age
		
		if(age<18)
			//throw InvalidAgeException
			throw new InvalidAgeExpcetion("Age is not valid, under 18");
		
		//validate pancard
		if(panCard == null || panCard.isEmpty())
			//throw InvalidPanCardException
			throw new InvalidPanCardException("Pancard cannot be empty of null");
		
		return new Employee(id,  age+"",  name, panCard);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}



	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", panCard=" + panCard + "]";
	}
	
	

}
