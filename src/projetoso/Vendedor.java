package projetoso;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
/**
 *
 * @author walber
 */
public class Vendedor extends Thread{
    String produto1, produto2, produto3;
    public Semaphore semaforo;
    List<String> produtosVendedor;
    MesaVendedor mesaVendedor;
    
    public Vendedor(String produto1, String produto2, String produto3){
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;
        
        produtosVendedor = new ArrayList<>();
        produtosVendedor.add(produto1);
        produtosVendedor.add(produto2);
        produtosVendedor.add(produto3);
    }
    
    public List<String> sorteio(){
        List<String> produtosSorteio = new ArrayList<>(produtosVendedor);
        List<String> produtosFinal = new ArrayList<>();
        
        for(int i = 0; i < 2; i++){
            String produtoSorteado = produtosSorteio.remove((int) 
                    (Math.random() * produtosSorteio.size()));
            produtosFinal.add(produtoSorteado);
        }
        return produtosFinal;
    }
}