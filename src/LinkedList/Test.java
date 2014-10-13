package LinkedList;

public class Test {
	public static void main(String[] args) {
		LinkList<String> link = new LinkList<String>();
		link.add("Dylan");
		link.add("java");
		link.add(".Net");
		link.add("C#");			
		link.reverse();
		
		System.out.println(link.size);
		for (int i = 0; i < link.size; i++) {
			System.out.println(link.getNodeOfIndex(i).data);
		}
	}

}
