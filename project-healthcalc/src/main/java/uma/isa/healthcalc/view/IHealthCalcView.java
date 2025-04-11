package uma.isa.healthcalc.view;

import java.awt.event.ActionListener;

public interface IHealthCalcView {
    String getSexo();
    String getEdad();
    String getAltura();
    String getPeso();

    void setResultado(String resultado);
    void mostrarError(String mensaje);

    void addCalcularPesoIdealListener(ActionListener listener);
    void addCalcularTMBListener(ActionListener listener);
    void addCalcularIMCListener(ActionListener listener);
    void addCalcularRMCListener(ActionListener listener);
}
