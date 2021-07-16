

import java.util.* ;
import java.lang.*;


class Tp {

    public static void main(String args[])  {


        Expression exp=new Expression("log(3)");


       try {
            exp.analyser();
           System.out.println(exp.eval());
        }
        catch (ParFermManqException e){
            System.out.println("parenthese fermante manquante !");
        }
        catch (ParOuvManqException e){
            System.out.println("parenthese ouvrante manquante !");
        }




    }
}