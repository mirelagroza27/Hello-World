
public class Person {
    private final String name;
    private boolean full = false;

    public Person(String name) {
        this.name = name;
    }

    public String name(){
        return name;
    }

    public void isFull() {
        System.out.printf("%s is full: %s%n", name, full);
    }

    public void eat(){
        full = true;
        System.out.printf("Person %s eats.%n", name);
        isFull();
    }



    public void run(){
        System.out.printf("Person %s exercises.", name);
    }

    public void drink(){
        System.out.printf("Person %s drinks.", name);
    }



}
