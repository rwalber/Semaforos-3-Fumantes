package projetoso;
import java.util.List;
/**
 *
 * @author walber
 */
public class MesaVendedor {
    
    Vendedor vendedor = new Vendedor("Tabaco", "Papel", "Fósforo");
    public List<String> mesaVendedor;
    
    public synchronized List<String> getMesaVendedor(){
        return vendedor.sorteio();
    }
}
