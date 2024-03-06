package Inheritance;

class Aeroplane{

    public void takeoff()
    {
        System.out.println("Aeroplane is takr off");
    }

    public void fly() // it is a overriden
    {
        System.out.println("Aeroplane is fly");
    }
}

class cargoplane extends Aeroplane
{
    public void fly() // parant to child inheritand andyor need you change 
    {
        System.out.println("cargo at lower");
        System.out.println("cargoplane is a override acooding to require that is change ");
    }
}

class passangerplan extends Aeroplane
{
    public void fly() 
    {
        System.out.println("Aeroplane is fly at medium hight");
    }
}



public class inheritance_9
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

