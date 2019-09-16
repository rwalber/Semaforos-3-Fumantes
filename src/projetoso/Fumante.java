package projetoso;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
/**
 *
 * @author walber
 */
public class Fumante extends Thread{
    public int idFumante;
    public String elementoFumante;
    public Semaphore semaforo;
    List<String> materiaisFumante;
    
    MesaVendedor mesaVendedor;
    
    public Fumante(int id, String elemento, Semaphore semaforo, 
            MesaVendedor mesaVendedor){
        this.idFumante = id;
        this.elementoFumante = elemento;
        this.semaforo = semaforo;
        this.mesaVendedor = mesaVendedor;
        
        materiaisFumante = new ArrayList<>();
        materiaisFumante.add(elementoFumante);
    }

    private void fumar(){
        try {
            System.out.println("Fumante " + idFumante + " " + "esta com o "
                    + "vendedor e completou o cigarro, já pode fumar..");
            Thread.sleep(2000);
            System.out.println("Fumante " + idFumante 
                    + " Terminou de fumar, encerrando..");
            System.out.println("  ");
        } catch (InterruptedException e) {}
    }
    
    private void processar(List<String> produtosVenda){
        if(!produtosVenda.contains(materiaisFumante.get(0))){
            System.out.println("Produtos a venda: " + produtosVenda);
            System.out.println("Fumante "+ idFumante 
                    + " possui: " + materiaisFumante);
            fumar();
        }
    }
    
    @Override
    public void run(){
        while(true){
            List<String> produtosVenda = mesaVendedor.getMesaVendedor();
            try {
                semaforo.acquire();
                processar(produtosVenda);
            } catch (InterruptedException e) {}
            finally{
                semaforo.release();
            }
        }
    }
}
