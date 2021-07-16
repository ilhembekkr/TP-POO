

import java.util.* ;
import java.lang.*;


class Tp {

    public static void main(String args[])  {


        Expression exp=new Expression("(-2)^*2");


       try {
            exp.analyserParent();
           System.out.println(exp.eval());
        }
        catch (ParFermManqException e){
            System.out.println("parenthese fermante manquante !");
        }
        catch (ParOuvManqException e){
            System.out.println("parenthese ouvrante manquante !");
        }
       catch (SyntaxErrorException e){
           System.out.println("erreur de syntaxe  !");
       }




    }
}