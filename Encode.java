
public class Encode {
	private char[][] grid = new char[5][5];
	public static void main(String[] args) {
		new Encode();
	}
	public Encode() {
		grid = new char[5][5];		
		String message = "The launch codes are: 123";
		System.out.println(message);
		String cipher = encode(message);
		System.out.println(cipher);
		String returned = decode(cipher);		
		System.out.println(returned.equals(message));
	}
	private String decode(String cipher) {
		String message = "";
		
		return message;
	}
	private String encode(String message) {
		String cypher = "";
		
		return cypher;
	}
}
