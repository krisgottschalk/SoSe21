package aufgaben.aufgabe7;

public class Student implements Listener
{
	private String name;
	private Publisher publisher;
	
	public Student(String name)
	{
		this.name = name;
	}

	@Override
	public void update() 
	{
		String msg = this.publisher.getUpdate(this);
		System.out.println(this.name + " received " + msg);
	}

	@Override
	public void setPublisher(Publisher publisher) 
	{
		this.publisher = publisher;
		if(publisher.register(this))
		{
			System.out.println(this.name + " registered!");
		}
	}

	@Override
	public void removePublisher(Publisher publisher) 
	{
		if(publisher.unregister(this))
		{
			System.out.println(this.name + " deregistered!");
		}
	}

	@Override
	public int hashCode() 
	{
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (obj == null) return false;
		if (obj == this) return true;
		if (this.getClass() != obj.getClass()) return false;
		
		Student other = (Student) obj;
	    return (this.name == other.name);
	}
	
	
	

}
