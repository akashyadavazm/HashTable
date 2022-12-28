package hashOperations;

public class HashTableUC1<K, V> {

	public MyMapNode<K, V> head = null;
	public MyMapNode<K, V> tail = null;

	public boolean isEmpty() {
		return head == null;
	}

	public void addWords(K key, V value) {
		MyMapNode<K, V> node = new MyMapNode<K, V>(key, value);
		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.next = tail;
			tail.next.next = null;

		}

	}

	public void display() {
		if (isEmpty()) {
			System.out.println("No Sentence Found");
		} else {
			MyMapNode<K, V> temp = head;
			while (temp != null) {
				System.out.print(temp.key + " " + temp.value);
				temp = temp.next;
			}

		}

	}

	public static void main(String[] args) {
		HashTableUC1<Integer, String> ht = new HashTableUC1<Integer, String>();

		ht.addWords(1, "To");
		ht.addWords(2, "be");
		ht.addWords(3, "or");
		ht.addWords(4, "not");
		ht.addWords(5, "to");
		ht.addWords(6, "be");

		ht.display();
	}
}
