public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Batuta");

        myDog.setName("Batuta");
        System.out.println("Dog's name: " + myDog.showName());

        myDog.bark();

        myDog.setNumberOfPuppies(5);
        System.out.println("Number of puppies: " + myDog.showNumberOfPuppies());

        Dog puppy1 = new Dog("Juan");
        Dog puppy2 = new Dog("Dos");
        Dog puppy3 = new Dog("Teres");
        Dog puppy4 = new Dog("Katro");
        Dog puppy5 = new Dog("Tingko");

        Dog[] puppies = {puppy1, puppy2, puppy3, puppy4, puppy5};

        myDog.setPuppies(puppies);

        System.out.println("Puppies:");
        myDog.showPuppies();
    }
}
