import java.util.Scanner;
public class RockPaperSc {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lets play Rock, Paper or Scissors!");
        System.out.println("Do you want to play? YES/NO");
        String ready= scan.nextLine();
        if(ready.equalsIgnoreCase("Yes")){
            System.out.println("OKAY!  Pick Rock, Paper or Scissors");
            System.out.println("Rock=1 Paper=2 Scissors=3");

            String hand= scan.nextLine();

            if(hand.equalsIgnoreCase("Rock")|| hand.equalsIgnoreCase("Paper")|| hand.equalsIgnoreCase("Scissors")){
                String computerHand= pickGenerate();
                System.out.println("You has picked: "+hand);
                System.out.println("Machine has picked: "+ computerHand);
                if(hand.equalsIgnoreCase(computerHand)){
                    System.out.println("DRAW!");
                }else if(hand.equalsIgnoreCase("Rock")&& computerHand.equalsIgnoreCase("Paper")||
                hand.equalsIgnoreCase("Scissors")&& computerHand.equalsIgnoreCase("Rock")||
                hand.equalsIgnoreCase("Paper")&& computerHand.equalsIgnoreCase("Scissors")){
                    System.out.println("Ohh You lost!");
                }else if(hand.equalsIgnoreCase("Paper")&& computerHand.equalsIgnoreCase("Rock")||
                hand.equalsIgnoreCase("Rock")&& computerHand.equalsIgnoreCase("Scissors")||
                hand.equalsIgnoreCase("Scissors")&& computerHand.equalsIgnoreCase("Paper")){
                    System.out.println("Yeyy You won!!");
                }
            }else{
                System.out.println("ERROR, Only accepted Rock Paper or Scissors");
            }

        }else{
            System.out.println("Okay maybe next time. See you soon");
            System.exit(0);
        }

        scan.close();

    }
    public static String pickGenerate(){
        double randomHand= Math.random()*3;
        int integer =(int)randomHand;
        switch (integer) {
            case 0: return "Rock";
            case 1: return "Paper";
            case 2: return "Scissors";
            default: return "--";
        }
    }
}