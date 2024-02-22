/*Set:-Seter mens set the the data
 * get:-getter means fact the data 
 *      - data retrun varibale
 * 
 * (ringt click source action then setter gettr )
 * 
 * Setter :- compsory the methode stsart set
 *          -it shhould be public.
 *             -return type Should be void.
 *              Compolsory have same argument. ex -setName value pass (String name)
 * 
 * Getter :-the methode stsart get
 *          -it shhould be public.
 *          - retrun type should not be void
 *          -Compolsory should not have argument
 *          
 */

class Student
{
    int age;
    String   name;

    
   

    public int getAge() {
        return age;
    }




    public void setAge(int age) {
        this.age = age;
    }




    public String getName() {
        return name;
    }




    public void setName(String name) {
        this.name = name;
    }




    public void Show()
    {
        System.out.println(name +" "+ age);
    }
}
public class encapsulation_6 
{
    public static void main(String[] args)
    {
        Student ob=new Student();
        Student ob1=new Student();
//.......................... Setter...................................................................................//
        ob.setAge(19);
        ob.setName("Akash");

        ob1.setAge(22);
        ob1.setName("Subha");

        ob.Show();
        ob1.Show();
///............................. Getter.......................................................................///
        int Stud1Age =ob.getAge();
        System.out.println(Stud1Age);

        String Stud1name =ob.getName();
        System.out.println(Stud1name);

        
        int Stud2Age =ob1.getAge();
        System.out.println(Stud2Age);

        String Stud2name =ob1.getName();
        System.out.println(Stud2name);
        
    }
}
