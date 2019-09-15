package projetoso;
import java.util.concurrent.Semaphore;

/**
 *
 * @author walber
 */

public class CriarThread extends Thread{
    private int id;
    private Semaphore semaforo;
    
    public CriarThread(int id, Semaphore semaforo){
        this.id = id;
        this.semaforo = semaforo;
    }
    
    private void processar(){
        try {
            System.out.println("Thread: " + id + "processando");
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
    }
    
    private void entrarRegiaoNC(){
         System.out.println("Thread: " + id + "em região não crítica");
         processar();
    }
    
    private void entrarRegiaoC(){
        System.out.println("Thread: " + id + "em região crítica");
        processar();
        System.out.println("Thread: " + id + "saindo da região crítica");
    }
    
    @Override
    public void run(){
        entrarRegiaoNC();
        try {
            semaforo.acquire();
            entrarRegiaoC();
        } catch (InterruptedException e) {}
        finally{
            semaforo.release();
        }
    }
}
