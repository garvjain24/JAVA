
class Vehicle{
public void Tyre(){
System.err.println("the car has four tyres");
}
}
class Car extends Vehicle{
public void Type(){
System.err.println("IT is a sedan");
}
}
class BMW extends Car {
public void MAKE (){
System.err.println("IT is German");
}
}
/**
 * MultiLevelI
 */
public class MultiLevelI {
public static void main(String[] args) {
    BMW bmw=new BMW();
    bmw.Tyre();
    bmw.Type();
    bmw.MAKE();
}

}


