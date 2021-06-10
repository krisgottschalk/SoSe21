package aufgaben.aufgabe7;

public class Testklasse {

	public static void main(String[] args) 
	{       
		final int NR_OF_STUDENTS = 5;
		Slack slack = new Slack();

		Student[] students = new Student[NR_OF_STUDENTS];
		Character c = 'A';
		for(int index=0; index < students.length; index++)
		{
			students[index] = new Student(c.toString());
			c++;
			students[index].setPublisher(slack);
		}
		slack.publishNews();

		System.out.println();
		students[1].removePublisher(slack);
		students[3].removePublisher(slack);
		System.out.println();
		slack.publishNews();

		System.out.println();
		students[1].setPublisher(slack);
		students[2].removePublisher(slack);
		students[4].removePublisher(slack); 
		System.out.println();
		slack.publishNews();

		System.out.println();
		students[0].removePublisher(slack);
		students[1].removePublisher(slack);
		students[1].removePublisher(slack);
		students[3].setPublisher(slack);
		System.out.println();
		slack.publishNews();
		
		Student student1 = new Student("Anna");
		Student student2 = new Student("Annah");
		Student student3 = new Student("Anna");
		System.out.println(student1.equals(student2));
		System.out.println(student1.equals(student3));
		System.out.println(student1.hashCode());
	}

}

