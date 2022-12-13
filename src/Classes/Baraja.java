package Classes;

/**
 * @author Antonio Ruiz Ruiz
 * @version 12.12.2022
 * @since JDK 19.0
 */
public class Baraja {

    //creación del objeto carta
    Carta c= new Carta();

    //constructor por defecto
    public Baraja(){
    }
    /*
    metodo donde se crean dos arrays, una para coll y otra para numero
    donde a través de un for se recorre la array palo y se inserta en el objeto
    el palo correspondiente con el setColl. Después dentro de ese for se hace otro
    for que recorre la array numero y se inserta en el objeto el numero correspondiente
    con el setNumero y posteriormente se imprime el objeto
     */
    public void mostrarBaraja(){
        //creación de arrays
        String palo[]= {"oros","bastos","espases","copes"};
        int numero[]={1,2,3,4,5,6,7,8,9,10,11,12};
        for (int i=0; i<palo.length;i++){
            c.setColl(palo[i]);
            for(int j=0;j< numero.length;j++){
                c.setNumero(numero[j]);
                System.out.println(c);
            }
        }
    }
}
