public class Activity{
    public static void main(String[] args){
        
        Dog dog = new Dog();
        dog.name = "Batuta";
        dog.puppies = 5;

        dog.dogs[0] = "Juan";
        dog.dogs[1] = "Dos";
        dog.dogs[2] = "Teres";
        dog.dogs[3] = "Cuatro";
        dog.dogs[4] = "Cinco";
        
        for (int i = 0; i < 5; i++){
            System.out.println(dog.dogs[i]);
        }

        System.out.println(dog.dogName());
        System.out.println("Woof! Woof!");
        System.out.println(dog.numOfPuppies());
        
    }
}
