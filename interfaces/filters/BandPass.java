//: interfaces/filters/BandPass.java
package interfaces.filters;

import interfaces.filters.Waveform;

public class BandPass extends Filter {
    double lowCutoff, highCutoff;
    public BandPass(double lowCut, double highCut) {
		lowCutoff = lowCut;
        highCutoff = highCut;
    }
    public Waveform process(Waveform input) { return input; }
}