package AdaptorPattern;

/**
 * Created by Safoora Yousefi on 7/24/18.
 */
public class Main {
    public static void main(String args[]) {
        OldCoffeeMachine ocm = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter adaptor = new CoffeeTouchscreenAdapter(ocm);
        adaptor.chooseFirstSelection();
    }
}
