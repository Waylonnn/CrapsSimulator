public class Dice {
    private int num = 0;
    public Dice(){
        roll();
    }
    public void roll(){
        num = ((int) (Math.random() * 10) + 2);
    }
    public int getRoll(){
        return num;
    }


}
