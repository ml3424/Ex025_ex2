public class Cat extends Animal implements Runnable{
    @Override
    void make_sound()
    {
        System.out.println("Cats meow! like Hello Kitty");
    }

    @Override
    void eat()
    {
        System.out.println("Cats likes to eat pigeons");
    }

    @Override
    public void run()
    {
        System.out.println("Cats can run up to 30 miles per hour");
    }
}
