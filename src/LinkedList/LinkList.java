package LinkedList;



@SuppressWarnings("unchecked")
public class LinkList<T> {
	
	Node head;
	
	int size=0;
	public Node getTail(){
		Node current = head;
		while(current.next!=null){
			current=current.next;			
		}		
		return current;     
	}
	
	public void add(T t){
		if(head==null){
			head=new Node(t);
			size=size+1;
		}else{
			Node<T> temp=new Node<T>(t);
			getTail().next=temp;
			size = size + 1;
		}
		
	}
	
	public Node getNodeOfIndex(int index){
		if(index>size){
			return null;
		}else{	
			Node current = head;
		for(int i=0;i<index;i++){			
			current=current.next;
			}
		return current;
		}
	}
	public void  remove(int index){
			if(index<0 |index>size-1){ 
				
			}else if(index==0){
				head=head.next;
				size=size-1;
			}else if(index==size-1){
				getNodeOfIndex(index-1).next=null;
				size=size-1;
			}else{
				getNodeOfIndex(index-1).next=getNodeOfIndex(index).next;
				size=size-1;
			}
			
	}
	public void insert(int index,T t){
		if(index<0 | index>size){
			//Do nothing
		}else if(index==0){
			Node<T> temp=new Node<T>(t);
			temp.next=head;
			head=temp;
			size=size+1;
		}else if(index==size){
			add(t);
		}else{
			Node<T> current=new Node<T>(t);
			current.next=getNodeOfIndex(index);
			getNodeOfIndex(index-1).next=current;
			size=size+1;
		}
		
	}
	public void reverse(){
		if(head==null | head.next==null){
			
		}else{
			Node current = head;
			Node p =null;
			Node q = null;
			
			while(current!=null) {
				p = current.next;
				current.next = q;
				q = current;
				current = p;
				
			}
			head = q;
		}
	}
	

}
