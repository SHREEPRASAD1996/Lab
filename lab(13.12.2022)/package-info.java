package comi;
class Base{
int value = 0;
Base(){
addValue();
}
void addValue(){
value += 10;
}
int getValue(){
return value;
}
}
class Derived extends Base{
Derived(){
addValue();
}
void addValue(){
value += 20;
}
}
public class Test{
public static void main(String[] args){
Base b = new Derived();
System.out.println(b.getValue());
}
}

}

public static void main(String[] args) {

Rose r = new Rose();

r.rsam(5);

}

}