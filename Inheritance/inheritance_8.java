package Inheritance;


// inherit:- parrent class to child class  inherit & child class are does not modfy that so

//parant clasas
class Aeroplane{

    public void takeoff()
    {
        System.out.println("Aeroplane is takr off");
    }

    public void fly()
    {
        System.out.println("Aeroplane is fly");
    }
}
//child class
class cargoplane extends Aeroplane   //child classs can not a change
{

}

class passangerplan extends Aeroplane
{
    
}



public class inheritance_8 
{
    public static void main(String[] args) 
    {
        cargoplane cp =new cargoplane();
        cp.takeoff();
        cp.fly();

        passangerplan pp =new passangerplan();
        pp.takeoff();
        pp.fly();
    }
}
