class Box
{
    float width,height,depth;
    Box(float width,float height,float depth)
      {
	    	this.width = width;
		this.height = height;
		this.depth = depth;
      }
   void displayBoxDetails()
        {
	  System.out.println("The box width is"+width);
	  System.out.println("The box height is"+height);
	  System.out.println("The box depth is"+depth);
	}
}
class BoxColor extends Box
{
   String color;
   BoxColor(float width,float height,float depth,String color)
   { 
        super(width,height,depth);		 
         this.color = color; 		 
  } 
  void display()
 {
    System.out.println("The box color"+color);
 }
}
class Hello
      {
     public static void main(String args[])
          {
	       BoxColor b = new BoxColor(4.5f,5.5f,6.7f,"red"); 
	       b.displayBoxDetails();
	       b.display();
	  }
      }  


