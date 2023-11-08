
package laboratorio12;

/**
 *
 * @author Micha
 */
public class Operacion {

    private cajaValidacion caja1;
    private cajaValidacion caja2;
    private cajaValidacion resultado;
    
    
    public Operacion(cajaValidacion valor1, cajaValidacion valor2,cajaValidacion resultado) {
        this.caja1 = valor1;
        this.caja2 = valor2;
        this.resultado=resultado;
    }
    
    
   
    public void suma(){
        float res= this.caja1.getValor() + 
                this.caja2.getValor();
        this.resultado.mostrarInfo(res + "");
    }
    
    public void resta(){
         float res= this.caja1.getValor() -
                this.caja2.getValor();
        this.resultado.mostrarInfo(res + "");
    }
    
    public void multiplicacion(){
        float res= this.caja1.getValor() *
                this.caja2.getValor();
        this.resultado.mostrarInfo(res + "");
    }
    
    public void division(){
        float res= this.caja1.getValor() /
                this.caja2.getValor();
        
        if(this.caja2.getValor()==0){
        this.resultado.mostrarError(res+"No se puede dividir entre cero");
        }else if(this.caja1.getValor()==0&& this.caja2.getValor()==0){
        this.resultado.mostrarInfo("Ambos numeros deben ser mayores a ser cero");
        }else{
            this.resultado.mostrarInfo(res + "");
        }}
}
