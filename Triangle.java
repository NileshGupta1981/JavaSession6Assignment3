public class Triangle implements Shape {
	
	//Triangle tri = new Triangle();
	
	public void draw(){
		System.out.println ("Shape to be drawn is triangle");
		
	}
	
	public void getarea (double base , double height){
		
		double area = 0.5*base*height;
		
		System.out.println ("Area of Triangle is:"+area);
		
	}
	
	
}