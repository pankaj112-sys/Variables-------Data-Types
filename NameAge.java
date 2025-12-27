/* Write a program to print your name and age... */
public class NameAge{
    public static void main(String[] args) {
        String name = "Pankaj Yadav";
        int age = 19;
        System.out.println("Hello my name is " + name.toUpperCase() + " And I am " + age +" years old 💯💯");
        System.out.println("Thank You ");
    }

}



/* Write a Program to take input by user and print name and age...*/
public class NameAge {
    public static void main (String args[]){
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Your name: ");
        String name = s.nextLine();
        System.out.println("Enter Your age: ");
        int age = s.nextInt();
        System.out.println("oo hooo your name is "+ name +" And Your age is "+ age);
    }

    
}