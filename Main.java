import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("\n--- RUBRICA ---");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Modifica contatto");
            System.out.println("3. Rimuovi contatto");
            System.out.println("4. Cerca contatto");
            System.out.println("5. Mostra tutti i contatti");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // pulizia buffer

            switch (scelta) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    rubrica.aggiungiContatto(new Contatto(nome, telefono, email));
                    break;

                case 2:
                    System.out.print("Nome del contatto da modificare: ");
                    nome = scanner.nextLine();
                    System.out.print("Nuovo telefono: ");
                    telefono = scanner.nextLine();
                    System.out.print("Nuova email: ");
                    email = scanner.nextLine();
                    rubrica.modificaContatto(nome, telefono, email);
                    break;

                case 3:
                    System.out.print("Nome del contatto da rimuovere: ");
                    nome = scanner.nextLine();
                    rubrica.rimuoviContatto(nome);
                    break;

                case 4:
                    System.out.print("Nome da cercare: ");
                    nome = scanner.nextLine();
                    Contatto c = rubrica.cercaContatto(nome);
                    if (c != null) {
                        System.out.println(c);
                    } else {
                        System.out.println("Contatto non trovato.");
                    }
                    break;

                case 5:
                    rubrica.mostraContatti();
                    break;

                case 0:
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);

        scanner.close();
    }
}
