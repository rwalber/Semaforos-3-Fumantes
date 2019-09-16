package projetoso;
import java.util.concurrent.Semaphore;
/**
 *
 * @author walber
 */
public class ProjetoSO {

    public static void main(String[] args) {
        int numAcesso = 1; // número de acessos simultâneos ao semáforo
        
        //Instância do Semáforo
        Semaphore semaforo = new Semaphore(numAcesso);
        MesaVendedor mesa = new MesaVendedor();
        
        //Instância das threads dos fumantes
        Fumante fumante1 = new Fumante(1, "Fósforo", semaforo, mesa);
        Fumante fumante2 = new Fumante(2, "Tabaco", semaforo, mesa);
        Fumante fumante3 = new Fumante(3, "Papel", semaforo, mesa);

        //Inicialização das threads
        fumante1.start();
        fumante2.start();
        fumante3.start();
    }
}
