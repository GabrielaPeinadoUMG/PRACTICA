/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dispositivos;

/**
 *
 * @author HP
 */
public class Crear_Dispo {
    protected String Computadora_Portatil;
    protected String Tablet;
    protected String SmartWatch;
    protected String Smartphone;
    protected String Auriculares_Inalambrico;

    public String getComputadora_Portatil() {
        return Computadora_Portatil;
    }

    public void setComputadora_Portatil(String Computadora_Portatil) {
        this.Computadora_Portatil = Computadora_Portatil;
    }

    public String getTablet() {
        return Tablet;
    }

    public void setTablet(String Tablet) {
        this.Tablet = Tablet;
    }

    public String getSmartWatch() {
        return SmartWatch;
    }

    public void setSmartWatch(String SmartWatch) {
        this.SmartWatch = SmartWatch;
    }

    public String getSmartphone() {
        return Smartphone;
    }

    public void setSmartphone(String Smartphone) {
        this.Smartphone = Smartphone;
    }

    public String getAuriculares_Inalambrico() {
        return Auriculares_Inalambrico;
    }

    public void setAuriculares_Inalambrico(String Auriculares_Inalambrico) {
        this.Auriculares_Inalambrico = Auriculares_Inalambrico;
    }
    
    
    
    public String mostrarDatos(){  
        return "Computadora_Portatil: "+Computadora_Portatil+"\nTablet"+Tablet+"\nSmarthphone"+Smartphone+"\nSmarthphone"+Smartphone+"\nAuriculares_Inalambricos"+Auriculares_Inalambrico;
    }
    
}
