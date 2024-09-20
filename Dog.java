public class Dog{
    String name;
    boolean isMale;
    int numberOfPuppies;
    Dog[] puppies;

    public Dog(String name){
        this.name = name;
        this.numberOfPuppies = 0;
        puppies = new Dog[0];
    }

    public void setName(String name){
        this.name = name;
    }

    public String showName(){
        return name;
    }

    public void bark(){
        System.out.println("Woof! Woof!");
    }

    public void setNumberOfPuppies(int numberOfPuppies){
        this.numberOfPuppies = numberOfPuppies;
    }

    public int showNumberOfPuppies(){
        return numberOfPuppies;
    }

    public void setPuppies(Dog[] puppies){
        this.puppies = puppies;
    }

    public void showPuppies(){
        for (Dog puppy : puppies) {
            System.out.println(puppy.showName());
        }
    }
}
