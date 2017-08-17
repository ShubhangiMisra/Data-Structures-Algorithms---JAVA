package lecture19_maps_Hashtables;

import java.util.HashMap;
import java.util.Set;

public class RemoveDuplicates {

	public static int[] remove(int[] input){
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<input.length;i++){
			map.put(input[i],1);
		}
		int[]arr=new int[map.size()];
		Set<Integer>set=map.keySet();
		int index=0;
		for(Integer j:set){
			arr[index]=j;
			index++;
		}
			
		return arr;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]={1,7,6,6,2,2};
		lecture3Arrays.PrintArray.printArray(remove(input));
		



	}

}
