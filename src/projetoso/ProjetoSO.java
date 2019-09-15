package projetoso;
import java.util.concurrent.Semaphore;

/**
 *
 * @author walber
 */

public class ProjetoSO {

    public static void main(String[] args) {
        int numAcesso = 1; // número de acessos simultâneos
        int numThreads = 3; // número de threads(fumantes)
        int i;
        
        //Instância do Semáforo
        Semaphore semaforo = new Semaphore(numAcesso);
        
        //Instância do vendedor
//        Vendedor vendedor = new Vendedor("Tabaco", "Papel", "Fósforo");
        
        //Instância das threads dos fumantes
//        Fumante[] fumante = new Fumante[numThreads];
        Fumante fumante1 = new Fumante(1, "Fósforo", semaforo);
        Fumante fumante2 = new Fumante(2, "Tabaco", semaforo);
        Fumante fumante3 = new Fumante(3, "Papel", semaforo);
        
//        while(true){
            fumante1.start();
            fumante2.start();
            fumante3.start();
//        }
//        for(i = 0; i < numThreads; i++){
//            fumante[i] = new Fumante(i, "AA", semaforo);
//            fumante[i].start();
//        }

//        System.out.println("-------------------------");
//        System.out.println(vendedor.Sorteio());
//        System.out.println("-------------------------");
//        fumante1.start();
        
        


        
    }
}
