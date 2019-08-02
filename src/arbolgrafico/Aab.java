package arbolgrafico;
import java.util.ArrayList;
import javax.swing.JPanel;
public class Aab {
    Arbol miArbol = new Arbol();
    public Aab() {
    }
   public boolean insertar(Integer dato) {
       
        return (this.miArbol.agregar(dato));
    }
    public String borrar(Integer dato) {
        Integer x = this.miArbol.borrar(dato);
        if (x == null) {
            return ("No existe el dato en el arbol");
        }
        return ("Borrado el dato: " + x.toString());
    }
    public String preOrden() {
        ArrayList it = this.miArbol.preOrden();
        return (recorrido(it, "Recorrido PreOrden"));
    }
    public String inOrden() {
        ArrayList it = this.miArbol.inOrden();
        return (recorrido(it, "Recorrido InOrden"));
    }
    public String posOrden() {
        ArrayList it = this.miArbol.postOrden();
        return (recorrido(it, "Recorrido PosOrden"));
    }
    public String esta(Integer dato) {
        boolean siEsta = this.miArbol.buscar(dato);
        String r = "El dato:" + dato.toString() + "\n";
        r += siEsta ? "Si se encuentra en el arbol" : "No se encuentra en el arbol";
        return (r);
    }
    private String recorrido(ArrayList it, String msg) {
        int i = 0;
        String r = msg + "\n";
        while (i < it.size()) {
            r += "\t" + it.get(i).toString() + "\n";
            i++;
        }
        return (r);
    }
    public String CantidadNodos(){
        return this.miArbol.cantidadNodos();
    }   
    public String CantidadHojas(){
        return this.miArbol.cantidadNodosHoja();
    }
    public String alturaArbol(){
        return this.miArbol.retornarAltura();
    }
    public String borrarMenor(){
        return this.miArbol.borrarMenor();
    }
    public String borrarMayor(){
        return this.miArbol.borrarMayor();
    }
    public String porNivel(){
        this.miArbol.alturaArbol();
        ArrayList it = this.miArbol.imprimirNivel();
        return (recorrido(it, "Imprimir Por niveles en orden!!!"));
    }
    public JPanel getDibujo() {
        return this.miArbol.getdibujo();
    }
}
