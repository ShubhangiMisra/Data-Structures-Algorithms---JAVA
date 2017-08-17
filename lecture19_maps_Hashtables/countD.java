package lecture19_maps_Hashtables;

import java.util.HashMap;
import java.util.Scanner;

public class countD {
	public static  int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("enter"+i+"element");
			arr[i]=s.nextInt();
		}return arr;
		
	}
	
	public static void countDistinctNumbers(int[] input, int k){
		int start=0;
		while(k-1<=input.length-1){
			
			HashMap<Integer,Integer>map=new HashMap<>();
			for(int i=start;i<k;i++){
				map.put(input[i],1);
			}
			System.out.println(map.size());
			k++;
			start++;
			
		}
		
		
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		Scanner s=new Scanner(System.in);
		System.out.println("enter k");
		int k=s.nextInt();
		countDistinctNumbers(arr, k);

	}

}
