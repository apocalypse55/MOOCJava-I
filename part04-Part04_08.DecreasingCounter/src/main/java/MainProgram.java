
public class MainProgram {

    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(10);
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        System.out.println("Paul: " + paulsCard);
        mattsCard.eatAffordably();
        System.out.println("Matt: " + mattsCard);
        paulsCard.addMoney(20);
        System.out.println("Paul: " + paulsCard);
        mattsCard.eatHeartily();
        System.out.println("Matt: " + mattsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        System.out.println("Paul: " + paulsCard);
        mattsCard.addMoney(50);
        System.out.println("Matt: " + mattsCard);

        // DecreasingCounter counter = new DecreasingCounter(10);

        // counter.printValue();
        // counter.decrement();
        // counter.decrement();
        // counter.printValue();
        // counter.reset();
        // counter.printValue();

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
