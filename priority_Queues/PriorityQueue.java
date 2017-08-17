package priority_Queues;

import java.util.ArrayList;
 
public class PriorityQueue<T> {
	ArrayList<PQNode<T>> data=new ArrayList<>();
	public int size(){
		return data.size();
	}
	
	public boolean isEmpty(){
		return size()==0;
	}
	public void insert(T data,int priority){
		PQNode<T>node=new PQNode<>();
		node.data=data;
		node.priority=priority;
		this.data.add(node);
		int childIndex=this.data.size()-1;
		
		int parentIndex=(childIndex-1)/2;
		
		while(childIndex>0){
			PQNode<T>child=this.data.get(childIndex);
			PQNode<T>parent=this.data.get(parentIndex);
			if(this.data.get(parentIndex).priority<this.data.get(childIndex).priority){
				this.data.set(parentIndex, child);
				this.data.set(childIndex,parent);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}else{
				return;
			}
			
		}
	}
	
	public T removeMax() throws Exception{
		if(data.size()==0){
			throw new Exception();
		}
		T temp=data.get(0).data;
		data.set(0, data.get(data.size()-1));
		data.remove(data.size()-1);
		if(size()>0){
			downHeapify(0);
		}
		return temp;
	}

	private void downHeapify(int index) {
		// TODO Auto-generated method stub
		int leftChildIndex=2*index+1;
		int rightChildIndex=2*index+2;
		if(leftChildIndex>data.size()-1){
			return;
		}
		int maxIndex=index;
		if(data.get(leftChildIndex).priority>data.get(maxIndex).priority){
			maxIndex=leftChildIndex;
		}
		
		if(rightChildIndex<data.size() && data.get(rightChildIndex).priority>data.get(maxIndex).priority){
			maxIndex=rightChildIndex;
		}
		if(maxIndex!=index){
			PQNode<T>temp=this.data.get(maxIndex);
			data.set(maxIndex, data.get(index));
			data.set(index, temp);
			downHeapify(maxIndex);
		}
		
	}
	
	

}
