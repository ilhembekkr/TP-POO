

import java.util.* ;
import java.lang.*;


class Tp {

    public static void main(String args[])  {

        TableSymboles table = new TableSymboles() ;

        double x=0;
        Let myLet = new Let("y = 5*cos(23)");
        myLet.executer(table);
        Print print=new Print("y");
        print.executer(table );
       // Let myLet2 = new Let("y =y+5");
       // myLet2.executer(table);
        //System.out.println(table.getTableSymboles().get("y"));

        //Expression exp=new Expression("");
        //System.out.println(table.getTableSymboles().get(x));

      /*  try {
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



*/
    }
}