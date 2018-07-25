/**
 * Created by Safoora Yousefi on 7/24/18.
 */
package AdaptorPattern;
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface{
    OldCoffeeMachine ocm;
    CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
        this.ocm = newMachine;
    }
    public void chooseFirstSelection() {
        this.ocm.selectA();
    }
    public void chooseSecondSelection() {
        this.ocm.selectB();
    }
}
