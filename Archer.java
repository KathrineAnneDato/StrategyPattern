public class Archer implements Character{
    @Override
    public void attack(){
        System.out.println("Archer shoots an arrow!");
    }    
    @Override
    public void defend(){
        System.out.println("Using a shield to defend!");    
    }
}