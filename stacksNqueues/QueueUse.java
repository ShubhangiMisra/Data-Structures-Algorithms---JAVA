package stacksNqueues;

public class QueueUse {
	
	public static QueueUsingLinkedLists<Integer> takeInput(){
		System.out.println("enter data");
		while(data!=-1){
			
		}
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
          QueueUsingLinkedLists<Integer>q=new QueueUsingLinkedLists<>();
          for(int i=0;i<5;i++){
        	  q.enqueue(i);
        	  
          }
          while(q.size!=0){
        	  System.out.println(q.dequeue());
          }
	}

}
