package priority_Queues;

public class PriorityQueueUse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>q=new PriorityQueue<>();
		int in[]={2,4,5,1,7,9,8};
		for(int i:in){
			q.insert(i,i);
		}
//		System.out.println(q.data.size());
		while(q.size()!=0){
			System.out.println(q.removeMax());
		}
		
		

	}

}
