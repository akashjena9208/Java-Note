1- Inheritance:-It always speaks about reusability`. using extend key word.
example:- class Human  // it is a Super class // parent class // Base class
{
    int age;
    void sleep()
    {
        age=20;
        System.out.println("Human need to good sleep");
        System.out.println(age);
    }
}

class Student extends Human // it is child class // sub class // drive class
{

}

public class inheritance_1  
{
    public static void main(String[] args) 
    {
        Student st = new Student();
        st.sleep();
    }
}


//..........................MORE ON IN HERITANCE.............................................
 1-PRIVATE MEMBER  can not inheritance.
 2-Constrctor can not inheritance.

 //....................................
  Types of Inheritance
 * Single level inheritance:- one cls another class inherit
 * multilavel inheritance:-
 * Herichical Inheritance
 * multipule Inhritance



