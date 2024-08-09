class Vehicle{
public void move(){}
public void st(){}
}
class Bike extends Vehicle{
public void move(){
System.out.println("Bike moves");
}
public void st(){
System.out.println("Bike starts");
}
public void mile(){
System.out.println("50 mile per hr");
}
}
class Car extends Vehicle{
public void move(){
System.out.println("Car moves");
}
public void st(){
System.out.println("car sts");
}
public void mile(){
System.out.println("200 mile per hr");
}
}
class Veh{
public static void main(String a[]){
Garage g=new Garage();	
g.room(new Bike());
g.room(new Car());
}
}
class Garage{
public void room(Vehicle v){
v.move();
v.st();
//Bike b=new Bike();
new Bike().mile();
}
}

