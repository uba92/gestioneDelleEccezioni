
// librerie di Logger importate dal jar in libraries
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    //creo istanza di Logger
    private static final Logger myLogger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

       myLogger.info("Avvio del programma");
       myLogger.debug("Esempio di log di debug");
       myLogger.warn("attenzione, messaggio di esempio per notice!");
       myLogger.error("Errore");

    }
}
