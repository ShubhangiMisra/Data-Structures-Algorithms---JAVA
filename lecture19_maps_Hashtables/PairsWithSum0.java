package lecture19_maps_Hashtables;

import java.util.HashMap;
import java.util.Set;

public class PairsWithSum0 {

	public static int pairs(int[]input){
		HashMap<Integer, Integer>map=new HashMap<>();
		for(int i=0;i<input.length;i++){
			if(!map.containsKey(input[i])){
				map.put(input[i], 1);
			}
			else{
				int value=map.get(input[i]);
				map.put(input[i], value+1);
			}
		}



		//			method 2;
		//			if(map.containsKey(-j) ){
		//				count+=map.get(j)*map.get(-j);
		//				map.remove(j);
		//				map.remove(-j);

		//			Method 1;
		int count=0;	
		Set<Integer>set=map.keySet();
//		for(Integer j:set){

			//			if(map.containsKey(-j) ){
			//				count+=map.get(j)*map.get(-j);
			//				map.put(j, 0);
			//				map.put(-j, 0);
			//			}
			//				
			//			}
			//		Set<Integer>set=map.keySet();
			//		int count=0;	
			for(Integer j:set){
				while(map.containsKey(-j) && map.get(j)!=0){
					count+=map.get(-j);
					int value=map.get(j);
					map.put(j, value-1);

				}
			}
			return count;


		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a[]={2,-2,2,-2,-2};
			System.out.println(pairs(a));



		}
	}