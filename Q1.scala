import math.{sqrt,pow}
object Q1 extends App {

  val p1 = point(2,3);
  val p2 = point(4,8);
  val p3 = p1+p2;
  val p4 = p1.move(6,7);
  val p5 = p1.distance(p2)
  val p6 = p1.invert();


  println(p1);
  println(p2);
  println("ADD = "+ p3);
  println("Move = "+ p4);
  println("Distance = "+p5);
  println("Invert = "+ p6);


  case class point(a:Int,b:Int){

    def x:Int=a;
    def y:Int=b;

    def +(that:point)=point(this.x+that.x,this.y+that.y) // add two points
    def move(dx:Int,dy:Int)=point(this.x+dx,this.y+dy) // move a point by a distances
    def distance(that:point)=sqrt(pow(that.x-this.x,2) + pow(that.y-this.y,2));// distance between two given points
    def invert()=point(this.y,this.x)//switch the x and coordinates
  }



}
