package converter.main;

import converter.CelsiumToKelvin;
import converter.CelsiumToFarenheit;

public class Main {
    public static void main(String[] args) {

        CelsiumToFarenheit cF = new CelsiumToFarenheit(8);
        cF.printInfo();
        CelsiumToKelvin cK = new CelsiumToKelvin(1);
        cK.printInfo();

    }
}
