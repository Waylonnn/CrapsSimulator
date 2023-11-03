import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        boolean playAgain = true;
        boolean askAgain;
        boolean sent;
        int sum;
        int point;
        String play;

        Scanner scan = new Scanner(System.in);
        while(playAgain){
            askAgain = true;
            sent = true;
            d1.roll();
            d2.roll();
            sum = d1.getRoll() + d2.getRoll();
            System.out.println("You rolled a " + d1.getRoll() + " You also rolled a " + d2.getRoll() + " Your sum" +
                    " is " + sum);
            if (sum == 2 ||
                    sum == 3 ||
                    sum == 12){
                System.out.println("You crapped out! You Lose!");
            } else if (sum == 7 ||
                    sum == 11){
                System.out.println("Natural! You Win!");
            } else{
                point = sum;
                System.out.println("The point is " + point + ". Keep rolling until you roll a " +
                        point + ", but, if you roll a 7, You Lose!");
                while(sent){
                    d1.roll();
                    d2.roll();
                    sum = d1.getRoll() + d2.getRoll();
                    System.out.println("You rolled a " + d1.getRoll() + " You also rolled a " + d2.getRoll() + " Your sum" +
                            " is " + sum);
                    if(sum == 7) {
                        System.out.println("You Lose!");
                        sent = false;
                    }else if(sum == point){
                        System.out.println("You Win!");
                        sent = false;
                    } else{
                        System.out.println("Roll again!");
                    }
                }
            }
            while(askAgain){
                System.out.println("Play Again? (Y/N)");
                play = scan.nextLine();
                if (play.equalsIgnoreCase("Y")){
                    askAgain = false;
                } else if (play.equalsIgnoreCase("N")){
                    playAgain = false;
                    askAgain = false;
                } else{
                    System.out.println("Incorrect Value.\n");
                }
            }
        }
    }
}