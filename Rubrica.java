import java.util.ArrayList;
import java.util.List;

public class Rubrica {
    private List<Contatto> contatti = new ArrayList<>();

    // Aggiungi contatto
    public void aggiungiContatto(Contatto c) {
        contatti.add(c);
        System.out.println("Contatto aggiunto!");
    }

    // Cerca contatto per nome
    public Contatto cercaContatto(String nome) {
        for (Contatto c : contatti) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    // Rimuovi contatto
    public void rimuoviContatto(String nome) {
        Contatto c = cercaContatto(nome);
        if (c != null) {
            contatti.remove(c);
            System.out.println("Contatto rimosso!");
        } else {
            System.out.println("Contatto non trovato.");
        }
    }

    // Modifica contatto
    public void modificaContatto(String nome, String nuovoTelefono, String nuovaEmail) {
        Contatto c = cercaContatto(nome);
        if (c != null) {
            c.setTelefono(nuovoTelefono);
            c.setEmail(nuovaEmail);
            System.out.println("Contatto modificato!");
        } else {
            System.out.println("Contatto non trovato.");
        }
    }

    // Mostra tutti i contatti
    public void mostraContatti() {
        if (contatti.isEmpty()) {
            System.out.println("Rubrica vuota.");
        } else {
            for (Contatto c : contatti) {
                System.out.println(c);
            }
        }
    }
}
