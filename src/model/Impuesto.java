
package model;

public class Impuesto extends Transito {
    String tipoImpuesto;

    public Impuesto(String tipoImpuesto, String placa) {
        super(placa);
        this.tipoImpuesto = tipoImpuesto;
    }
    
    //Municipal
    public double calculaImp(){
        return smlv;
    }
    
    //Departamental
    public double calculaImp(int modelo){
        double impuesto=smlv;
        if (modelo<=2010){
            impuesto+=smlv*0.1;
            //return smlv*1.1;
        }
        else{
            impuesto+=smlv*0.2;
            //return smlv*1.2;
        } 
        return impuesto;
    }
    //Dcto  Dptal
    public double calculaDcto(int modelo,double impuesto){
        if (modelo>=2010 && modelo<=2015){
            return impuesto*0.05;
        }
        else{
            if (modelo>2015){
                return impuesto*0.1;
            }   
        }
       return 0;
    }
    //Dcto para todos
    public double calculaDcto(String soat,double impuesto){
        if (soat.equals("S")){
            return impuesto*0.05;
        }
        return 0;
    } 
}
