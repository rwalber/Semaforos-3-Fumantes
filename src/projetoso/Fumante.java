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
    List<String> materiais;
    
    ProdutosVendedor produtosVendedor = new ProdutosVendedor();
    
    public Fumante(int id, String elemento, Semaphore semaforo){
        this.idFumante = id;
        this.elementoFumante = elemento;
        this.semaforo = semaforo;
        
        materiais = new ArrayList<>();
        materiais.add(elementoFumante);
    }
    
//    private void processar(){
//        try {
//            System.out.println("Thread: " + idFumante + "processando");
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {}
//    }
    
    public void fumar(){
        try {
            System.out.println("Fumante: " + idFumante + " Completou o cigarro, já pode fumar..");
            System.out.println("  ");
            Thread.sleep(3000);
            System.out.println("Fumante: " + idFumante + " Terminou de fumar, encerrando..");
            System.out.println("  ");
        } catch (InterruptedException e) {}
    }
    
    public synchronized void pegarElemento(List<String> materiaisVendedor){
        int count = 0;
        List<String> aux = materiaisVendedor;
        
        for (int i = 0; i < aux.size(); i++){
            if(count == 1){
                break;
            }
            else{
                if(materiais.contains(aux.get(i))){
                }
                else{
                    materiais.add(aux.get(i));
                    count += 1;
                }
            }
        }
    }
    
    private boolean processar(List<String> aux){
//        List<String> auxAtual = aux;
        if(materiais.contains("Tabaco") && materiais.contains("Papel") && materiais.contains("Fósforo")){
                fumar();
                return true;
        }else{
            System.out.println("Fumante "+ idFumante + " possui: " + materiais);
            pegarElemento(aux);
            System.out.println("Fumante "+ idFumante + " está com o vendedor, agora possui: " + materiais);
            System.out.println("  ");
            if(materiais.contains("Tabaco") && materiais.contains("Papel") && materiais.contains("Fósforo")){
                fumar();
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                List<String> aux = produtosVendedor.ProdutosVendedor();
                System.out.println("Produtos a venda: " + aux);
                semaforo.acquire();
                if(processar(aux)){
                    break;
                }
            } catch (InterruptedException e) {}
            finally{
                semaforo.release();
            }
        }
    }
}
