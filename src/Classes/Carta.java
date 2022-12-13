package Classes;

/**
 * @author Antonio Ruiz Ruiz
 * @since JDK 19.0
 * @version 12.12.2022
 */

public class Carta {
    //creación de variables
    private int numero;
    private String coll;
    //constructor por defecto
    public Carta(){

    }
   //constructor que copia otro objeto c en uno nuevo
    public Carta(Carta c){
        this.numero = c.numero;
        this.coll = c.coll;
    }
    //setters de la clase. Cada setter valida que la iformación introducida sea correcta
    public void setNumero(int numero) {
        if (numero<=12&&numero>0){
            this.numero = numero;
        }else{
            System.out.println("El numero introduit no es correcte");
        }
    }
    public void setColl(String coll) {
        if ((coll=="oros")||(coll=="copes")||(coll=="espases")||(coll=="bastos")){
            this.coll=coll;
        }
        else{
            System.out.println("Es coll introudit no es correcte");
        }
    }
    //toString para cambiar el valor del return a un String
    @Override
    public String toString() {
        return "La carta es el " + numero + " de " + coll;
    }
}
