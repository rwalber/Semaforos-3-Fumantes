package projetoso;
import java.util.List;

/**
 *
 * @author walber
 */
public class ProdutosVendedor {
    
    Vendedor vendedor = new Vendedor("Tabaco", "Papel", "Fósforo");
    
    public synchronized List<String> ProdutosVendedor(){
        return vendedor.Sorteio();
    }
}
