import java.util.Scanner;
public class Interpreteur {

    public void lancer(){
        Commande commande ;
        TableSymboles table = new TableSymboles() ;
        Scanner scan= new Scanner(System.in);
        String ligne = scan.nextLine();
        System.out.println(ligne);
        while (ligne.trim() != "end") {

            LigneDeCommande l = new LigneDeCommande(ligne);
            try {
                   commande=l.extraireCommande();
                   commande.executer(table );

            }
            catch (CommandeIntrouvableException e ){
                System.out.println("commande introuvable !");
            }
            ligne = scan.nextLine();

        }
        System.exit(0);
    }
}
