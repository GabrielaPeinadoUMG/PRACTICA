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
public class Smartpho extends Crear_Dispo{
  private int Correo_Electronico;
  private int Nombre_Dispositivo;
  private int Visible_Conexion;
  private int Numero_Telefonico;
  
   public Smartpho(int Correo_Electronico, int Nombre_Dispositivo, int Visible_Conexion, int Numero_Telefonico, String Computadora_Portatil, String Tablet,String SmartWatch, String Smartphone,String Auriculares_Inalambrico ){ 
      /*   super (Computadora_Portatil, Tablet, SmartWatch, Smartphone, Auriculares_Inalambrico);*/
    this.Correo_Electronico = Correo_Electronico;
    this.Nombre_Dispositivo = Nombre_Dispositivo;
    this.Visible_Conexion = Visible_Conexion;
    this.Numero_Telefonico = Numero_Telefonico;
}

    public int getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(int Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public int getNombre_Dispositivo() {
        return Nombre_Dispositivo;
    }

    public void setNombre_Dispositivo(int Nombre_Dispositivo) {
        this.Nombre_Dispositivo = Nombre_Dispositivo;
    }

    public int getVisible_Conexion() {
        return Visible_Conexion;
    }

    public void setVisible_Conexion(int Visible_Conexion) {
        this.Visible_Conexion = Visible_Conexion;
    }

    public int getNumero_Telefonico() {
        return Numero_Telefonico;
    }

    public void setNumero_Telefonico(int Numero_Telefonico) {
        this.Numero_Telefonico = Numero_Telefonico;
    }

  @Override
   public String mostrarDatos(){   
    return "Computadora_Portatil: "+Computadora_Portatil+"\nTablet"+Tablet+"\nSmarthphone"+Smartphone+"\nSmarthphone"+Smartphone+"\nAuriculares_Inalambricos"+Auriculares_Inalambrico+"\nCorreo_Electronico"+Correo_Electronico+"\nNombre_Dispositivo"+Nombre_Dispositivo+"\nVisible_Conexion"+Visible_Conexion+"\nNumero_Telefonico"+Numero_Telefonico;
    }
   
   
}