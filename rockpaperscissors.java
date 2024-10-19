import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor{
    public static void main (String args[]){
                Scanner sc= new Scanner(System.in);
                while(true){
        String[] rps= {"r","p","s"};
        String computerMove= rps[new Random().nextInt(rps.length)];
        String playerMove; 
        while(true){
            System.out.println("CHOOSE YOUR MOVE FROM(r,p,s)=>");
            playerMove = sc.nextLine();
            if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s") ){
                break;
            }
            System.out.println(".................");
            System.out.println(".................");
            System.out.println("THIS IS NOT THE ACTUAL GAME BRO GO AND PLAY IT WISELY");
            System.out.println(".................");
            System.out.println(".................");
            
        }
        System.out.println("Computer Player: "+ computerMove);
        if(playerMove.equals(computerMove)){
            System.out.println("The Game is tie!!");
        }
        else if(playerMove.equals("r")){
            if(computerMove.equals("p")){
                System.out.println("OH NOO! YOU LOSE:(");
            }else if(computerMove.equals("s")){
                System.out.println("WOWWW!! YOU WINN");
            }
        }
        else if(playerMove.equals("p")){
            if(computerMove.equals("s")){
                System.out.println("OH NOO! YOU LOSE:(");
            }else if(computerMove.equals("r")){
                System.out.println("WOWWW!! YOU WINN");
            }
        }
        else if(playerMove.equals("s")){
            if(computerMove.equals("r")){
                System.out.println("OH NOO! YOU LOSE:(");
            }else if(computerMove.equals("p")){
                System.out.println("WOWWW!! YOU WINN");
            }
        }
        System.out.println("DO YOU WANT TO PLAY AGAIN?? (y/n)");
        String playAgain = sc.nextLine();
        if(!playAgain.equals("y")){
            break;
        }
        

    }
    sc.close();
}

}
