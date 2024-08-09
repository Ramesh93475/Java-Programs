import java.util.*;
class Hiiiii{
private int acc;
private int pas;
void settacc(int acc){
this.acc=acc;
}
void settpas(int pas){
this.pas=pas;
}
void gettacc(){
System.out.println("Account no"+acc);
}
void gettpas(){
System.out.println("Password is"+pas);
}
}
class Getss{
public static void main(String args[]){
Hiiiii h=new Hiiiii();
h.settacc(1234);
h.settpas(1812);
h.gettacc();
h.gettpas();
}
} 