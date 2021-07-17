import java.util.Arrays;
import java.util.List;

public class Let extends Commande {

    private String variable ;
    private String expression  ;

    public Let (String op) throws DeclarationInterditeException{
        super(op);
        String variableInterdite[] = {"log", "l", "o", "s", "g", "lo", "og", "sin", "s", "i", "n", "si", "in", "cos", "c", "co", "os"};
        String[] s=op.trim().split("=");
        this.variable=s[0].trim();
        boolean trouv = false ;
        int i =0 ;
        while ((trouv != true) && (  variableInterdite.length < i )){
            if (this.variable == variableInterdite[i] ) {
                trouv = true ;
                throw new DeclarationInterditeException() ;
            }
        }
        System.out.println(variable);
        this.expression=s[1].trim();
        System.out.println(expression);
    }






    public void executer(TableSymboles table)  {
        Expression expVar = new Expression(expression);
        boolean erreur=false ;
        //boolean isNum = false ;
        double valeur=0 ;
        if (expVar.isNumber()) {  valeur = Double.parseDouble(String.valueOf(expression)) ;}
        else {
            try {
                expVar.analyserParent();
                valeur  = expVar.evaluer(table);


            } catch (ParFermManqException e1) {
                erreur=true ;
                System.out.println("parenthese fermante manquante !");
            } catch (ParOuvManqException e2) {
                erreur=true ;
                System.out.println("parenthese ouvrante manquante !");
            }
        }

        System.out.println(variable);

           if (!erreur ){ table.ajouterSymbole(variable,valeur);

        System.out.println("valeur ajoutee"+valeur);}

    }












    }

