/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB7OOP;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Line {
	
	private Point start;
	private Point end;
	
	public Line(Point start, Point end)
	{
		this.start=start;
		this.end=end;
	}
	public Line(int x1, int y1, int x2, int y2)
	{
		start =new Point(x1, x2);
		end  = new Point(y1, y2);
	}
	public Point getStart()
        {
		return start;
	}
	public Point getEnd()
        {
		return end;
	}
	public void setstart(Point start)
	{
		this.start=start;
	}
	public void setEnd(Point end)
	{
		this.end=end;
	}
	/*public String toString() 
	{
		return "Start: "+start+"End: "+end;
	}*/
	public double length()
	{
		return this.start.distance(this.end);
	}
	
	
	public static void main(String[] args) {
		Point start= new Point(3,2);
		Point end = new Point(7,8);
		///Line l1=  new Line
	  	System.out.printf("%.2f",start.distance(end));
                System.out.println();
	}
}
	
class Point{
	private int x;
	private int y;
	
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getX()
    {
		return x;
	}
	public int getY()
    {
		return y;
	}
	public void setX(int x)
	{
		this.x=x;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	
	public String toString() 
	{
		return x+","+y;
	}
	public double distance(Point p) {
		return Math.sqrt((Math.pow(x-p.x, 2))+(Math.pow(y-p.y, 2)));
	}
	public double distance(int x, int y) {
		return distance(new Point(x,y));
	}
 }
















/*public int[] getXY() {
int[] XY = {x,y};
return XY;
}
public void setXY(int x, int y) {
this.x=x;
this.y=y;
}
public class Point {

        double dis;

        Point(int x1,int y1,int x2,int y2)
        {
              dis=(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
        }	
       public static void main(String args[])
       {
             int x1,x2,y1,y2;	
             Scanner sc=new Scanner(System.in);
             x1=sc.nextInt();		  
             y1=sc.nextInt();	 
             x2=sc.nextInt();
             y2=sc.nextInt();  
             Point cd=new Point(x1,y1,x2,y2);	 
      
	         System.out.println(cd.dis);
     
  }
}*/

