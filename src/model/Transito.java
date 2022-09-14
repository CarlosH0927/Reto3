
package model;

import javax.swing.JLabel;

public class Transito {
    String placa;
    double netoPagar,smlv=1000000;

    public Transito(String placa) {
        this.placa = placa;
    }
    
    public void factura(double impuesto, double descuento,
                        JLabel lblImpuesto,JLabel lblDescuento,JLabel lblNeto){
        netoPagar=impuesto-descuento;
        lblImpuesto.setText(""+impuesto);
        lblDescuento.setText(""+descuento);
        lblNeto.setText(""+netoPagar);
    }
    
}
