public class Notes {
    public static void main(String[] args) {
        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I'm scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less then 100");
        }

        if(topScore > 90 || secondTopScore <= 90){
            System.out.println("Either or both of the conditions are true");
        }

    }
}
