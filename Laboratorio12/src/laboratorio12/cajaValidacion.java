/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio12;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Micha
 */
public class cajaValidacion {

    /**
     * @return the caja
     */
    
    private JTextField caja;
    private JLabel error;
    
    public cajaValidacion(JTextField caja, JLabel error) {
        this.caja = caja;
        this.error = error;
    }
    
    public float getValor(){
     float valor=0;
       error.setText("");
       try{
        String valortexto=caja.getText();
        valor=Float.parseFloat(valortexto);
       }catch(NumberFormatException ex){
        error.setText("Error de formato");
       }return valor;
    }
    public void mostrarInfo(String t){
    this.error.setText("");
    this.caja.setText(t);
    }
    
    public void mostrarError(String er){
    this.error.setText(er);
    }
    
    public JTextField getCaja() {
        return caja;
    }

    /**
     * @param caja the caja to set
     */
    public void setCaja(JTextField caja) {
        this.caja = caja;
    }

    /**
     * @return the error
     */
    public JLabel getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(JLabel error) {
        this.error = error;
    }
    
}
