
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);
        counter.printValue();
        counter.decrement();
        counter.decrement();
        counter.printValue();
        counter.reset();
        counter.printValue();

        // System.out.println(card);
        // card.eatHeartily();
        // System.out.println(card);
        // card.eatHeartily();
        // System.out.println(card);


        // card.addMoney(10);
        // System.out.println(card);
        // card.addMoney(15);
        // System.out.println(card);
        // card.addMoney(200);
        // System.out.println(card);
        // System.out.println("Paul: " + card);
        // card.addMoney(-15);
        // System.out.println("Paul: " + card);
    }
}
