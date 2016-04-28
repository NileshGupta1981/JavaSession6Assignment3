public class Rectanlge implements Shape {
	
	 //Rectanlge rect = new Rectanlge();
	
	public void draw(){
		System.out.println ("Shape to be drawn is Rectangle");
		
	}
	
	public void getarea (double base , double height){
		
		double area = base*height;
		
		System.out.println ("Area of Rectangle is: "+area);
		
	}
	
	
}