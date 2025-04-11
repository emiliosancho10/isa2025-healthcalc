package uma.isa.healthcalc;

import uma.isa.healthcalc.model.*;
import uma.isa.healthcalc.view.*;
import uma.isa.healthcalc.controller.*;

public class Main {
    public static void main(String[] args) {
        IHealthCalcView view = new HealthCalcView();
        new HealthCalcController(view);
        ((HealthCalcView) view).setVisible(true);
    }
}
