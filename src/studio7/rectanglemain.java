package studio7;

public class rectanglemain {
	private int width;
	private int length;
	
	public rectanglemain (int width, int length) {
		this.width=width;
		this.length=length;
	}

	
	public int area () {
		int areaResult=0;
				areaResult=this.width*this.length;
		return areaResult;
	}
	public int perimeter()  {
		int perimeterResult=0;
			perimeterResult=2*this.width+2*this.length;
		return perimeterResult;
	}
	public boolean isSquare ()  {
		if (this.width==this.length) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isSmaller (rectanglemain second) {
		
		if (this.area()>= second.area()) {
			return false;
		}
		else {
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectanglemain one = new rectanglemain (2,3);
		one.area();
		one.perimeter();
		one.isSquare();
		rectanglemain two = new rectanglemain (3,4);
		one.isSmaller(two);
	}
}
