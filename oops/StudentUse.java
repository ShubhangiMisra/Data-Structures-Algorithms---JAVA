package oops;

public class StudentUse {
	
	public static<T extends CompareInterface<T>> void bubbleSort(T arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j].compareTo(arr[j+1])==1){
					T temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] arr=new Student[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=new Student();
			arr[i].marks=100-i;
		}
		
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].marks);
		}
		
		

	}

}
