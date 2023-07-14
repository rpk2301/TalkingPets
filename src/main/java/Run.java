import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void setPETS(ArrayList<Pet> PETS) {
        Run.PETS = PETS;
    }

    private static ArrayList<Pet> PETS = new ArrayList<>();
static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

    setPETS();
    MakeSpeak();





    }

    //Coming back from lunch make sure the first element is getting a name.
    public static void setPETS() {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        System.out.println("How many pets do you have?");
        int f = scan.nextInt();
        for (int i = 0; i < f; i++) {
            System.out.println("What type of animal is your "+ (i+1) + " pet?" + '\n');
            if(i==0) {
                scan.nextLine();
            }
            String type = scan.nextLine();
            System.out.println("What is their name?" + '\n');
            String name = scan.nextLine();
            pets.add(getPet(type,name));
        }
         setPETS(pets);
    }

    public static void MakeSpeak(){


        for(Pet p : PETS)
        {
            System.out.println(p.getName() + " says " + p.speak());

        }
    }



    public static  Pet getPet(String type, String name)
    {
        if(type.equalsIgnoreCase("dog"))
        {
           return new Dog(name);
        }
        else if(type.equalsIgnoreCase("fish"))
        {
          return  new Fish(name);
        }
        else if(type.equalsIgnoreCase("cat"))
        {
           return  new Cat(name);
        }
        return null;
    }
}
