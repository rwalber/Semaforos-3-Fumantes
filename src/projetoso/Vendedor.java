package projetoso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walber
 */
public class Vendedor {
    String produto1;
    String produto2;
    String produto3;
    List<String> produtos;
    
    public Vendedor(String produto1, String produto2, String produto3){
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;
        
        produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
    }
    
    public List<String> Sorteio(){
        List<String> produtosSorteio = new ArrayList<>(produtos);
        List<String> produtosFinal = new ArrayList<>();
        
        for(int i = 0; i < 2; i++){
            String produtoSorteado = produtosSorteio.remove((int) (Math.random() * produtosSorteio.size()));
            produtosFinal.add(produtoSorteado);
        }
        return produtosFinal;
    }
}
