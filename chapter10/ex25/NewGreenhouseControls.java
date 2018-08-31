//: chapter10/ex25/NewGreenhouseControls.java
import innerclasses.controller.*;

public class NewGreenhouseControls extends GreenhouseControls {
    private boolean waterMistGenerator = false;

    class WaterMistGeneratorOn extends Event {
        public WaterMistGeneratorOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            // Put hardware control code here;
            waterMistGenerator = true;
        }

        public String toString() {
            return "The water mist generator is on";
        }
    }

    class WaterMistGeneratorOff extends Event {
        public WaterMistGeneratorOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            // Put hardware control code here;
            waterMistGenerator = false;
        }

        public String toString() {
            return "The water mist generator is off";
        }
    }
}