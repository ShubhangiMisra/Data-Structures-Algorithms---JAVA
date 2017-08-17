package lecture20_Maps;

import java.util.ArrayList;

import lec13_dataStructures.Node;

public class Map<K,V> {
	int size;
	ArrayList<Node<MapPair<K, V>>>buckets;
	public Map(){
		buckets=new ArrayList<>();
		for(int i=0;i<10;i++){
			buckets.add(null);
		}
	}

	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public int getBucketIndex(K key){
		int hashCode=key.hashCode();
		int bucketIndex=hashCode%buckets.size();
		return bucketIndex;
	}

	public V find(K key){
		int bucketIndex=getBucketIndex(key) ;
		Node<MapPair<K, V>>head=buckets.get(bucketIndex);
		if(head==null){
			return null;
		}
		Node<MapPair<K, V>>temp=head;
		while(temp!=null){
			if(temp.data.key.equals(key)){
				return temp.data.value;
			}
			temp=temp.next;
		}
		return null;	
	}

	public void put(K key,V value){
		int bucketIndex=getBucketIndex(key) ;
		Node<MapPair<K, V>>head=buckets.get(bucketIndex);
		MapPair<K, V>pair=new MapPair<>();
		pair.key=key;
		pair.value=value;
		Node<MapPair<K, V>>newNode=new Node<MapPair<K,V>>(pair);
		if(head==null){
			buckets.set(bucketIndex, newNode); 
			size++;
		}
		else{
			Node<MapPair<K, V>>temp=head,prev=null;
			while(temp!=null){
				if(temp.data.key.equals(key)){
					temp.data.value=value;
					return;
				}
				prev=temp;
				temp=temp.next;
			}
			prev.next=newNode;
			size++;
		}
		double loadFactor=size*1.0/buckets.size();
		if(loadFactor>=0.75){
			reHash();
		}
	}

	public void remove(K key){
		int bucketIndex=getBucketIndex(key) ;
		Node<MapPair<K, V>>head=buckets.get(bucketIndex);
		if(head==null){
			return;
		}
		Node<MapPair<K, V>>temp=head,prev=null;
		if(temp.data.key.equals(key)){
			buckets.set(bucketIndex,temp.next);
			size--;
			return;
		}
		while(temp!=null){
			if(temp.data.key.equals(key)){

				prev.next=temp.next;
				size--;
				return;
			}
			prev=temp;
			temp=temp.next;
		}
		return;
	}

	public void reHash(){
		ArrayList<Node<MapPair<K, V>>>oldBuckets=buckets;
		ArrayList<Node<MapPair<K, V>>>buckets=new ArrayList<>();
		for(int i=0;i<2*oldBuckets.size();i++){
			buckets.add(null);
		}
		size=0;
		for(Node<MapPair<K,V>> head : oldBuckets){
			Node<MapPair<K, V>> temp = head ;
			while(temp!=null){
				put(temp.data.key, temp.data.value);
				temp=temp.next;
			}

		}
	}
	public static void main(String[] args) {
		Map<String,Integer>map=new Map<>();
		map.put("abc",2);
		map.put("def", 4);
		map.put("b", 10);
		map.put("c", 10);
		//	System.out.println(map.size);




	}
}

