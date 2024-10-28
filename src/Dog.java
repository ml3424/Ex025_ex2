public class Dog extends Animal implements Runnable{
    @Override
    void make_sound()
    {
        System.out.println("Dogs bark!");
    }

    @Override
    void eat()
    {
        System.out.println("Dogs likes to eat peanut-butter");
    }

    @Override
    public void run()
    {
        System.out.println("Dogs can run up to 25 to 45 miles per hour");
    }
}
