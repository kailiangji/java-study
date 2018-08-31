//: chapter10/ex24/GreenhouseController.java
// Configure and execute the greehouse system.
import innerclasses.controller.*;

public class GreenhouseController {
    public static void main(String[] args) {
        NewGreenhouseControls gc = new NewGreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
            gc.new ThermostatNight(0),
            gc.new LightOn(200),
            gc.new LightOff(400),
            gc.new WaterOn(600),
            gc.new WaterOff(800),
            gc.new FanOn(1000),
            gc.new FanOff(1200),
            gc.new WaterMistGeneratorOn(100),
            gc.new WaterMistGeneratorOff(500),
            gc.new ThermostatDay(1400)
        };

        gc.addEvent(gc.new Restart(2000, eventList));
        if(args.length == 1)
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        gc.run();
    }
}