import java.util.ArrayList;

public class Game {

    public static void play(GameWheel g) {
        int total = 0;
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            String color;
            int amount;
            Slice roll = g.spinWheel();

            color = roll.getColor();
            amount = roll.getPrizeAmount();
            total += amount;

            list.add(color);
            System.out.println("Spin " + i + ": " + roll.toString());
        }
        int counter = 0;
        String placeholder = "";
        for (String s : list) {
            counter++;
            placeholder = s;
        }

        if (counter > 1) {
            System.out.println("You won $" + total);
        }else{
            System.out.println(total * 2);
            System.out.println("All spots landed on were the same color " + placeholder + " doubling your money!");
        }
    }
}