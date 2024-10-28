public class Bird extends Animal implements Flyable{
    @Override
    void make_sound()
    {
        System.out.println("Birds tweet!");
    }

    @Override
    void eat()
    {
        System.out.println("Birds likes to eat seeds");
    }

    @Override
    public void fly()
    {
        System.out.println("Birds can fly in 20-to-30-mph range");
    }
}