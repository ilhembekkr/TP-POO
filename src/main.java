

import java.util.* ;
import java.lang.*;


class Tp {

    public static void main(String args[])  {

        TableSymboles table = new TableSymboles() ;

        double x=0;
        Let myLet = new Let("x = 5");
        ;
        Expression exp=new Expression("x^2*log(2)");

        try {
            myLet.executer(table);
            exp.analyserParent();
            x=exp.eval();
        }

        catch (ParFermManqException e){
            System.out.println("parenthese fermante manquante !");
        }
        catch (ParOuvManqException e){
            System.out.println("parenthese ouvrante manquante !");
        }
        catch (FonctionIntrouvableException e){
            System.out.println("FonctionIntrouvable !");
        }
        catch (SyntaxErrorException e){
            System.out.println("erreur de syntaxe  !");
        }
        System.out.println(x);




    }
}