import java.util.Scanner;
public class Interpreteur {

    public void lancer(){
        Commande commande ;
        TableSymboles table = new TableSymboles() ;
        Scanner scan= new Scanner(System.in);
        System.out.print(">");
        String ligne = scan.nextLine();
        while (ligne.compareTo("end")!=0) {

            LigneDeCommande l = new LigneDeCommande(ligne);
            try {
                   commande=l.extraireCommande();
                   commande.executer(table );

            }
            catch (CommandeIntrouvableException e ){
                System.out.println("commande introuvable !");
            }
            System.out.print(">");
            ligne = scan.nextLine();

        }
        System.out.println("fin du programme ");
        System.exit(0);
    }
}
