class object1
{
    int a = 3;// instance variable 
    String name = "idiot";// instance variable
    public static void main(String[]args)
    {
        // declare the variable 
        // and create the object
        int num = 9;// primitive variable
        object1 obj = new object1();// refernce variable
        object1 obj1 = new object1();
        System.out.println(obj.a);
        System.out.println(obj.name);
        
        obj1.name = "pushpak";
        obj1.a = 23;
        
        System.out.println(obj1.a);
        System.out.println(obj1.name);
    }
}