public class Wizard implements Character{
    @Override
    public void attack(){
        System.out.println("Wizard casts a spell!");
    }
    @Override
    public void defend(){
        System.out.println("Creating a magic barrier for defense!");
    }
}