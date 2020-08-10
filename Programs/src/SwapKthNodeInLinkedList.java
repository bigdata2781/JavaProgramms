import java.util.Objects;

public class SwapKthNodeInLinkedList {

	public static void main(String[] args) {
		int totalNode = 8;
		int swapNode = 3;

		int data[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		Node head = null;
		Node current = null;

		for (int i : data) {
			current = new Node(i, current);

			if (Objects.isNull(head)) {
				head = current;
			}
		}

		Node node = head;

		while (node != null) {
			node = node.getNextRef();
		}

		int indexOfEndKNode = (totalNode - swapNode + 1);

		if (indexOfEndKNode == swapNode) {
			System.out.println("Start node and end node index are same. Swapping not needed.");
		} else {
			node = head;
			Node preStartKNode = null;
			Node preEndKNode = null;
			int i = 1;

			while (node != null) {

				if (i == (swapNode - 1)) {
					preStartKNode = node;
				} else if (i == (indexOfEndKNode - 1)) {
					preEndKNode = node;
				}
				i++;
				node = node.getNextRef();
			}

			// Swap Kth Node
			Node temp = preStartKNode.nextRef;
			preStartKNode.nextRef = preEndKNode.nextRef;
			preEndKNode.nextRef = temp;

			// Change next node of Kth Node
			temp = preStartKNode.nextRef.nextRef;
			preStartKNode.nextRef.nextRef = preEndKNode.nextRef.nextRef;
			preEndKNode.nextRef.nextRef = temp;

			node = head;
			while (node != null) {
				System.out.println(node.data);
				node = node.getNextRef();
			}
		}
	}
}

class Node {
	int data;
	Node nextRef;

	Node(int data, Node prevRef) {
		this.data = data;

		if (Objects.nonNull(prevRef)) {
			prevRef.nextRef = this;
		}
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node nextRef) {
		this.nextRef = nextRef;
	}
}
