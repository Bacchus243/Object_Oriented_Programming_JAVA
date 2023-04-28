
public class Node {
	public String name;
	public Node north;
	public Node east;
	public Node south;
	public Node west;
	
	public Node(String givenName) {
		this.name = givenName;
		this.north = null;
		this.east = null;
		this.south = null;
		this.west = null;
	}
	
	public void setCardinals(Node north, Node east, Node south, Node west ) {
		this.north = north;
		this.east = east;
		this.south = south;
		this.west =	west;		
	}
}
