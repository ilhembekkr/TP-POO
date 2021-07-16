

import java.util.* ;
import java.lang.*;


class Tp {

    public static void main(String args[])  {


        Expression exp=new Expression("(-2)^2");
        double x=0;

       try {
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