

import java.util.* ;
import java.lang.*;


class Tp {

    public static void main(String args[])  {


        Expression exp=new Expression("(15+20))(");
        System.out.println(exp.eval());

      /*  try {
            exp.analyser();
        }
        catch (ParFermManqException e){
            System.out.println("parenthese fermante manquante !");
        }
        catch (ParOuvManqException e){
            System.out.println("parenthese ouvrante manquante !");
        }*/



    }
}