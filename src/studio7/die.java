package studio7;


public class die {
	private int sides;
	public die (int sides) {
		this.sides=sides;
	}
	public int rollDie () {
		int result= (int) (Math.random()*sides+1);
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		die one = new die(20);
		one.rollDie();
	}
}
