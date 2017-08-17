package oops;

public class Student implements CompareInterface<Student> {
	int marks;
	
	
	public  int compareTo(Student second){
		if(this.marks>second.marks){
			return 1;
		}
		else if(this.marks<second.marks){
			return -1;
		}
		else {
			return 0;
		}
	}


	 
}
